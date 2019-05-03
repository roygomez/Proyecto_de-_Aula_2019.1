
package modelo;

import java.util.ArrayList;
import java.sql.Date;


public class PrestamoBibliografico {
    
    private int idPrestamo;
    private ArrayList<MaterialBibliografico> material;
    private Persona persona;
    private Date fechaPrestamo;
    private Date fechaLimite;
    private Date fechaDevolucion;
    private String tipoPrestamo;

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public ArrayList<MaterialBibliografico> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<MaterialBibliografico> material) {
        this.material = material;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }
}
