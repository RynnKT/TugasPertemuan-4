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

public class Insert extends Koneksi {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            System.out.print("Masukkan Nomor: ");
            String klm1 = sc.nextLine();
            System.out.print("Masukkan Klub: ");
            String klm2 = sc.nextLine();
            System.out.print("Masukkan Kota Asal: ");
            String klm3 = sc.nextLine();
            System.out.print("Masukkan Point Kemenangan: ");
            String klm4 = sc.nextLine();

            String QUERY = "INSERT INTO LigaSawah VALUES ('" + klm1 + "', '" + klm2 + "', '" + klm3 + "', '" + klm4 + "')";
            stmt.executeUpdate(QUERY);

            System.out.println("Data Berhasil Ditambahkan!");

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }