package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101, "Spring Framework", "Pradeep"));
        list.add(new Course(102, "Spring Boot", "Sukhvinder"));
        list.add(new Course(103, "Web Application", "Adam"));
    }

    @Override
    public List<Course> getAllCourse() {
        return list;
    }

    @Override
    public Course getCourseById(int courseid) {

        Course c = null;
        for (Course course:list) {
            if(course.getCourseid()==courseid) {
                c = course;
                break;
            }

        }

        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        String title = course.getTitle();
        String instructor = course.getInstructor();
        Course c = null;
        for (Course e:list) {
            if (e.getCourseid()==course.getCourseid()) {
                e.setTitle(title);
                e.setInstructor(instructor);
            }

        }
        return null;
    }

    @Override
    public String deleteCourseById(int courseid) {

        Course c = null;
        for (Course course:list) {
            if(course.getCourseid()==courseid) {
                list.remove(course);
                break;
            }

        }
        return "Deleted Successfully";
    }
}
