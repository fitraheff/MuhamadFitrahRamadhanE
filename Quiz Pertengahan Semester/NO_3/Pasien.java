package NO_3;

import java.util.Scanner;

// Class Pasien
class Pasien {
    String nama;
    String namaPoli;
    String namaDokter;
    String keteranganDokter;
    int biayaPendaftaran;
    int biayaObat;
    int biayaVitamin;
    int biayaDokter;
    int totalBiaya;

    public void inputPasienData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SELAMAT DATANG DI RUMAH SAKIT WARAS ----");
        System.out.println("============================================");
        System.out.println("");
        System.out.println("--------------------o0o---------------------");
        System.out.println("*Masukan Data Pasien *");

        System.out.println("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukan Alamat    ");
        String alamat = scanner.nextLine();
        System.out.print("Masukan No. Telp  ");
        String noIdentitas = scanner.nextLine();
        System.out.println("");

        System.out.println("Nama Poli");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
        System.out.println("");
        System.out.print("Pilih Poli   : ");
        int poli = scanner.nextInt();
        switch (poli) {
            case 1:
                namaPoli = "Gigi";
                break;
            case 2:
                namaPoli = "Anak";
                break;
            case 3:
                namaPoli = "Umum";
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        System.out.println("Nama Dokter");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfia Putri");
        System.out.println("");
        System.out.print("Pilih Dokter : ");
        int dokter = scanner.nextInt();
        switch (dokter) {
            case 1:
                namaDokter = "drg. Ahmad Afandi";
                break;
            case 2:
                namaDokter = "dr. Aris Wicaksono, Sp.A.";
                break;
            case 3:
                namaDokter = "dr. Alfia Putri";
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        System.out.println("Berikan Keterangan Dokter : ");
        keteranganDokter = scanner.nextLine();
        System.out.println("Masukkan biaya Pendaftaran: ");
        biayaPendaftaran = scanner.nextInt();
        System.out.println("Masukkan biaya Obat: ");
        biayaObat = scanner.nextInt();
        System.out.println("Masukkan biaya Vitamin: ");
        biayaVitamin = scanner.nextInt();
        System.out.println("Masukkan biaya Doketer: ");
        biayaVitamin = scanner.nextInt();

        System.out.println("--------------------o0o---------------------");
        System.out.println("============================================");
    }

    public void displayPasienData() {
        System.out.println("Dokter:    " + namaDokter);
        System.out.println("Keterangan " + keteranganDokter);
        System.out.println("");

        double totalBiaya = biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;
        System.out.println("Total Biaya yang di Bayar Pasien  Rp. " + totalBiaya);
        System.out.println("");
        System.out.println("Salam Sehat " + nama + " dari Rumah Sakit Waras");
    }
}
