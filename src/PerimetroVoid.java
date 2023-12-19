import java.util.Scanner;

public class PerimetroVoid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, altura;

        System.out.println("Introduce la base del rectángulo: ");
        base = input.nextDouble();
        System.out.println("Introduce la altura del rectángulo: ");
        altura = input.nextDouble();
        input.close();

        perimetroRectangulo(base, altura);

    }

    public static void perimetroRectangulo(double base, double altura) {

        double perimetro = (2 * base) + (2 * altura);
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }
}
