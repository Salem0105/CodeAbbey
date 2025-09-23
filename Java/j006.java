import java.util.Scanner;

public class j006 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // recibir primer dato
        String index = scan.nextLine();
        System.out.println(sumatoria(index));
    }

    public static String sumatoria(String total) {
        String mostrar = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < Integer.parseInt(total); i++) {
            String data = scan.nextLine();// se trabaja linea a linea
            String[] cadena = data.split(" ");// separar
            // reducir o simplificar variables para usar
            double a = Double.parseDouble(cadena[0]);
            double b = Double.parseDouble(cadena[1]);
            mostrar += round(a, b) + " ";// agragar
        }
        return mostrar;
    }

    public static int round(double a, double b) {
        // Positiva
        if ((a / b) > 0) {
            // Evaluar si la parte decimal es mayor o igual a 0.5
            if ((a / b) % 1 >= 0.5) {
                return (int) ((a / b) + 1);
            } else {
                return (int) (a / b);
            }
        }
        // Negativa
        else {
            // Evaluar si la parte decimal es menor o igual a -0.5
            if ((a / b) % 1 <= -0.5) {
                return (int) ((a / b) - 1);
            } else {
                return (int) (a / b);
            }
        }
    }
}
