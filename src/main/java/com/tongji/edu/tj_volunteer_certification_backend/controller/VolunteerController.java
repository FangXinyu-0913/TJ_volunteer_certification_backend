package com.tongji.edu.tj_volunteer_certification_backend.controller;

import com.tongji.edu.tj_volunteer_certification_backend.entity.JsonResultEntity;
import com.tongji.edu.tj_volunteer_certification_backend.service.VolunteerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: VolunteerController
 * @Author 方新宇
 * @Date: 2023/1/17 17:15
 * @Version 1.0
 */
@RestController
@RequestMapping("volunteer")
public class VolunteerController {
    @Resource
    VolunteerService volunteerService;

    /**
     * @method: getEpidemicVolunteerInfo
     * @param name
     * @param volunteer_no
     * @return eligible volunteer info
     */
    @RequestMapping(value = "epidemic",method = RequestMethod.GET)
    public JsonResultEntity getEpidemicVolunteerInfo(@RequestParam("name")String name,@RequestParam("volunteer_no")String volunteer_no)
    {
        return volunteerService.getVolunteerInfo(name, volunteer_no);
    }

    /**
     * @method: getRedhat2022FallVolunteerInfo
     * @param name
     * @param student_id
     * @return eligible volunteer info
     */
    @RequestMapping(value = "redhat2022fall",method = RequestMethod.GET)
    public JsonResultEntity getRedhat2022FallVolunteerInfo(@RequestParam("name")String name,@RequestParam("student_id")String student_id)
    {
        return volunteerService.getRedHat2022VolunteerInfo(name, student_id);
    }

}