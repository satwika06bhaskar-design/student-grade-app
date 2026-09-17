package com.example.java_student_grade_app.student;

public class Student {

    private String name;
    private int javaMarks;
    private int dbmsMarks;
    private int cnMarks;

    public Student(String name, int javaMarks, int dbmsMarks, int cnMarks) {
        this.name = name;
        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;
        this.cnMarks = cnMarks;
    }

    public String getName() {
        return name;
    }

    public int getJavaMarks() {
        return javaMarks;
    }

    public int getDbmsMarks() {
        return dbmsMarks;
    }

    public int getCnMarks() {
        return cnMarks;
    }
}