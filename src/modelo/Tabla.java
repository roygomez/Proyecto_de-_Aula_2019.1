
package modelo;


public class Tabla {
    
    private int cantNom=0;
    
    String [] [] tabla = new String [9999][2];
    
    public int getCantNom(){
        return cantNom;
    }
    
    public String [][] getTabla(){
        return tabla;
    }
    
    public void push(String nombre){
        int i=0;
        while(i<cantNom){
            if (nombre.equals(tabla[i][0])) {
                tabla[i][1]= Integer.toString(Integer.parseInt(tabla[i][1])+1);
                return;
            }
            i++;
        }
        tabla[cantNom][0] = nombre;
        tabla[cantNom][1]="1";
        cantNom++;
        
    }
    
}
