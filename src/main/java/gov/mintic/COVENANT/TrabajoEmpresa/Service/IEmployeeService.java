package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

public interface IEmployeeService {

    public Employee findById(long id);

    public List<Employee> findAll();

    public Employee createEmpleado(Employee empleado);

    public Employee updateEmployee( long id, Employee empleado);

    public void deleteEmpleado(long id);

}
