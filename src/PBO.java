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
    boolean pesan1, pesan2, pesan3, pesan4, pesan5, pesan6, pesan7, pesan8;
    int bayar, kurang, kembali;
    String nama, jawab, order1, order2, order3, order4, order5, order6, order7, order8;

    Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
        PBO obj = new PBO();
        obj.Toko();
    }

void Toko(){
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
    System.out.print("Masukkan nama : ");
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
        System.out.print("Pilih Produk : ");
        order = input.nextInt();
        switch(order){
            case 1 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_a = input.nextInt();
                a = spidol_biasa * all_a;
                order1 = "Spidol";
                pesan1=true;
                break;
            case 2 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_b = input.nextInt();
                b = pulpen * all_b;
                order2 = "Pulpen";
                pesan2=true;
                break;
            case 3 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_c = input.nextInt();
                c = pensil * all_c;
                order3 = "Pensil";
                pesan3=true;
                break;
            case 4 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_d = input.nextInt();
                d = spidol_papan_tulis * all_d;
                order4 = "Spidol Whiteboard";
                pesan4=true;
                break;
            case 5 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_e = input.nextInt();
                e = penghapus_spidol_papan * all_e;
                order5 = "Penghapus Whiteboard";
                pesan5=true;
                break;
            case 6 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_f = input.nextInt();
                f = tipe_X * all_f;
                order6 = "Tip X";
                pesan6=true;
                break;
            case 7 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_g = input.nextInt();
                g = penghapus * all_g;
                order7 = "Penghapus";
                pesan7=true;
                break;
            case 8 :
                System.out.print("Masukkan Jumlah Barang : ");
                all_h = input.nextInt();
                h = penggaris * all_h;
                order8 = "Penggaris";
                pesan8=true;
                break;
        }
        System.out.print("Ingin Menambah Barang? y/n");
        jawab = input.next();
    }while (jawab.equals("y"));

    total_belanja=a+b+c+d+e+f+g+h;
    System.out.println("List Produk yang dibeli");
    System.out.println("\tNama Barang\t|  Harga  |  Jumlah Barang  |  Total Harga");
    if (pesan1=true) {
        System.out.println("Spidol\t\t\t:  "+spidol_biasa+"           "+all_a+"               "+a);
    }
    if (pesan2=true) {
        System.out.println("Pulpen                  :  "+pulpen+"           "+all_b+"               "+b);
    }
    if (pesan3=true) {
        System.out.println("Pensil                  :  "+pensil+"           "+all_c+"               "+c);
    }
    if (pesan4=true) {
        System.out.println("Spidol Whiteboard       :  "+spidol_papan_tulis+"           "+all_d+"               "+d);
    }
    if (pesan5=true) {
        System.out.println("Penghapus Whiteboard    :  "+penghapus_spidol_papan+"           "+all_e+"               "+e);
    }
    if (pesan6=true) {
        System.out.println("Tip X                   :  "+tipe_X+"           "+all_f+"               "+f);
    }
    if (pesan7=true) {
        System.out.println("Penghapus               :  "+penghapus+"           "+all_g+"               "+g);
    }
    if (pesan8=true) {
        System.out.println("Penggaris               :  "+penggaris+"           "+all_h+"               "+h);
    }
    System.out.println("==================================================================");
    System.out.println("Total Belanja           :    \t\t\t      Rp. "+total_belanja); 
    System.out.print("Masukkan Nominal        :    \t\t\t      Rp. ");
    bayar=input.nextInt();
 
        if (bayar<total_belanja) {
            kurang = total_belanja - bayar;
            System.out.println("--------- Warning! ---------");
            System.out.println("Mohon maaf uang anda kurang :        Rp. "+kurang);
            System.out.println("----------------------------");
        } else {
            System.out.println("");
            System.out.println(" _______________________________________________________________________________");
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("| Nama : "+nama+"\t\t\t\t\t\t\t\t\t|");
            System.out.println("|\t\tNama Barang\t|  Harga  |  Jumlah Barang  |  Total Harga\t|");
            if (pesan1=true) {
                System.out.println("|\tSpidol\t\t\t:  "+spidol_biasa+"           "+all_a+"               "+a+"\t\t|");
            }
            if (pesan2=true) {
                System.out.println("|\tPulpen                  :  "+pulpen+"           "+all_b+"               "+b+"\t\t|");
            }
            if (pesan3=true) {
                System.out.println("|\tPensil                  :  "+pensil+"           "+all_c+"               "+c+"\t\t|");
            }
            if (pesan4=true) {
                System.out.println("|\tSpidol Whiteboard       :  "+spidol_papan_tulis+"           "+all_d+"               "+d+"\t\t|");
            }
            if (pesan5=true) {
                System.out.println("|\tPenghapus Whiteboard    :  "+penghapus_spidol_papan+"           "+all_e+"               "+e+"\t\t|");
            }
            if (pesan6=true) {
                System.out.println("|\tTip X                   :  "+tipe_X+"           "+all_f+"               "+f+"\t\t|");
            }
            if (pesan7=true) {
                System.out.println("|\tPenghapus               :  "+penghapus+"           "+all_g+"               "+g+"\t\t|");
            }
            if (pesan8=true) {
                System.out.println("|\tPenggaris               :  "+penggaris+"           "+all_h+"               "+h+"\t\t|");
            }
            System.out.println("|===============================================================================|");
            System.out.println("|\tTotal Belanja           :    \t\t\t      Rp. "+total_belanja+"\t\t|"); 
            System.out.println("|\tPembayaran Sejumlah     :    \t\t\t      Rp. "+bayar+"\t\t|");
            kembali = bayar - total_belanja;
            System.out.println("|\tKembalian anda          :    \t\t\t      Rp. "+kembali+"\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("|*******************************************************************************|");
            System.out.println("|********************Terimakasih Telah Menggunakan Jasa Kami********************|");
            System.out.println("|*******************************************************************************|");
            System.out.println("|_______________________________________________________________________________|");
        }
}
}
