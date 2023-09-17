package com.tongji.volunteercertification.repository;

import com.tongji.volunteercertification.entity.TjuVs2023CertificationEntity;
import com.tongji.volunteercertification.entity.TjuVs2023CertificationEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TjuVs2023CertificationEntityRepo extends JpaRepository<TjuVs2023CertificationEntity, TjuVs2023CertificationEntityPK> {
    @Query(value = "select * from TJU_VS_2023_certification where student_name = ?1 and student_no = ?2 and activity_name = ?3", nativeQuery = true)
    List<TjuVs2023CertificationEntity> findTjuVs2023CertEntities(String name, String student_id, String activity_name);
}
