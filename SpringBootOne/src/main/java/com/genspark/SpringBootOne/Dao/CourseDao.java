package com.genspark.SpringBootOne.Dao;

import com.genspark.SpringBootOne.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

}

