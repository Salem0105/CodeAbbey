//https://www.codeabbey.com/index/task_view/triangles

public class j009 {
    public static int isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numTriplets = Integer.parseInt(scanner.nextLine());
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < numTriplets; i++) {
            String[] line = scanner.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            results.append(isTriangle(a, b, c)).append(" ");
        }

        System.out.println(results.toString().trim());
        scanner.close();
    }
}
