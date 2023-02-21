package com.tongji.volunteercertification.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @title: Redhat2022FallEntity
 * @Author 方新宇
 * @Date: 2023/2/21 11:35
 * @Version 1.0
 */
@Entity
@Table(name = "redhat_2022_fall", schema = "Certification", catalog = "")
public class Redhat2022FallEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "student_id")
    private String studentId;
    @Basic
    @Column(name = "volunteer_hours")
    private BigDecimal volunteerHours;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public BigDecimal getVolunteerHours() {
        return volunteerHours;
    }

    public void setVolunteerHours(BigDecimal volunteerHours) {
        this.volunteerHours = volunteerHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Redhat2022FallEntity that = (Redhat2022FallEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(studentId, that.studentId) && Objects.equals(volunteerHours, that.volunteerHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentId, volunteerHours);
    }
}