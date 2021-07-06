package com.main.model;

import com.main.dto.UserDTO;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class UserTableModel implements TableModel {

    private final String[] columnName = {"ID", "PASSWORD", "USER TYPE", "ENTRY DATE", "USER NAME", "IS ACTIVE"};
    private final Class[] columnClass = {String.class, String.class, String.class, String.class, String.class, String.class};
    ArrayList<UserDTO> arrayList;

    public UserTableModel(ArrayList<UserDTO> arrayList) {
        this.arrayList = arrayList;
    }

    public int getRowCount() {
        return arrayList.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public String getColumnName(int columnIndex) {
        return columnName[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        UserDTO dTO = arrayList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dTO.getID();
            case 1:
                return dTO.getPassword();
            case 2:
                return dTO.getUserType();
            case 3:
                return dTO.getEntryDate();
            case 4:
                return dTO.getUserName();
            case 5:
                return dTO.getIsActive();
        }
        return null;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {
    }
}
