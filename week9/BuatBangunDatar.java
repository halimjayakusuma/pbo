package week9;
import java.util.Scanner;

public class BuatBangunDatar 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Bangun Datar ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Luas Segitiga");
            System.out.println("5. Luas Jajar Genjang");
            System.out.println("6. Luas Trapesium");
            System.out.println("7. Luas Layang-layang");
            System.out.println("8. Keliling Persegi");
            System.out.println("9. Keliling Persegi Panjang");
            System.out.println("10. Keliling Lingkaran");
            System.out.println("11. Keliling Segitiga");
            System.out.println("12. Keliling Jajar Genjang");
            System.out.println("13. Keliling Trapesium");
            System.out.println("14. Keliling Layang-layang");
            System.out.println("15. Volume Kubus");
            System.out.println("16. Volume Tabung");
            System.out.println("17. Keluar");
            System.out.println("");
            System.out.print("Pilih menu : ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    int sisiPersegi = scanner.nextInt();
                    BangunDatar luasPersegi = new BangunDatar(0.0);
                    System.out.println("Luas Persegi: " + luasPersegi.luas(sisiPersegi) + " cm2");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    double panjangPersegiPanjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebarPersegiPanjang = scanner.nextDouble();
                    BangunDatar luasPersegiPanjang = new BangunDatar(0.0, 0.0);
                    System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang.luas(panjangPersegiPanjang, lebarPersegiPanjang) + " cm2");
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariLingkaran = scanner.nextDouble();
                    BangunDatar luasLingkaran = new BangunDatar(0.0);
                    System.out.println("Luas Lingkaran: " + luasLingkaran.luas(jariJariLingkaran) + " cm2");
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Masukkan alas: ");
                    int alasSegitiga = scanner.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggiSegitiga = scanner.nextInt();
                    BangunDatar luasSegitiga = new BangunDatar(0.0, 0.0);
                    System.out.println("Luas Segitiga: " + luasSegitiga.luas(alasSegitiga, tinggiSegitiga) + " cm2");
                    System.out.println("");
                    break;

                case 5:
                    System.out.print("Masukkan alas: ");
                    double alasJajarGenjang = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiJajarGenjang = scanner.nextDouble();
                    BangunDatar luasJajarGenjang = new BangunDatar(0.0);
                    System.out.println("Luas Jajar Genjang: " + luasJajarGenjang.luasJajarGenjang(alasJajarGenjang, tinggiJajarGenjang) + " cm2");
                    System.out.println("");
                    break;

                case 6:
                    System.out.print("Masukkan sisi a: ");
                    double sisiATrapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    double sisiBTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiTrapesium = scanner.nextDouble();
                    BangunDatar luasTrapesium = new BangunDatar(0.0);
                    System.out.println("Luas Trapesium: " + luasTrapesium.luasTrapesium(sisiATrapesium, sisiBTrapesium, tinggiTrapesium) + " cm2");
                    System.out.println("");
                    break;

                case 7:
                    System.out.print("Masukkan diagonal 1: ");
                    double diagonal1LayangLayang = scanner.nextDouble();
                    System.out.print("Masukkan diagonal 2: ");
                    double diagonal2LayangLayang = scanner.nextDouble();
                    BangunDatar luasLayangLayang = new BangunDatar(0.0);
                    System.out.println("Luas Layang-layang: " + luasLayangLayang.luasLayangLayang(diagonal1LayangLayang, diagonal2LayangLayang) + " cm2");
                    System.out.println("");
                    break;

                case 8:
                    System.out.print("Masukkan sisi: ");
                    int sisiKelilingPersegi = scanner.nextInt();
                    BangunDatar kelilingPersegi = new BangunDatar(0.0);
                    System.out.println("Keliling Persegi: " + kelilingPersegi.keliling(sisiKelilingPersegi) + " cm");
                    System.out.println("");
                    break;

                case 9:
                    System.out.print("Masukkan panjang: ");
                    double panjangKelilingPersegiPanjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebarKelilingPersegiPanjang = scanner.nextDouble();
                    BangunDatar kelilingPersegiPanjang = new BangunDatar(0.0);
                    System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang.keliling(panjangKelilingPersegiPanjang, lebarKelilingPersegiPanjang) + " cm");
                    System.out.println("");
                    break;

                case 10:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariKelilingLingkaran = scanner.nextDouble();
                    BangunDatar kelilingLingkaran = new BangunDatar(0.0);
                    System.out.println("Keliling Lingkaran: " + kelilingLingkaran.keliling(jariJariKelilingLingkaran) + " cm");
                    System.out.println("");
                    break;

                case 11:
                    System.out.print("Masukkan sisi kiri: ");
                    double sisiKiriSegitiga = scanner.nextDouble();
                    System.out.print("Masukkan sisi bawah: ");
                    double sisiBawahSegitiga = scanner.nextDouble();
                    System.out.print("Masukkan sisi kanan: ");
                    double sisiKananSegitiga = scanner.nextDouble();
                    BangunDatar kelilingSegitiga = new BangunDatar(0.0);
                    System.out.println("Keliling Segitiga: " + kelilingSegitiga.keliling(sisiKiriSegitiga, sisiBawahSegitiga, sisiKananSegitiga) + " cm");
                    System.out.println("");
                    break;

                case 12:
                    System.out.print("Masukkan panjang alas: ");
                    double alasKelilingJajarGenjang = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi miring: ");
                    double sisiMiringKelilingJajarGenjang = scanner.nextDouble();
                    BangunDatar kelilingJajarGenjang = new BangunDatar(0.0);
                    System.out.println("Keliling Jajar Genjang: " + kelilingJajarGenjang.kelilingJajarGenjang(alasKelilingJajarGenjang, sisiMiringKelilingJajarGenjang) + " cm");
                    System.out.println("");
                    break;

                case 13:
                    System.out.print("Masukkan sisi a: ");
                    double sisiAKelilingTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    double sisiBKelilingTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi c: ");
                    double sisiCKelilingTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi d: ");
                    double sisiDKelilingTrapesium = scanner.nextDouble();
                    BangunDatar kelilingTrapesium = new BangunDatar(0.0);
                    System.out.println("Keliling Trapesium: " + kelilingTrapesium.kelilingTrapesium(sisiAKelilingTrapesium, sisiBKelilingTrapesium, sisiCKelilingTrapesium, sisiDKelilingTrapesium) + " cm");
                    System.out.println("");
                    break;

                case 14:
                    System.out.print("Masukkan sisi a: ");
                    double sisiAKelilingLayangLayang = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    double sisiBKelilingLayangLayang = scanner.nextDouble();
                    BangunDatar kelilingLayangLayang = new BangunDatar(0.0);
                    System.out.println("Keliling Layang-layang: " + kelilingLayangLayang.kelilingLayangLayang(sisiAKelilingLayangLayang, sisiBKelilingLayangLayang) + " cm");
                    System.out.println("");
                    break;

                case 15:
                    System.out.print("Masukkan sisi: ");
                    double sisiVolumeKubus = scanner.nextDouble();
                    BangunRuang volumeKubus = new BangunRuang(sisiVolumeKubus);
                    System.out.println("Volume Kubus: " + volumeKubus.volume(sisiVolumeKubus) + " cm3");
                    System.out.println("");
                    break;

                case 16:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariVolumeTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiVolumeTabung = scanner.nextDouble();
                    BangunRuang volumeTabung = new BangunRuang(0.0);
                    System.out.println("Volume Tabung: " + volumeTabung.volume(jariJariVolumeTabung, tinggiVolumeTabung) + " cm3");
                    System.out.println("");
                    break;

                case 17:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
