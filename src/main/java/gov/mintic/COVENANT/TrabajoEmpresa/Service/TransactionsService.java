package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class TransactionsService implements ITransactionsService{


    @Override
    public Transactions findById(long id) {
        Transactions transaccion = new Transactions();
        Employee empleado = new Employee();
        Enterprise empresa = new Enterprise();
        transaccion.setId(1);
        transaccion.setConcepto("Aporte de Socios");
        transaccion.setMonto(5000000);
        transaccion.setEmpleado(new Employee());
        transaccion.setEmpresa(new Enterprise());
        transaccion.setUpdatedAt(new Date());
        transaccion.setCreatedAt(new Date());
        return transaccion;
    }

    @Override
    public List<Transactions> findAll() {
        List<Transactions> transacciones = new ArrayList<Transactions>();
        Transactions transacciones1 = new Transactions();
        Employee empleado = new Employee();
        Enterprise empresa = new Enterprise();
        transacciones1.setId(1);
        transacciones1.setConcepto("Adelanto Arriendo Local");
        transacciones1.setMonto(-500000);
        transacciones.add(transacciones1);
        transacciones1.setEmpleado(new Employee());
        transacciones1.setEmpresa(new Enterprise());
        transacciones1.setUpdatedAt(new Date());
        transacciones1.setCreatedAt(new Date());
        Transactions transacciones2 = new Transactions();
        transacciones2.setId(2);
        transacciones2.setConcepto("Estanteria");
        transacciones2.setMonto(-400000);
        transacciones2.setEmpleado(new Employee());
        transacciones2.setEmpresa(new Enterprise());
        transacciones2.setUpdatedAt(new Date());
        transacciones2.setCreatedAt(new Date());
        transacciones.add(transacciones2);
        return transacciones;
    }

    @Override
    public Transactions createTransaccion(Transactions transacciones) {
        Transactions newTransaccion = new Transactions();
        newTransaccion.setId(transacciones.getId());
        newTransaccion.setConcepto(transacciones.getConcepto());
        newTransaccion.setMonto(transacciones.getMonto());
        newTransaccion.setEmpleado(transacciones.getEmpleado());
        newTransaccion.setEmpresa(transacciones.getEmpresa());
        newTransaccion.setUpdatedAt(transacciones.getUpdatedAt());
        newTransaccion.setCreatedAt(transacciones.getCreatedAt());
        return newTransaccion;
    }

    @Override
    public Transactions updateTransaccion(long id, Transactions transacciones) {
        Transactions putTransaccion = findById(id);
        putTransaccion.setConcepto(transacciones.getConcepto());
        putTransaccion.setMonto(transacciones.getMonto());
        putTransaccion.setEmpleado(transacciones.getEmpleado());
        putTransaccion.setEmpresa(transacciones.getEmpresa());
        putTransaccion.setUpdatedAt(transacciones.getUpdatedAt());
        putTransaccion.setCreatedAt(transacciones.getCreatedAt());
        return putTransaccion;
    }

    @Override
    public void deleteTransaccion(long id) {
        Transactions deleteTransaction = findById(id);

    }
}
