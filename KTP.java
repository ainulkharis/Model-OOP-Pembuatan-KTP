public class KTP{
    
    public String No_Daftar;
    public String NIK;
    public String Nama;
    public String TanggalLahir;
    public String Pekerjaan;
    public String Alamat;
    public String Agama;
    public String GolonganDarah;

    public KTP(){}

    public KTP(String no_daftar, String nik, String nama, String tgl_lhr, String pekerjaan, String alamat, String agama, String gol_darah){
        this.No_Daftar = no_daftar;
        this.NIK = nik;
        this.Nama = nama;
        this.TanggalLahir = tgl_lhr;
        this.Pekerjaan = pekerjaan;
        this.Alamat = alamat;
        this.Agama = agama;
        this.GolonganDarah = gol_darah;
    }

    public void cetakStatus(String myStatus){
        switch (myStatus) {
            case "maried":
            System.out.println("Bener married??");
            break;
        case "single":
            System.out.println("Kapan marriednya??");
            break;
        default:
            break;      
        }
    }
}
