import java.util.Scanner;

public class j008 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // recibir primer dato
        String index = scan.nextLine();
        System.out.println(iteration(index));
    }

    public static String iteration(String index) {
        String show = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < Integer.parseInt(index); i++) {
            String[] data = scan.nextLine().split(" ");// recibir y separar
            // simplificar datos
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            int c = Integer.parseInt(data[2]);
            show += progresion(a, b, c) + " "; // evaluar y agregar
        }
        return show;
    }

    public static int progresion(int a, int b, int c) {
        int a_ini = 0; // guardar el valor inicial de a
        for (int i = 0; i < c; i++) {
            a_ini += a + i * b; // formula de la progresion
        }
        return a_ini;
    }
}