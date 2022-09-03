package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ProfileService implements IProfileService {
    @Override
    public Profile findById(long id) {
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
