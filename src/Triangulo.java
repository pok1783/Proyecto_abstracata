public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(String tipo, int base, int altura){
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override 
    public double calcularArea(){
        return (double) (base*altura)/2; 
    }
    
}
