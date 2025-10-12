import java.util.Scanner;

public class j041 {

    static Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        iterate();
        Scanner.close();
    }

    public static void iterate() {
        String show = "";
        int n = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = Scanner.nextLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            int c = Integer.parseInt(data[2]);
            show += median(a, b, c) + " ";
        }
        System.out.println(show);
    }

    public static int median(int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }
}