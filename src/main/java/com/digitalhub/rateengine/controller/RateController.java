package com.digitalhub.rateengine.controller;

import com.digitalhub.rateengine.model.RateRequest;
import com.digitalhub.rateengine.model.RateResponse;
import com.digitalhub.rateengine.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rate")
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @PostMapping
    public RateResponse getRate(
            @RequestBody RateRequest rateRequest
    ) {
        return null;
    }
}
