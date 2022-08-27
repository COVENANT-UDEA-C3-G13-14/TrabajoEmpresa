package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import java.util.Arrays;

public class Enterprise {

    private long idEmpresa;
    private String nombre;
    private String documento;
    private String numeroTelefono;
    private String direccion;
    private Employee empleado[];
    private Transactions tansacciones[];

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
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

    public Employee[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Employee[] empleado) {
        this.empleado = empleado;
    }

    public Transactions[] getTansacciones() {
        return tansacciones;
    }

    public void setTansacciones(Transactions[] tansacciones) {
        this.tansacciones = tansacciones;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "idEmpresa=" + idEmpresa +
                ", nombres='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleado=" + Arrays.toString(empleado) +
                ", tansacciones=" + Arrays.toString(tansacciones) +
                '}';
    }
}
