import java.util.Scanner;

    public class Pemilihan2Percobaan2 {

        public static void main(String[] args){
            Scanner asla = new Scanner(System.in);

            int pilihan_menu;
            int harga;
            double diskon = 0.10;
            String member;
            int jumlah_beli;
            double total_bayar;

            System.out.println("------------------------");
            System.out.println("==== MENU KAFE JTI =====");
            System.out.println("------------------------");
            System.out.println("1. Ricebowl");
            System.out.println("2. Ice Tea");
            System.out.println("3. Paket Bundling (Ricebowl + Ice Tea");
            System.out.println("-------------------------------------");
            System.out.println("Masukkan angka dari menu yang dipilih = ");
            pilihan_menu = asla.nextInt();
            asla.nextLine();

            System.out.print("Apakah punya member (y/n) ? = ");
            member = asla.nextLine();

            System.out.println("Masukkan jumlah beli = ");
            jumlah_beli = asla.nextInt();

            System.out.println("----------------------------");

            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);

                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);

                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; // Menghentikan eksekusi lebih lanjut jika pilihan salah

                }
                // Menghitung total bayar setelah diskon
                total_bayar = harga - (harga * diskon) * jumlah_beli;
                System.out.println("Total bayar setelah diskon = " + total_bayar);

                // potongan QRIS Rp1.000
                total_bayar = total_bayar - 1000;
                System.out.println("Total bayar setelah potongan QRIS = " + total_bayar);
            }
            
        }

        

    
}
