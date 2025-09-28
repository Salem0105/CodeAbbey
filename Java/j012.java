import java.util.Scanner;

public class j012 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(iteration(n));
        scan.close();
    }

    public static String iteration(int index) {
        String show = ""; // un string vacio para ir agregando los resultados
        for (int i = 0; i < index; i++) {
            String[] data = scan.nextLine().split(" ");// recibir y separar
            // simplificar datos (day1 hour1 min1 sec1 day2 hour2 min2 sec2)
            int day1 = Integer.parseInt(data[0]);
            int hour1 = Integer.parseInt(data[1]);
            int min1 = Integer.parseInt(data[2]);
            int sec1 = Integer.parseInt(data[3]);
            int day2 = Integer.parseInt(data[4]);
            int hour2 = Integer.parseInt(data[5]);
            int min2 = Integer.parseInt(data[6]);
            int sec2 = Integer.parseInt(data[7]);
            show += diffTime(day1, hour1, min1, sec1, day2, hour2, min2, sec2) + " ";// agregar
        }
        return show;
    }

    public static String diffTime(int d1, int h1, int m1, int s1, int d2, int h2, int m2, int s2) {
        // convertir todo a segundos y sacar la diferencia
        int totalTime = (d2 * 86400 + h2 * 3600 + m2 * 60 + s2) - (d1 * 86400 + h1 * 3600 + m1 * 60 + s1);
        // convertir de nuevo a d h m s
        int days = totalTime / 86400;
        int hours = (totalTime % 86400) / 3600;
        int minutes = (totalTime % 3600) / 60;
        int seconds = totalTime % 60;
        return "(" + days + " " + hours + " " + minutes + " " + seconds + ")";
    }
}
