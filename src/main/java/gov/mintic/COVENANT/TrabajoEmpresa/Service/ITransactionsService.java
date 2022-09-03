package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ITransactionsService {

    public Transactions findById(long id);

    public List<Transactions> findAll();

    public Transactions createTransaccion(Transactions transacciones);

    public Transactions updateTransaccion( long id, Transactions transacciones);

    public void deleteTransaccion( long id);

}
