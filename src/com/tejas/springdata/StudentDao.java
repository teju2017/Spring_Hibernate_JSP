package com.tejas.springdata;

import java.util.List;

public interface StudentDao 
{
    public List<Student> getStudents();
    
    public void insertData(Student theStudent);
    
    public void deleteData(Student theStudent);
    
}
