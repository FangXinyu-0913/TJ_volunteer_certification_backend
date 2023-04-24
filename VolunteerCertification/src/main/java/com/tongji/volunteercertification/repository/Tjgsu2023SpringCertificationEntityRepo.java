package com.tongji.volunteercertification.repository;

import com.tongji.volunteercertification.entity.Tjgsu2023SpringCertificationEntity;
import com.tongji.volunteercertification.entity.Tjgsu2023SpringCertificationEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Tjgsu2023SpringCertificationEntityRepo extends JpaRepository<Tjgsu2023SpringCertificationEntity, Tjgsu2023SpringCertificationEntityPK> {
    @Query(value = "select * from TJGSU_2023_spring_certification where student_name = ?1 and student_no = ?2 and activity_name = ?3", nativeQuery = true)
    List<Tjgsu2023SpringCertificationEntity> findTjgsu2023SpringCertEntities(String name, String student_id, String activity_name);
}
