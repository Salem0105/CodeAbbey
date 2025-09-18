package Java;
import java.util.*;;

//https://www.codeabbey.com/index/task_view/sum-in-loop

public class j002 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //recibir los datos
        String index = scan.nextLine();
        String numbers = scan.nextLine();
        System.out.println(sum(numbers));
    }

    public static int sum(String numbers) {
        //Ingresar cada dato separado por un espacio dentro del vector
        String[] vector = numbers.split(" ");
        int sum = 0;
        
        for (String a_z : vector) {
            //sumar cada valor, pero primero se convierte en entero
            sum += Integer.parseInt(a_z);
        }
        return sum;
    }
}
