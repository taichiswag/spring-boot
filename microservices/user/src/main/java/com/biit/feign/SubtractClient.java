package com.biit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SUBTRACTOR", fallback = SubtractFallback.class)
public interface SubtractClient {

    @GetMapping("/subtract/{n1}/{n2}")
    Integer subtract(@PathVariable int n1, @PathVariable int n2);
}
