
//https://www.codeabbey.com/index/task_view/fahrenheit-celsius
import java.util.Scanner;

public class j007 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // recibir primer dato
        String index = scan.nextLine();
        System.out.println(iteration(index));
    }

    public static String iteration(String cadena) {
        String mostrar = ""; // un string vacio para ir agregando los resultados
        String[] index = cadena.split(" ");// separar
        for (int i = 0; i < Integer.parseInt(index[0]); i++) {
            double celsius = (Integer.parseInt(index[i + 1]) - 32) * (5.0 / 9.0);// convertir a celsius
            mostrar += round_far_zero(celsius) + " ";// agregar
        }
        return mostrar;
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
