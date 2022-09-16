package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empresas")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_enterprise",nullable = false)
    private long idEnterprise;


    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="documento",nullable = false)
    private String documento;
    @Column(name="numero_contacto",nullable = false)
    private String numeroTelefono;
    @Column(name="direccion",nullable = false)
    private String direccion;

    @OneToMany
    private List<Employee> usuarios = new ArrayList<>();

    @OneToMany
    private List<Transactions> transacciones = new ArrayList<>();

    private Date createdAt;
    private Date updatedAt;

    public Enterprise() {
    }

    public Enterprise(long id, String nombre, String documento, String numeroTelefono, String direccion, List<Employee> usuarios, List<Transactions> transacciones, Date createdAt, Date updatedAt) {
        this.idEnterprise = id;
        this.nombre = nombre;
        this.documento = documento;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return idEnterprise;
    }

    public void setId(long id) {
        this.idEnterprise = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Employee> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Employee> usuarios) {
        this.usuarios = usuarios;
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
        return "Enterprise{" +
                "id=" + idEnterprise +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuarios=" + usuarios +
                ", transacciones=" + transacciones +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
