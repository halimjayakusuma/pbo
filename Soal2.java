package week1;

public class Soal2 {

	public static void main(String[] args) {
		// a. Keliling lingkaran dengan diameter 10
        int diameterLingkaran = 10;
        double kelilingLingkaran = Math.PI * diameterLingkaran;
        System.out.println("Keliling lingkaran dengan diameter 10 adalah: " + kelilingLingkaran);

        // b. Luas segitiga siku-siku dengan alas = 6, tinggi = 8
        int alasSegitiga = 6;
        int tinggiSegitiga = 8;
        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        System.out.println("Luas segitiga siku-siku dengan alas 6 dan tinggi 8 adalah: " + luasSegitiga);

        // c. Volume tabung dengan diameter = 5, tinggi = 10
        int diameterTabung = 5;
        int tinggiTabung = 10;
        double radiusTabung = diameterTabung / 2.0;
        double volumeTabung = Math.PI * radiusTabung * radiusTabung * tinggiTabung;
        System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah: " + volumeTabung);

	}

}
