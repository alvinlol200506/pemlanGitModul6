public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, int tahunMasuk, int bulanMasuk, int hariMasuk, int jumlahAnak, double gaji, String departemen) { // selain dari class manusia juga dari class pekerja, lalu ditambah variabel departemen
        super(nama, nik, jenisKelamin, menikah, tahunMasuk, bulanMasuk, hariMasuk, jumlahAnak, gaji);
        this.departemen = departemen; // setter departemen
    }


    public String getDepartemen(){ // getter variabel departemen
        return this.departemen;
    }

    public double getTunjangan(){ // tunjangan manager 10%, gaji ditambah 10 gajinya
        return getGaji() + getGaji() * 0.1;
    }

    public String toString(){ // mengeprint info dari class Pekerja dan dari class ini
        return super.toString() + "\nDepartemen: " + getDepartemen();
    }
}
