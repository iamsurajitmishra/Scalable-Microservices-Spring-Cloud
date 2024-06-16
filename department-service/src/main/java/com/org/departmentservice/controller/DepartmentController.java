package com.org.departmentservice.controller;
import com.org.departmentservice.dto.DepartmentDTO;

import com.org.departmentservice.services.DepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(
        name = "Department Service CRUD APP",
        description = "Department can be added, deleted , updated, read from DB"
)
@RestController
@RequestMapping("/api/department-service")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    /**
     * Save a department
     * In mysql db
     * @param departmentDTO
     * @return
     */
    @PostMapping("/save")
    public DepartmentDTO saveDepartment(@RequestBody DepartmentDTO departmentDTO){
        return departmentService.saveDepartment(departmentDTO);
    }

    /**
     *
     * @return
     */
    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }


    @GetMapping("/departments/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable Long id){
        return new ResponseEntity<>(departmentService.getDepartmentById(id), HttpStatus.OK);
    }

    @GetMapping("/{departmentCode}")
    public ResponseEntity<DepartmentDTO> findByDepartmentCode(@PathVariable String departmentCode){
        return new ResponseEntity<>(departmentService.findDepartmentByDepartmentCode(departmentCode), HttpStatus.OK);
    }

}
