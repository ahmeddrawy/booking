package com.hagz_hotels.hotels_booking.Model.DAO;
import java.sql.*;

public class DBUtil {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelsBooking?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException throwables) {
            System.out.println("Connection Failed");
            throwables.printStackTrace();
        }
        return con;
    }
}
