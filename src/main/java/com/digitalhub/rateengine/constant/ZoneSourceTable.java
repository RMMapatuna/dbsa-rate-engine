package com.digitalhub.rateengine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ZoneSourceTable {

    COUNTRY("M_COUNTRY"),
    CITY("M_CITY"),
    PROVINCE("M_PROVINCE"),
    SUBDIVISION("M_SUBDIVISION");

    private final String tableName;
}
