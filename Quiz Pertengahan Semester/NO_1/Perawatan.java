package NO_1;

class Perawatan {
    String jenisPerawatan;
    int hargaPerawatan;
    int jumlahOrang;

    public Perawatan(String jenisPerawatan, int hargaPerawatan, int jumlahOrang) {
        this.jenisPerawatan = jenisPerawatan;
        this.hargaPerawatan = hargaPerawatan;
        this.jumlahOrang = jumlahOrang;
    }

    public int hitungHarga() {
        return hargaPerawatan * jumlahOrang;
    }
}





