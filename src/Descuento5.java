Import java.util.Scanner;

public class Descuento5 {
    public static void aplicarDescuento5(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el precio total: ");
        double precio = Scanner.nextDouble();
        double descuento = precio * 0.05;
        double precioFinal = precio - descuento;
        System.out.println("Descuento del 5%: $" + descuento);
        System.out.println("********************************");
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("********************************");
    }
}
