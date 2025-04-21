import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia{ // class Pekerja anak kelas Manusia
    // method method baru untuk class Pekerja
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, int tahunMasuk, int bulanMasuk, int hariMasuk, int jumlahAnak, double gaji) { // sama seperti dari induk class Manusia tapi ada tambahan untuk pekerja
        super(nama, nik, jenisKelamin, menikah);
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, hariMasuk);
        this.jumlahAnak = jumlahAnak;
        this.gaji = gaji;
    }


    // aslinya di sini ada getGaji() tapi diganti sama yang di akhir karena ada tambahan bonus

    public int getTahunMasuk(){ // return tahun masuk kerja
        return tahunMasuk.getYear();
    }
    public int getBulanMasuk(){ // return bulan masuk kerja
        return tahunMasuk.getMonthValue();
    }
    public int getHariMasuk(){ // return hari keberapa masuk kerja
        return tahunMasuk.getDayOfMonth();
    }
    public int getJumlahAnak(){ // return jumlah anaknya
        return jumlahAnak;
    }

    public double getBonus(){
        LocalDate sekarang = LocalDate.now(); // menetapkan tanggal sekarang sebagai acuan kerja berapa tahun
        Period lamaKerja = Period.between(tahunMasuk, sekarang); // mendapatkan berapa lama bekerja
        double bonus = 0; // menetapkan bonus tergantung lama kerja

        if(lamaKerja.getYears() >= 0 && lamaKerja.getYears() <= 5){ // kalau sudah kerja dari 0 sampai 5 tahun dapat bonus 5%
            bonus = this.gaji * 5 / 100;
        } else if(lamaKerja.getYears() >= 6 && lamaKerja.getYears() <= 10){ // kalau sudah kerja dari 6 sampai 10 tahun dapat bonus 10%
            bonus = this.gaji * 10 / 100;
        } else if(lamaKerja.getYears() > 10){ // kalau sudah kerja lebih dari 10 tahun dapat bonus 15%
            bonus = this.gaji * 15 / 100;
        }

        return bonus; // return double bonus
    }
    public double tunjanganAnak(){ // menghitung tunjangan dengan bonus 20/anak
        return jumlahAnak * 20;
    }
    public double getGaji(){ // gaji adalah gaji utama + bonus + tunjangan
        return gaji + getBonus() + tunjanganAnak();
    }

    @Override // override kalau ini sudah ada di parent tapi karena anaknya ada maka utamakan pakai punya anaknya
    public double getPendapatan() {
        return super.getPendapatan() + getGaji(); // menjalankan getPendapatan() ditambah dari getGaji() dari class ini
    }

    @Override
    public String toString() { // dari class manusia ditambah info baru dari class ini
        return super.toString() + "\nTahun Masuk: " + getHariMasuk() + " "+ getBulanMasuk() + " "+ getTahunMasuk() + "\nJumlah Anak: " + getJumlahAnak() + "\nGaji: " + getGaji();
    }
}
