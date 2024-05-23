package com.org.employeeservice.controller;


import com.org.employeeservice.dto.APIResponseDto;
import com.org.employeeservice.dto.EmployeeDto;
import com.org.employeeservice.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(
        name = "Employee Service CRUD APP",
        description = "Employee can be added, deleted , updated, read from DB"
)
@RestController
@RequestMapping("/api/employee-service")
@AllArgsConstructor
public class EmployeeController {

    private  EmployeeService employeeService;


    @PostMapping("/save")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return new  ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);

    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<APIResponseDto> getEmployeeById(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }
    
}
