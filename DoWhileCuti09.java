import java.util.Scanner;

public class DoWhileCuti09 {
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String Konfirmasi;

    System.out.print("Jatah cuti: ");
    jatahCuti = scan.nextInt();

do {
    System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
    Konfirmasi = scan.next();

    if (Konfirmasi.equalsIgnoreCase("y")) {
        System.out.print("Jumlah hari: ");
        jumlahHari = scan.nextInt();

        if (jumlahHari <= jatahCuti) {
            jatahCuti -= jumlahHari;
            System.out.println("Sisa jatah cuti: " + jatahCuti);
        } else{
            System.out.println("Sisa jatah cuti anda tidak mencukupi");
            break;
        }
    } else{
        break;
    }
} while (jatahCuti > 0);

    }
}