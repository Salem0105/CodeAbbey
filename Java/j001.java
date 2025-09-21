//https://www.codeabbey.com/index/task_view/sum-of-two

import java.util.*;

public class j001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(sum(str));
    }

    public static int sum(String str) {
        String[] v = str.split(" ");
        int sum = 0;
        for (String a : v) {
            sum += Integer.parseInt(a);
        }
        return sum;
    }
}
