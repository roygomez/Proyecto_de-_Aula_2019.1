
package modelo;

import java.sql.Date;


public class Multa {
    
    private int idMulta;
    private Date fechaMulta;
    private double valorMulta;
    private Date fechaPago;
    private String motivoMulta;
    private boolean controlPago;
    private int idUsuario;
    private Usuario usuario;

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public Date getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMotivoMulta() {
        return motivoMulta;
    }

    public void setMotivoMulta(String motivoMulta) {
        this.motivoMulta = motivoMulta;
    }

    public boolean isControlPago() {
        return controlPago;
    }

    public void setControlPago(boolean controlPago) {
        this.controlPago = controlPago;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
