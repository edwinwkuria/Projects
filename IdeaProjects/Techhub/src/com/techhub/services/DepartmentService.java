package com.techhub.services;

import com.techhub.academic.Department;

import java.util.Iterator;

public class DepartmentService extends Department implements AcademicI {
    SchoolService schoolService;
    @Override
    public void Add(Object o) {
        Department department = (Department) o;
    departments.add(department);
    }

    @Override
    public void Read(Object o) {
        schoolService = (SchoolService) o;
        for (Department department : departments) {
            String name = department.getName();
            String chairman =department.getChairman();
            String school = schoolService.getClassName(department.getSchool());
            System.out.println("Department: "+name+" Chaired by: "+chairman+" in the school of "+school);
        }
    }

    @Override
    public void Edit(Object o, Object obj) {

    }

    @Override
    public void Delete(Object o) {

    }

    @Override
    public Object FindOne(Object o) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String getClassName(int i) {
        return null;
    }
}
