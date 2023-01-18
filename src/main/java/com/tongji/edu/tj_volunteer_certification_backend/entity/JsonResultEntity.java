package com.tongji.edu.tj_volunteer_certification_backend.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: JsonResultEntity
 * @Author 方新宇
 * @Date: 2023/1/17 17:10
 * @Version 1.0
 */
public class JsonResultEntity {
    public int errorCode;

    public boolean status;

    public Map<String, Object> data;

    public JsonResultEntity() {
        this.errorCode = 300;
        this.status = false;
        this.data = new HashMap<>();
    }
}