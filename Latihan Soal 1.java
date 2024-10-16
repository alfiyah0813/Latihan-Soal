import java.util.Scanner;

public class  TotalHargaBelanja{
public static void main(String[] args){
//Membuat scanner untuk input data dari pengguna
    Scanner scanner = new Scanner(System.in);

//Meminta input harga awal barang
System.out.print("Masukkan harga awal barang: ");
double hargaAwal= scanner.nextDouble();

//Meminta input presentase diskon
System.out.print("Masukkan persentase diskon (tanpa %): ");
double diskon= scanner.nextDouble();

//Meminta input jumlah barang yang dibeli
System.out.print("Masukkan jumlah barag yang dibeli: ");
int jumlahBarang = scanner.nextInt();

//Menghitung harga setelah diskon
double hargaSetelahDiskon = hargaAwal - (hargaAwal * diskon / 100);

//Menghitung total harga untuk semua barang
double totalHarga = hargaSetelahDiskon * jumlahBarang;

//Menampilkan hasil perhitungan 
System.out.println("Total harga setelah diskon adalah: Rp " + totalHarga);

//Menutup scanner
scanner.close();
}
}