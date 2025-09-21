//https://www.codeabbey.com/index/task_view/min-of-three

import java.util.Scanner;

public class j005 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //recibir primer dato
        String index = scan.nextLine();
        System.out.println(sumatoria(index));
    }

    public static String sumatoria(String total) {
        String mostrar = ""; //un string vacio para ir agragando los resultados
        for (int i = 0; i < Integer.parseInt(total); i++) {
            String data = scan.nextLine();//se trabaja linea a linea
            String[] cadena = data.split(" ");//separar
            String valor = "";//inicializar
            //reducir o simplificar variables para comparar
            int a = Integer.parseInt(cadena[0]);
            int b = Integer.parseInt(cadena[1]);
            int c = Integer.parseInt(cadena[2]);
            //comparar y buscar el menor
            if (a < b && a < c) {
                valor = a + "";
            } else if (b < a && b < c) {
                valor = b + "";
            } else {
                valor = c + "";
            }
            mostrar += valor + " ";//agragar
        }
        return mostrar;
    }
}
