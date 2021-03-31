package Antrian;

/**
 *
 * @author ADVANG4C
 * Nama : Adi Sepriyadi
 * NIM  : 20200040093
 * Kelas: TI20E Reg B
 * 
 */
import java.util.ArrayDeque;
import java.util.Scanner;
public class antrianbank {
    public static void main(String[] args) {
 antrian antri = new antrian(10);
 antri.insert("Ali (Nasabah Baru)");
 antri.insert("Aria (Debit)");
 antri.insert("Dzikri (Kredit)");
 antri.insert("Faizal (Investasi)");
 antri.insert("Yudha (CS)");
 antri.insert("Yogi (SetorTunai)");
 antri.insert("Alda (Penarikan)");
 antri.insert("Adi (Investasi)");
 
 System.out.println("======================================");
 System.out.println("Antrian belakang : "+ antri.infopalingbelakang());
 System.out.println("Antrian depan : "+ antri.infopalingdepan());
 System.out.println("======================================");
 
 
 int exit=0;
 while(exit != 1) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\n");
      System.out.print("=== Selamat Datang di Antrian Bank === \n");
      System.out.print("\n");
      System.out.print("============  Menu Utama  ============ \n");
      System.out.print("[1] Tambah data Antrian \n");
      System.out.print("[2] Hapus Antrian elemen pertama \n");
      System.out.print("[3] Hapus Antrian di Posisi tertentu \n");
      System.out.print("[4] Format semua data \n");      
      System.out.print("[5] Tampilkan data \n");
      System.out.print("[6] Keluar dari Aplikasi \n");
      System.out.print("====================================== \n");
      System.out.print("Pilih Menu : ");
      int menu = scanner.nextInt();

      switch(menu) {
        case 1: 
          System.out.println("Masukan Data Antri!");
          System.out.print("Nama Antrian dan Keperluan (...) : ");
          String nama = scanner.next();
          nama+=scanner.nextLine();
          antri.insert(nama);
          break;
        case 2:
          antri.removenull();
          System.out.println("Data pertama berhasil di Hapus! \n");
          System.out.println("Antrian belakang : "+ antri.infopalingbelakang());
          System.out.println("Antrian depan : "+ antri.infopalingdepan());
          System.out.println("======================================");
          break;
        case 3: 
          System.out.print("\nPilih Antrian untuk dihapus! ");
          System.out.print("Pilih No sesuai dengan data : ");
          String no = scanner.next();
          no+=scanner.nextLine();
          antri.removenullindex();
          break;
        case 4:
          antri.format();
          System.out.println("Seluruh Data berhasil di Hapus! \n");
          System.out.println("Antrian belakang : "+ antri.infopalingbelakang());
          System.out.println("Antrian depan : "+ antri.infopalingdepan());
          System.out.println("======================================");
        case 5:
          antri.infoAntrian();
          System.out.println("Antrian belakang : "+ antri.infopalingbelakang());
          System.out.println("Antrian depan : "+ antri.infopalingdepan());
          System.out.println("======================================");
          break;
        case 6:
          System.out.print("Keluar dari Aplikasi [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();
          exit = confirm;
          break;
      }
    }
}
}