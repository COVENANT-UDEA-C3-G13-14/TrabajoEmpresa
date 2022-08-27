package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import org.springframework.context.annotation.Profile;

import java.util.Arrays;

public class Employee {

    private long idEmpleado;
    private String correo;
    private String Imagen;
    private String nombre;
    private String telefono;
    private String rol;
    private Enterprise empresa;
    private Transactions transsacciones[];


    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Enterprise getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Enterprise empresa) {
        this.empresa = empresa;
    }

    public Transactions[] getTranssacciones() {
        return transsacciones;
    }

    public void setTranssacciones(Transactions[] transsacciones) {
        this.transsacciones = transsacciones;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmpleado=" + idEmpleado +
                ", correo='" + correo + '\'' +
                ", Imagen='" + Imagen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol='" + rol + '\'' +
                ", empresa=" + empresa +
                ", transsacciones=" + Arrays.toString(transsacciones) +
                '}';
    }
}
