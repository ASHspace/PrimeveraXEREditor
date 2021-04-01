package com.ashraf.primeveraxereditor;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
* Implementation for the XERDataTableModel which extends AbstractTableModel
* Abstract class provides default implementations for most of the methods in the TableModel interface. 
*/
public class XERDataTableModel extends AbstractTableModel {

    private List<XERDataModel> xerDataModel;

    /*
    * Column Header declaration for the DataModel
    */
    private final String[] columnNames = new String[]{
        "Unique ID", "Activity ID", "WBS", "Task Name", "Start Date", "End Date", "Predecessor", "Successor"
    };
    
    /*
    * Types of Data Class for each Header
    */
    private final Class[] columnClass = new Class[]{
        String.class, String.class, String.class, String.class, Date.class, Date.class, String.class, String.class
    };

    public XERDataTableModel(List<XERDataModel> xerDataModel) {
        this.xerDataModel = xerDataModel;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getRowCount() {
        return xerDataModel.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    /*
    * Each column value for our DataModel 
    */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        XERDataModel row = xerDataModel.get(rowIndex);

        if (0 == columnIndex) {
            return row.getUniqueID();
        } else if (1 == columnIndex) {
            return row.getActivityID();
        } else if (2 == columnIndex) {
            return row.getWBS();
        } else if (3 == columnIndex) {
            return row.getTaskName();
        } else if (4 == columnIndex) {
            return row.getStartDate();
        } else if (5 == columnIndex) {
            return row.getEndDate();
        } else if (6 == columnIndex) {
            return row.getPredecessor();
        } else if (7 == columnIndex) {
            return row.getSuccessor();
        }
        return null;
    }

}
