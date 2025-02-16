package com.biit.feign;

import org.springframework.stereotype.Component;

@Component
public class SubtractFallback implements SubtractClient {
    @Override
    public Integer subtract(int n1, int n2) {
        return Integer.MIN_VALUE;
    }
}
