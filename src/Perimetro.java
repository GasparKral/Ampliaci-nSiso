import java.util.Scanner;

public class Perimetro {

    /*
     * Escribe un programa que, introduzca por teclado los valores correspondientes
     * a la base y la altura
     * de un rectángulo e imprime su perímetro usando la función
     * ‘perimetroRectangulo()’, que recibirá
     * esos valores como parámetros y retornará el resultado.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, altura, perimetro;

        System.out.println("Introduce la base del rectángulo: ");
        base = input.nextDouble();
        System.out.println("Introduce la altura del rectángulo: ");
        altura = input.nextDouble();
        input.close();

        perimetro = perimetroRectangulo(base, altura);

        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }

    public static double perimetroRectangulo(double base, double altura) {

        double perimetro = (2 * base) + (2 * altura);
        return perimetro;
    }
}
