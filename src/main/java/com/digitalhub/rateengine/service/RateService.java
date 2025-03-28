package com.digitalhub.rateengine.service;

import com.digitalhub.rateengine.model.RateRequest;
import com.digitalhub.rateengine.model.RateResponse;

public interface RateService {

    RateResponse getRate(RateRequest rateRequest);
}
