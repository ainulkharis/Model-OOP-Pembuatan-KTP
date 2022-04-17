import java.util.Random;
import java.util.Scanner;

public class DisdukcapilNew {
    public static void main(String[] args) {
        for(int n=0;n<3;n++){
            KTP Pendaftar = new KTP();
            Scanner pleaseInput = new Scanner(System.in);

            Random rnd = new Random();
            Pendaftar.No_Daftar = String.valueOf(rnd.nextInt(1000));

            System.out.println("Masukkan NIK = ");
            Pendaftar.NIK = pleaseInput.nextLine();

            System.out.println("Masukkan Nama Lengkap = ");
            Pendaftar.Nama = pleaseInput.nextLine();

            System.out.println("Masukkan Tanggal Lahir = ");
            Pendaftar.TanggalLahir = pleaseInput.nextLine();

            System.out.println("Masukkan Alamat = ");
            Pendaftar.Alamat = pleaseInput.nextLine();

            System.out.println("Masukkan Pekerjaan = ");
            Pendaftar.Pekerjaan = pleaseInput.nextLine();

            System.out.println("Masukkan Agama = ");
            Pendaftar.Agama = pleaseInput.nextLine();

            System.out.println("Masukkan Golongan Darah = ");
            Pendaftar.GolonganDarah = pleaseInput.nextLine();

            System.out.println("Data Pendaftar KTP ke " + n+1);
            System.out.println("NIK             = " + Pendaftar.NIK);
            System.out.println("Nama Lengkap    = " + Pendaftar.Nama);
            System.out.println("Tanggal Lahir   = " + Pendaftar.TanggalLahir);
            System.out.println("Alamat          = " + Pendaftar.Alamat);
            System.out.println("Pekerjaan       = " + Pendaftar.Pekerjaan);
            System.out.println("Agama           = " + Pendaftar.Agama);
            System.out.println("Golongan Darah  = " + Pendaftar.GolonganDarah);
        }
    }
}
