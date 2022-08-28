package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionsRestController {

    @GetMapping("/transactions/{id}")
    public Transactions findById(@PathVariable long id) {
        Transactions transacciones = new Transactions();
        transacciones.setId(1);
        transacciones.setConcepto("Aporte de Socios");
        transacciones.setMonto(1000000);
        transacciones.setEmpleado(transacciones.getEmpleado());
        transacciones.setEmpresa(transacciones.getEmpresa());
        transacciones.setUpdatedAt(transacciones.getUpdatedAt());
        transacciones.setCreatedAt(transacciones.getCreatedAt());
        return transacciones;
        //Transactions transacciones1 = new Transactions();
        //transacciones1.setId(2);
        //transacciones1.setConcepto("Adelanto Arriendo Local");
        //transacciones1.setMonto(-300000);
        //transacciones1.setEmpleado(transacciones1.getEmpleado());
        //transacciones1.setEmpresa(transacciones1.getEmpresa());
        //transacciones1.setUpdatedAt(transacciones1.getUpdatedAt());
        //transacciones1.setCreatedAt(transacciones1.getCreatedAt());
        //return transacciones1;
    }

}
