package SOAL;
import java.util.Scanner;
public class Tugas_4_individu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan cuaca(kemarau, hujan, mendung, badai, berkabut):");
        String cuaca = input.nextLine().toLowerCase() ;
        

        if (cuaca.equals("kemarau")) {
            System.out.println("Cuaca kemarau → Bisa bawa payung bisa juga tidak.");
        } else if (cuaca.equals("hujan")) {
            System.out.println("Cuaca hujan →  Tidak cocok untuk jalan-jalan.");
        } else if (cuaca.equals("mendung")) {
            System.out.println("Cuaca mendung→ Hati-hati, bisa jadi akan turun hujan.");
        } else if (cuaca.equals("badai")) {
            System.out.println("Cuaca badai → Lebih baik tetap saja di rumah.");
        } else if (cuaca.equals("berkabut")) {
            System.out.println("Cuaca berkabut → Berkendara harus lebih berhati-hati.");
        } else {
            System.out.println("Kondisi cuaca tidak ada.");
        }
    }
}