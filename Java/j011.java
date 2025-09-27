import java.util.Scanner;

public class j011 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String index = scan.nextLine();
        System.out.println(iteration(index));
    }

    public static int sumDigits(int number) {
        int div_number = number / 10;
        int mod_number = number % 10;
        if (div_number > 0) {
            return mod_number + sumDigits(div_number);
        } else {
            return mod_number;
        }
    }

    public static String iteration(String index) {
        String show = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < Integer.parseInt(index); i++) {
            String[] data = scan.nextLine().split(" ");// recibir y separar
            // simplificar datos
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            int c = Integer.parseInt(data[2]);
            int number = a * b + c;
            show += sumDigits(number) + " ";// agregar
        }
        return show;
    }
}
