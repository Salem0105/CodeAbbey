
public class j022 {
    
    public static void main(String[] args) {
        int n = 3000;
        try {
            Thread.sleep(n);
            System.out.println("Ya pasaron "+ n/1000 +" segundos");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
