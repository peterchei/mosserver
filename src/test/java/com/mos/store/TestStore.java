package com.mos.store;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;






import org.junit.Test;

import com.mos.domain.AveragePriceGroup;
import com.mos.domain.Order;
import com.mos.domain.Portfolio;
import com.mos.refdata.domain.Exchange;

public class TestStore {
	
	
	@Test
	public void testStore() {
		
		//Create Portfolio
		Portfolio pf = new Portfolio();
		pf.setName("Peter Portfolio");
		pf.setTradeDate(Integer.parseInt(new SimpleDateFormat("yyyyddmm").format((new Date()))));
		new PortfolioStore().save(pf);
		assertTrue(pf.getPortfolioid()>0);

		AveragePriceGroup apg = new AveragePriceGroup();

		apg.setCapacity("A");
		apg.setAveragePrice(BigDecimal.ZERO);
		apg.setClientId(1);
		apg.setFlowType("SS");
		apg.setCapacity("A");
		apg.setExchangeId(1);
		apg.setInstrumentId(1);
		apg.setStatus("NEW");
		apg.setQuantity(BigDecimal.ONE);
		apg.setMergeKey("MERGEKEY");
		apg.setTradeDate(20150101);
		apg.setVersion((1));
	
		new AveragePriceGroupStore().save(apg);

		//Create Order
		Order od = new Order();
	
		od.setAveragePrcGrpId((apg.getAveragePrcGrpId()));
		od.setPortfolioId((pf.getPortfolioid()));
		od.setFoOrderRef("XXXXXX");
		od.setClientId(1);
		od.setSide("B");
		od.setInstrumentId(1);
		od.setExchangeId(1);
		od.setQuantity(BigDecimal.TEN);
		od.setOrderStatus("NEW");
		od.setCommission(BigDecimal.ZERO);
		od.setCommissionType("BPS");
		od.setBookId(999);
		od.setTradeDate(1);
		od.setSettleConversion("T+3");
		od.setSettleDate((20150101));
		od.setFlowType("SS");
		od.setCurrency("HKD");
		od.setSettleCurrency("USD");
		od.setFxRate(BigDecimal.ONE);
		od.setFxDirection("D");
		od.setExecutionCountry("HK");
		od.setExecutionRegion("AS");
		od.setFrontOfficeComment(BigDecimal.ONE);
		od.setCapacity("A");
		od.setMoComment(" ");
		od.setVersion(BigDecimal.ONE);
		od.setTraderId("Peter");
		od.setSalesId("Peter");
		new OrderStore().save(od);
		assertTrue(od.getOrderId()>0);
		
		
	
		

	}

}
