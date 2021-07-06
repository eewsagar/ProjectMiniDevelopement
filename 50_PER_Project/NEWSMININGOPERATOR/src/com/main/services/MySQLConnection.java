package com.main.services;

import com.main.refector.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection implements IConstantManager {

    private static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DATABASE_DRIVER);
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PreparedStatement preStateMent(String sql) throws SQLException, ClassNotFoundException {
        return getConnection().prepareStatement(sql);
    }

}
