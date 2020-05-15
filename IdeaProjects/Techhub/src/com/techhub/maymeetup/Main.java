package com.techhub.maymeetup;
import com.techhub.academic.*;
import com.techhub.services.DepartmentService;
import com.techhub.services.SchoolService;

import static com.techhub.academic.Department.*;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;
public class Main {

    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        schoolService.Add(economics);
        schoolService.Add(computing);
        schoolService.Read(schoolService);

        DepartmentService departmentService = new DepartmentService();
        departmentService.Add(economictheory);
        departmentService.Add(appliedeconomics);
        departmentService.Add(datascience);
        departmentService.Add(programming);
        departmentService.Read(schoolService);



    }
}
