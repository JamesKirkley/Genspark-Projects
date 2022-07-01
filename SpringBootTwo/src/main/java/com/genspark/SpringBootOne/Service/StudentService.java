package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    Student getStudentById(int studentid);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    String deleteStudentById(int studentid);
}
