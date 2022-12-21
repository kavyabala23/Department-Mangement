package com.example.Departments.Exceptions;

public class TeachersNotFoundException extends RuntimeException {
    public TeachersNotFoundException(Long id) {
       super ("Could not find teacher " + id);
      }
}
