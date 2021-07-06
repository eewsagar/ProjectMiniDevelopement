package com.main.model;

import com.main.dto.OperatorDTO;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class OperatorTableModel implements TableModel {

    private final String[] columnName = {"ID", "FULL NAME", "USER NAME", "CODE NUMBER", "CONTAT NO", "PASSWORD", "ENTRY DATE", "EMAIL ID"};
    private final Class[] columnClass = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    ArrayList<OperatorDTO> arrayList;

    public OperatorTableModel(ArrayList<OperatorDTO> arrayList) {
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
        OperatorDTO dTO = arrayList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dTO.getID();
            case 1:
                return dTO.getFullName();
            case 2:
                return dTO.getUserName();
            case 3:
                return dTO.getCodeNumber();
            case 4:
                return dTO.getContatNo();
            case 5:
                return dTO.getPassword();
            case 6:
                return dTO.getEntryDate();
            case 7:
                return dTO.getEmailId();
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
