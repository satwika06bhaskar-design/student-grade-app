package com.example.java_student_grade_app.student;
public class Main {

    public static void main(String[] args) {

        Student student =
                new Student("Rahul", 85, 78, 82);

        GradeCalculator calculator =
                new GradeCalculator();

        int total = calculator.calculateTotal(student);
        double average = calculator.calculateAverage(student);
        String grade = calculator.calculateGrade(student);
        String result = calculator.calculateResult(student);

        System.out.println("================================");
        System.out.println("       STUDENT GRADE SYSTEM");
        System.out.println("================================");

        System.out.println("Student Name : " + student.getName());
        System.out.println("Java         : " + student.getJavaMarks());
        System.out.println("DBMS         : " + student.getDbmsMarks());
        System.out.println("CN           : " + student.getCnMarks());

        System.out.println("--------------------------------");

        System.out.println("Total        : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
    }
}