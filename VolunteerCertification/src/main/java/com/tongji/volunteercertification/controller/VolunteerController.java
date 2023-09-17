package com.tongji.volunteercertification.controller;


import com.tongji.volunteercertification.service.VolunteerService;
import com.tongji.volunteercertification.entity.JsonResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @title: VolunteerController
 * @Author 方新宇
 * @Date: 2023/1/17 17:15
 * @Version 1.0
 */
@RestController
@RequestMapping("certification")
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
    public JsonResultEntity getEpidemicVolunteerInfo(@RequestParam("name")String name, @RequestParam("volunteer_no")String volunteer_no)
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

    /**
     * @method: getPGSAVolunteerInfo2023Spring
     * @param name
     * @param student_id
     * @param activity_name
     * @return eligible volunteer info
     */
    @RequestMapping(value = "GSU2023spring",method = RequestMethod.GET)
    public JsonResultEntity getTJGSUVolunteerInfo2023Spring(@RequestParam("name")String name, @RequestParam("student_id")String student_id, @RequestParam("activity_name")String activity_name)
    {
        return volunteerService.getTJGSUVolunteerInfo2023Spring(name, student_id, activity_name);
    }

    /**
     * @method: getTJUVSVounteerInfo2023
     * @param name
     * @param student_id
     * @param activity_name
     * @return eligible volunteer info
     */
    @RequestMapping(value = "TJUVS2023",method = RequestMethod.GET)
    public JsonResultEntity getTJUVSVounteerInfo2023(@RequestParam("name")String name, @RequestParam("student_id")String student_id, @RequestParam("activity_name")String activity_name)
    {
        return volunteerService.getTJVSVolunteerInfo2023(name,student_id,activity_name);
    }
}