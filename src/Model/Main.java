/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ConexaoDB;
import DAO.Tabelas;
import View.Index;
/**
 *
 * @author mauri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoDB con = new ConexaoDB();
        Tabelas tb_fun = new Tabelas(con);
        Tabelas tb_cob = new Tabelas(con);
                
        tb_fun.tbFuncionario();
        tb_cob.tbCobertura();
        
        Index tab = new Index();
        tab.setVisible(true);
        
       
    }
    
    
}





   
    