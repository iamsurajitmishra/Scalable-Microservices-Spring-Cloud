package com.org.employeeservice.service;

import com.org.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("/api/department-service/{departmentCode}")
    DepartmentDto findByDepartmentCode(@PathVariable String departmentCode);
}
