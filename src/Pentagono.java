public class Pentagono extends Figura {
    private int Lado;
    private int apotema;

    public Pentagono(String tipo, int lado, int apotema){
        super(tipo);
        this.Lado = lado;
        this.apotema = apotema;
    }

    @Override 
    public double calcularArea(){
        return (double) ((5*Lado)*apotema)/2; 
    }
    
}
