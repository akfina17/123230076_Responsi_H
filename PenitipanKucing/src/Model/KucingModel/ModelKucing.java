/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.KucingModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelKucing {
    private Integer id_kucing;
    private String nama_pemilik, nama_kucing, no_telepon, lama_penitipan, biaya;
    
    public Integer getID(){
        return id_kucing;
    }
    
    public void setID(Integer id_kucing){
        this.id_kucing = id_kucing;
    }
    
    public String getNamaPemilik(){
        return nama_pemilik;
    }
    
    public void setNamaPemilik(String nama_pemilik){
        this.nama_pemilik = nama_pemilik;
    }
    
    public String getNamaKucing(){
        return nama_kucing;
    }
    
    public void setNamaKucing(String nama_kucing){
        this.nama_kucing = nama_kucing;
    }
    
    public String getNoTelepon(){
        return no_telepon;
    }
    
    public void setNoTelepon(String no_telepon){
        this.no_telepon = no_telepon;
    }
    
    public Integer getLamaPenitipan(){
        return lama_penitipan;
    }
    
    public void setLamaPenitipan(Integer lama_penitipan){
        this.lama_penitipan = lama_penitipan;
    }
    
    public Integer getBiaya(){
        return biaya;
    }
    
    public void setBiaya(Integer biaya){
        this.biaya = biaya;
    }
}
