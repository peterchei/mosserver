package com.mos.refdata.domain;

import java.util.Date;

/**
 * Created by peter on 12/20/2015.
 */
public class ClientPreferenceGroup {


    private long id;
    private ClientPreferenceLevel level;

    //Keys
    private Long partyId;
    private Long exchangeId;
    private Long marketId;
    private String ClientRegion;


    //meta data
    private String createdBy;
    private String modifiedBy;
    private Date creationDatetime;
    private Date lastModifiedDateTime;
    private boolean isDeleted;

}
