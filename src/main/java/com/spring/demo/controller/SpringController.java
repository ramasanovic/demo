package com.spring.demo.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.demo.model.AirCraft;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/spring/demo/")
public class SpringController {

    @GetMapping(value = "getModels")
    public String getModels() throws JsonProcessingException {
        List<AirCraft> airCraftList = new ArrayList<>();
        AirCraft airCraft1 = new AirCraft();
        airCraft1.setId(117L);
        airCraft1.setBrand("BOEING");
        airCraft1.setCode("777-9");
        airCraftList.add(airCraft1);

        AirCraft airCraft2 = new AirCraft();
        airCraft2.setId(117L);
        airCraft2.setBrand("AIRBUS");
        airCraft2.setCode("A319");
        airCraftList.add(airCraft2);

        AirCraft airCraft3 = new AirCraft();
        airCraft3.setId(117L);
        airCraft3.setBrand("BOEING");
        airCraft3.setCode("A350-900");
        airCraftList.add(airCraft3);

        AirCraft airCraft4 = new AirCraft();
        airCraft4.setId(117L);
        airCraft4.setBrand("AIRBUS");
        airCraft4.setCode("A400M");
        airCraftList.add(airCraft4);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(airCraftList);
    }
}
