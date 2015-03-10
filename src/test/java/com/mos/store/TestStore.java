package com.mos.store;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.persistence.sdo.types.SDOWrapperType.IntObjectWrapperImpl;
import org.junit.Test;

import com.mos.domain.AveragePriceGroup;
import com.mos.domain.DomainEnums.CommissionType;
import com.mos.domain.DomainEnums.FlowType;
import com.mos.domain.Fill;
import com.mos.domain.Order;
import com.mos.domain.Portfolio;
import com.mos.domain.DomainEnums.AVGStatus;
import com.mos.domain.DomainEnums.Capacity;
import com.mos.domain.DomainEnums.OrderStatus;
import com.mos.domain.DomainEnums.Side;

public class TestStore {

	@Test
	public void testStore() {

		for (int i=0;i<1000;i++) {
		// Create Portfolio
		Portfolio pf = new Portfolio();
		pf.setName("Peter Portfolio");
		pf.setTradeDate(Integer.parseInt(new SimpleDateFormat("yyyyddmm")
				.format((new Date()))));
		new PortfolioStore().save(pf);
		assertTrue(pf.getPortfolioid() > 0);

		AveragePriceGroup apg = new AveragePriceGroup();

		apg.setCapacity("A");
		apg.setAveragePrice(BigDecimal.ZERO);
		apg.setClientId(1);
		apg.setFlowType("SS");
		apg.setCapacity("A");
		apg.setExchangeId(1);
		apg.setInstrumentId(1);
		apg.setStatus(AVGStatus.OPEN);
		apg.setQuantity(BigDecimal.ONE);
		apg.setMergeKey("MERGEKEY");
		apg.setTradeDate(20150101);
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
		od.setTradeDate(1);
		od.setSettleConversion("T+3");
		od.setSettleDate((20150101));
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
		fill.setIsOffMarket("Y");
		fill.setExecutionTime(new Timestamp(new Date().getTime()));

		new FillStore().save(fill);
		}

	}

}
