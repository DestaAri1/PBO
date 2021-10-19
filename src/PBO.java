import java.util.Scanner;

public class PBO {
    int spidol_biasa, a;
    int pulpen, b;
    int pensil, c;
    int spidol_papan_tulis, d;
    int penghapus_spidol_papan, e;
    int tipe_X, f;
    int penghapus, g;
    int penggaris, h;
    int all_a;
    int all_b;
    int all_c;
    int all_d;
    int all_e;
    int all_f;
    int all_g;
    int all_h;
    int order;
    int total_belanja;
    String nama, jawab, order1, order2, order3, order4, order5, order6, order7, order8;

    Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
        PBO object = new PBO();
    }

void transaksi(){
    spidol_biasa = 3500;
    pulpen = 2500;
    pensil = 2000;
    spidol_papan_tulis = 6000;
    penghapus_spidol_papan = 5500;
    tipe_X = 5000;
    penghapus = 1000;
    penggaris = 2000;
    total_belanja = 0;
    jawab = "N";

    System.out.println("=====================");
    System.out.println("===Toko Alat Tulis===");
    System.out.println("=====================");
    System.out.println("Masukkan nama : ");
    nama = input.next();
    do {
        System.out.println("List Barang : ");
        System.out.println("1. Spidol               = Rp. 3500");
        System.out.println("2. Pulpen               = Rp. 2500");
        System.out.println("3. Pensil               = Rp. 2000");
        System.out.println("4. Spidol Whiteboard    = Rp. 6000");
        System.out.println("5. Penghapus Whiteboard = Rp. 5500");
        System.out.println("6. Tip X                = Rp. 5000");
        System.out.println("7. Penghapus            = Rp. 1000");
        System.out.println("8. Penggaris            = Rp. 2000");
        System.out.println("Pilih Produk : ");
        order = input.nextInt();
        switch(order){
            case 1 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_a = input.nextInt();
                a = spidol_biasa * all_a;
                order1 = "Spidol";
                break;
            case 2 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_b = input.nextInt();
                b = pulpen * all_b;
                order2 = "Pulpen";
                break;
            case 3 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_c = input.nextInt();
                c = pensil * all_c;
                order3 = "Pensil";
                break;
            case 4 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_d = input.nextInt();
                d = spidol_papan_tulis * all_d;
                order4 = "Spidol Whiteboard";
                break;
            case 5 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_e = input.nextInt();
                e = penghapus_spidol_papan * all_e;
                order5 = "Penghapus Whiteboard";
                break;
            case 6 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_f = input.nextInt();
                f = tipe_X * all_f;
                order6 = "Tip X";
                break;
            case 7 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_g = input.nextInt();
                g = penghapus * all_g;
                order7 = "Penghapus";
                break;
            case 8 :
                System.out.println("Masukkan Jumlah Barang : ");
                all_h = input.nextInt();
                h = penggaris * all_h;
                order8 = "Penggaris";
                break;
        }
        System.out.println("Ingin Menambah Barang? y/n");
        jawab = input.next();
    }while (jawab.equals("y"));
}
}
