package com.mos.refdata.domain;

import java.util.Date;

/**
 * Created by peter on 12/20/2015.
 */
public class MarketCharge {

    private long id;
    private String chargeName;
    private String chargeCode;
    private String chargeRate;
    private String chargeRateType;
    private double minCharge;
    private double maxCharge;
    private Date effectiveFromDate;
    private Date effectiveToDate;
    private String amountRounding;
    private int amountRoundingDPS;
    private String priceRounding;
    private int priceRoundingDPS;

    private String calculationType;
    private String calculationLogic;
    private String calculationFilter;


}
