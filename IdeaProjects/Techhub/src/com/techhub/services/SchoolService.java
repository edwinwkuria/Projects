package com.techhub.services;

import com.techhub.academic.School;

import java.util.concurrent.atomic.AtomicReference;

public class SchoolService extends School implements AcademicI  {

    @Override
    public void Add (Object o) {
        School school = (School) o;
        schools.add(school);
    }

    @Override
    public void Read(Object o) {
        for (School school : schools) {
            System.out.println(school);
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
        //System.out.println(getSchools());
        //return "Hello World";

    }
}