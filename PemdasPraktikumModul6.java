public class PemdasPraktikumModul6 {
    public static void main(String[] args) {

        // testcase Manusia
        System.out.println("==================== MANUSIA ====================");
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a + "\n=================================================");
        Manusia b = new Manusia("B", "222", false, true);
        System.out.println(b + "\n=================================================");
        Manusia c = new Manusia("C", "333", true, false);
        System.out.println(c + "\n=================================================");

        // testcase MahasiswaFILKOM
        System.out.println("\n==================== Mahasiswa FILKOM ====================");
        MahasiswaFILKOM aKuliah = new MahasiswaFILKOM("A", "111", true, true, "245150700111006", 2.9);
        System.out.println(aKuliah + "\n==========================================================");
        MahasiswaFILKOM bKuliah = new MahasiswaFILKOM("B", "222", false, true, "245150200111026", 3.2);
        System.out.println(bKuliah + "\n==========================================================");
        MahasiswaFILKOM cKuliah = new MahasiswaFILKOM("C", "333", true, false, "245150300111036", 3.8);
        System.out.println(cKuliah + "\n==========================================================");

        // testcase Pekerja
        System.out.println("\n==================== PEKERJA ====================");
        Pekerja aKerja = new Pekerja("A", "111", true, true, 2023, 4, 20, 2, 1000);
        System.out.println(aKerja + "\n=================================================");
        Pekerja bKerja = new Pekerja("B", "222", false, true, 2016, 12, 23, 0, 1000);
        System.out.println(bKerja + "\n=================================================");
        Pekerja cKerja = new Pekerja("C", "333", true, false, 2005, 5, 20, 10, 1000);
        System.out.println(cKerja + "\n=================================================");

        // testcase Manager
        System.out.println("\n==================== MANAGER ====================");
        Manager aManager = new Manager("A", "111", true, true, 2010, 4, 20, 2, 7500, "HRD");
        System.out.println(aManager + "\n=================================================");
        Pekerja bManager = new Manager("B", "222", false, true, 2010, 12, 23, 0, 7500, "Finance/Accounting");
        System.out.println(bManager + "\n=================================================");
        Pekerja cManager = new Manager("C", "333", true, false, 2010, 5, 20, 10, 7500, "IT Manager");
        System.out.println(cManager + "\n=================================================");
    }
}
