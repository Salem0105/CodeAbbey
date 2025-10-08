import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class j020 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(iteration(index));
        scanner.close();
        
    }

    public static String iteration(int index) {
        String show = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < index; i++) {
            String data = scanner.nextLine();// recibir
            show += contVowels(data) + " ";// agregar
        }
        return show;
    }

    public static int contVowels(String text) {
        int cont = 0;
        // Creamos un conjunto (Set) con todas las vocales
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOUyY".toCharArray()) {
            vowels.add(c);
        }

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (vowels.contains(current)) {
                cont += 1;
            }
        }
        return cont;
    }
}
