/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SDAO;
import Config.Conecta;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Pessoas.Cliente;
import Model.Pessoas.Endereco;
import java.util.List;
import java.util.ArrayList;

public class ClienteSDAO {
    private Conecta conecta;
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
  
   

    public ClienteSDAO() {
        conecta = new Conecta();
    }
    
     public Cliente localizarId(Integer id) {
        try {
            sql = "SELECT * FROM cliente WHERE id = ?";            
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);    
            resultados = ps.executeQuery();
            resultados.next();
            Cliente cliente = new Cliente();
            cliente.setId(Integer.valueOf(resultados.getString(1)));
            cliente.setNome(resultados.getString(2));
            cliente.setTelefone(resultados.getString(3));
            Endereco endereco = new Endereco();
            endereco.setRua(resultados.getString(4));
            endereco.setNumero(resultados.getString(5));
            endereco.setEstado(resultados.getString(6));
            endereco.setBairro(resultados.getString(7));
            endereco.setCidade(resultados.getString(8));
            cliente.setEndereco(endereco);
            return cliente;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
    }
  
    /**
     *
     * @return
     */
    public List<Cliente> ListarTodos(){
        ResultSet result = null; 
        List<Cliente> listaCliente = null;
        String sql = "SELECT id, nome, telefone, rua, numero, bairro, cidade, estado FROM cliente";
        try{
             ps = conecta.conn.prepareStatement(sql); 
             result = ps.executeQuery();
             while(result.next()){
                 if(listaCliente == null){
                     listaCliente = new ArrayList<Cliente>();
                 }
                 Cliente clienteLista = new Cliente();
                 clienteLista.setId(result.getInt(1));
                 clienteLista.setNome(result.getString(2));
                 clienteLista.setTelefone(result.getString(3));
                 Endereco enderecoLista = new Endereco();
                 enderecoLista.setRua(result.getString(4));
                 enderecoLista.setNumero(result.getString(5));
                 enderecoLista.setBairro(result.getString(6));
                 enderecoLista.setCidade(result.getString(7));
                 enderecoLista.setEstado(result.getString(8));
                 clienteLista.setEndereco(enderecoLista);
                 listaCliente.add(clienteLista);
             }
         }catch (SQLException ex) {
                System.out.println(ex.getMessage());
                msg = "Falha na cobranca da operacao";
            }
        return listaCliente;
     }
    
    
    public List<Cliente> buscar(String nome){
        sql = "SELECT id, nome, telefone, rua, numero, estado, cidade, bairro FROM cliente WHERE nome LIKE ?";
        List<Cliente> listaCliente = null;
        ResultSet result = null;
        
        try{
            ps = conecta.conn.prepareStatement(sql); 
            ps.setString(1, "%" + nome +"%");
            result = ps.executeQuery();
            while(result.next()){
                if(listaCliente == null){
                     listaCliente = new ArrayList<Cliente>();
                 }
                 Cliente clienteLista = new Cliente();
                 clienteLista.setId(result.getInt(1));
                 clienteLista.setNome(result.getString(2));
                 clienteLista.setTelefone(result.getString(3));
                 Endereco enderecoLista = new Endereco();
                 enderecoLista.setRua(result.getString(4));
                 enderecoLista.setNumero(result.getString(5));
                 enderecoLista.setBairro(result.getString(6));
                 enderecoLista.setCidade(result.getString(7));
                 enderecoLista.setEstado(result.getString(8));
                 clienteLista.setEndereco(enderecoLista);
                 listaCliente.add(clienteLista);
            }
        }catch (SQLException ex) {
                System.out.println(ex.getMessage());
                msg = "Falha na cobranca da operacao";
            }
        return listaCliente;
    }
    
    
    public Cliente ObterId(Integer id){
        sql = "SELECT id, nome, telefone, rua, numero, estado, cidade, bairro WHERE nome LIKE ?";
        ResultSet result = null;
        
        try{
            ps = conecta.conn.prepareStatement(sql); 
            ps.setInt(1,id);
            result = ps.executeQuery();
                if(result.next()){
                 Cliente cliente = new Cliente();
                 cliente.setId(result.getInt(1));
                 cliente.setNome(result.getString(2));
                 cliente.setTelefone(result.getString(3));
                 Endereco enderecoLista = new Endereco();
                 enderecoLista.setRua(result.getString(4));
                 enderecoLista.setNumero(result.getString(5));
                 enderecoLista.setBairro(result.getString(6));
                 enderecoLista.setCidade(result.getString(7));
                 enderecoLista.setEstado(result.getString(8));
                 cliente.setEndereco(enderecoLista);
                 return cliente;
                }
        }catch (SQLException ex) {
                System.out.println(ex.getMessage());
                msg = "Falha na cobranca da operacao";
            }
        return null;
    }
      
   
   public  void salvar(Cliente cliente){ 
       try{
        sql = "INSERT INTO cliente (id, nome, telefone, rua, numero, bairro, cidade, estado) VALUES(?,?,?,?,?,?,?,?)";
        ps = conecta.conn.prepareStatement(sql);
        ps.setInt(1, cliente.getId());
        ps.setString(2, cliente.getNome());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEndereco().getRua());
        ps.setString(5, cliente.getEndereco().getBairro());
        ps.setString(6, cliente.getEndereco().getCidade());
        ps.setString(7, cliente.getEndereco().getEstado());
        ps.execute();
       }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } 
   }
   
   
   
   public void update(Cliente clienteAtualizado){
       try{
           sql = "UPDATE cliente SET nome = ?, telefone = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ? WHERE id = ?;";
            ps = conecta.conn.prepareStatement(sql);
            ps.setString(1, clienteAtualizado.getNome());
            ps.setString(2, clienteAtualizado.getTelefone());
            ps.setString(3, clienteAtualizado.getEndereco().getRua());
            ps.setString(4, clienteAtualizado.getEndereco().getNumero());
            ps.setString(5, clienteAtualizado.getEndereco().getBairro());
            ps.setString(6, clienteAtualizado.getEndereco().getCidade());
            ps.setString(7, clienteAtualizado.getEndereco().getEstado());
            ps.setInt(8, clienteAtualizado.getId());
            ps.executeUpdate();
       }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
   }
   
   public void delete(Integer id){
       try{
           sql = "DELETE FROM cliente WHERE id = ?";
           ps = conecta.conn.prepareStatement(sql);
           ps.setInt(1, id); 
           ps.execute();
       }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }   
   }
   
  
}
