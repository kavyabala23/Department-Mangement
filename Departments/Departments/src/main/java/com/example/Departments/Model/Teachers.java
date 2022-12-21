package com.example.Departments.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity

public class Teachers {

// private final DepartmentRepository repository;


  @Id
  @GeneratedValue 
  private Long teach_id;
  private String name;
  private String email;
  private String mobile_num;

  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
  @ManyToOne(fetch = FetchType.LAZY) 
  @JoinColumn(name ="department_id")
  private Department department; 

  Teachers(){  

  }

public Teachers (String name,String email,String mobile_num, Department department){
    this.name =name;
    this.email=email;
    this.mobile_num =mobile_num;
    this.department = department;
    
}
public Long getTeach_id() {
    return teach_id;
}
public void setTeach_id(Long teach_id) {
    this.teach_id = teach_id;
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
    return "Teachers [teacher_id=" + teach_id + ", name=" + name +" email=" + email + ", mobile_num=" + mobile_num + "]";
}



}
