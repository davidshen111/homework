package com.ontario.homework.service;


import com.ontario.homework.entity.DataEntity;
import com.ontario.homework.mapper.DataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DataService {

    @Autowired
    private DataMapper dataMapper;

    public List<DataEntity> getPresentData() {
        List<DataEntity> result =  dataMapper.getPresentData();
        return result;
    }

}
