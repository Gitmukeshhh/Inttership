package com.example.Shubham.DTO;

import javax.naming.ldap.PagedResultsControl;

public class CollageDto {

    private String clgName;
    private  int clgRating;

    private int studentId;

    public String getClgName() {
        return clgName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
}
