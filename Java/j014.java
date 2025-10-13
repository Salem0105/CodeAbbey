import java.util.Scanner;
import java.math.BigInteger;;

public class j014 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        iterate();
        scan.close();
    }

    public static void iterate() {
        BigInteger n = new BigInteger(scan.nextLine());
        System.out.println(repeat(n));
    }

    public static BigInteger repeat(BigInteger n) {
        String[] modular = scan.nextLine().split(" ");
        if (modular[0].equals("%")) {
            return n.mod(BigInteger.valueOf(Long.parseLong(modular[1])));
        } else if (modular[0].equals("+")) {
            return repeat(n.add(BigInteger.valueOf(Long.parseLong(modular[1]))));
        } else {
            return repeat(n.multiply(BigInteger.valueOf(Long.parseLong(modular[1]))));
        }
    }
}
