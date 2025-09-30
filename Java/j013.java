import java.util.Scanner;

public class j013 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String index = scan.nextLine();
        System.out.println(iteration(index));
    }

    public static String iteration(String index) {
        String show = ""; // un string vacio para ir agregando los resultados
        String[] data = scan.nextLine().split(" ");// recibir y separar
        for (int i = 0; i < Integer.parseInt(index); i++) {
            int newData = Integer.parseInt(data[i]);
            show += WSD(digits(newData)) + " ";// agregar
        }
        return show;
    }

    // Convertir numero a cadena de digitos
    public static String digits(int number) {
        int div_number = number / 10;
        int mod_number = number % 10;
        if (div_number > 0) {
            return digits(div_number) + " " + mod_number;
        } else {
            return "" + mod_number;
        }
    }

    // Calcular suma ponderada de digitos
    public static int WSD(String number) {
        String[] digits = number.split(" ");
        int total = 0;
        for (int i = 0; i < digits.length; i++) {
            total += Integer.parseInt(digits[i]) * (i + 1);
        }
        return total;
    }
}
