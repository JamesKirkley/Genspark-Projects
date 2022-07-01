package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Dao.StudentDao;
import com.genspark.SpringBootOne.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return this.studentDao.findAll();
    }

    @Override
    public Student getStudentById(int studentid) {

        Optional<Student> c = this.studentDao.findById(studentid);
        Student student = null;
        if(c.isPresent())
        {
            student = c.get();
        } else {
            throw new RuntimeException(" Student not found for id :: " + studentid);

        }
        return student;

    }

    @Override
    public Student addStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public String deleteStudentById(int studentid) {

        this.studentDao.deleteById(studentid);
        return "Deleted Successfully";
    }
}
