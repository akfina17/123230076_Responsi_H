/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.KucingModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTabel extnds AbstractTableModel{
    List<ModelKucing> daftarKucing;
    String kolom[] = {"ID", "Nama Pemilik", "Nama Kucing", "No Telepon", "Lama Penitipan", "Biaya"};
    
    public ModelTabel(List<ModelKucing> daftarKucing){
        this.daftarKucing = daftarKucing;
    }
    
    @Override
    public int getRowCount(){
        return kolom.length;
    }
    
    @Override
    public int getColumnCount(){
        return kolom.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                return daftarKucing.get(rowIndex).getID();
            case 1:
                return daftarKucing.get(rowIndex).getNamaPemilik();
            case 2:
                return daftarKucing.get(rowIndex).getNamaKucing();
            case 3:
                return daftarKucing.get(rowIndex).getNoTelepon();
            case 4:
                return daftarKucing.get(rowIndex).getLamaPenitipan();
            case 5:
                return daftarKucing.get(rowIndex).getBiaya();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }
}
