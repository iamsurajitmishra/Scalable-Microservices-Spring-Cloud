package com.org.employeeservice.service;

import com.org.employeeservice.dto.APIResponseDto;
import com.org.employeeservice.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
    APIResponseDto getEmployeeById(Long id);
}
