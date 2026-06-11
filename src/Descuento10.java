import java.util.Scanner;

public class Descuento10 {

    public static void aplicarDescuento10() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el precio total para el 10%: ");
        double precio = teclado.nextDouble();

        // Calculamos el 10% de descuento
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;

        // Mostramos los resultados
        System.out.println("\n***********************************");
        System.out.println("Descuento del 10%: $" + descuento);
        System.out.println("Precio final con 10%: $" + precioFinal);
        System.out.println("***********************************");
    }

    // El método main para ejecutar el archivo
    public static void main(String[] args) {
        aplicarDescuento10();
    }
}
