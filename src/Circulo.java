public class Circulo extends Figura {
     private int radio;

    public Circulo(String tipo, int radio){
        super(tipo);
        this.radio = radio;
    }

    @Override 
    public double calcularArea(){
        return (double) Math.PI*(radio*radio); 
    }
    
}
