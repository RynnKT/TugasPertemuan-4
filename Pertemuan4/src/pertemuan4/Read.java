 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Read extends Koneksi {

    public static void run() {
        String QUERY = "SELECT * FROM LigaSawah";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {

            System.out.println("\n=== Data LigaSawah ===");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getInt(4)
                );
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // scanner agar user bisa pause sebelum balik ke menu
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTekan Enter untuk kembali ke Menu Utama...");
        sc.nextLine();
    }
}