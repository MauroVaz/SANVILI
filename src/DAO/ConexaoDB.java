/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mauri
 */
public class ConexaoDB {
    
    private Connection conexao;
    
    public boolean conectar(){
        
        try{
            
            File file = new File("data_base/");
           
        if (file.exists()) {
            
            String url = "jdbc:sqlite:data_base/sanvili_data.db";
            
            this.conexao = DriverManager.getConnection(url);
            
        }else{
            
            new File("data_base/").mkdir();
             
            String url = "jdbc:sqlite:data_base/sanvili_data.db";
            
            this.conexao = DriverManager.getConnection(url);
        }
           
            
        }catch(SQLException e){
            
            System.err.println(e.getMessage());
            
            return false;
        }
       
        return true;
    }
    
    public boolean desconectar(){
        
        try{
            
            if(this.conexao.isClosed() == false){
                this.conexao.close();
                
            }
            
        }catch(SQLException e){
            
            System.err.println(e.getMessage());
            return false;
        }
            
      
        return true;
    }
    
    
    public Statement criarStatment(){
        
        try{
            return this.conexao.createStatement();
        }catch(SQLException e){
            return null;    
        }
    }
    
    public PreparedStatement criarPreparedStatment(String sql){
        
        try{
            return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;    
        }
    }
    
    
    
    public Connection getConexao(){
    
        return this.conexao;
        
    }
    
}
