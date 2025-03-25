package com.digitalhub.rateengine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ZoneSourceTable {

    COUNTRY("M_COUNTRY"),
    PROVINCE("M_PROVINCE");

    private final String tableName;
}
