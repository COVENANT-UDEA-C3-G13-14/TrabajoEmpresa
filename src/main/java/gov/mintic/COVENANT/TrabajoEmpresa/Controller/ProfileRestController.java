package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.IProfileService;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.ITransactionsService;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class ProfileRestController {
    @Autowired
    private IProfileService ProfileService;
    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable long id) {
        return ProfileService.findById(id);


    }
}
