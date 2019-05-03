
package modelo;

import java.sql.Date;


public class Multa {
    
    private int idMulta;
    private Date fechaMulta;
    private double valorMulta;
    private Date fechaPago;
    private String motivoMulta;
    private boolean controlPago;

    /**
     * @return the idMulta
     */
    public int getIdMulta() {
        return idMulta;
    }

    /**
     * @param idMulta the idMulta to set
     */
    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    /**
     * @return the fechaMulta
     */
    public Date getFechaMulta() {
        return fechaMulta;
    }

    /**
     * @param fechaMulta the fechaMulta to set
     */
    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    /**
     * @return the valorMulta
     */
    public double getValorMulta() {
        return valorMulta;
    }

    /**
     * @param valorMulta the valorMulta to set
     */
    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the motivoMulta
     */
    public String getMotivoMulta() {
        return motivoMulta;
    }

    /**
     * @param motivoMulta the motivoMulta to set
     */
    public void setMotivoMulta(String motivoMulta) {
        this.motivoMulta = motivoMulta;
    }

    /**
     * @return the controlPago
     */
    public boolean isControlPago() {
        return controlPago;
    }

    /**
     * @param controlPago the controlPago to set
     */
    public void setControlPago(boolean controlPago) {
        this.controlPago = controlPago;
    }

    
    
}
