import java.util.Scanner;

//https://www.codeabbey.com/index/task_view/sums-in-loop

public class j003 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        //recibir primer dato
        String index = scan.nextLine();
        System.out.println(sumatoria(index));
    }
    
    public static String sumatoria(String total){
        String mostrar = ""; //un string vacio para ir agragando los resultados
        for(int i = 0; i < Integer.parseInt(total); i++){
            String data = scan.nextLine();//se trabaja linea a linea
            String[] cadena = data.split(" ");//separar
            //convertir y sumar
            int sub_suma = Integer.parseInt(cadena[0]) + Integer.parseInt(cadena[1]);
            mostrar += String.valueOf(sub_suma) + " ";//agragar
        }
        return mostrar;
    }
}
