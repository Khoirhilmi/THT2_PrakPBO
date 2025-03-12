import java.util.Random;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Jumlah Mata Kuliah yang Diambil: ");
        int jumlahMataKuliah = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.print("Masukkan Nilai Mata Kuliah " + i + ": ");
            totalNilai += input.nextDouble();
        }
        
        double rataRata = totalNilai / jumlahMataKuliah;
        double ipk = (rataRata / 100) * 4;
        
        boolean usiaLebihDari22 = usia > 22;
        boolean ipkBagus = ipk >= 3.5 && jumlahMataKuliah > 4;
        boolean ipkKurang = ipk < 2.5 || jumlahMataKuliah < 4;
        
        int nomorAntrian = random.nextInt(100) + 1;
        
        System.out.println("\n=== Laporan Akademik Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        System.out.println("Jumlah Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Rata-rata Nilai: " + rataRata);
        System.out.println("IPK: " + ipk);
        
        System.out.println("Evaluasi Akademik:");
        System.out.println("- Usia lebih dari 22 tahun: " + (usiaLebihDari22 ? "Ya" : "Tidak"));
        System.out.println("- IPK >= 3.5 dan Jumlah Mata Kuliah > 4: " + (ipkBagus ? "Ya" : "Tidak"));
        System.out.println("- IPK < 2.5 atau Jumlah Mata Kuliah < 4: " + (ipkKurang ? "Ya" : "Tidak"));
        
        System.out.println("Nomor Antrian Konsultasi Akademik: " + nomorAntrian);
        
        input.close();
    }
}
