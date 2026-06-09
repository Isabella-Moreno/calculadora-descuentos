import java.util.Scanner;

public class CompararDescuentos {
    public static void compararDescuentos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio original: ");
        double precio = scanner.nextDouble();

        double precio5 = precio - (precio * 0.05);
        double precio10 = precio - (precio * 0.10);
        double precio15 = precio - (precio * 0.15);

        System.out.println("Precio con descuento del 5%:  $" + precio5);
        System.out.println("Precio con descuento del 10%: $" + precio10);
        System.out.println("Precio con descuento del 15%: $" + precio15);
    }
}
