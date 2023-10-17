import java.util.Scanner;
public class HitungIP22{
    public static void main(String[] args) {
        Scanner input22 = new Scanner (System.in);

        String nama,matkul,huruf; 
        int sks,jmlmatkul = 0,remidi = 0,jmlhSks = 0;
        char ulang = 'N';
        double jmlhIp = 0;

        System.out.println("=======Program Hitung IP=======");
        System.out.print("Masukkan nama : ");
        nama = input22.nextLine();

        do{
        System.out.print("Nama Mata Kuliah : ");
        matkul = input22.nextLine();
        jmlmatkul++;
        System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
        huruf = input22.next();
        //konversi nilai
        double bobot = 0.0;
        switch (huruf) {
            case "A":
                bobot = 4.0;
                break;
            case "B+":
                bobot = 3.5;
                break;
            case "B":
                bobot = 3.0;
                break;
            case "C+":
                bobot = 2.5;
                break;
            case "C":
                bobot = 2.0;
                break;
            case "D":
                bobot = 1.0;
                remidi++;
                break;
            case "E":
                bobot = 0.0;
                remidi++;
                break;
            default:
                System.out.println("Nilai tidak valid untuk mata kuliah ini.");
                continue; // Skip iterasi selanjutnya
        }

        System.out.print("Masukkan jumlah SKS : ");
        sks = input22.nextInt();
        
        jmlhIp += bobot * sks;
        jmlhSks += sks;

        System.out.print("Apakah Lanjut Input Nilai (Y/N)? ");
        ulang = input22.next().charAt(0);

     } while (ulang != 'N');

        double totalNilai = jmlhIp / jmlhSks;

        System.out.println("------------Hasil Perhitungan IP------------");
        System.out.println("Nama                    : " +nama);
        System.out.println("Indeks Prestasi (IP)    : " +totalNilai) ;
        System.out.println("Jumlah mata kuliah      : " +jmlmatkul);
        System.out.println("Jumlah SKS              : " +jmlhSks);
        System.out.println("Jumlah MK yang harus perbaikan / remidi : " +remidi);
}
}
