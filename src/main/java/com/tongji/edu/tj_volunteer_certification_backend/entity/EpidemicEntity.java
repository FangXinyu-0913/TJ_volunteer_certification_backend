package com.tongji.edu.tj_volunteer_certification_backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @title: EpidemicEntity
 * @Author 方新宇
 * @Date: 2023/1/17 15:16
 * @Version 1.0
 */
@Entity
@Table(name = "epidemic", schema = "Certification", catalog = "")
public class EpidemicEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "credit_hours")
    private BigDecimal creditHours;
    @Basic
    @Column(name = "volunteer_no")
    private String volunteerNo;
    @Basic
    @Column(name = "honor_hours")
    private BigDecimal honorHours;
    @Basic
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Basic
    @Column(name = "age")
    private Integer age;
    @Basic
    @Column(name = "politics_status")
    private String politicsStatus;
    @Basic
    @Column(name = "unit")
    private String unit;
    @Basic
    @Column(name = "student_no")
    private String studentNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(BigDecimal creditHours) {
        this.creditHours = creditHours;
    }

    public String getVolunteerNo() {
        return volunteerNo;
    }

    public void setVolunteerNo(String volunteerNo) {
        this.volunteerNo = volunteerNo;
    }

    public BigDecimal getHonorHours() {
        return honorHours;
    }

    public void setHonorHours(BigDecimal honorHours) {
        this.honorHours = honorHours;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        EpidemicEntity that = (EpidemicEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(creditHours, that.creditHours) && Objects.equals(volunteerNo, that.volunteerNo) && Objects.equals(honorHours, that.honorHours) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(age, that.age) && Objects.equals(politicsStatus, that.politicsStatus) && Objects.equals(unit, that.unit)  && Objects.equals(studentNo, that.studentNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creditHours, volunteerNo, honorHours, phoneNumber, age, politicsStatus, unit, studentNo);
    }
}