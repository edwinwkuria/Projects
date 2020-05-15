package com.techhub.services;

import com.techhub.academic.Lecturer;
import com.techhub.academic.School;
import com.techhub.academic.Student;

import java.util.StringJoiner;

public class StudentService extends Student implements AcademicI {
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
}
