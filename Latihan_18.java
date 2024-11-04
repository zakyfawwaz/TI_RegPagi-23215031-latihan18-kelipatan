
public class Latihan_18 {
    public static void main(String[] args) {
        double angka = 3.5;
        
        System.out.println("Bilangan kelipatan 3,5 dari 3,5 sampai dengan 35:");
        while (angka <= 35) {
            System.out.printf("%.1f ", angka);
            angka += 3.5;
        }
    }
}
