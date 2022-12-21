package com.example.Departments.Exceptions;

public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException(Long id) {
        super("Could not find" + id);
      }
}
