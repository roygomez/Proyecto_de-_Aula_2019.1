
package modelo;

import java.util.ArrayList;




public class Usuario extends Persona {
    
    private String tipoUsuario;
    private boolean inscrito;
    private ArrayList<Multa> multas;
    private String codigoInstitucional;
    private double pagoAnual;
    private boolean controlPago; 

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the inscrito
     */
    public boolean isInscrito() {
        return inscrito;
    }

    /**
     * @param inscrito the inscrito to set
     */
    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }

    /**
     * @return the codigoInstitucional
     */
    public String getCodigoInstitucional() {
        return codigoInstitucional;
    }

    /**
     * @param codigoInstitucional the codigoInstitucional to set
     */
    public void setCodigoInstitucional(String codigoInstitucional) {
        this.codigoInstitucional = codigoInstitucional;
    }

    /**
     * @return the pagoAnual
     */
    public double getPagoAnual() {
        return pagoAnual;
    }

    /**
     * @param pagoAnual the pagoAnual to set
     */
    public void setPagoAnual(double pagoAnual) {
        this.pagoAnual = pagoAnual;
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
