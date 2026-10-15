import java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = ryuh.nextLine();
        System.out.println("Memproses pengajuan untuk " + nama + ".");
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = ryuh.nextLine().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = ryuh.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = ryuh.nextInt();

            if (dokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan (juara " + juara + ").");
                } else {
                    System.out.println("Status : Dana penghargaan tidak diberikan (bukan juara 1, 2, atau 3).");
                }
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = ryuh.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int pkm = ryuh.nextInt();

            if (dokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (pkm == 1) {
                    System.out.println("Status : Dana penghargaan diberikan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dana penghargaan tidak diberikan (PKM tidak lolos pendanaan).");
                }
            }
        } else {
            System.out.println("Status : Dana penghargaan tidak diberikan (kegiatan Lainnya).");
        }

        ryuh.close();
    }
}