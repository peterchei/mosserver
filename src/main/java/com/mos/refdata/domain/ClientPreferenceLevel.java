package com.mos.refdata.domain;

/**
 * Created by peter on 12/20/2015.
 */
public enum ClientPreferenceLevel {

    DEFAULT(0),
    INSTRUMENT(10),
    REGION(20),
    MARKET(30),
    EXCHANGE(40),
    REGACC_INSTRUMENT(50),
    TOPACC_INSTRUMENT(60),
    SUBACC_INSTRUMENT(70),
    REGACC_MARKET(80),
    TOPACC_MARKET(90),
    SUBACC_MARKET(100),
    REGACC_EXCHANGE(110),
    TOPACC_EXCHANGE(120),
    SUBACC_EXCHANGE(130);

    private ClientPreferenceLevel(int levelId) {
        this.levelId = levelId;
    }

    private int levelId;
}
