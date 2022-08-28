package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable long id){
        Employee empleado = new Employee();
        Enterprise empresa = new Enterprise();
        Profile perfil = new Profile();
        Transactions transaccion = new Transactions();
        empleado.setId(id);
        empleado.setNombre("Andres Vargas");
        empleado.setCorreo("correo@gmail.com");
        empleado.setPerfil(perfil);
        RollName rollName = RollName.Administrativo;
        empleado.setRol(rollName);
        empleado.setEmpresa(new Enterprise(empresa.getId(), empresa.getNombre(), empresa.getDocumento(), empresa.getNumeroTelefono(), empresa.getDireccion(), empresa.getUsuarios(),empresa.getTransacciones(),empresa.getUpdatedAt(),empresa.getCreatedAt()));
        empleado.setTransacciones(new ArrayList<>());
        empleado.setUpdatedAt(new Date());
        empleado.setCreatedAt(new Date());
        return empleado;


    }

}
