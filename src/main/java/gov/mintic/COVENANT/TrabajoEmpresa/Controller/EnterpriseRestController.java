package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class EnterpriseRestController {

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        Enterprise empresa = new Enterprise();
        empresa.setId(id);
        empresa.setNombre("Cocacola");
        empresa.setDocumento("1234");
        empresa.setNumeroTelefono("55555");
        empresa.setDireccion("av 2");
        //empresa.setEmpleado(empleado[Employee]);
        //empresa.setTansacciones();
        return empresa;
    }
}
