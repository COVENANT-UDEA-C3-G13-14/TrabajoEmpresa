package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.RollName;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
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
        empleado.setId(id);
        empleado.setCorreo("correo@123.com");
        empleado.setNombre("pedro perez");
        empleado.setEmpresa(empleado.getEmpresa());
        RollName rollName = RollName.Administrativo;
        empleado.setRol(rollName);
        //empleado.setPerfil(empleado.getPerfil());
        //empleado.setTransacciones(empleado.getTransacciones());
        //empleado.setTelefono("123456987");
        //RollName rollName = RollName.UsuarioAdministrativo;
        //empleado.setRol(rollName);
        //Enterprise enterprise = new Enterprise() ;
        //enterprise.setIdEmpresa(1);
        //enterprise.setNombres("COVENANT");
        //enterprise.setDocumento("1024452112-9");
        //enterprise.setNumeroTelefono("5555555");
        //enterprise.setDireccion("fasdlñjkñ");
        //Transactions transactions = new Transactions();
        //transactions.setIdTransaccion(1);
        //transactions.setConcepto("recaudo");
        //transactions.setMonto(100000);
        return empleado;


    }

}
