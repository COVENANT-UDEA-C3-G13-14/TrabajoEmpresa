package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import org.springframework.web.bind.annotation.PathVariable;

public interface IProfileService {

    public Profile findById( long id);
}
