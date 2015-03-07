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
		pf.setTradedate(Integer.parseInt(new SimpleDateFormat("yyyyddmm").format((new Date()))));
		new PortfolioStore().save(pf);
		assertTrue(pf.getPortfolioid()>0);

		AveragePriceGroup apg = new AveragePriceGroup();

		apg.setCapacity("A");
		apg.setAveragePrice(BigDecimal.ZERO);
		apg.setClientId(BigDecimal.ONE);
		apg.setFlowType("SS");
		apg.setCapacity("A");
		apg.setExchangeId(BigDecimal.ONE);
		apg.setInstrumentId(BigDecimal.ONE);
		apg.setStatus("NEW");
		apg.setQuantity(BigDecimal.ONE);
		apg.setMergeKey("MERGEKEY");
		apg.setTradeDate(new BigDecimal(20150101));
		apg.setVersion(new BigDecimal(1));
	
		new AveragePriceGroupStore().save(apg);

		//Create Order
		Order od = new Order();
	
		od.setAveragePrcGrpId(new BigDecimal(apg.getAveragePrcGrpId()));
		od.setPortfolioId(new BigDecimal(pf.getPortfolioid()));
		od.setFoOrderRef("XXXXXX");
		od.setClientId(BigDecimal.ONE);
		od.setSide("B");
		od.setInstrumentId(BigDecimal.ONE);
		od.setExchangeId(BigDecimal.ONE);
		od.setQuantity(BigDecimal.TEN);
		od.setOrderStatus("NEW");
		od.setCommission(BigDecimal.ZERO);
		od.setCommissionType("BPS");
		od.setBookId(BigDecimal.ZERO);
		od.setTradeDate(BigDecimal.ONE);
		od.setSettleConversion("T+3");
		od.setSettleDate(new BigDecimal(20150101));
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
