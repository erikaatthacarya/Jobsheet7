import java.util.Scanner;

public class WhileKelipatan09 {
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);

    int kelipatan, i=1, jumlah=0, counter=0, avg;
    System.out.print("Masukkan bilangan kelipatan (1-9): ");
    kelipatan = scan.nextInt();

    while (i <= 50){
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
        i++;
    }
    avg = jumlah / counter;
    System.out.println("Banyaknya bilangan :" + jumlah);
    System.out.println("Total bilangan kelipatan :" + counter);
    System.out.println("rata-rata :" + avg);
    }
}