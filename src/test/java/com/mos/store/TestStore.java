package com.mos.store;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mos.domain.*;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

import com.mos.domain.DomainEnums.BookingStatus;
import com.mos.domain.DomainEnums.CommissionType;
import com.mos.domain.DomainEnums.CtmStatus;
import com.mos.domain.DomainEnums.FlowType;
import com.mos.domain.DomainEnums.PaymentMethod;
import com.mos.domain.DomainEnums.AVGStatus;
import com.mos.domain.DomainEnums.AllocStatus;
import com.mos.domain.DomainEnums.AllocType;
import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.ConfStatus;
import com.mos.domain.DomainEnums.EntityType;
import com.mos.domain.DomainEnums.OrderStatus;
import com.mos.domain.DomainEnums.Side;
import com.mos.domain.DomainEnums.TaskStatus;
import com.mos.domain.DomainEnums.TaskType;

public class TestStore {

	private static Logger log = getLogger(TestStore.class);

	private Order od;
	private Allocation alloc;
	private ClientTrade ct;
	private Fill fill;
	

	/**
	 * Store one record for each entity first.
	 * 
	 */
	@Before 
	public void setup() {

		int tradeDate = Integer.parseInt(new SimpleDateFormat("yyyyMMdd")
				.format(new Date()));
		int settleDate = Integer.parseInt(new SimpleDateFormat("yyyyMMdd")
				.format(new Date()));

		// Create Portfolio
		Portfolio pf = new Portfolio();
		pf.setName("Peter Portfolio");
		pf.setTradeDate(Integer.parseInt(new SimpleDateFormat("yyyymmdd")
				.format((new Date()))));
		new PortfolioStore().save(pf);
		assertTrue(pf.getPortfolioId() > 0);

		AveragePriceGroup apg = new AveragePriceGroup();

		apg.setCapacity(Capacity.Agency);
		apg.setAveragePrice(BigDecimal.ZERO);
		apg.setClientId(1);
		apg.setFlowType(FlowType.SS);
		apg.setCapacity(Capacity.Agency);
		apg.setExchangeId(1);
		apg.setInstrumentId(1);
		apg.setStatus(AVGStatus.OPEN);
		apg.setQuantity(BigDecimal.ONE);
		apg.setMergeKey("MERGEKEY");
		apg.setTradeDate(tradeDate);
		apg.setVersion((1));

		new AveragePriceGroupStore().save(apg);

		// Create Order
		od = new Order();

		od.setAveragePrcGrpId((apg.getAveragePrcGrpId()));
		od.setPortfolioId((pf.getPortfolioId()));
		od.setFoOrderRef("XXXXXX");
		od.setClientId(1);
		od.setSide(Side.B);
		od.setInstrumentId(1);
		od.setExchangeId(1);
		od.setQuantity(BigDecimal.TEN);
		od.setOrderStatus(OrderStatus.VERIFIED);
		od.setCommission(BigDecimal.ZERO);
		od.setCommissionType(CommissionType.BPS);
		od.setBookId(999);
		od.setTradeDate(tradeDate);
		od.setSettleConversion("T+3");
		od.setSettleDate((settleDate));
		od.setFlowType(FlowType.SS);
		od.setCurrency("HKD");
		od.setSettleCurrency("USD");
		od.setFxRate(BigDecimal.ONE);
		od.setFxDirection("D");
		od.setExecutionCountry("HK");
		od.setExecutionRegion("AS");
		od.setFrontOfficeComment("Hello");
		od.setCapacity(Capacity.Agency);
		od.setMoComment(" ");
		od.setVersion(1);
		od.setTraderId("Peter");
		od.setSalesId("Peter");
		new OrderStore().save(od);
	
		fill = new Fill();
		fill.setCapacity(od.getCapacity());
		fill.setExchangeId(od.getExchangeId());
		fill.setInstrumentId(od.getInstrumentId());
		fill.setSide(od.getSide());
		fill.setPrice(apg.getAveragePrice());
		fill.setTradeDate(od.getTradeDate());
		fill.setOrderId(od.getOrderId());
		fill.setExternalRef("externalRef");
		fill.setExecutedShares(BigDecimal.ONE);
		fill.setIsOffMarket(true);
		fill.setExecutionTime(new Timestamp(new Date().getTime()));

		new FillStore().save(fill);

		alloc = new Allocation();
		alloc.setAllocationPrice(BigDecimal.ONE);
		alloc.setAllocStatus(AllocStatus.NEW);
		alloc.setAveragePrcGrpId(apg.getAveragePrcGrpId());
		alloc.setClearingMechanism("HK");
		alloc.setFirmDepo(11);
		alloc.setQuantity(BigDecimal.TEN);
		alloc.setCommission(BigDecimal.ZERO);
		alloc.setCommissionType(CommissionType.BPS);
		alloc.setCommissionAmount(BigDecimal.TEN);
		alloc.setAllocType(AllocType.TRADE);
		alloc.setClientSSI(0);
		alloc.setSubAccountId(100);
		alloc.setTopAccountId(200);
		alloc.setTradeDate(od.getTradeDate());
		alloc.setSettleDate(od.getSettleDate());
		alloc.setAveragePrice(BigDecimal.ONE);
		alloc.setPaymentMethod(PaymentMethod.DVP);
		alloc.setVersion(1);

		new AllocationStore().save(alloc);

		List<Allocation> allocs = new AllocationStore()
				.getAllAllocationByOrderId(od.getOrderId());

		System.out.println(allocs);

		ct = new ClientTrade();
		ct.setAllocationId(alloc.getAllocationId());
		ct.setBookingStatus(BookingStatus.BOOKED);
		ct.setConfirmSuppress(true);
		ct.setExchangeId(alloc.getExchangeId());
		ct.setInstrumentId(alloc.getInstrumentId());
		ct.setQuantity(alloc.getQuantity());
		ct.setSettleDate(alloc.getSettleDate());
		ct.setCtmStatus(CtmStatus.AFFRIAMED);
		ct.setBookingSuppress(false);
		ct.setTradeDate(alloc.getTradeDate());
		ct.setConfStatus(ConfStatus.NONE);
		ct.setVersion(1);

		new ClientTradeStore().save(ct);

		Task task = new Task();
		task.setAssignedGroup("MyGroup");
		task.setAssignedUser("MyUser");
		task.setComments("Testing");
		task.setCreationTime(new Date());
		task.setDescription("New Order");
		task.setObjectId(od.getOrderId());
		task.setObjectType(EntityType.ORDER);
		task.setTaskStatus(TaskStatus.NEW);
		task.setTradeDate(tradeDate);
		task.setTaskType(TaskType.TRADEMANAGEMENT);

		new TaskStore().save(task);




	}

