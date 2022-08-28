package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api")

public class EnterpriseRestController {

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        Enterprise empresa = new Enterprise();
        Employee empleado = new Employee();
        Transactions transacciones = new Transactions();
        empresa.setId(1);
        empresa.setNombre("Coca Cola");
        empresa.setDocumento("800193639");
        empresa.setNumeroTelefono("3158278615");
        empresa.setDireccion("Mz 27 Lte 403 Videlso");
        empresa.setUsuarios(new ArrayList<>());
        empresa.setTransacciones(new ArrayList<>());
        empresa.setUpdatedAt(new Date());
        empresa.setCreatedAt(new Date());

        return empresa;
    }
}
