package com.org.departmentservice.repository;

import com.org.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
        Department findByDepartmentCode(String departmentCode);
}
