package com.main.services;

import com.main.dto.OperatorDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Logger;

public class OperatorService {

    public static Integer saveOperator(OperatorDTO dTO) {
        String insertQuery = "INSERT INTO tbl_operator(fullName,userName,codeNumber,contatNo,password,entryDate,emailId)VALUES ("
                + "'" + dTO.getFullName() + "',"
                + "'" + dTO.getUserName() + "',"
                + "'" + dTO.getCodeNumber() + "',"
                + "'" + dTO.getContatNo() + "',"
                + "'" + dTO.getPassword() + "',"
                + "'" + dTO.getEntryDate() + "',"
                + "'" + dTO.getEmailId() + "');";
        System.out.println("insertQuery = " + insertQuery);

        try {
            MySQLConnection.preStateMent(insertQuery).execute();
            return 1;
        } catch (Exception e) {
            Logger.getLogger(OperatorService.class.getName());
        }
        return null;
    }

    public static Integer updateOperator(OperatorDTO dTO, String id) {
        String updateQuery = "UPDATE tbl_operator SET "
                + "fullName = '" + dTO.getFullName() + "',"
                + "userName = '" + dTO.getUserName() + "',"
                + "codeNumber = '" + dTO.getCodeNumber() + "',"
                + "contatNo = '" + dTO.getContatNo() + "',"
                + "password = '" + dTO.getPassword() + "',"
                + "entryDate = '" + dTO.getEntryDate() + "',"
                + "emailId = '" + dTO.getEmailId() + "'  WHERE id = '" + id + "' AND `isActive` = 'T'";
        System.out.println("updateQuery = " + updateQuery);

        try {
            MySQLConnection.preStateMent(updateQuery).execute();

            return 1;
        } catch (Exception e) {
            Logger.getLogger(OperatorService.class.getName());
        }
        return null;
    }

    public static ArrayList<OperatorDTO> searchOrListOperator(String id, String mode) {
        String searchQuery = "";
        if (mode.equals("all")) {

            searchQuery = "SELECT * FROM tbl_operator";

        }
        if (mode.equals("search")) {
            searchQuery = "SELECT * FROM tbl_operator WHERE id = '" + id + "'";

        }
        System.out.println("searchQuery = " + searchQuery);
        ArrayList<OperatorDTO> arrayList = new ArrayList<>();
        try {
            try (ResultSet executeQuery = MySQLConnection.preStateMent(searchQuery).executeQuery()) {
                while (executeQuery.next()) {
                    OperatorDTO dTO = new OperatorDTO();
                    dTO.setID(executeQuery.getString("id"));
                    dTO.setFullName(executeQuery.getString("fullName"));
                    dTO.setUserName(executeQuery.getString("userName"));
                    dTO.setCodeNumber(executeQuery.getString("codeNumber"));
                    dTO.setContatNo(executeQuery.getString("contatNo"));
                    dTO.setPassword(executeQuery.getString("password"));
                    dTO.setEntryDate(executeQuery.getString("entryDate"));
                    dTO.setEmailId(executeQuery.getString("emailId"));
                    arrayList.add(dTO);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(OperatorService.class.getName());
        }
        return arrayList;
    }
}
