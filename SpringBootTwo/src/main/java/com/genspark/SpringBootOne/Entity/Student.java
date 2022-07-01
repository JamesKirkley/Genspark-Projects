package com.genspark.SpringBootOne.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_students")
public class Student {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;
    private String name;
    private String teacher;

    public Student() {
    }

    public Student(String title, String instructor) {
        this.name = name;
        this.teacher = teacher;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
