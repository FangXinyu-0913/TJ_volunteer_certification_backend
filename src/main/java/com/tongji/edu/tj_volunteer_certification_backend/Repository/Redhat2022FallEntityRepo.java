package com.tongji.edu.tj_volunteer_certification_backend.Repository;

import com.tongji.edu.tj_volunteer_certification_backend.entity.EpidemicEntity;
import com.tongji.edu.tj_volunteer_certification_backend.entity.Redhat2022FallEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Redhat2022FallEntityRepo extends JpaRepository<Redhat2022FallEntity,String> {
    @Query(value = "select * from redhat_2022_fall where name = ?1 and student_id = ?2", nativeQuery = true)
    List<Redhat2022FallEntity> findRedhat2022FallEntitiesByNameAndStudentId(String name, String student_id);
}
