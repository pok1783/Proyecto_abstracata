public class Cuadrado extends Figura {
     private int lado;
    

    public Cuadrado(String tipo, int lado){
        super(tipo);
        this.lado = lado;
    }

    @Override 
    public double calcularArea(){
        return (lado*lado); 
    }
    
}
