package com.learnspingboot.learnjavaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {
//    /courses
//    Course: id, name, author
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfiguration retrieveAllCurrencyConfig() {
//        return here
        return configuration;
    }
}
