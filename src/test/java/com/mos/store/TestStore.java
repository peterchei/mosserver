package com.mos.store;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

import com.mos.domain.Allocation;
import com.mos.domain.AveragePriceGroup;
import com.mos.domain.ClientTrade;
import com.mos.domain.DomainEnums.BookingStatus;
import com.mos.domain.DomainEnums.CommissionType;
import com.mos.domain.DomainEnums.CtmStatus;
import com.mos.domain.DomainEnums.FlowType;
import com.mos.domain.DomainEnums.PaymentMethod;
import com.mos.domain.Fill;
import com.mos.domain.Order;
import com.mos.domain.Portfolio;
import com.mos.domain.DomainEnums.AVGStatus;
import com.mos.domain.DomainEnums.AllocStatus;
import com.mos.domain.DomainEnums.AllocType;
import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.ConfStatus;
import com.mos.domain.DomainEnums.OrderStatus;
import com.mos.domain.DomainEnums.Side;

public class TestStore {

	private static Logger log = getLogger(TestStore.class);

	@Test
	public void testSaveOrderFillAllocation() {

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
		assertTrue(pf.getPortfolioid() > 0);

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
		Order od = new Order();

		od.setAveragePrcGrpId((apg.getAveragePrcGrpId()));
		od.setPortfolioId((pf.getPortfolioid()));
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
		od.setFrontOfficeComment(BigDecimal.ONE);
		od.setCapacity(Capacity.Agency);
		od.setMoComment(" ");
		od.setVersion(1);
		od.setTraderId("Peter");
		od.setSalesId("Peter");
		new OrderStore().save(od);
		assertTrue(od.getOrderId() > 0);

		Fill fill = new Fill();
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

		Allocation alloc = new Allocation();
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


		ClientTrade ct = new ClientTrade();
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

	}

}
