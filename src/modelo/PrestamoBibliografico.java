package modelo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrestamoBibliografico {

    private int idPrestamo;
    private String codigoPrestamo;
    private Timestamp fechaPrestamo;
    private Timestamp fechaLimite;
    private Timestamp fechaDevolucion;
    private String tipoPrestamo;
    private int idMaterial;
    private int idUsuario;
    private MaterialBibliografico material;
    private Usuario usuario;

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public Timestamp getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Timestamp fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Timestamp getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Timestamp fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public MaterialBibliografico getMaterial() {
        return material;
    }

    public void setMaterial(MaterialBibliografico material) {
        this.material = material;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Date getFechaDev(String tipo) {
        Calendar c = Calendar.getInstance();

        switch (tipo) {
            case "Interno": {
                c.add(Calendar.DAY_OF_YEAR, -1);
                for (int i = 0; i < 7; i++) {
                    c.add(Calendar.DAY_OF_YEAR, 1);
                    if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                        c.add(Calendar.DAY_OF_YEAR, 1);
                    }
                }
                if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    c.add(Calendar.DAY_OF_YEAR, 1);
                }

                return c.getTime();
            }
            case "Externo": {
                c.add(Calendar.HOUR, 2);

                if (c.get(Calendar.HOUR) >= 9) {
                    System.out.println("No se puede generar el prestamo");
                }
                return c.getTime();
            }
            default: {
                System.out.println("El caso insertado es incorrecto!");
            }
        }

        return null;
    }

}
