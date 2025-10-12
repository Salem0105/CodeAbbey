import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class j019 {
    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iterate();
        Scanner.close();
    }

    public static void iterate() {
        String show = "";
        int n = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = Scanner.nextLine().split("");
            show += matchingBrackets(data) + " ";
        }
        System.out.println(show);
    }

    // Usar pilas para comprobar si los parentesis estan correctos
    public static int matchingBrackets(String[] data) {
        // Usar clave valor para comprobar su correspondiente
        Map<String, String> pares = new HashMap<>();
        pares.put("(", ")");
        pares.put("[", "]");
        pares.put("{", "}");
        pares.put("<", ">");

        Stack<String> pila = new Stack<>();
        for (String s : data) {
            if (s.equals("(") || s.equals("[") || s.equals("{") || s.equals("<")) {
                pila.push(s);
            } else if (s.equals(")") || s.equals("]") || s.equals("}") || s.equals(">")) {
                if (pila.isEmpty() || !pares.get(pila.peek()).equals(s)) {
                    return 0;
                } else {
                    pila.pop();
                }
            }
        }
        return pila.isEmpty() ? 1 : 0;
    }
}
