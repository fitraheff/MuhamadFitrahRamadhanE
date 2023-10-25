package NO_1;

import java.util.Scanner;

class Salon {
    String nama;
    String noTelepon;

    public Salon(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    public void tampilkanUcapanTerimaKasih() {
        System.out.println("Terima kasih, " + nama + " sudah datang di Salon MOCHI");
        System.out.println("Membuat anda cantik adalah Keahlian kami");
    }
}

public class mainSalon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- SELAMAT DATANG DI SALON MOCHI ---- ");
        System.out.println("========================================= ");
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Masukkan nomor telepon pelanggan: ");
        String noTelepon = input.nextLine();
        System.out.println("");
        System.out.println("------------------ o0o ------------------");

        Salon salon = new Salon(namaPelanggan, noTelepon);

        int totalHargaPerawatan = 0;
        int totalHargaSewa = 0;

        char lanjutkan = 'y';

        do {
            System.out.print("Lakukan Transaksi ? [y/t]: ");
            lanjutkan = input.next().charAt(0);
            input.nextLine();
            System.out.println("------------------ o0o ------------------");

            if (lanjutkan != 'y' && lanjutkan != 'Y') {
                break;
            }
            System.out.println();
            System.out.println("Menu Pilihan : ");
            System.out.println("1. Jenis Perawatan");
            System.out.println("2. Jenis Penyewaan");
            System.out.println();
            System.out.println("------------------ o0o ------------------");
            System.out.print("Pilihan Anda (Ketik 1/2): ");
            int pilihan = input.nextInt();
            System.out.println("------------------ o0o ------------------");

            if (pilihan == 1) {
                System.out.println();
                System.out.println("Pilihan Jenis Perawatan");
                System.out.println("1. Facial Wajah");
                System.out.println("2. Masker");
                System.out.println("3. Potong Rambut");
                System.out.println();
                System.out.println("------------------ o0o ------------------");
                System.out.print("Masukkan pilihan Anda (Ketik 1/2/3): ");
                int pilihanPerawatan = input.nextInt();
                System.out.println("------------------ o0o ------------------");

                Perawatan perawatan = null;
switch (pilihanPerawatan) {
    case 1:
        System.out.println();
        System.out.println("Pilihan Jenis Perawatan Facial Wajah:");
        System.out.println("1. Facial Biasa (Rp. 50,000)");
        System.out.println("2. Facial Emas (Rp. 100,000)");
        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
        int pilihanFacial = input.nextInt();
        System.out.println();
        System.out.println("------------------ o0o ------------------");
        input.nextLine();
        System.out.println();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();
        if (pilihanFacial == 1) {
            perawatan = new Perawatan("Facial Biasa", 50000, jumlahOrang);
        } else if (pilihanFacial == 2) {
            perawatan = new Perawatan("Facial Emas", 100000, jumlahOrang);
        } else {
            System.out.println("Pilihan tidak valid.");
            continue;
        }
        break;
    case 2:
        System.out.println();
        System.out.println("Pilihan Jenis Perawatan Masker:");
        System.out.println("1. Masker Buah (Rp. 40,000)");
        System.out.println("2. Masker Lumpur (Rp. 75,000)");
        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
        int pilihanMasker = input.nextInt();
        System.out.println();
        System.out.println("------------------ o0o ------------------");
        input.nextLine();
        System.out.println();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang1 = input.nextInt();
        if (pilihanMasker == 1) {
            perawatan = new Perawatan("Masker Buah", 40000, jumlahOrang1);
        } else if (pilihanMasker == 2) {
            perawatan = new Perawatan("Masker Lumpur", 75000, jumlahOrang1);
        } else {
            System.out.println("Pilihan tidak valid.");
            continue;
        }
        break;
    case 3:
        System.out.println();
        System.out.println("Pilihan Jenis Potong Rambut:");
        System.out.println("1. Tidak Keramas (Rp. 20,000)");
        System.out.println("2. Keramas (Rp. 35,000)");
        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
        int pilihanPotongRambut = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.println("------------------ o0o ------------------");
        System.out.println();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang2 = input.nextInt();
        if (pilihanPotongRambut == 1) {
            perawatan = new Perawatan("Potong Rambut Tanpa Keramas", 20000, jumlahOrang2);
        } else if (pilihanPotongRambut == 2) {
            perawatan = new Perawatan("Pot  ong Rambut dengan Keramas", 35000, jumlahOrang2);
        } else {
            System.out.println("Pilihan tidak valid.");
            continue;
        }
        break;
    default:
        System.out.println("Pilihan tidak valid.");
        continue;
        }
                int hargaPerawatan = perawatan.hitungHarga();
                totalHargaPerawatan += hargaPerawatan;

                System.out.println("Total harga perawatan: " + hargaPerawatan);
                
            } else if (pilihan == 2) {
                System.out.println();
                System.out.println("Pilihan Jenis Menu Penyewaan");
                System.out.println("1. Baju Pengantin");
                System.out.println("2. Aksesoris");
                System.out.println("3. Rias Wajah");
                System.out.println();
                System.out.println("------------------ o0o ------------------");
                System.out.print("Masukkan pilihan Anda (Ketik 1/2/3): ");
                int pilihanSewa = input.nextInt();
                System.out.println("------------------ o0o ------------------");

                // Input jumlah jam sewa
                System.out.print("Masukkan jumlah jam sewa: ");
                int jumlahJamSewa = input.nextInt();

                // Membuat objek Sewa sesuai pilihan
                Sewa sewa = null;

                switch (pilihanSewa) {
                    case 1:
                        System.out.println();
                        System.out.println("Pilihan Jenis Penyewaan Baju Pengantin:");
                        System.out.println("1. Baju Pengantin Adat (Rp. 150,000)");
                        System.out.println("2. Baju Pengantin Internasional (Rp. 350,000)");
                        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
                        int pilihanBaju = input.nextInt();
                        System.out.println();
                        System.out.println("------------------ o0o ------------------");
                        input.nextLine();
                        System.out.println();
                        System.out.print("Masukkan jumlah orang: ");
                        int jumlahOrang1 = input.nextInt();
                        if (pilihanBaju == 1) {
                            sewa = new Sewa("Baju Pengantin Adat", 150000, jumlahOrang1);
                        } else if (pilihanBaju == 2) {
                            sewa = new Sewa("Baju Pengantin Internasional", 350000, jumlahOrang1);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                            continue;
                        }
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Pilihan Jenis Penyewaan Aksesoris:");
                        System.out.println("1. Aksesoris Anak (Rp. 20,000)");
                        System.out.println("2. Aksesoris Dewasa (Rp. 50,000)");
                        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
                        int pilihanAkses = input.nextInt();
                        System.out.println();
                        System.out.println("------------------ o0o ------------------");
                        input.nextLine();
                        System.out.println();
                        System.out.print("Masukkan jumlah orang: ");
                        int jumlahOrang2 = input.nextInt();
                        if (pilihanAkses == 1) {
                            sewa = new Sewa("Baju Pengantin Adat", 20000, jumlahOrang2);
                        } else if (pilihanAkses == 2) {
                            sewa = new Sewa("Baju Pengantin Internasional", 50000, jumlahOrang2);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                            continue;
                        }
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Pilihan Jenis Penyewaan Rias Wajah:");
                        System.out.println("1. Rias Wajah Biasa (Rp. 100,000)");
                        System.out.println("2. Rias Wajah Make Up Artis (Rp. 250,000)");
                        System.out.print("Masukkan pilihan Anda (Ketik 1/2): ");
                        int pilihanRias = input.nextInt();
                        System.out.println();
                        System.out.println("------------------ o0o ------------------");
                        input.nextLine();
                        System.out.println();
                        System.out.print("Masukkan jumlah orang: ");
                        int jumlahOrang3 = input.nextInt();
                        if (pilihanRias == 1) {
                            sewa = new Sewa("Rias Wajah Biasa", 100000, jumlahOrang3);
                        } else if (pilihanRias == 2) {
                            sewa = new Sewa("Rias Wajah Make Up Artis", 250000, jumlahOrang3);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        continue;
                }

                int hargaSewa = sewa.hitungHarga();
                totalHargaSewa += hargaSewa;

                System.out.println("Total harga penyewaan: " + hargaSewa);
                System.out.println("------------------ o0o ------------------");
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }
            System.out.println("");
            System.out.println("------------------ o0o ------------------");
            System.out.print("Input lagi (y/t)? ");
            lanjutkan = input.next().charAt(0);
            input.nextLine();
            System.out.println("------------------ o0o ------------------");
        } while (lanjutkan == 'y' || lanjutkan == 'Y');

        int totalHarga = totalHargaPerawatan + totalHargaSewa;
        System.out.println("");
        System.out.println("Total yang harus dibayar: " + totalHarga);
        System.out.println("");
        salon.tampilkanUcapanTerimaKasih();
    }
}