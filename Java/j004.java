//https://www.codeabbey.com/index/task_view/min-of-two

import java.util.Scanner;

public class j004 {

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
            //comparar y buscar el menor
            if (Integer.parseInt(cadena[0]) < Integer.parseInt(cadena[1])) {
                valor = cadena[0];
            } else {
                valor = cadena[1];
            }
            mostrar += valor + " ";//agragar
        }
        return mostrar;
    }
}
