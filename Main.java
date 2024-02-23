import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = data.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        String jenisKelamin = data.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalLahir = data.nextLine();

        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.print("Jenis Kelamin :");
        if (jenisKelamin.equals("L")) {
            System.out.print("Laki-laki");
        } else if (jenisKelamin.equals("P")) {
            System.out.print("Perempuan");
        }

        LocalDate TanggalLahir = LocalDate.parse(tanggalLahir);
        LocalDate hariIni = LocalDate.now();
        Period period = Period.between(TanggalLahir, hariIni);

        System.out.println();
        System.out.println(" Umur : " + period.getYears() + " tahun " + period.getMonths() + " bulan " + period.getDays() + " Hari ");
    }
}