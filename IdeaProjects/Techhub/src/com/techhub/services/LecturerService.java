package com.techhub.services;

import com.techhub.academic.*;
import com.techhub.database.Crud;

import java.util.Date;
import java.util.StringJoiner;

public class LecturerService extends Lecturer implements AcademicI {
    Crud crud = new Crud();
    @Override
    public void Add(Object o) {
    Lecturer lecturer = (Lecturer) o;
    lecturers.add(lecturer);
    }

    @Override
    public void Read(Object[] o) {
        SchoolService  school = (SchoolService) o[0];
        DepartmentService department = (DepartmentService) o[1];
        System.out.println("Total Lecturers: "+ lecturers.size());
    for (Lecturer lecturer: lecturers){
        StringJoiner outputString = new StringJoiner(" ");
        outputString.add("Lecturer :");
        outputString.add(lecturer.getFullName());
        outputString.add("Registration Number:");
        outputString.add(lecturer.getRegistrationNumber());
        outputString.add("School / Department: ");
        outputString.add(school.getClassName(lecturer.getSchoolId())+"/"+department.getClassName(lecturer.getDepartmentId()));
        outputString.add("Units:");
        for(Unit unit: lecturer.getUnits()){
            outputString.add(unit.getUnitTitle()+",");
        }
        System.out.println(outputString);
    }

    }

    @Override
    public void Edit(Object o, Object obj) {
        Lecturer lecturero = (Lecturer) o;
        Lecturer lecturer = (Lecturer) obj;
        if(lecturers.contains(lecturero)){
            lecturers.remove(lecturero);
            lecturers.add(lecturer);
        }
    }

    @Override
    public void Delete(Object o) {
        Lecturer lecturer = (Lecturer) o;
        if(lecturers.contains(lecturer)) {
            lecturers.remove(lecturer);
        }
    }

    @Override
    public Object FindOne(Object o) {
        return null;
    }

    @Override
    public int size() {
        return lecturers.size();
    }

    @Override
    public String getClassName(int i) {
        for (Lecturer lecturer: lecturers){
            if(lecturer.getId() == i){
                return lecturer.getFullName();
            }
            else{
                continue;
            }
        }
        return "Object is incorrect";
    }

    @Override
    public int saveToDatabase(Object o) {
        if(o instanceof Lecturer) {
            Lecturer lecturer = (Lecturer) o;
            String lecturerFirstName = lecturer.getFirstName();
            String lecturerLastName = lecturer.getLastName();
            String dateOfBirth = lecturer.getDateOfBirth();
            String regNo = lecturer.getRegistrationNumber();
            int schoolId = lecturer.getSchoolId();
            int departmentId = lecturer.getDepartmentId();
            String units = lecturer.getUnitString();
            String connectionString = crud.generateDBString();
            String statementString = String.format("INSERT INTO lecturers(firstname,lastname,dateofbirth,registrationnumber,schoolid,departmentid,units)" +
                    " VALUES ('%s','%s','%s','%s','%d','%d','%s')", lecturerFirstName,lecturerLastName,dateOfBirth,regNo,schoolId,departmentId,units);
            return crud.saveToDatabase(connectionString, statementString);
        }
        else
            return -1;
    }
}

