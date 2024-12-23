package ObjetosFunciones;

public class ManuelesF {

    //variables
    
    private final String nombre = "Manuel";
    private static int apellido=-1;
    private int edad;
    
    //constructores
    
    public ManuelesF(int edad) {
        this.edad = edad;
        apellido++;
    }
    
    //getters
    
    public static int getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Manueles{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

  
    
    
}
