package com.tongji.edu.tj_volunteer_certification_backend.Repository;

import com.tongji.edu.tj_volunteer_certification_backend.entity.EpidemicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EpidemicEntityRepo extends JpaRepository<EpidemicEntity,String> {
    @Query(value = "select * from epidemic where name = ?1 and volunteer_no = ?2", nativeQuery = true)
    List<EpidemicEntity> findEpidemicEntitiesByNameAndVolunteerNo(String name,String volunteer_no);
}
