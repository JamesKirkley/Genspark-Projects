package com.genspark.SpringBootOne.Controller;

import com.genspark.SpringBootOne.Entity.Student;
import com.genspark.SpringBootOne.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to the Student Manager</H1></HTML>";
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.studentService.getAllStudent();
    }
    @GetMapping("/students/{studentid}")
    public Student getStudent(@PathVariable String studentid) {

        return this.studentService.getStudentById(Integer.parseInt(studentid));

    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return this.studentService.addStudent(student);

    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student)
    {
        return this.studentService.updateStudent(student);
    }
    @DeleteMapping("/students/{studentid}")
    public String deleteStudent(@PathVariable String studentid)
    {
        return this.studentService.deleteStudentById(Integer.parseInt(studentid));
    }
}
