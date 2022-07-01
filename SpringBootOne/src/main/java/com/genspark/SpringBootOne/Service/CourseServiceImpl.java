package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Dao.CourseDao;
import com.genspark.SpringBootOne.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getAllCourse() {
        return this.courseDao.findAll();
    }

    @Override
    public Course getCourseById(int courseid) {

        Optional<Course> c = this.courseDao.findById(courseid);
        Course course = null;
        if(c.isPresent())
        {
            course = c.get();
        } else {
            throw new RuntimeException(" Course not found for id :: " + courseid);

        }
        return course;

    }

    @Override
    public Course addCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public String deleteCourseById(int courseid) {

        this.courseDao.deleteById(courseid);
        return "Deleted Successfully";
    }
}