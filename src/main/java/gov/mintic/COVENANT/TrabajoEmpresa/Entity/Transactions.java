package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import java.util.Date;

public class Transactions {

    private long idTransaccion;
    private String concepto;
    private String monto;
    private Employee usuario;
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


    @Override
    public String toString() {
        return "Transactions{" +
                "idTransaccion=" + idTransaccion +
                ", concepto='" + concepto + '\'' +
                ", monto='" + monto + '\'' +
                ", usuario=" + usuario +
                ", empresa=" + empresa +
                '}';
    }
}
