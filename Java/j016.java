import java.util.Scanner;

public class j016 {
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
            show += round_far_zero(average(data)) + " ";// agregar
        }
        return show;
    }

    // Promedio pero sin contar el ultimo numero 
    public static double average(String[] numbers) {
        double total = 0;
        for (int i = 0; i < (numbers.length - 1); i++) {
            total += Integer.parseInt(numbers[i]);
        }
        return total / (numbers.length - 1);
    }

    public static int round_far_zero(double number) {
        // Positivo
        if (number > 0) {
            // Evaluar si la parte decimal es mayor o igual a 0.5
            if (number % 1 >= 0.5) {
                return (int) (number + 1);
            } else {
                return (int) number;
            }
        }
        // Negativo
        else {
            // Evaluar si la parte decimal es menor o igual a -0.5
            if (number % 1 <= -0.5) {
                return (int) (number - 1);
            } else {
                return (int) number;
            }
        }
    }
}