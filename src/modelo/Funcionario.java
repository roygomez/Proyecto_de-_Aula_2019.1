
package modelo;


public class Funcionario extends Persona {
    
    private String rol;

    @Override
    public String toString() {
        return "Funcionario{" + "rol=" + rol + '}';
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
}
