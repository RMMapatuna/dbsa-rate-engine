package com.digitalhub.rateengine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InternationalZoneType {

    DBSA_ZONE("DBSA_ZONE", "DBSA INTERNATIONAL ZONE");

    private String name;
    private String description;
}
