package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Database {

    Connection con;

    public static void main(String[] args) {
//        Database c = new Database();
//        String firstname, lastname, phone;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Firstname");
//        firstname = sc.nextLine();
//        System.out.println("Enter Lastname");
//        lastname = sc.nextLine();
//        System.out.println("Enter Phone");
//        phone = sc.nextLine();
//        c.register(firstname, lastname, phone);
//        try {
//            c.getData();
//        } catch (Exception ex) {
//        }
    }
    //register driver

    public void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainer?" + "user=root");
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public void register(String firstname, String lastname, String phone) {
        try {
            registerDriver();
            String sql = "INSERT INTO `contacts`(`firstname`, `lastname`, `phone`) VALUES (?,?,?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, firstname);
            p.setString(2, lastname);
            p.setString(3, phone);
            long x = p.executeUpdate();
            con.close();
        } catch (Exception e) {
        }
    }

    public void getData() throws Exception {
        registerDriver();
        String sql = "SELECT  `firstname`, `lastname`, `phone` FROM `contacts` WHERE 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String phone = rs.getString("phone");
            System.out.println(firstname + "\n" + lastname + "\n" + phone);
        }
        con.close();
    }
}
