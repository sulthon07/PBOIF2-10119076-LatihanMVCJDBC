/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sulthonnaufalakmal.latihanmvcjdbc.main;

import edu.sulthonnaufalakmal.latihanmvcjdbc.database.KingBarberShopDatabase;
import edu.sulthonnaufalakmal.latihanmvcjdbc.entity.Pelanggan;
import edu.sulthonnaufalakmal.latihanmvcjdbc.error.PelangganException;
import edu.sulthonnaufalakmal.latihanmvcjdbc.service.PelangganDao;
import edu.sulthonnaufalakmal.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class PBOIF210119076LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        PelangganDao dao = KingBarberShopDatabase.getPelangganDao();
        
        dao.deletePelanggan(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(PBOIF210119076LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        }
    }
    

