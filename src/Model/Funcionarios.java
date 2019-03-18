/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mauri
 */
public class Funcionarios {
   
   private String id;

    
   private int prefixo_agencia;
   private String nome_agencia;
   private String nome_funcionario;
   private String telefone_funcionario;
   private String cargo_agencia;
   private String roupa;
   private int bota;
   
   
   
   
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public int getBota() {
        return bota;
    }

    public void setBota(int Bota) {
        this.bota = Bota;
    }

    public int getPrefixo_agencia() {
        return prefixo_agencia;
    }

    public void setPrefixo_agencia(int prefixo_agencia) {
        this.prefixo_agencia = prefixo_agencia;
    }

   
    public String getNome_agencia() {
        return nome_agencia;
    }

    public void setNome_agencia(String nome_agencia) {
        this.nome_agencia = nome_agencia;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getTelefone_funcionario() {
        return telefone_funcionario;
    }

    public void setTelefone_funcionario(String telefone_funcionario) {
        this.telefone_funcionario = telefone_funcionario;
    }

    public String getCargo_agencia() {
        return cargo_agencia;
    }

    public void setCargo_agencia(String cargo_agencia) {
        this.cargo_agencia = cargo_agencia;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }
    
    
    
    
}
