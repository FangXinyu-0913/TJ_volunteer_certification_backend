package com.tongji.volunteercertification.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Tjgsu2023SpringCertificationEntityPK implements Serializable {
    @Column(name = "student_no")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentNo;
    @Column(name = "volunteer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String volunteerId;

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
        Tjgsu2023SpringCertificationEntityPK that = (Tjgsu2023SpringCertificationEntityPK) o;
        return Objects.equals(studentNo, that.studentNo) && Objects.equals(volunteerId, that.volunteerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo, volunteerId);
    }
}
