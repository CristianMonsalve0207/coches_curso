package com.project.coches.persistance.repository;

import com.project.coches.persistance.entity.BrandCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Recibe un objeto y un id
public interface IBrandCarCrudRepository extends JpaRepository<BrandCarEntity, Integer> {
    
}
