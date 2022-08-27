package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import java.util.Date;

public class Transactions {

    private long idTransaccion;
    private String concepto;
    private String monto;
    private Employee usuario;
    private Enterprise empresa;
    private Date fCreacion;
    private Date fActualizacion;

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

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Employee getUsuario() {
        return usuario;
    }

    public void setUsuario(Employee usuario) {
        this.usuario = usuario;
    }

    public Enterprise getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Enterprise empresa) {
        this.empresa = empresa;
    }

    public Date getfCreacion() {
        return fCreacion;
    }

    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    public Date getfActualizacion() {
        return fActualizacion;
    }

    public void setfActualizacion(Date fActualizacion) {
        this.fActualizacion = fActualizacion;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "idTransaccion=" + idTransaccion +
                ", concepto='" + concepto + '\'' +
                ", monto='" + monto + '\'' +
                ", usuario=" + usuario +
                ", empresa=" + empresa +
                ", fCreacion=" + fCreacion +
                ", fActualizacion=" + fActualizacion +
                '}';
    }
}
