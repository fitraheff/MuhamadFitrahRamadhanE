package NO_1;

class Sewa {
    String jenisSewa;
    int hargaSewa;
    int jumlahJamSewa;

    public Sewa(String jenisSewa, int hargaSewa, int jumlahJamSewa) {
        this.jenisSewa = jenisSewa;
        this.hargaSewa = hargaSewa;
        this.jumlahJamSewa = jumlahJamSewa;
    }

    public int hitungHarga() {
        return hargaSewa * jumlahJamSewa;
    }
}