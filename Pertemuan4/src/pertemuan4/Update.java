/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update extends Koneksi {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            System.out.print("Masukkan Nama Kolom yang ingin diubah: ");
            String kolom = sc.nextLine();
            System.out.print("Masukkan Nilai Baru: ");
            String nilaiBaru = sc.nextLine();
            System.out.print("Masukkan Nama Kolom Acuan: ");
            String kolomAcuan = sc.nextLine();
            System.out.print("Masukkan Nilai Acuan: ");
            String nilaiAcuan = sc.nextLine();

            String QUERY = "UPDATE LigaSawah SET " + kolom + " = '" + nilaiBaru + "' WHERE " + kolomAcuan + " = '" + nilaiAcuan + "'";
            stmt.executeUpdate(QUERY);

            System.out.println("Data Berhasil Diupdate!");

        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }