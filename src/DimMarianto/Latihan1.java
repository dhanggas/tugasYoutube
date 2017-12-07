/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DimMarianto;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhanggas
 */
public class Latihan1 {

    private static final String uname = "root";
    private static final String psswd = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbbelajarswing";

    public static void main(String[] args) {
        try {
            Connection koneksi = DriverManager.getConnection(url, uname, psswd);

            Statement st = koneksi.createStatement();
            ResultSet hasil = st.executeQuery("select * from tbmahasiswa");
            while (hasil.next()) {
                System.out.print("id : " + hasil.getString(1));
                System.out.print("nama : " + hasil.getString(2));
                System.out.print("jurusan : " + hasil.getString(3));
                System.out.println("");
            }
            koneksi.close();

            PreparedStatement ps = (PreparedStatement) koneksi.prepareStatement("insert into tbmahasiswa (id,nama,jurusan) values (?,?,?)");
            ps.setString(1, "123");
            ps.setString(2, "Juni");
            ps.setString(3, "SU");
            ps.executeUpdate();
            ps.close();

            PreparedStatement ps2 = (PreparedStatement) koneksi.prepareStatement("update tbmahasiswa set nama = ? where id = ?");
            ps2.setString(1, "Roni sanjaya");
            ps2.setString(2, "1");
            ps2.executeUpdate();
            ps2.close();

            PreparedStatement ps3 = (PreparedStatement) koneksi.prepareStatement("delete from tbmahasiswa  where id = ?");
            ps3.setString(1, "1");
            ps3.executeUpdate();
            ps3.close();
            System.out.println("database ada");

        } catch (SQLException ex) {
            System.err.println("data base tidak ada");
            Logger.getLogger(Latihan1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
