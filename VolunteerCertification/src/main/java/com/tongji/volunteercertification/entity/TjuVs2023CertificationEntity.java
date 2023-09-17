package com.tongji.volunteercertification.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TJU_VS_2023_certification", schema = "Certification", catalog = "")
@IdClass(TjuVs2023CertificationEntityPK.class)
public class TjuVs2023CertificationEntity {
    @Basic
    @Column(name = "student_name")
    private String studentName;
    @Basic
    @Column(name = "activity_name")
    private String activityName;
    @Basic
    @Column(name = "work_hour")
    private Integer workHour;
    @Basic
    @Column(name = "work_group")
    private String workGroup;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_no")
    private String studentNo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "volunteer_id")
    private String volunteerId;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Integer workHour) {
        this.workHour = workHour;
    }

    public String getWorkGroup() {
        return workGroup;
    }

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(String volunteerId) {
        this.volunteerId = volunteerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TjuVs2023CertificationEntity that = (TjuVs2023CertificationEntity) o;
        return Objects.equals(studentName, that.studentName) && Objects.equals(activityName, that.activityName) && Objects.equals(workHour, that.workHour) && Objects.equals(workGroup, that.workGroup) && Objects.equals(studentNo, that.studentNo) && Objects.equals(volunteerId, that.volunteerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, activityName, workHour, workGroup, studentNo, volunteerId);
    }
}
