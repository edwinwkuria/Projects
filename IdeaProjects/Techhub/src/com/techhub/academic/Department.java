package com.techhub.academic;

import java.util.ArrayList;
import java.util.List;

import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;

public class Department {
    //Properties
    protected int id;
    protected String name;
    private String chairman;
    private int school;
    protected List<Department> departments= new ArrayList<>();
    /**
     * Constructor
     */
    public Department(){

    }
    public Department(int id, String name, String chairman, int school) {
        this.id = id;
        this.name = name;
        this.chairman = chairman;
        this.school= school;
    }
    /**
     * Accessors and Mutators
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }
    /**
     * To String method
     */
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chairman='" + chairman + '\'' +
                '}';
    }
    /**
     *
     * initialize
     */

    public static Department economictheory = new Department(1,"Economic Theory","Dr Ouma", economics.getId());
    public static Department appliedeconomics = new Department(2,"Applied Economics","Dr KOsgei",economics.getId());
    public static Department programming = new Department(3, "Programming","Dr Njenga",computing.getId());
    public static Department datascience = new Department(4,"Data Science","Dr Rashid",computing.getId());
}
