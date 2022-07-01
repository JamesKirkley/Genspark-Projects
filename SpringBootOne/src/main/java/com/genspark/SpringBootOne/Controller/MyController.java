package com.genspark.SpringBootOne.Controller;

import com.genspark.SpringBootOne.Entity.Course;
import com.genspark.SpringBootOne.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;



    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to the Courses</H1></HTML>";
    }
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourse();
    }
    @GetMapping("/courses/{courseid}")
    public Course getCourse(@PathVariable String courseid) {

        return this.courseService.getCourseById(Integer.parseInt(courseid));

    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);

    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseid}")
    public String deleteCourse(@PathVariable String courseid)
    {
        return this.courseService.deleteCourseById(Integer.parseInt(courseid));
    }
}
