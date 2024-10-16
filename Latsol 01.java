import java.util.Scanner;

public class latsol1{
    public static void main(String[] args) {
        
System.out.println("Kalkultor Barang ");
        String NamaBarang;
        double diskon;
        double harga;
        double jumlah;
        double total;
        double jadiSatu;
        Scanner masukkan = new Scanner(System.in);
       
 System.out.println("Masukkan Nama Barang = ");
NamaBarang = masukkan.next();

System.out.println("Harga");
harga = masukkan.nextDouble;

System.out.println("Jumlah Barang = ");
jumlah = masukkan.nextDouble;

System.out.println("Masukkan Diskon = ");
diskon = masukkan.nextDouble;

jadi satu = harga * jumlah;

total = (harga * jumlah );
diskon = diskon / 100 * jadi_satu;
total = total - diskon;
System.out.println("Total Harga adalah =" +total);
    }
    }