import java.util.Scanner;

public class j018 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int index = Integer.parseInt(scan.nextLine());
        System.out.println(iteration(index));
        scan.close();
    }

    public static String iteration(int index) {
        String show = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < index; i++) {
            String[] data = scan.nextLine().split(" ");// recibir y separar
            // simplificar valores de entrada
            int x = Integer.parseInt(data[0]);
            int n = Integer.parseInt(data[1]);
            if (round_zero(squareRoot(1, x, n))) {
                show += (int) squareRoot(1, x, n) + " ";// quitar decimal
            } else {
                show += squareRoot(1, x, n) + " ";// agregar
            }
        }
        return show;
    }

    // Raiz cuadrada por el Método de Herón
    public static double squareRoot(double r, int x, int n) {
        double newR = (r + x / r) / 2;
        if (n > 1) {
            return squareRoot(newR, x, n - 1);
        } else if (n == 1) {
            return newR;
        } else {
            return 1;
        }
    }

    public static boolean round_zero(double number) {
        // Positivo
        // Evaluar si la parte decimal es mayor o igual a 0.0
        if (number % 1 == 0.0) {
            return true;
        } else {
            return false;
        }
    }
}
