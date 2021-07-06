package com.main.services;

import com.main.dto.UserDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Logger;

public class UserService {

    public static Integer saveUser(UserDTO dTO) {
        String insertQuery = "INSERT INTO tbl_user(password,userType,entryDate,userName,isActive)VALUES ("
                + "'" + dTO.getPassword() + "',"
                + "'" + dTO.getUserType() + "',"
                + "'" + dTO.getEntryDate() + "',"
                + "'" + dTO.getUserName() + "',"
                + "'Y');";
        System.out.println("insertQuery = " + insertQuery);

        try {
            MySQLConnection.preStateMent(insertQuery).execute();

            return 1;
        } catch (Exception e) {
            Logger.getLogger(UserService.class.getName());
        }
        return null;
    }

    public static Integer updateUser(UserDTO dTO, String id) {
        String updateQuery = "UPDATE tbl_user SET "
                + "password = '" + dTO.getPassword() + "',"
                + "userType = '" + dTO.getUserType() + "',"
                + "entryDate = '" + dTO.getEntryDate() + "',"
                + "userName = '" + dTO.getUserName() + "',"
                + "isActive = '" + dTO.getIsActive() + "'  WHERE id = '" + id + "' AND `isActive` = 'T'";
        System.out.println("updateQuery = " + updateQuery);

        try {
            MySQLConnection.preStateMent(updateQuery).execute();

            return 1;
        } catch (Exception e) {
            Logger.getLogger(UserService.class.getName());
        }
        return null;
    }

    public static ArrayList<UserDTO> searchOrListUser(String id, String mode) {
        String searchQuery = "";
        if (mode.equals("all")) {
            searchQuery = "SELECT * FROM tbl_user";
        }
        if (mode.equals("search")) {
            searchQuery = "SELECT * FROM tbl_user WHERE userName = '" + id + "'   ";
        }
        if (mode.equals("query")) {
            searchQuery = id;
        }
        System.out.println("searchQuery = " + searchQuery);
        ArrayList<UserDTO> arrayList = new ArrayList<>();
        try {
            try (ResultSet executeQuery = MySQLConnection.preStateMent(searchQuery).executeQuery()) {
                while (executeQuery.next()) {
                    UserDTO dTO = new UserDTO();
                    dTO.setID(executeQuery.getString("id"));
                    dTO.setUserType(executeQuery.getString("userType"));
                    dTO.setUserName(executeQuery.getString("userName"));
                    dTO.setPassword(executeQuery.getString("password"));
                    dTO.setEntryDate(executeQuery.getString("entryDate"));
                    arrayList.add(dTO);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(UserService.class.getName());
        }
        return arrayList;
    }
}
