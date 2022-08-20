package com.example.herokuapp.repo;


import com.example.herokuapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    @Query("FROM StudentEntity ")
    List<StudentEntity> findAll();
}
