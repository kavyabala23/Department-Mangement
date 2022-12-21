package com.example.Departments.Exceptions;

public class StudentsNotFoundException  extends RuntimeException {
    public StudentsNotFoundException (Long id) {
       super ("Could not find student " + id);
      }
}