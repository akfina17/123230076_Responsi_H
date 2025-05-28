/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.KucingModel;

import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOKucing {
    public void insert(ModelKucing kucing);
    public void update(ModelKucing kucing);
    public void delete(int id_kucing);
    public List<ModelKucing> getAll();
}
