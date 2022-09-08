package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;

import java.util.List;

public interface IEnterpriseService {

    public Enterprise findById(long id);

    public List<Enterprise> findAll();

    public Enterprise createEnterprise(Enterprise empresa);

    public Enterprise updateEmpresa(long id, Enterprise empresa);

    public void deleteEnterprise(long id);
}
