package com.techhub.services;

public interface AcademicI {
    public void Add(Object o);
    public void Read(Object[] o);
    public void Edit(Object o, Object obj);
    public void Delete(Object o);
    public Object FindOne(Object o);
    public int size();
    public String getClassName(int i);


}
