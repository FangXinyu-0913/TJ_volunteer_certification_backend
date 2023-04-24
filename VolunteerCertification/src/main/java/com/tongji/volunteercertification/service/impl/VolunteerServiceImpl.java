package com.tongji.volunteercertification.service.impl;

import com.tongji.volunteercertification.entity.*;
import com.tongji.volunteercertification.repository.EpidemicEntityRepo;
import com.tongji.volunteercertification.repository.Redhat2022FallEntityRepo;
import com.tongji.volunteercertification.repository.Tjgsu2023SpringCertificationEntityRepo;
import com.tongji.volunteercertification.service.VolunteerService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: VolunteerServiceImpl
 * @Author 方新宇
 * @Date: 2023/1/17 17:11
 * @Version 1.0
 */
@Service
public class VolunteerServiceImpl implements VolunteerService {

    @Resource
    EpidemicEntityRepo epidemicEntityRepo;

    @Resource
    Redhat2022FallEntityRepo redhat2022FallEntityRepo;

    @Resource
    Tjgsu2023SpringCertificationEntityRepo tjgsu2023SpringCertificationEntityRepo;
    @Override
    public JsonResultEntity getVolunteerInfo(String name, String volunteer_no) {
        JsonResultEntity message = new JsonResultEntity();
        try{
            List<EpidemicEntity> epidemicEntitiesInfo = epidemicEntityRepo.findEpidemicEntitiesByNameAndVolunteerNo(name,volunteer_no);

            message.data.put("success", epidemicEntitiesInfo.size());
            message.errorCode = 200;
            message.status = true;
        }catch (Exception e){
            message.data.put("error", e.getMessage());
            message.errorCode = 300;
            message.status = false;
            return message;
        }
        return message;
    }

    @Override
    public JsonResultEntity getRedHat2022VolunteerInfo(String name, String student_id) {
        JsonResultEntity message = new JsonResultEntity();
        try{
            List<Redhat2022FallEntity> redhatEntitiesInfo = redhat2022FallEntityRepo.findRedhat2022FallEntitiesByNameAndStudentId(name,student_id);

            message.data.put("success", redhatEntitiesInfo.size());
            message.errorCode = 200;
            message.status = true;
        }catch (Exception e){
            message.data.put("error", e.getMessage());
            message.errorCode = 300;
            message.status = false;
            return message;
        }
        return message;
    }

    @Override
    public JsonResultEntity getTJGSUVolunteerInfo2023Spring(String name, String student_id, String activity_name) {
        JsonResultEntity message = new JsonResultEntity();
        try{
            List<Tjgsu2023SpringCertificationEntity> VolunteerEntitiesInfo = tjgsu2023SpringCertificationEntityRepo.findTjgsu2023SpringCertEntities(name,student_id,activity_name);
            message.data.put("success", VolunteerEntitiesInfo.size());
            message.data.put("info", VolunteerEntitiesInfo);
            message.errorCode = 200;
            message.status = true;
        }catch (Exception e){
            message.data.put("error", e.getMessage());
            message.errorCode = 300;
            message.status = false;
            return message;
        }
        return message;
    }
}