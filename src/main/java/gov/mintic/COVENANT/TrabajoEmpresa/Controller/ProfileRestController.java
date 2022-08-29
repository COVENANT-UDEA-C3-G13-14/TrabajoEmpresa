package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable long id) {
        Profile perfil = new Profile();
        Employee empleado = new Employee();
        perfil.setId(1);
        perfil.setImage("Foto");
        perfil.setPhone("3014071406");
        perfil.setEmpleado(new Employee());
        perfil.setUpdatedAt(new Date());
        perfil.setCreatedAt(new Date());
        return perfil;


    }
}
