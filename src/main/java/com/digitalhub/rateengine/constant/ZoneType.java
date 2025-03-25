package com.digitalhub.rateengine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ZoneType {

    DOMESTIC("DOMESTIC"),
    INTERNATIONAL("INTERNATIONAL");

    private final String name;
}
