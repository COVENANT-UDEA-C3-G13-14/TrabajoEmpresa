package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")


public class EmployeeRestController {


    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable long id){
        Employee empleado = new Employee();
        empleado.setIdEmpleado(id);
        empleado.setCorreo("correo@123.com");
        empleado.setNombre("pedro perez");
        empleado.setTelefono("123456987");

        return empleado;


    }

}
