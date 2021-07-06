package com.main.model;

import com.main.dto.NewsMiningDTO;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.apache.commons.codec.binary.Base64;

public class NewsMiningTableModel implements TableModel {

    private final String[] columnName = {"CATEGORY", "TITLE"};
    private final Class[] columnClass = {String.class, String.class};
    ArrayList<NewsMiningDTO> arrayList;

    public NewsMiningTableModel(ArrayList<NewsMiningDTO> arrayList) {
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
        NewsMiningDTO dTO = arrayList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dTO.getCategory();
            case 1:
                return new String(Base64.decodeBase64(dTO.getTitle().getBytes()));
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
