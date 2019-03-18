/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cobertura;
import Model.Funcionarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class Query {
    
    public void insert(Funcionarios d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlInsert = "INSERT INTO Funcionarios ("
                +"id,"
                +"prefixo_agencia,"
                +"nome_agencia,"
                +"nome_funcionario,"
                +"telefone_funcionario,"
                +"cargo_agencia,"
                +"roupa,"
                +"bota"
                +") VALUES (?,?,?,?,?,?,?,?)"
                +";";
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlInsert);
      
        try {
            
           

            stmt.setInt(2, d.getPrefixo_agencia());
            stmt.setString(3, d.getNome_agencia());
            stmt.setString(4, d.getNome_funcionario());
            stmt.setString(5, d.getTelefone_funcionario());
            stmt.setString(6, d.getCargo_agencia());
            stmt.setString(7, d.getRoupa());
            stmt.setInt(8, d.getBota());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionario Cadastrado");
           
        } catch (SQLException ex) {
            
        } finally {
            con.desconectar();
        }
    }

    public List<Funcionarios> selectTel() {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Funcionarios d = new Funcionarios();
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Telefonista");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
    
   
    
    
    public List<Funcionarios> selectCop() {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Funcionarios d = new Funcionarios();
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Copeira");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
            
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
              
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
    
    
    
    
    
    public List<Funcionarios> selectLimp() {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Funcionarios d = new Funcionarios();
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Limpeza");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
            
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
              
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
    
     
     public void update(Funcionarios d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlUpdate = "UPDATE Funcionarios SET prefixo_agencia = ?, nome_agencia = ?, nome_funcionario = ?, telefone_funcionario = ?,cargo_agencia = ?, roupa = ?, bota = ? where ID = ?";
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlUpdate);
        
        
        try {
            
            stmt.setInt(1, d.getPrefixo_agencia());
            stmt.setString(2, d.getNome_agencia());
            stmt.setString(3, d.getNome_funcionario());
            stmt.setString(4, d.getTelefone_funcionario());
            stmt.setString(5, d.getCargo_agencia());
            stmt.setString(6, d.getRoupa());
            stmt.setInt(7, d.getBota());
            stmt.setString(8, d.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados do Funcionario Atualizados");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no statement SQL, entre em contato com o administrador do sistema.");
        } finally {
            con.desconectar();
        }
    }
     
     
     public void delete(Funcionarios d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlDelete = "DELETE FROM Funcionarios WHERE ID = ?";
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlDelete);
        try {
            

            stmt.setString(1, d.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no statement SQL, entre em contato com o administrador do sistema.");
        } finally {
            con.desconectar();
        }
    
}
     
     
      public List<Funcionarios> selectTelFilter(Funcionarios d) {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ? AND prefixo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Telefonista");
            stmt.setInt(2, d.getPrefixo_agencia() );
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
     
     
       public List<Funcionarios> selectCopFilter(Funcionarios d) {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ? AND prefixo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Copeira");
            stmt.setInt(2, d.getPrefixo_agencia() );
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
       
       
        public List<Funcionarios> selectLimpFilter(Funcionarios d) {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        List<Funcionarios> listafuncionario = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Funcionarios WHERE cargo_agencia = ? AND prefixo_agencia = ?;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "Limpeza");
            stmt.setInt(2, d.getPrefixo_agencia() );
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getString("ID"));
                funcionario.setPrefixo_agencia(Integer.parseInt(rs.getString("prefixo_agencia")));
                funcionario.setNome_agencia(rs.getString("nome_agencia"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCargo_agencia(rs.getString("cargo_agencia"));
                funcionario.setRoupa(rs.getString("roupa"));
                funcionario.setBota(Integer.parseInt(rs.getString("bota")));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                listafuncionario.add(funcionario);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listafuncionario;
         
    }
     
        
        
        
        
        
        
        
        
      //Coberturas Query
        
        
        
       public void insertCobertura(Cobertura d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlInsertCob = "INSERT INTO Coberturas ("
                +"ID,"
                +"nome,"
                +"endereco,"
                +"numero,"
                +"bairro,"
                +"cidade,"
                +"cep,"
                +"cidade_nat,"
                +"telefone,"
                +"celular,"
                +"data_nascimento,"
                +"pai,"
                +"mae,"
                +"cpf,"
                +"rg,"
                +"ctps,"
                +"serie,"
                +"uf,"
                +"dt_ctps,"
                +"pis,"
                +"dt_pis,"
                +"banco,"
                +"conta_ag,"
                +"conta_digito,"
                +"n_conta_corrente,"
                +"n_conta_poupanca"
                +") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
                +";";
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlInsertCob);
           
        try {
            
           
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getEndereco());
            stmt.setString(4, d.getNumero());
            stmt.setString(5, d.getBairro());
            stmt.setString(6, d.getCidade());
            stmt.setString(7, d.getCep());
            stmt.setString(8, d.getCidade_nat());
            stmt.setString(9, d.getTelefone());
            stmt.setString(10, d.getCelular());
            stmt.setString(11, d.getData_nascimento());
            stmt.setString(12, d.getPai());
            stmt.setString(13, d.getMae());
            stmt.setString(14, d.getCpf());
            stmt.setString(15, d.getRg());
            stmt.setString(16, d.getCtps());
            stmt.setString(17, d.getSerie());
            stmt.setString(18, d.getUf());
            stmt.setString(19, d.getDt_ctps());
            stmt.setString(20, d.getPis());
            stmt.setString(21, d.getDt_pis());
            stmt.setString(22, d.getBanco());
            stmt.setString(23, d.getConta_ag());
            stmt.setString(24, d.getConta_digito());
            stmt.setString(25, d.getN_conta());
            stmt.setString(26, d.getN_conta_poup());
            
            

            
           
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cobertura Cadastrada");
        
        } catch (SQLException ex) {
            
        } finally {
            con.desconectar();
        }
    }
       
       
       
       
        public List<Cobertura> selectCob() {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Cobertura d = new Cobertura();
        List<Cobertura> listacobertura = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Coberturas;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Cobertura cobertura = new Cobertura();
                
                cobertura.setId(rs.getString("ID"));
                cobertura.setNome(rs.getString("nome"));
                cobertura.setEndereco(rs.getString("endereco"));
                cobertura.setNumero(rs.getString("numero"));
                cobertura.setBairro(rs.getString("bairro"));
                cobertura.setCidade(rs.getString("cidade"));
                cobertura.setCep(rs.getString("cep"));
                cobertura.setCidade_nat(rs.getString("cidade_nat"));
                cobertura.setTelefone(rs.getString("telefone"));
                cobertura.setCelular(rs.getString("celular"));
                cobertura.setData_nascimento(rs.getString("data_nascimento"));
                cobertura.setPai(rs.getString("pai"));
                cobertura.setMae(rs.getString("mae"));
                cobertura.setCpf(rs.getString("cpf"));
                cobertura.setRg(rs.getString("rg"));
                cobertura.setCtps(rs.getString("ctps"));
                cobertura.setSerie(rs.getString("serie"));
                cobertura.setUf(rs.getString("uf"));
                cobertura.setDt_ctps(rs.getString("dt_ctps"));
                cobertura.setPis(rs.getString("pis"));
                cobertura.setDt_pis(rs.getString("dt_pis"));
                cobertura.setBanco(rs.getString("banco"));
                cobertura.setConta_ag(rs.getString("conta_ag"));
                cobertura.setConta_digito(rs.getString("conta_digito"));
                cobertura.setN_conta(rs.getString("n_conta_corrente"));
                cobertura.setN_conta_poup(rs.getString("n_conta_poupanca"));
                
             
            
            
                listacobertura.add(cobertura);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listacobertura;
         
    }
    
        
    public List<Cobertura> selectCobResum() {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Cobertura d = new Cobertura();
        List<Cobertura> listacobertura = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT ID, nome, telefone, celular, cpf, rg FROM Coberturas;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Cobertura cobertura = new Cobertura();
                
                cobertura.setId(rs.getString("ID"));
                cobertura.setNome(rs.getString("nome"));
                cobertura.setTelefone(rs.getString("telefone"));
                cobertura.setCelular(rs.getString("celular"));
                cobertura.setCpf(rs.getString("cpf"));
                cobertura.setRg(rs.getString("rg"));
               
                
             
            
            
                listacobertura.add(cobertura);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listacobertura;
         
    }
        
        
     public List<Cobertura> Search(Cobertura d) {
        ConexaoDB con = new ConexaoDB();
         
        ResultSet rs = null;
        PreparedStatement stmt = null;
       
        List<Cobertura> listacobertura = new ArrayList<>();
        con.conectar();
        
        String selectqueryempres = "SELECT * FROM Coberturas WHERE nome LIKE ? ;";
        
       
           
        try {
            
            stmt = con.criarPreparedStatment(selectqueryempres);
            stmt.setString(1, "%"  + d.getNome() + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                Cobertura cobertura = new Cobertura();

                cobertura.setId(rs.getString("ID"));
                cobertura.setNome(rs.getString("nome"));
                cobertura.setEndereco(rs.getString("endereco"));
                cobertura.setNumero(rs.getString("numero"));
                cobertura.setBairro(rs.getString("bairro"));
                cobertura.setCidade(rs.getString("cidade"));
                cobertura.setCep(rs.getString("cep"));
                cobertura.setCidade_nat(rs.getString("cidade_nat"));
                cobertura.setTelefone(rs.getString("telefone"));
                cobertura.setCelular(rs.getString("celular"));
                cobertura.setData_nascimento(rs.getString("data_nascimento"));
                cobertura.setPai(rs.getString("pai"));
                cobertura.setMae(rs.getString("mae"));
                cobertura.setCpf(rs.getString("cpf"));
                cobertura.setRg(rs.getString("rg"));
                cobertura.setCtps(rs.getString("ctps"));
                cobertura.setSerie(rs.getString("serie"));
                cobertura.setUf(rs.getString("uf"));
                cobertura.setDt_ctps(rs.getString("dt_ctps"));
                cobertura.setPis(rs.getString("pis"));
                cobertura.setDt_pis(rs.getString("dt_pis"));
                cobertura.setBanco(rs.getString("banco"));
                cobertura.setConta_ag(rs.getString("conta_ag"));
                cobertura.setConta_digito(rs.getString("conta_digito"));
                cobertura.setN_conta(rs.getString("n_conta_corrente"));
                cobertura.setN_conta_poup(rs.getString("n_conta_poupanca"));
                
                listacobertura.add(cobertura);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

        return listacobertura;
         
    }
     
     
     
      public void delete(Cobertura d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlDelete = "DELETE FROM Coberturas WHERE ID = ?";
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlDelete);
        try {
            

            stmt.setString(1, d.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cobertura Deletada");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no statement SQL, entre em contato com o administrador do sistema.");
        } finally {
            con.desconectar();
        }
    }
      
       public void updateCob(Cobertura d) {

        ConexaoDB con = new ConexaoDB();
        con.conectar();
        
        String sqlUpdate =  "UPDATE Coberturas SET nome = ?,endereco = ?,numero = ?,bairro = ?,cidade = ?,cep = ?,cidade_nat = ?,telefone = ?,celular = ?,data_nascimento = ?,pai = ?,mae = ?,cpf = ?,rg = ?,ctps = ?,serie = ?,uf = ?, dt_ctps = ?,pis = ?,dt_pis = ?,banco = ?,conta_ag = ?,conta_digito = ?,n_conta_corrente = ?,n_conta_poupanca = ? WHERE ID = ? ;" ;
                
        
        PreparedStatement stmt = con.criarPreparedStatment(sqlUpdate);
        
        
        try {
            
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getEndereco());
            stmt.setString(3, d.getNumero());
            stmt.setString(4, d.getBairro());
            stmt.setString(5, d.getCidade());
            stmt.setString(6, d.getCep());
            stmt.setString(7, d.getCidade_nat());
            stmt.setString(8, d.getTelefone());
            stmt.setString(9, d.getCelular());
            stmt.setString(10, d.getData_nascimento());
            stmt.setString(11, d.getPai());
            stmt.setString(12, d.getMae());
            stmt.setString(13, d.getCpf());
            stmt.setString(14, d.getRg());
            stmt.setString(15, d.getCtps());
            stmt.setString(16, d.getSerie());
            stmt.setString(17, d.getUf());
            stmt.setString(18, d.getDt_ctps());
            stmt.setString(19, d.getPis());
            stmt.setString(20, d.getDt_pis());
            stmt.setString(21, d.getBanco());
            stmt.setString(22, d.getConta_ag());
            stmt.setString(23, d.getConta_digito());
            stmt.setString(24, d.getN_conta());
            stmt.setString(25, d.getN_conta_poup());
            stmt.setString(26, d.getId());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados da Cobertura Atualizados");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no statement SQL, entre em contato com o administrador do sistema.");
        } finally {
            con.desconectar();
        }
    }
      
       public void close() {
          ConexaoDB con = new ConexaoDB(); 
           con.desconectar();
           System.out.println("fechou");
}
       
       
}
