public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, int tahunMasuk, int bulanMasuk, int hariMasuk, int jumlahAnak, double gaji, String departemen) {
        super(nama, nik, jenisKelamin, menikah, tahunMasuk, bulanMasuk, hariMasuk, jumlahAnak, gaji);
        this.departemen = departemen;
    }


    public String getDepartemen(){
        return this.departemen;
    }

    public double getTunjangan(){
        return getGaji() + getGaji() * 0.1;
    }

    public String toString(){
        return super.toString() + "\nDepartemen: " + getDepartemen();
    }
}
