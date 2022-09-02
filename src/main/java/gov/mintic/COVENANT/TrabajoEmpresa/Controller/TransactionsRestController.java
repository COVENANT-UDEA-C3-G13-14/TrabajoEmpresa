package gov.mintic.COVENANT.TrabajoEmpresa.Controller;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Employee;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Enterprise;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Profile;
import gov.mintic.COVENANT.TrabajoEmpresa.Entity.Transactions;
import gov.mintic.COVENANT.TrabajoEmpresa.Service.ITransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionsRestController {

    @Autowired
    private ITransactionsService TransactionsService;

    @GetMapping("/transactions/{id}")
    public Transactions findById(@PathVariable long id) {
        return TransactionsService.findById(id);
    }

    @GetMapping("/transactions")
    public List<Transactions> findAll() {
        return TransactionsService.findAll();
    }

    @PostMapping ("/transactions")
    public Transactions createTransaccion(@RequestBody Transactions transacciones) {
        return TransactionsService.createTransaccion(transacciones);
    }

    @PutMapping ("/transactions/{id}")
    public Transactions updateTransaccion(@PathVariable long id, @RequestBody Transactions transacciones) {
        return TransactionsService.updateTransaccion(id,transacciones);
    }

    @DeleteMapping ("/transactions/{id}")
    public void deleteTransaccion(@PathVariable long id) {
        TransactionsService.deleteTransaccion(id);
    }
}