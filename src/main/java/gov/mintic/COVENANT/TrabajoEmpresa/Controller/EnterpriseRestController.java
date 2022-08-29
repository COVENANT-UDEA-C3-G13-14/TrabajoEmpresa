package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EnterpriseRestController {

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        Enterprise empresa = new Enterprise();
        Employee empleado = new Employee();
        Transactions transacciones = new Transactions();
        empresa.setId(1);
        empresa.setNombre("Alumar");
        empresa.setDocumento("800193639");
        empresa.setNumeroTelefono("3158278615");
        empresa.setDireccion("Mz 27 Lte 403 Videlso");
        empresa.setUsuarios(new ArrayList<>());
        empresa.setTransacciones(new ArrayList<>());
        empresa.setUpdatedAt(new Date());
        empresa.setCreatedAt(new Date());
        return empresa;
    }
    @GetMapping("/enterprise")
    public List<Enterprise> findAll() {
        List<Enterprise> empresas = new ArrayList<Enterprise>();
        Enterprise empresa1 = new Enterprise();
        Employee empleado = new Employee();
        Transactions transacciones = new Transactions();
        empresa1.setId(1);
        empresa1.setNombre("Coca Cola");
        empresa1.setDocumento("800123456");
        empresa1.setNumeroTelefono("5822083");
        empresa1.setDireccion("Cll 0 AN 10-38");
        empresa1.setUsuarios(new ArrayList<>());
        empresa1.setTransacciones(new ArrayList<>());
        empresa1.setUpdatedAt(new Date());
        empresa1.setCreatedAt(new Date());
        empresas.add(empresa1);
        Enterprise empresa2 = new Enterprise();
        empresa2.setId(2);
        empresa2.setNombre("Postobon");
        empresa2.setDocumento("900678987");
        empresa2.setNumeroTelefono("5807875");
        empresa2.setDireccion("Av 23 4-36");
        empresa2.setUsuarios(new ArrayList<>());
        empresa2.setTransacciones(new ArrayList<>());
        empresa2.setUpdatedAt(new Date());
        empresa2.setCreatedAt(new Date());
        empresas.add(empresa2);
        return empresas;
    }

    @PostMapping("/enterprise")
    public Enterprise createEmpresa(@RequestBody Enterprise empresa) {
        Enterprise newEmpresa = new Enterprise();
        newEmpresa.setId(empresa.getId());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setDocumento(empresa.getDocumento());
        newEmpresa.setNumeroTelefono(empresa.getNumeroTelefono());
        newEmpresa.setDireccion(empresa.getDireccion());
        newEmpresa.setUsuarios(empresa.getUsuarios());
        newEmpresa.setTransacciones(empresa.getTransacciones());
        newEmpresa.setUpdatedAt(empresa.getUpdatedAt());
        newEmpresa.setCreatedAt(empresa.getCreatedAt());
        return newEmpresa;
    }

    @PutMapping ("/enterprise/{id}")
    public Enterprise updateEnterprise(@PathVariable long id, @RequestBody Enterprise empresa) {
        Enterprise putEmpresa = findById(id);
        putEmpresa.setId(empresa.getId());
        putEmpresa.setNombre(empresa.getNombre());
        putEmpresa.setDocumento(empresa.getDocumento());
        putEmpresa.setNumeroTelefono(empresa.getNumeroTelefono());
        putEmpresa.setDireccion(empresa.getDireccion());
        putEmpresa.setUsuarios(empresa.getUsuarios());
        putEmpresa.setTransacciones(empresa.getTransacciones());
        putEmpresa.setUpdatedAt(empresa.getUpdatedAt());
        putEmpresa.setCreatedAt(empresa.getCreatedAt());
        return putEmpresa;
    }

    @DeleteMapping ("/enterprise/{id}")
    public void deleteEmpresa(@PathVariable long id) {
        Enterprise deleteEmpresa = findById(id);
    }
}


