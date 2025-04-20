import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, int tahunMasuk, int bulanMasuk, int hariMasuk, int jumlahAnak, double gaji) {
        super(nama, nik, jenisKelamin, menikah);
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, hariMasuk);
        this.jumlahAnak = jumlahAnak;
        this.gaji = gaji;
    }


    // aslinya di sini ada getGaji() tapi diganti sama yang di akhir karena ada tambahan bonus

    public int getTahunMasuk(){
        return tahunMasuk.getYear();
    }
    public int getBulanMasuk(){
        return tahunMasuk.getMonthValue();
    }
    public int getHariMasuk(){
        return tahunMasuk.getDayOfMonth();
    }
    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){
        LocalDate sekarang = LocalDate.now();
        Period lamaKerja = Period.between(tahunMasuk, sekarang);
        double bonus = 0;

        if(lamaKerja.getYears() >= 0 && lamaKerja.getYears() <= 5){
            bonus = this.gaji * 5 / 100;
        } else if(lamaKerja.getYears() >= 6 && lamaKerja.getYears() <= 10){
            bonus = this.gaji * 10 / 100;
        } else if(lamaKerja.getYears() >= 10){
            bonus = this.gaji * 15 / 100;
        }

        return bonus;
    }
    public double tunjanganAnak(){
        return jumlahAnak * 20;
    }
    public double getGaji(){
        return gaji + getBonus() + tunjanganAnak();
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + tunjanganAnak();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + getHariMasuk() + " "+ getBulanMasuk() + " "+ getTahunMasuk() + "\nJumlah Anak: " + getJumlahAnak() + "\nGaji: " + getGaji();
    }
}
