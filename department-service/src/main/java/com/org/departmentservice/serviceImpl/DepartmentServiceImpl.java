package com.org.departmentservice.serviceImpl;

import com.org.departmentservice.dto.DepartmentDTO;
import com.org.departmentservice.entity.Department;
import com.org.departmentservice.repository.DepartmentRepository;
import com.org.departmentservice.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    private ModelMapper modelMapper;

    /**
     * Department will be saved using this save(department) service method
     * @param departmentDTO
     * @return
     */
    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        Department department = modelMapper.map(departmentDTO, Department.class);
        Department savedDepartment=departmentRepository.save(department);

        return modelMapper.map(savedDepartment, DepartmentDTO.class);
    }

    /**
     *
     * @return
     */
    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<Department> departments=departmentRepository.findAll();
        return departments.stream().map(department -> modelMapper.map(department, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDTO getDepartmentById(Long id) {
        Optional<Department> department=departmentRepository.findById(id);
        if(department.isPresent()) {
            return modelMapper.map(department.get(), DepartmentDTO.class);
        }
        return null;
    }

    @Override
    public DepartmentDTO findDepartmentByDepartmentCode(String departmentCode) {
        Department department=departmentRepository.findByDepartmentCode(departmentCode);
        return modelMapper.map(department, DepartmentDTO.class);
    }
}
