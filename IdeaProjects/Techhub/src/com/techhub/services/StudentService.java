package com.techhub.services;

import com.techhub.academic.Lecturer;
import com.techhub.academic.School;
import com.techhub.academic.Student;
import com.techhub.database.Crud;

import java.util.StringJoiner;

public class StudentService extends Student implements AcademicI {
    Crud crud = new Crud();
    @Override
    public void Add(Object o) {
        Student student = (Student) o;
        students.add(student);
    }

    @Override
    public void Read(Object[] o) {
        SchoolService school = (SchoolService) o[0];
        DepartmentService department = (DepartmentService) o[1];
        System.out.println("Total students: "+students.size());
    for(Student student:students){
        StringJoiner studentString = new StringJoiner(" ");
        studentString.add("Student: ");
        studentString.add(student.getFullName());
        studentString.add("Registration Number: ");
        studentString.add(student.getRegistrationNumber());
        studentString.add("School / Department: ");
        studentString.add(school.getClassName(student.getSchoolId())+"/"+department.getClassName(student.getDepartmentId()));
        studentString.add("Course: ");
        studentString.add(student.getCourse());
        System.out.println(studentString);
    }
    }

    @Override
    public void Edit(Object o, Object obj) {
        Student studento = (Student) o;
        Student student = (Student) obj;
        if(students.contains(studento)){
            students.remove(studento);
            students.add(student);
        }
    }

    @Override
    public void Delete(Object o) {
        Student student = (Student) o;
        if(students.contains(student)) {
            students.remove(student);
        }
    }

    @Override
    public Object FindOne(Object o) {
        return null;
    }

    @Override
    public int size() {
        return students.size();
    }

    @Override
    public String getClassName(int i) {
        for (Student student : students){
            if(student.getId() == i){
                return student.getFullName();
            }
            else{
                continue;
            }
        }
        return "Object is incorrect";
    }

    @Override
    public int saveToDatabase(Object o) {
        if(o instanceof Student) {
            Student student = (Student) o;
            String firstName = student.getFirstName();
            String lastName = student.getLastName();
            String dateOfBirth = student.getDateOfBirth();
            String regNo = student.getRegistrationNumber();
            int schoolId = student.getSchoolId();
            int departmentId = student.getDepartmentId();
            String course = student.getCourse();
            String connectionString = crud.generateDBString();
            String statementString = String.format("INSERT INTO students(firstname,lastname,dateofbirth,registrationnumber,schoolid,departmentid,course)" +
                    " VALUES ('%s','%s','%s','%s','%d','%d','%s')", firstName,lastName,dateOfBirth,regNo,schoolId,departmentId,course);
            return crud.saveToDatabase(connectionString, statementString);
        }
        else
            return -1;
    }
}
