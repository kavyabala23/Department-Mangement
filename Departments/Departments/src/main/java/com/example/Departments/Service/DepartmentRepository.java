package com.example.Departments.Service;
import com.example.Departments.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository(jpa -java presistence API)contains the full API of CrudRepository(create,read,update,delete)and PagingAndSortingRepository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
