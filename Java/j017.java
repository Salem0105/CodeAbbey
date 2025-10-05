import java.util.Scanner;

public class j017 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int index = Integer.parseInt(scan.nextLine());
        String[] data = scan.nextLine().split(" ");// recibir y separar
        System.out.println(checkSum(data));
        scan.close();
    }

    public static long checkSum(String[] number) {
        long result = 0;
        for (int i = 0; i < number.length; i++) {
            result = (result + Integer.parseInt(number[i])) * 113;
            if (result > 10000007) {
                result = result % 10000007;
            }
        }
        return result;
    }
}
