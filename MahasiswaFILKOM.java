public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }


    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public String getNim(){
        return nim;
    }
    public String getIpk(){
        return String.valueOf(ipk);
    }

    public String getStatus(){
        char tahunPuluh = nim.charAt(0); // digit ke 1
        char tahunSatuan = nim.charAt(1); // digit ke 2
        char nomorProdi = nim.charAt(6); // digit ke 7

        String angkatan = "20" + String.valueOf(tahunPuluh) + String.valueOf(tahunSatuan);
        String prodi = "";

        switch (nomorProdi){
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                System.out.println("[ada error pada nomor prodi pada angka ketujuh, harusnya antara 2-4 dan 6-7]");
                break;
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        double beasiswa = 0;

        if(ipk >= 3.0 && ipk <= 3.5){
            beasiswa = 50;
        } else if (ipk >= 3.6) {
            beasiswa = 75;
        }

        return beasiswa;
    }

    public double getPendapatan(){
        return getTunjangan() + getBeasiswa();
    }

    public String toString(){
        return super.toString() + "\nNIM: " + getNim() + "\nIPK: " + getIpk() + "\nStatus: " + getStatus();
    }

}
