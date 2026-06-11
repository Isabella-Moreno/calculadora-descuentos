import java.util.Scanner;

public class Descuento15 {
    public static void aplicarDescuento15(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el precio total: ");
        double precio = Scanner.nextDouble();
        double descuento = precio * 0.15;
        double precioFinal = precio - descuento;
        System.out.println("Descuento del 15%: $" + descuento);
        System.out.println("*****************************");
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("*****************************+");
    }
}
