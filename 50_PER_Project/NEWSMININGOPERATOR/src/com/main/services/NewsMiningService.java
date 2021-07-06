package com.main.services;

import com.main.controller.DateUtil;
import com.main.dto.NewsMiningDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.apache.commons.codec.binary.Base64;

public class NewsMiningService {

    public static Integer saveNewsMining(NewsMiningDTO dTO) {
        String insertQuery = "INSERT INTO tbl_newsmining(category,token3,token6,totalWeight,byUser,token1,token4,token7,title,filePath,token2,token5,token8,entryDate,txtSearchText,isActive)VALUES ("
                + "'" + dTO.getCategory() + "',"
                + "'" + dTO.getToken3() + "',"
                + "'" + dTO.getToken6() + "',"
                + "'" + dTO.getTotalWeight() + "',"
                + "'" + dTO.getByUser() + "',"
                + "'" + dTO.getToken1() + "',"
                + "'" + dTO.getToken4() + "',"
                + "'" + dTO.getToken7() + "',"
                + "'" + dTO.getTitle().replaceAll("'", "").toLowerCase() + "',"
                + "'" + dTO.getFilePath() + "',"
                + "'" + dTO.getToken2() + "',"
                + "'" + dTO.getToken5() + "',"
                + "'" + dTO.getToken8() + "',"
                + "'" + DateUtil.getCurrentDate() + "',"
                + "'" + dTO.getTitle().replaceAll("'", "").toLowerCase() + "',"
                + "'Y"
                + "');";
        System.out.println("insertQuery = " + insertQuery);

        try {
            MySQLConnection.preStateMent(insertQuery).execute();

            return 1;
        } catch (Exception e) {
            Logger.getLogger(NewsMiningService.class.getName());
        }
        return null;
    }

    public static Integer updateNewsMining(NewsMiningDTO dTO, String id) {
        String updateQuery = "UPDATE tbl_newsmining SET "
                + "id = '" + dTO.getID() + "',"
                + "category = '" + dTO.getCategory() + "',"
                + "token3 = '" + dTO.getToken3() + "',"
                + "token6 = '" + dTO.getToken6() + "',"
                + "totalWeight = '" + dTO.getTotalWeight() + "',"
                + "byUser = '" + dTO.getByUser() + "',"
                + "token1 = '" + dTO.getToken1() + "',"
                + "token4 = '" + dTO.getToken4() + "',"
                + "token7 = '" + dTO.getToken7() + "',"
                + "title = '" + dTO.getTitle() + "',"
                + "filePath = '" + dTO.getFilePath() + "',"
                + "token2 = '" + dTO.getToken2() + "',"
                + "token5 = '" + dTO.getToken5() + "',"
                + "token8 = '" + dTO.getToken8() + "',"
                + "entryDate = '" + dTO.getEntryDate() + "'  WHERE id = '" + id + "' AND `isActive` = 'T'";
        System.out.println("updateQuery = " + updateQuery);

        try {
            MySQLConnection.preStateMent(updateQuery).execute();

            return 1;
        } catch (Exception e) {
            Logger.getLogger(NewsMiningService.class.getName());
        }
        return null;
    }

    public static ArrayList<NewsMiningDTO> searchOrListNewsMining(String id, String mode) {
        String searchQuery = "";
        if (mode.equals("all")) {

            searchQuery = "SELECT * FROM tbl_newsmining";

        }
        if (mode.equals("search")) {
            searchQuery = "SELECT * FROM tbl_newsmining WHERE id = '" + id + "'";

        }
        System.out.println("searchQuery = " + searchQuery);
        ArrayList<NewsMiningDTO> arrayList = new ArrayList<>();
        try {
            try (ResultSet executeQuery = MySQLConnection.preStateMent(searchQuery).executeQuery()) {
                while (executeQuery.next()) {
                    NewsMiningDTO dTO = new NewsMiningDTO();
                    dTO.setID(executeQuery.getString("id"));
                    dTO.setCategory(executeQuery.getString("category"));
                    dTO.setToken3(executeQuery.getString("token3"));
                    dTO.setToken6(executeQuery.getString("token6"));
                    dTO.setTotalWeight(executeQuery.getString("totalWeight"));
                    dTO.setByUser(executeQuery.getString("byUser"));
                    dTO.setToken1(executeQuery.getString("token1"));
                    dTO.setToken4(executeQuery.getString("token4"));
                    dTO.setToken7(executeQuery.getString("token7"));
                    dTO.setTitle(executeQuery.getString("title"));
                    dTO.setFilePath(executeQuery.getString("filePath"));
                    dTO.setToken2(executeQuery.getString("token2"));
                    dTO.setToken5(executeQuery.getString("token5"));
                    dTO.setToken8(executeQuery.getString("token8"));
                    dTO.setEntryDate(executeQuery.getString("entryDate"));
                    arrayList.add(dTO);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(NewsMiningService.class.getName());
        }
        return arrayList;
    }
}
