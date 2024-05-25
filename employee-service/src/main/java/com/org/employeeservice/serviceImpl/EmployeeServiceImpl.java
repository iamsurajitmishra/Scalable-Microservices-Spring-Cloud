package com.org.employeeservice.serviceImpl;

import com.org.employeeservice.dto.APIResponseDto;
import com.org.employeeservice.dto.DepartmentDto;
import com.org.employeeservice.dto.EmployeeDto;
import com.org.employeeservice.entity.Employee;
import com.org.employeeservice.repository.EmployeeRepository;
import com.org.employeeservice.service.APIClient;
import com.org.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;
    private APIClient apiClient;
    //private RestTemplate restTemplate;
    //private WebClient webClient;


    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee=employeeRepository.save(employee);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
       return  employeeList.stream().map(employee -> modelMapper.map(employee, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public APIResponseDto getEmployeeById(Long id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        EmployeeDto employeeDto = modelMapper.map(optionalEmployee.get(), EmployeeDto.class);

        //ResponseEntity<DepartmentDto> responseEntityDepartmentDto = restTemplate.getForEntity("http://localhost:8080/api/department-service/"+optionalEmployee.get().getDepartmentCode(), DepartmentDto.class);
//        DepartmentDto departmentDto = webClient.get().uri("http://localhost:8080/api/department-service/"+optionalEmployee.get().getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();

       DepartmentDto departmentDto = apiClient.findByDepartmentCode(employeeDto.getDepartmentCode());

        //DepartmentDto departmentDto =responseEntityDepartmentDto.getBody();
        
        //API response
        APIResponseDto apiResponseDto =new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);

        return apiResponseDto;
    }
}
