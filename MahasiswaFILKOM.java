public class MahasiswaFILKOM extends Manusia{ // extends artinya ini anaknya class Manusia
    // ada tambahan instance dari sebelumnya, dan yang dari sebelumnya juga tersimpan
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) { // walau tidak ada nama, nik, dan jenisKelamin, karena ini adalah anak kelas maka masih bisa diisi
        super(nama, nik, jenisKelamin, menikah); // ini akan menjalankan new Manusia() di class Manusia
        // variabel variabel baru dari Manusia diset di sini
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim(){ // getter nim
        return nim;
    }
    public String getIpk(){ // getter ipk
        return String.valueOf(ipk);
    }

    public String getStatus(){
        char tahunPuluh = nim.charAt(0); // digit ke 1 dari nim untuk angka puluhan dalam tahun
        char tahunSatuan = nim.charAt(1); // digit ke 2 dari nim untuk angka satuan dalam tahun
        char nomorProdi = nim.charAt(6); // digit ke 7 dari nim untuk mengecek angka prodi

        String angkatan = "20" + String.valueOf(tahunPuluh) + String.valueOf(tahunSatuan); // akan mengeprint 2000 dan tahun puluhan dan satuan berapa, misalnya 2016
        String prodi = ""; // instance prodi local buat method ini

        switch (nomorProdi){ // mengecek digit ke 7 dan menetapkan dia prodi apa
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

        return prodi + ", " + angkatan; // return prodi apa , angkatan tahun berapa
    }

    public double getBeasiswa(){ // return beasiswa tergantung ipk
        double beasiswa = 0;

        if(ipk >= 3.0 && ipk <= 3.5){ // kalau ipk dari 3 sampai 3.5 dapat beasiswa 50
            beasiswa = 50;
        } else if (ipk >= 3.6) { // ipk 3.5 sampai 4 dapat beasiswa 75
            beasiswa = 75;
        }

        return beasiswa; // return double beasiswa
    }

    public double getPendapatan(){ //
        return super.getTunjangan() + getBeasiswa(); // pendapatan dari tunjangan Manusia dan beasiswanya
    }

    public String toString(){ // menjalankan toString() dari method class Manusia ditambah informasi tambahan yang ada di class ini
        return super.toString() + "\nNIM: " + getNim() + "\nIPK: " + getIpk() + "\nStatus: " + getStatus();
    }

}
