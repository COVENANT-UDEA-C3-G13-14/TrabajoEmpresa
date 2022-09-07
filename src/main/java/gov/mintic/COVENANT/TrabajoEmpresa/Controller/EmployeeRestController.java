package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private IEmployeeService EmployeeService;

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable long id){
        return EmployeeService.findById(id);

    }
    @GetMapping("/employee")
    public List<Employee> findAll() {
        return EmployeeService.findAll();
    }

    @PostMapping("/employee")
    public Employee createEmpleado(@RequestBody Employee empleado) {
        return EmployeeService.createEmpleado(empleado);
    }

    @PutMapping ("/employee/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee empleado) {
        return EmployeeService.updateEmployee(id, empleado);
    }

    @DeleteMapping ("/employee/{id}")
    public void deleteEmpleado(@PathVariable long id) {
        EmployeeService.deleteEmpleado(id);
    }
}
