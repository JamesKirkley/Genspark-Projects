package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class student
{
    private int id;

    private String name;
    //@Autowired
    private List<Phone> ph;
    //@Autowired
    private Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }


    public student(int id, String name, List<Phone>  phones, Address address){
        this.id = id;
        this.name = name;
        this.ph = phones;
        this.add = address;
    }

    public void init() {
        System.out.println("Initialized");
    }
    public void destroy() {
        System.out.println("Destroyed");
    }


    @Override
    public String toString() {
        return "Student\n{" +
                "ID=" + id +
                ", \nName='" + name + '\'' +
                ", \nPhone=" + ph +
                ", \nAddress=" + add +
                '}';
    }
}


