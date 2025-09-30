import java.util.Scanner;

public class j015 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(iteration());
    }

    public static String iteration() {
        String[] data = scan.nextLine().split(" ");// recibir y separar
        return max(data) + " " + min(data);
    }

    //metodo para encontrar el minimo y maximo, busca en toda la lista uno por uno
    public static int min(String[] number) {
        int temp = Integer.parseInt(number[0]);
        int min_n = 0;
        for (int i = 0; i < number.length; i++) {
            if (temp > Integer.parseInt(number[i])) {
                min_n = Integer.parseInt(number[i]);
                temp = min_n;
            } else {
                min_n = temp;
            }
        }
        return min_n;
    }

    public static int max(String[] number) {
        int temp = Integer.parseInt(number[0]);
        int max_n = 0;
        for (int i = 0; i < number.length; i++) {
            if (temp < Integer.parseInt(number[i])) {
                max_n = Integer.parseInt(number[i]);
                temp = max_n;
            } else {
                max_n = temp;
            }
        }
        return max_n;
    }
}
