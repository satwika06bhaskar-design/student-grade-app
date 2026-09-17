package com.example.java_student_grade_app.student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GradeCalculatorTest {
@Test
public void testTotal() {

    Student student =
            new Student("Rahul", 85, 78, 82);

    GradeCalculator calculator =
            new GradeCalculator();

    assertEquals(245, calculator.calculateTotal(student));
}

@Test
public void testGrade() {

    Student student =
            new Student("Rahul", 85, 78, 82);

    GradeCalculator calculator =
            new GradeCalculator();

    assertEquals("A", calculator.calculateGrade(student));
}

@Test
public void testPass() {

    Student student =
            new Student("Rahul", 85, 78, 82);

    GradeCalculator calculator =
            new GradeCalculator();

    assertEquals("PASS", calculator.calculateResult(student));
}
}