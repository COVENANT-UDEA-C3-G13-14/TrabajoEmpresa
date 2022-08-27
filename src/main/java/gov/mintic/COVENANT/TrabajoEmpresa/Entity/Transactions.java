package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import java.util.Date;

public class Transactions {

    private long idTransaccion;
    private String concepto;
    private float monto;

    private Employee empleado;
    private Enterprise empresa;

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Employee getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Employee empleado) {
        this.empleado = empleado;
    }

    public Enterprise getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Enterprise empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "idTransaccion=" + idTransaccion +
                ", concepto='" + concepto + '\'' +
                ", monto='" + monto + '\'' +
                ", usuario=" + empleado +
                ", empresa=" + empresa +
                '}';
    }
}
