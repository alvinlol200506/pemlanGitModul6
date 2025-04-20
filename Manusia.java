public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private double tunjangan;


    public Manusia (String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }


    public String getNama(){
        return nama;
    }
    public String getJeniskelamin(){
        if (jenisKelamin){
            return "pria";
        } else {
            return "wanita";
        }
    }
    public String getNik(){
        return nik;
    }
    public String getMenikah(){
        if (menikah){
            return "sudah menikah";
        } else {
            return "belum menikah";
        }
    }

    public double getTunjangan(){
        if (menikah && jenisKelamin){
            tunjangan = 25;
        } else if (menikah && !jenisKelamin){
            tunjangan = 20;
        } else {
            tunjangan = 15;
        }

        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        return "Nama: " + getNama() + "\nNIK: " + getNik() + "\nJenis kelamin: " + getJeniskelamin() +"\nPendapatan: " + getPendapatan();
    }
}
