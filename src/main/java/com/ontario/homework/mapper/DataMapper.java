package com.ontario.homework.mapper;

import com.ontario.homework.entity.DataEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DataMapper {
    List<DataEntity> getPresentData();
}
