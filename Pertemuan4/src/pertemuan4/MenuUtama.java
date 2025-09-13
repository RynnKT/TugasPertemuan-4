/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

public class MenuUtama extends Koneksi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Read Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Membuang karakter newline

            switch (pilih) {
                case 1:
                    char jwbInsert;
                    do {
                        Insert.run();
                        System.out.println("Apakah ingin menambahkan data lagi? (y/t)");
                        jwbInsert = sc.next().toLowerCase().charAt(0);
                        sc.nextLine();
                    } while (jwbInsert == 'y');
                    break;
                case 2:
                    char jwbUpdate;
                    do {
                        Update.run();
                        System.out.println("Apakah ingin merubah data lagi? (y/t)");
                        jwbUpdate = sc.next().toLowerCase().charAt(0);
                        sc.nextLine();
                    } while (jwbUpdate == 'y');
                    break;
                case 3:
                    char jwbDelete;
                    do {
                        Delete.run();
                        System.out.println("Apakah ingin menghapus 1 baris data lagi? (y/t)");
                        jwbDelete = sc.next().toLowerCase().charAt(0);
                        sc.nextLine();
                    } while (jwbDelete == 'y');
                    break;
                case 4:
                    Read.run();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 5);
        sc.close();
    }
}