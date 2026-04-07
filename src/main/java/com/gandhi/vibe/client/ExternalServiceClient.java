package com.gandhi.vibe.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "external-api", url = "${app.external-service.base-url}")
public interface ExternalServiceClient {

    @GetMapping("/v1/data")
    Map<String, Object> getExternalData();
}
