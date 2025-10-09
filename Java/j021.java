import java.util.Scanner;
import java.util.Arrays;

public class j021 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(iteration())
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", ""));
        scanner.close();
    }

    public static int[] iteration() {
        String[] data = scanner.nextLine().split(" ");
        String[] recieve = scanner.nextLine().split(" ");
        int[] allNumbers = contNumbers(recieve, Integer.parseInt(data[1]));
        int[] numbersOut = Arrays.copyOfRange(allNumbers, 1, allNumbers.length);
        return numbersOut;
    }

    public static int[] contNumbers(String[] numbers, int tree) {
        int[] cont = new int[tree + 1];
        for (int i = 0; i < numbers.length; i++) {
            cont[Integer.parseInt(numbers[i])]++;
        }
        return cont;
    }

}
