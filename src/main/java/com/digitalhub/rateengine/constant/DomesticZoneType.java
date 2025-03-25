package com.digitalhub.rateengine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DomesticZoneType {

    DBSA_ZONE("DBSA_ZONE", "DBSA DOMESTIC ZONE"),
    LBC_ZONE("LBC_ZONE", "LBC COURIER DOMESTIC ZONE");

    private String name;
    private String description;
}
