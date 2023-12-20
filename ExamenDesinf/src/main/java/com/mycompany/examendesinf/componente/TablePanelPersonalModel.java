/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examendesinf.componente;

import com.mycompany.examendesinf.dto.Personal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 34675
 */
public class TablePanelPersonalModel extends AbstractTableModel{
private List<Personal> listadoPersonal;
private String[]columnanes;
private Class<?>[] columnclass;

    public TablePanelPersonalModel(List<Personal> listadoPersonal) {
        this.listadoPersonal = listadoPersonal;
        columnanes=new String[]{"NIF","NOMBRE","APELLIDOS","DEPARTAMENTO","EDAD"};
        columnclass=new Class<?>[]{String.class,String.class,String.class,String.class,Integer.class};
    }

    @Override
    public int getRowCount() {
        return listadoPersonal.size();
    }

    @Override
    public int getColumnCount() {
        return columnanes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personal p=listadoPersonal.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getNif();
             case 1:
                return p.getNombre(); 
             case 2:
                return p.getApellidos();
            case 3:
                return p.getCodDepartamento();
            default:
                return p.getEdad();
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnclass[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnanes[column];
    }
    
}
