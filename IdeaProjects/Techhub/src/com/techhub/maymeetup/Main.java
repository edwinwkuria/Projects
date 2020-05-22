package com.techhub.maymeetup;
import com.techhub.academic.*;
import com.techhub.services.DepartmentService;
import com.techhub.services.LecturerService;
import com.techhub.services.SchoolService;
import com.techhub.services.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.techhub.academic.Department.*;
import static com.techhub.academic.Lecturer.*;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;
import static com.techhub.academic.Student.studentone;
import static com.techhub.academic.Student.studenttwo;

public class Main {

    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        schoolService.Add(economics);
        schoolService.Add(computing);

        schoolService.saveToDatabase(economics);
        schoolService.saveToDatabase(computing);
        schoolService.Read(new Object[]{schoolService});
        System.out.println();

        DepartmentService departmentService = new DepartmentService();
        departmentService.Add(economictheory);
        departmentService.Add(appliedeconomics);
        departmentService.Add(datascience);
        departmentService.Add(programming);

        departmentService.saveToDatabase(economictheory);
        departmentService.saveToDatabase(appliedeconomics);
        departmentService.saveToDatabase(datascience);
        departmentService.saveToDatabase(programming);
        departmentService.Read(new Object[]{schoolService});
        System.out.println();

        LecturerService lecturerService = new LecturerService();
        lecturerService.Add(lecone);
        lecturerService.Add(lectwo);
        lecturerService.Add(lecthree);
        lecturerService.Add(lecfour);

        lecturerService.saveToDatabase(lecone);
        lecturerService.saveToDatabase(lectwo);
        lecturerService.saveToDatabase(lecthree);
        lecturerService.saveToDatabase(lecfour);
        lecturerService.Read(new Object[]{schoolService, departmentService});
        System.out.println();

        StudentService studentService = new StudentService();
        studentService.Add(studentone);
        studentService.Add(studenttwo);

        studentService.saveToDatabase(studentone);
        studentService.saveToDatabase(studenttwo);
        studentService.Read(new Object[]{schoolService,departmentService});
        /*
        try {
            Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase?"+"user=root");
            System.out.println("Connection Successful");
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }*/



    }
}
