package com.tongji.volunteercertification.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TJGSU_2023_spring_certification", schema = "Certification", catalog = "")
@IdClass(Tjgsu2023SpringCertificationEntityPK.class)
public class Tjgsu2023SpringCertificationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_no")
    private String studentNo;
    @Basic
    @Column(name = "student_name")
    private String studentName;
    @Basic
    @Column(name = "work_group")
    private String workGroup;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "volunteer_id")
    private String volunteerId;
    @Basic
    @Column(name = "activity_name")
    private String activityName;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getWorkGroup() {
        return workGroup;
    }

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    public String getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(String volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tjgsu2023SpringCertificationEntity that = (Tjgsu2023SpringCertificationEntity) o;
        return Objects.equals(studentNo, that.studentNo) && Objects.equals(studentName, that.studentName) && Objects.equals(workGroup, that.workGroup) && Objects.equals(volunteerId, that.volunteerId) && Objects.equals(activityName, that.activityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo, studentName, workGroup, volunteerId, activityName);
    }
}
