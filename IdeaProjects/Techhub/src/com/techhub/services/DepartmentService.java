package com.techhub.services;

import com.techhub.academic.Department;
import com.techhub.academic.School;
import com.techhub.academic.Student;

import java.util.Iterator;

public class DepartmentService extends Department implements AcademicI {
    SchoolService schoolService;
    @Override
    public void Add(Object o) {
        Department department = (Department) o;
    departments.add(department);
    }

    @Override
    public void Read(Object[] o) {
        schoolService = (SchoolService) o[0];
        System.out.println("Total Departments: "+ departments.size());
        for (Department department : departments) {
            String name = department.getName();
            String chairman =department.getChairman();
            String school = schoolService.getClassName(department.getSchool());
            System.out.println("Department: "+name+" Chaired by: "+chairman+" in the school of "+school);
        }
    }

    @Override
    public void Edit(Object o, Object obj) {
        Department departmento = (Department) o;
        Department department = (Department) obj;
        if(departments.contains(departmento)){
            departments.remove(departmento);
            departments.add(department);
        }
    }

    @Override
    public void Delete(Object o) {
        Department department = (Department) o;
        if(departments.contains(department)) {
            departments.remove(department);
        }
    }

    @Override
    public Object FindOne(Object o) {
        return null;
    }

    @Override
    public int size() {
        return departments.size();
    }

    @Override
    public String getClassName(int i) {

        for (Department department: departments){
            if(department.getId() == i){
                return department.getName();
            }
            else{
                continue;
            }
        }
        return "Object is incorrect";
    }
}
