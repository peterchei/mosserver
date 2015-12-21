package com.mos.refdata.domain;

import com.mos.domain.DomainEnums;
import com.mos.domain.DomainEnums.FlowType;

import java.util.Date;

public class ClientPreference {


    private long id;

    private long preferenceGroupId;

    //Values
    private FlowType flowType;


    private String preferenceType;
    private String preferenceValue;

    private Date effectiveTo;
    private Date effectiveFrom;

    //meta data
    private String createdBy;
    private String modifiedBy;
    private Date creationDatetime;
    private Date lastModifiedDateTime;
    private boolean isDeleted;


}
