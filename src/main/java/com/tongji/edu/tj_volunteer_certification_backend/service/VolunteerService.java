package com.tongji.edu.tj_volunteer_certification_backend.service;

import com.tongji.edu.tj_volunteer_certification_backend.entity.JsonResultEntity;
import org.springframework.stereotype.Service;

@Service
public interface VolunteerService {
    public JsonResultEntity getVolunteerInfo(String name, String volunteer_no);

    public JsonResultEntity getRedHat2022VolunteerInfo(String name, String student_id);
}
