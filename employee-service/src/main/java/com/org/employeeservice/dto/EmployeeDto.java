package com.org.employeeservice.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
    private Long id;
    private String empFirstName;
    private String empLastName;
    private String email;
    private String departmentCode;
}
