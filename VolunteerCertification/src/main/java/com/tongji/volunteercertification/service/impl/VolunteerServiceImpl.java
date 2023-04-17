package com.tongji.volunteercertification.service.impl;

import com.tongji.volunteercertification.entity.SciTech2022FestivalEntity;
import com.tongji.volunteercertification.repository.EpidemicEntityRepo;
import com.tongji.volunteercertification.repository.Redhat2022FallEntityRepo;
import com.tongji.volunteercertification.entity.EpidemicEntity;
import com.tongji.volunteercertification.entity.JsonResultEntity;
import com.tongji.volunteercertification.entity.Redhat2022FallEntity;
import com.tongji.volunteercertification.repository.SciTech2022FestivalEntityRepo;
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
    SciTech2022FestivalEntityRepo sciTech2022FestivalEntityRepo;
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
    public JsonResultEntity getSciFestival2022VolunteerInfo(String name, String student_id) {
        JsonResultEntity message = new JsonResultEntity();
        try{
            List<SciTech2022FestivalEntity> sciFestival2022EntitiesInfo = sciTech2022FestivalEntityRepo.findSciTech2022FestivalEntitiesByNameAndStudentId(name,student_id);
            message.data.put("success", sciFestival2022EntitiesInfo.size());
            message.data.put("group", sciFestival2022EntitiesInfo.get(0).getWorkGroup());
            message.data.put("volunteerID", sciFestival2022EntitiesInfo.get(0).getVolunteerId());
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