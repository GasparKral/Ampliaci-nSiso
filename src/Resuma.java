import java.util.Scanner;

public class Resuma {

    /*
     * Escribe un programa donde el usuario decidirá cuantos números va a introducir
     * para realizar la
     * suma de todos ellos. Hay que utilizar la función ‘Suma ( )’.
     * NOTA:
     *  Primero pediremos cuantos números queremos sumar.
     *  Los almacenaremos en un array. Para ello tenemos que recorrer el vector e
     * introducir los
     * números.
     *  Crea la función Suma ( ), donde realizaremos las sumas de todos los
     * números. Para ello
     * tiene que entrar por parámetro el array de números.
     */

    /*
     * AMPLIACION:
     * 
     * Crea una función que duplique el Array introducido por el usuario, de manera
     * que pase a ser un Matriz: 
     * 
     * filas = 2
     * 
     * columnas = la longitud dada por el usuario;
     * 
     * en el que los valores de la segunda fila sean el doble de la primera.
     * 
     * Muestra la suma de la nueva fila y muestra la Matriz completa
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos números quieres sumar?");
        int range = input.nextInt();

        int[] numbers = new int[range];

        for (int i = 0; i < range; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numbers[i] = input.nextInt();
        }

        input.close();

        System.out.println("La suma es: " + Suma(numbers));

        int[][] array = duplicarArray(numbers);

        for (int i = 0; i < array[0].length; i++) {
            System.out.println(array[0][i] + " " + array[1][i]);
        }
    }

    public static int Suma(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int[][] duplicarArray(int[] numbers) {

        int[][] array = new int[2][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[0][i] = numbers[i];
            array[1][i] = numbers[i] * 2;
        }
        return array;
    }

}
