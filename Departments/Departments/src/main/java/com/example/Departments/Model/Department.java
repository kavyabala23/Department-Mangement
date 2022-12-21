package com.example.Departments.Model;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Department {
    
    @Id 
    @GeneratedValue 
    private Long id;
    private String name;
    private String description;
    
    


    Department(){ 
    }
  
    public Long getDepartmentId() {
        return id;
    }

    public void setDepartmentId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

   
    @Override
    public String toString() {
         return "Department [id=" + id + ", name=" + name + ", description=" + description + "]";//"techers"+ teachersList+
    }
   

}

