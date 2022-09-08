package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EnterpriseRestController {

    @Autowired
    private IEnterpriseService EnterpriseService;

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        return EnterpriseService.findById(id);
    }
    @GetMapping("/enterprise")
    public List<Enterprise> findAll() {

        return EnterpriseService.findAll();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise empresa) {

        return EnterpriseService.createEnterprise(empresa);
    }

    @PutMapping ("/enterprise/{id}")
    public Enterprise updateEmpresa(@PathVariable long id, @RequestBody Enterprise empresa) {
        return EnterpriseService.updateEmpresa(id, empresa);
    }

    @DeleteMapping ("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable long id) {
        
        Enterprise deleteEnterprise = findById(id);
    }
}


