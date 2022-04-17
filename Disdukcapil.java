public class Disdukcapil {
    public static void main(String[] args) {

        //Tanpa_Parameter
        KTP Pendaftar1 = new KTP();
        Pendaftar1.No_Daftar = "01";
        Pendaftar1.NIK = "200304030902";
        Pendaftar1.Nama = "Ainul Kharis";
        Pendaftar1.TanggalLahir = "03042003";
        Pendaftar1.Alamat = "Tanjungsari";
        Pendaftar1.Pekerjaan = "Mahasiswa";
        Pendaftar1.Agama = "Islam";
        Pendaftar1.GolonganDarah = "A";

        System.out.println("Nama Pendaftar KTP 01  = " + Pendaftar1.Nama);
        System.out.println("Pekerjaan Pendaftar 01 = " + Pendaftar1.Pekerjaan);
        Pendaftar1.cetakStatus(Pendaftar1.Pekerjaan);

        //Dengan_Parameter
        KTP Pendaftar2 = new KTP("02" ,"201309260902","Saeptrimo Rizqi Diono","26092013","Siswa SD","Tanjungsari","Islam","B");
        System.out.println("Nama Pendaftar KTP 02  = " + Pendaftar2.Nama);
        System.out.println("Pekerjaan Pendaftar 02 = " + Pendaftar2.Pekerjaan);
        Pendaftar2.cetakStatus(Pendaftar2.Pekerjaan);
    }
}
