package com.digitalhub.rateengine.model;

import com.digitalhub.rateengine.constant.ShippingType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RateRequest {

    private String carrier;
    private ShippingType shippingType;
    private Address pickupAddress;
    private Address deliveryAddress;
}
