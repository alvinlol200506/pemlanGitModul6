public class Manusia {
    // menetapkan instance private untuk class Manusia
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private double tunjangan;


    public Manusia (String nama, String nik, boolean jenisKelamin, boolean menikah){ // ini nanti bisa langsung dimasukkan infonya pas di new Manusia
        // mengisi instance dengan data datanya, btw karena pakai ini saya tidak jadi pakai setter
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }


    public String getNama(){ // getter nama dengan return namanya
        return nama;
    }
    public String getJeniskelamin(){ // kalau misalnya jeniskelamin nya true maka akan return String "pria" dan bila false akan "wanita"
        if (jenisKelamin){
            return "pria";
        } else {
            return "wanita";
        }
    }
    public String getNik(){ // getter String yang mereturn niknya
        return nik;
    }
    public String getMenikah(){ // kalau true maka akan return String "sudah menikah" bila false maka akan "belum menikah"
        if (menikah){
            return "sudah menikah";
        } else {
            return "belum menikah";
        }
    }

    public double getTunjangan(){
        if (menikah && jenisKelamin){ // bila dia sudah menikah dan pria
            tunjangan = 25;
        } else if (menikah && !jenisKelamin){ // bila dia sudah menikah dan wanita
            tunjangan = 20;
        } else { // bila dia belum menikah dan gender apapun
            tunjangan = 15;
        }

        return tunjangan; // mengembalikan nilai double tunjangan tergantung jenis kelamin dan status
    }

    public double getPendapatan(){ // mereturn double berapa uang hasil tunjangan (karena sumber uangnya hanya tunjangan maka saya hanya isi getTunjangan(), kalau ada lagi bakal ada "+" trus sumber lainnya
        return getTunjangan();
    }

    public String toString(){ // ini adalah method java dimana bila di Main kita print variabel referensinya, maka method ini akan dijalankan
        return "Nama: " + getNama() + "\nNIK: " + getNik() + "\nJenis kelamin: " + getJeniskelamin() +"\nPendapatan: " + getPendapatan();
    }
}
