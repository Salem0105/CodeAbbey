//https://www.codeabbey.com/index/task_view/linear-function

import java.util.Scanner;

public class j010 {

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
            int x1 = Integer.parseInt(data[0]);
            int y1 = Integer.parseInt(data[1]);
            int x2 = Integer.parseInt(data[2]);
            int y2 = Integer.parseInt(data[3]);
            show += findLinearEquation(x1, y1, x2, y2) + " ";// agregar
        }
        return show;
    }

    /*
     * a=​y2​−y1/x2​−x1
     * b=y−ax​​
     */

    public static String findLinearEquation(int x1, int y1, int x2, int y2) {
        int a = (y2 - y1) / (x2 - x1);
        int b = y1 - a * x1;
        return "(" + a + " " + b + ")";
    }
}
