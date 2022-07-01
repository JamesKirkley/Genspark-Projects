package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourse();
    Course getCourseById(int courseid);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourseById(int courseid);
}
