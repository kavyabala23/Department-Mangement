package com.example.Departments.Model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

public class Students {
 @Id 
 @GeneratedValue
  private  Long stud_id;
  private String name;
  private String email;
  private String mobile_num;
 
   
  @ManyToOne(fetch = FetchType.LAZY) 
  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
  private Department department; 
  
Students(){

  }

Students (String name,String email,String mobile_num){
    this.name =name;
    this.email=email;
    this.mobile_num =mobile_num;
    
   
}
public Long getStud_id() {
    return stud_id;
}
public void setStud_id(Long stud_id) {
    this.stud_id = stud_id;
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getMobile_num() {
    return mobile_num;
}
public void setMobile_num(String mobile_num) {
    this.mobile_num = mobile_num;
}

public Department getDepartment() {
    return department;
}

public void setDepartment(Department department) {
    this.department = department;
}
@Override
public String toString() {
    return "Students [ student_id=" + stud_id + ", name=" + name +" email=" + email + ", mobile_num=" + mobile_num + "]";
}

}
