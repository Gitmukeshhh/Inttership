package com.example.Shubham.Model;

import javax.persistence.*;

@Entity
@Table(name = "clg")
public class Collage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String clgName;
    private int clgRating;


    @OneToOne
    @JoinColumn()
    private Student student;


    public Collage(){


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public int getClgRating() {
        return clgRating;
    }

    public void setClgRating(int clgRating) {
        this.clgRating = clgRating;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
