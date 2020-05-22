package com.techhub.services;

import com.techhub.academic.School;
import com.techhub.database.Crud;

import java.util.concurrent.atomic.AtomicReference;

public class SchoolService extends School implements AcademicI  {
    Crud crud = new Crud();
    @Override
    public void Add (Object o) {
        School school = (School) o;
        schools.add(school);
    }
    @Override
    public void Read(Object[] o) {
        System.out.println("Total schools: "+ schools.size());
        for (School school : schools) {
            System.out.println(school.getSchoolName());
        }
    }

    @Override
    public void Edit(Object o, Object obj) {
        School school = (School) obj;
        if(schools.contains(o)){
            schools.remove(o);
            schools.add(school);
        }
    }

    @Override
    public void Delete(Object o) {
        School school = (School) o;
        if(schools.contains(school)) {
            schools.remove(school);
        }
    }

    @Override
    public int size() {
        return schools.size();
    }

    @Override
    public Object FindOne(Object o) {
        School school = (School) o;
        int index = schools.indexOf(school);
        if(index != -1 ){
            return (Object)schools.get(index);
        }
        return null;
    }

    @Override
    public String getClassName(int i) {
        for (School school: schools){
            if(school.getId() == i){
                return school.getSchoolName();
            }
            else{
                continue;
            }
        }
        return "Object is incorrect";
    }
    @Override
    public int saveToDatabase(Object o) {
        if(o instanceof School) {
            School school = (School) o;
            String schoolName = school.getSchoolName();
            String connectionString = crud.generateDBString();
            String statementString = String.format("INSERT INTO schools(name) VALUES ('%s')", schoolName);
            return crud.saveToDatabase(connectionString, statementString);
        }
        else
            return -1;
    }
}
