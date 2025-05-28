/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.KucingModel;

import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class DAOKucing implements InterfaceDAOKucing{
    @Override
    public void insert(ModelKucing kucing){
        try{
            String query = "INSERT INTO kucing (nama_pemilik, nama_kucing, no_telepon, lama_penitipan, biaya) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, kucing.getNamaPemilik);
            statement.setString(2, kucing.getNamaKucing);
            statement.setString(3, kucing.getNoTelepon);
            statement.setInt(4, kucing.getLamaPenitipan);
            statement.setInt(5, kucing.getBiaya);
            
            statement.executeUpdate();
            statement.close();
        }
        catch (SQLException e){
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void update(ModelKucing kucing){
        try{
            String query = "UPDATE kucing SET nama_pemilik=?, nama_kucing=?, no_telepon=?, lama_penitipan=?, biaya=? WHERE id_kucing=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, kucing.getNamaPemilik);
            statement.setString(2, kucing.getNamaKucing);
            statement.setString(3, kucing.getNoTelepon);
            statement.setInt(4, kucing.getLamaPenitipan);
            statement.setInt(5, kucing.getBiaya);
            
            statement.executeUpdate();
            statement.close();
        }
        catch (SQLException e){
            System.out.println("Update Failed: (" + e.getMessage()+ ")");
        }
    }
    
    @Override
    public void delete(int id_kucing){
        try{
            String query = "DELETE FROM kucing WHERE id_kucing=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id_kucing);
            
            statement.executeUpdate();
            statement.close();
        }
        catch (SQLException e){
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
        }
    }
    
    @Override
    public List<ModelKucing> getAll(){
        List<ModelKucing> listKucing = null;
        try{
            listKucing = new ArrayList<>();
            Statement statement = Connector.Connect().createStatement();
            
            String query = "SELECT * FROM kucing;";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                ModelKucing kcg = new ModelKucing();
                kcg.setID(resultSet.getInt("id_kucing"));
                kcg.setNamaPemilik(resultSet.getString("nama_pemilik"));
                kcg.setNamaKucing(resultSet.getString("nama_kucing"));
                kcg.setNoTelepon(resultSet.getString("no_telepon"));
                kcg.setLamaPenitipan(resultSet.getInt("lama_penitipan"));
                kcg.setBiaya(resultSet.getInt("biaya"));
                
                listKucing.add(kcg);
            }
            statement.close();
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listKucing;
    }
}