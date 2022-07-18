package com.test.service.impl;

import com.test.service.TestService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestServiceImpl  implements TestService {


    @Override
    public String test() {
        return UUID.randomUUID().toString();
    }
}
