package com.ontario.homework.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ontario.homework.entity.DataEntity;
import com.ontario.homework.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class RestMessage {

    @Autowired
    private DataService dataService;

    @GetMapping("/getData")
    public String getData() throws Exception {
        List<DataEntity> resultData = dataService.getPresentData();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(resultData);
    }

}
