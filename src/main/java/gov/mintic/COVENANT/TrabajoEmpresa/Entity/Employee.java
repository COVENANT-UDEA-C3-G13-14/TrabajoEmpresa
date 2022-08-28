package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String correo;
    private String nombre;

    @OneToOne
    private Profile perfil;

    @OneToMany
    private RollName rol;

    @ManyToOne
    private Enterprise empresa;

    @OneToMany
    private List<Transactions> transacciones = new ArrayList<>();

    private Date createdAt;
    private Date updatedAt;

    public Employee() {
    }

    public Employee(long id, String correo, String nombre, Profile perfil, RollName rol, Enterprise empresa, List<Transactions> transacciones, Date createdAt, Date updatedAt) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public RollName getRol() {
        return rol;
    }

    public void setRol(RollName rol) {
        this.rol = rol;
    }

    public Enterprise getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Enterprise empresa) {
        this.empresa = empresa;
    }

    public List<Transactions> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transactions> transacciones) {
        this.transacciones = transacciones;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", perfil=" + perfil +
                ", rol=" + rol +
                ", empresa=" + empresa +
                ", transacciones=" + transacciones +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
