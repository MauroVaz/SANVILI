/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mauri
 */
public class Tabelas {
    
    private final ConexaoDB conexaoDB;
    
    public Tabelas(ConexaoDB pConexaoDB){
        this.conexaoDB = pConexaoDB;
    }

    Tabelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void tbFuncionario (){
        
        String sql = "CREATE TABLE IF NOT EXISTS Funcionarios"
                +"("
                +"ID Integer PRIMARY KEY,"
                +"prefixo_agencia Integer,"
                +"nome_agencia text,"
                +"nome_funcionario text,"
                +"telefone_funcionario text,"
                +"cargo_agencia text,"
                +"roupa text,"
                +"bota text"
                +");";
        
        
        boolean conectou = false;
          
           
           
        try{
            
           conectou = this.conexaoDB.conectar();
           
           Statement stmt = this.conexaoDB.criarStatment();
           
           stmt.execute(sql);
           
           
        }catch(SQLException e){
            
        }finally{
            
            if(conectou){
                this.conexaoDB.desconectar();
            }
        }
    }
    
    public void tbCobertura (){
        
          String sql = "CREATE TABLE IF NOT EXISTS Coberturas"
                +"("
                +"ID Integer PRIMARY KEY,"
                +"nome text,"
                +"endereco text,"
                +"numero text,"
                +"bairro text,"
                +"cidade text,"
                +"cep text,"
                +"cidade_nat text,"
                +"telefone text,"
                +"celular text,"
                +"data_nascimento text,"
                +"pai text,"
                +"mae text,"
                +"cpf  text,"
                +"rg text,"
                +"ctps text,"
                +"serie text,"
                +"uf text,"
                +"dt_ctps text,"
                +"pis text,"
                +"dt_pis text,"
                +"banco text,"
                +"conta_ag text,"
                +"conta_digito text,"
                +"n_conta_corrente text,"
                +"n_conta_poupanca text"
                +");";
   
        
        
        boolean conectou = false;
          
         
           
        try{
            
           conectou = this.conexaoDB.conectar();
           
           Statement stmt = this.conexaoDB.criarStatment();
           
           stmt.execute(sql);
          
            
        }catch(SQLException e){
            
        }finally{
            
            if(conectou){
                this.conexaoDB.desconectar();
            }
        }
    }
    
    
}
