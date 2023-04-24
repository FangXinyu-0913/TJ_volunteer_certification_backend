package com.tongji.volunteercertification.service;

import com.tongji.volunteercertification.entity.JsonResultEntity;
import org.springframework.stereotype.Service;

@Service
public interface VolunteerService {
    public JsonResultEntity getVolunteerInfo(String name, String volunteer_no);

    public JsonResultEntity getRedHat2022VolunteerInfo(String name, String student_id);

//    public JsonResultEntity getSciFestival2022VolunteerInfo(String name, String student_id);

    public JsonResultEntity getTJGSUVolunteerInfo2023Spring(String name, String student_id, String activity_name);
}
