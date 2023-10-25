package NO_3;

public class MainPasien {
 // Class Main
    public static void main(String[] args) {
        Pasien pasien = new Pasien();
        pasien.inputPasienData();
        pasien.displayPasienData();
        Transaksi transaksi = new Transaksi(pasien);
    }
}   
