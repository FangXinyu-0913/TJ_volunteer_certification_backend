package com.tongji.volunteercertification.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sci_tech_2022_festival", schema = "Certification", catalog = "")
public class SciTech2022FestivalEntity {
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
    @Basic
    @Column(name = "volunteer_id")
    private String volunteerId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SciTech2022FestivalEntity that = (SciTech2022FestivalEntity) o;
        return Objects.equals(studentNo, that.studentNo) && Objects.equals(studentName, that.studentName) && Objects.equals(workGroup, that.workGroup) && Objects.equals(volunteerId, that.volunteerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo, studentName, workGroup, volunteerId);
    }
}
