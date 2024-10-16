import java.util.Scanner;

public class PenghitungGajiKaryawan {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah jam kerja dari pengguna
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = scanner.nextInt();

        // Meminta input tarif per jam dari pengguna
        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = scanner.nextDouble();

        // Menghitung gaji bruto
        double gajiBruto = jamKerja * tarifPerJam;

        // Menghitung potongan pajak (10% dari gaji bruto)
        double potonganPajak = gajiBruto * 0.10;

        // Menghitung gaji bersih
        double gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan hasil perhitungan
        System.out.println("Gaji Bruto: " + gajiBruto);
        System.out.println("Potongan Pajak (10%): " + potonganPajak);
        System.out.println("Gaji Bersih: " + gajiBersih);

        // Menutup scanner
        scanner.close();
    }
}
