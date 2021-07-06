/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.refector;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author piyush
 */
public class TableSetting implements ITableSetting {

    public static void setTable(JTable table) {
        TableColumnModel model = table.getColumnModel();
        int columnCount = model.getColumnCount();
        for (int index = 0; index < columnCount; index++) {
            TableColumn column = model.getColumn(index);
            column.sizeWidthToFit();
            String columnHeader = getCloumnHeader(index, table);
            System.out.println("columnHeader = " + columnHeader);
            if (columnHeader.equals("CATEGORY")) {
                column.setPreferredWidth(150);
            }
        }
    }

    private static String getCloumnHeader(int index, JTable table) {
        return table.getColumnName(index);
    }
}