	@Test
	public void testFigurationStore() {

	}

	@Test
	public void testBackOfficeNotification() {

		BackOfficeNotification bon = new BackOfficeNotification();

		bon.setBackOfficeId("XXXXXX");

		new BackOfficeNotificationStore().save(bon);
	}

	@Test
	public void testAllocationStore() {
		
		AllocationStore store = new AllocationStore();
		
		assertNotNull(store.get(alloc.getAllocationId()));
		
		assertNotNull(store.getAllAllocationByOrderId(od.getOrderId()));
		
		assertNotNull(store.getAllAllocations(5));
		
		assertNotNull(store.getAllocationByAveragePriceGroupId(od.getAveragePrcGrpId()));

	}

	@Test
	public void testOrderStore() {		
		OrderStore os = new OrderStore();
		
		assertTrue(os.getAllOrders(5).size() >0);	
		
		assertNotNull(os.getOrdersByAveragePrcGrpId(od.getAveragePrcGrpId()));		
		
		assertNotNull(os.get(od.getOrderId()));
	}

	@Test
	public void testAveragePriceGroupStore() {
		
		AveragePriceGroupStore store = new AveragePriceGroupStore();
		
		assertNotNull(store.get(od.getAveragePrcGrpId()));
		
		assertNotNull(store.getAveragePriceGroupByOrderId(od.getOrderId()));
	}

	@Test
	public void testClieneTradeStore() {
		
		ClientTradeStore store = new ClientTradeStore();
		
		assertNotNull(store.get(ct.getClientTradeId()));
		
		assertNotNull(store.getClientTradesByAllocId(alloc.getAllocationId()));

	}
	
	@Test
	public void testPortfolio() {
		PortfolioStore store = new PortfolioStore() ;
		
		
		assertNotNull(store.getPortfolioByDate(od.getTradeDate()));
		
		assertNotNull(store.getPortfolioByName("Peter Portfolio"));
		
		
	}

	@Test
	public void testFillStore() {
		FillStore store = new FillStore();
		
		assertNotNull(store.getFillByAveragePriceGroupId(od.getAveragePrcGrpId()));
		
		assertNotNull(store.getFillByOrderId(od.getOrderId()));
		
		assertNotNull(store.getFillByExternalId("externalRef"));
		
		assertNotNull(store.get(fill.getFillId()));
	}

	@Test
	public void testTaskStore() {
		TaskStore store = new TaskStore();
		
		List<Task> tasks = store.getTasksByEntityId(EntityType.ORDER,od.getOrderId());
		
		assertTrue(tasks != null && tasks.size() > 0);
		
		tasks = store.getAllPendingTasks();
		assertTrue(tasks != null && tasks.size() > 0);
		
		tasks = store.getAll();
		assertTrue(tasks != null && tasks.size() > 0);
		
	}
	
	


}
