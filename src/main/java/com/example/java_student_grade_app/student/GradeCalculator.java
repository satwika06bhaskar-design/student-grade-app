package com.example.java_student_grade_app.student;

public class GradeCalculator {

    public int calculateTotal(Student student) {
        return student.getJavaMarks()
                + student.getDbmsMarks()
                + student.getCnMarks();
    }

    public double calculateAverage(Student student) {
        return calculateTotal(student) / 3.0;
    }

    public String calculateGrade(Student student) {

        double average = calculateAverage(student);

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String calculateResult(Student student) {

        if (student.getJavaMarks() >= 40 &&
            student.getDbmsMarks() >= 40 &&
            student.getCnMarks() >= 40) {

            return "PASS";
        }

        return "FAIL";
    }
}