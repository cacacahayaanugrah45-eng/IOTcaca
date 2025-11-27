package latihan;

public class latihan_2_variabel {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM BELAJAR VARIABEL JAVA ===");
        System.out.println();
        
        System.out.println("1. VARIABEL PRIMITIVE");
        System.out.println("---------------------");
        
        int umur = 20;
        byte NilaiUjian = 85;
        short JumlahSiswa = 150;
        long PopulasiKota = 5000000L;
        
        System.out.println("umur: " + umur);
        System.out.println("Nilai Ujian: " + NilaiUjian);
        System.out.println("Jumlah Siswa: " + JumlahSiswa);
        System.out.println("Populasi Kota: " + PopulasiKota);
        System.out.println();
        
        float tinggiBadan = 175.5f;
        double hargaBarang = 125000.75;
        
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println();
        
        char grade = 'A';
        boolean isLulus = true;
        
        System.out.println("Grade: " + grade);
        System.out.println("Status Kelulusan: " + isLulus);
        System.out.println();
        
        System.out.println("2. VARIABEL REFERENCE");
        System.out.println("---------------------");
        
        String nama = "Budi Santoso";
        String alamat = "Jl. Merdeka No. 123";
        
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println();
        
        System.out.println("3. KONSTANTA (FINAL)");
        System.out.println("--------------------");
        
        final double PI = 3.14159;
        final String NEGARA = "Indonesia";
        
        System.out.println("Nilai PI: " + PI);
        System.out.println("Negara: " + NEGARA);
        System.out.println();
        
        System.out.println("4. OPERASI DENGAN VARIABEL");
        System.out.println("--------------------------");
        
        int a = 10;
        int b = 5;
        
        int penjumlahan = a + b;
        int pengurangan = a - b;
        int perkalian = a * b;
        int pembagian = a / b;
        int modulus = a % b;
        
        System.out.println(a + " + " + b + " = " + penjumlahan);
        System.out.println(a + " - " + b + " = " + pengurangan);
        System.out.println(a + " * " + b + " = " + perkalian);
        System.out.println(a + " / " + b + " = " + pembagian);
        System.out.println(a + " % " + b + " = " + modulus);
        System.out.println();
        
        System.out.println("5. TYPE CASTING");
        System.out.println("---------------");
        
        int angkaInt = 100;
        double angkaDouble = angkaInt;
        int angkaKembali = (int) angkaDouble;
        
        System.out.println("int ke double: " + angkaInt + " - " + angkaDouble);
        System.out.println("double ke int: " + angkaDouble + " - " + angkaKembali);
    }
}