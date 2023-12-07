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
import Model.Pessoas.Vendedor;
import Model.Pessoas.Endereco;
import java.util.List;
import java.util.ArrayList;

public class VendedorSDAO {

    private Conecta conecta;
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;

    public VendedorSDAO() {
        conecta = new Conecta();
    }

    public Vendedor localizar(Integer id) {
        try {
            sql = "SELECT * FROM vendedor WHERE id = ?";
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);
            resultados = ps.executeQuery();
            resultados.next();
            Vendedor vendedor = new Vendedor();
            vendedor.setId(Integer.parseInt(resultados.getString(1)));
            vendedor.setNome(resultados.getString(2));
            vendedor.setTelefone(resultados.getString(3));
            vendedor.setEmail(resultados.getString(4));
            vendedor.setTipo(resultados.getString(5));
            Endereco endereco = new Endereco();
            endereco.setRua(resultados.getString(6));
            endereco.setBairro(resultados.getString(7));
            endereco.setCidade(resultados.getString(8));
            endereco.setEstado(resultados.getString(9));
            vendedor.setEndereco(endereco);
            return vendedor;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
    }

    public List<Vendedor> listarTodos() {
        ResultSet result = null;
        List<Vendedor> listaVendedor = null;
        sql = "SELECT id, nome, telefone, email, tipo, rua, bairro, cidade, estado FROM vendedor";
        try {
            ps = conecta.conn.prepareStatement(sql);
            result = ps.executeQuery();
            while (result.next()) {
                if (listaVendedor == null) {
                    listaVendedor = new ArrayList<Vendedor>();
                }
                Vendedor vendedor = new Vendedor();
                vendedor.setId(Integer.parseInt(resultados.getString(1)));
                vendedor.setNome(resultados.getString(2));
                vendedor.setTelefone(resultados.getString(3));
                vendedor.setEmail(resultados.getString(4));
                vendedor.setTipo(resultados.getString(5));
                Endereco endereco = new Endereco();
                endereco.setRua(resultados.getString(6));
                endereco.setBairro(resultados.getString(7));
                endereco.setCidade(resultados.getString(8));
                endereco.setEstado(resultados.getString(9));
                vendedor.setEndereco(endereco);
                listaVendedor.add(vendedor);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaVendedor;
    }

    public List<Vendedor> buscarNome(String nome) {
        sql = "select id, nome, telefone, email, tipo, rua, bairro, cidade, estado FROM vendedor WHERE nome LIKE ?";
        ResultSet result = null;
        List<Vendedor> listaVendedor = null;

        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            result = ps.executeQuery();

            if (listaVendedor == null) {
                listaVendedor = new ArrayList<Vendedor>();
            }
            Vendedor vendedor = new Vendedor();
            vendedor.setId(Integer.parseInt(resultados.getString(1)));
            vendedor.setNome(resultados.getString(2));
            vendedor.setTelefone(resultados.getString(3));
            vendedor.setEmail(resultados.getString(4));
            vendedor.setTipo(resultados.getString(5));
            Endereco endereco = new Endereco();
            endereco.setRua(resultados.getString(6));
            endereco.setBairro(resultados.getString(7));
            endereco.setCidade(resultados.getString(8));
            endereco.setEstado(resultados.getString(9));
            vendedor.setEndereco(endereco);
            listaVendedor.add(vendedor);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }

        return listaVendedor;
    }

    public void salvar(Vendedor vendedor) {
        sql = "INSERT INTO vendedor (id, nome, telefone, email, tipo, rua, bairro, cidade, estado) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, vendedor.getId());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getTelefone());
            ps.setString(4, vendedor.getEmail());
            ps.setString(5, vendedor.getTipo());
            ps.setString(6, vendedor.getEndereco().getRua());
            ps.setString(7, vendedor.getEndereco().getBairro());
            ps.setString(8, vendedor.getEndereco().getCidade());
            ps.setString(9, vendedor.getEndereco().getEstado());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public void update(Vendedor vendedor) {
        sql = "UPDATE vendedor SET nome = ?, telefone = ?, email = ?, tipo = ?, rua = ?, bairro = ?, cidade = ?, estado = ? WHERE id = ?;";
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getTelefone());
            ps.setString(4, vendedor.getEmail());
            ps.setString(5, vendedor.getTipo());
            ps.setString(6, vendedor.getEndereco().getRua());
            ps.setString(7, vendedor.getEndereco().getBairro());
            ps.setString(8, vendedor.getEndereco().getCidade());
            ps.setString(9, vendedor.getEndereco().getEstado());
            ps.setInt(10, vendedor.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public void deletar(Integer id) {
        sql = "DELETE FROM vendedor WHERE id = ?";
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }

    }
}
