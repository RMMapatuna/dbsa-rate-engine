package com.digitalhub.rateengine.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

    private String street;
    private String subdivision;
    private String city;
    private String province;
    private String postalCode;
    private String country;
}
