package gov.mintic.COVENANT.TrabajoEmpresa.Service;

import gov.mintic.COVENANT.TrabajoEmpresa.Entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public Employee findById(long id) {
        Employee empleado = new Employee();
        Enterprise empresa = new Enterprise();
        Profile perfil = new Profile();
        Transactions transaccion = new Transactions();
        empleado.setId(id);
        empleado.setNombre("Andres Vargas");
        empleado.setCorreo("correo@gmail.com");
        empleado.setPerfil(perfil);
        RollName rollName = RollName.Administrativo;
        empleado.setRol(rollName);
        empleado.setEmpresa(new Enterprise(empresa.getId(), empresa.getNombre(), empresa.getDocumento(), empresa.getNumeroTelefono(), empresa.getDireccion(), empresa.getUsuarios(),empresa.getTransacciones(),empresa.getUpdatedAt(),empresa.getCreatedAt()));
        empleado.setTransacciones(new ArrayList<>());
        empleado.setUpdatedAt(new Date());
        empleado.setCreatedAt(new Date());
        return empleado;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> usuarios = new ArrayList<Employee>();
        Employee user1 = new Employee();
        Employee empleado = new Employee();
        Enterprise empresa = new Enterprise();
        Profile perfil = new Profile();
        Transactions transaccion = new Transactions();
        user1.setId(1);
        user1.setNombre("Phillip Suarez");
        user1.setCorreo("primero@gmail.com");
        user1.setPerfil(perfil);
        RollName rollName1 = RollName.Operador;
        user1.setRol(rollName1);
        user1.setEmpresa(new Enterprise(empresa.getId(), empresa.getNombre(), empresa.getDocumento(), empresa.getNumeroTelefono(), empresa.getDireccion(), empresa.getUsuarios(),empresa.getTransacciones(),empresa.getUpdatedAt(),empresa.getCreatedAt()));
        user1.setTransacciones(new ArrayList<>());
        user1.setUpdatedAt(new Date());
        user1.setCreatedAt(new Date());
        usuarios.add(user1);
        Employee user2 = new Employee();
        user2.setId(2);
        user2.setNombre("Leiya Mendoza");
        user2.setCorreo("segunda@gmail.com");
        user2.setPerfil(perfil);
        RollName rollName2 = RollName.Administrativo;
        user2.setRol(rollName2);
        user2.setEmpresa(new Enterprise(empresa.getId(), empresa.getNombre(), empresa.getDocumento(), empresa.getNumeroTelefono(), empresa.getDireccion(), empresa.getUsuarios(),empresa.getTransacciones(),empresa.getUpdatedAt(),empresa.getCreatedAt()));
        user2.setTransacciones(new ArrayList<>());
        user2.setUpdatedAt(new Date());
        user2.setCreatedAt(new Date());
        usuarios.add(user2);
        return usuarios;
    }

    @Override
    public Employee createEmpleado(Employee empleado) {
        Employee newEmpleado = new Employee();
        newEmpleado.setId(empleado.getId());
        newEmpleado.setNombre(empleado.getNombre());
        newEmpleado.setCorreo(empleado.getCorreo());
        newEmpleado.setPerfil(empleado.getPerfil());
        newEmpleado.setRol(empleado.getRol());
        newEmpleado.setEmpresa(empleado.getEmpresa());
        newEmpleado.setTransacciones(empleado.getTransacciones());
        newEmpleado.setUpdatedAt(empleado.getUpdatedAt());
        newEmpleado.setCreatedAt(empleado.getCreatedAt());
        return newEmpleado;
    }

    @Override
    public Employee updateEmployee(long id, Employee empleado) {
        Employee putEmpleado = findById(id);
        putEmpleado.setId(empleado.getId());
        putEmpleado.setNombre(empleado.getNombre());
        putEmpleado.setCorreo(empleado.getCorreo());
        putEmpleado.setPerfil(empleado.getPerfil());
        putEmpleado.setRol(empleado.getRol());
        putEmpleado.setEmpresa(empleado.getEmpresa());
        putEmpleado.setTransacciones(empleado.getTransacciones());
        putEmpleado.setUpdatedAt(empleado.getUpdatedAt());
        putEmpleado.setCreatedAt(empleado.getCreatedAt());
        return putEmpleado;
    }

    @Override
    public void deleteEmpleado(long id) {
        Employee deleteEmpleado = findById(id);

    }
}

