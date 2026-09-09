public class App {
    public static void main(String[] args) throws Exception {
        Figura Circulo = new Circulo("sixseven", 4);
        Figura Cuadrado = new Cuadrado("abduzcan", 5);
        Figura Pentangono = new Pentagono("Pentagono", 3, 2);
        Figura Triangulo = new Triangulo("pimienta", 4, 3);

        System.out.println("El area del circulo es: " + Circulo.calcularArea());
        System.out.println("El area del cuadrado es: " + Cuadrado.calcularArea());
        System.out.println("El area del pentagono es: " + Pentangono.calcularArea());
        System.out.println("El area del triangulo es: " + Triangulo.calcularArea());
    }
}
