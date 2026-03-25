package com.student.app;

import java.util.Scanner;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.exception.InvalidMarksException;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n1 Add Student");
            System.out.println("2 View All Students");
            System.out.println("3 Students with Marks > 70");
            System.out.println("4 Group Students by Course");
            System.out.println("5 Sort Students by Marks");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Course: ");
                        String course = sc.next();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        if (marks < 0 || marks > 100) {
                            throw new InvalidMarksException("Marks must be between 0 and 100");
                        }

                        Student s = new Student(id, name, course, marks);
                        service.addStudent(s);


                        System.out.println("Student Added!");

                    } catch (InvalidMarksException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    service.viewAll();
                    break;

                case 3:
                    service.getTopStudents();
                    break;

                case 4:
                    service.groupByCourse();
                    break;

                case 5:
                    service.sortByMarks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}