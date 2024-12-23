package ObjetosFunciones;

public class Ej1F {

    //variables
    
    private int numerador,denominador;

    //constructor
    
    public Ej1F(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //getter and setter

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Ej1F{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    
    
    
}
