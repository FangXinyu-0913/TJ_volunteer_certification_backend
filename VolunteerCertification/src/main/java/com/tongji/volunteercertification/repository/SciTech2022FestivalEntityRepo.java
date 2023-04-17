package com.tongji.volunteercertification.repository;

import com.tongji.volunteercertification.entity.Redhat2022FallEntity;
import com.tongji.volunteercertification.entity.SciTech2022FestivalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SciTech2022FestivalEntityRepo extends JpaRepository<SciTech2022FestivalEntity,String> {
    @Query(value = "select * from sci_tech_2022_festival where student_name = ?1 and student_no = ?2", nativeQuery = true)
    List<SciTech2022FestivalEntity> findSciTech2022FestivalEntitiesByNameAndStudentId(String name, String student_id);
}
