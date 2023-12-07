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
import Model.Produto.Produto;
import java.util.List;
import java.util.ArrayList;

public class ProdutoSDAO {

    private Conecta conecta;
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ProdutoSDAO() {
        conecta = new Conecta();
    }

    public Produto localizar(Integer id) {
        try {
            sql = "SELECT nome, descricao, valor_unitario, quant FROM produto WHERE id = ?";
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);
            resultados = ps.executeQuery();
            resultados.next();
            Produto produto = new Produto();
            produto.setNome(resultados.getString(1));
            produto.setDescricao(resultados.getString(2));
            produto.setValorUnitario(Double.parseDouble(resultados.getString(3)));
            produto.setQuant(Integer.parseInt(resultados.getString(4)));
            return produto;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
    }

    public List<Produto> listarTodos() {
        sql = "SELECT id, nome, descricao, valor_unitario, quant FROM produto";
        List<Produto> listaProduto = null;
        ResultSet result = null;

        try {
            ps = conecta.conn.prepareStatement(sql);
            result = ps.executeQuery();
            while (result.next()) {
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt(1));
                produto.setNome(result.getString(2));
                produto.setDescricao(result.getString(3));
                produto.setValorUnitario(result.getDouble(4));
                produto.setQuant(result.getInt(5));
                listaProduto.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
        return listaProduto;
    }

    public List<Produto> buscarNome(String nome) {
        sql = "SELECT id, nome, descricao, valor_unitario, quant FROM produto WHERE nome LIKE ?";
        List<Produto> listaProduto = null;
        ResultSet result = null;
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            result = ps.executeQuery();
            while (result.next()) {
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt(1));
                produto.setNome(result.getString(2));
                produto.setDescricao(result.getString(3));
                produto.setValorUnitario(result.getDouble(4));
                produto.setQuant(result.getInt(5));
                listaProduto.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
        return listaProduto;
    }

    public void salvar(Produto produto) {
        try {
            sql = "INSERT INTO produto (id, nome, descricao, valor_unitario, quant) VALUES(?,?,?,?,?)";
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, produto.getId());
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getDescricao());
            ps.setDouble(4, produto.getValorUnitario());
            ps.setInt(5, produto.getQuant());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public void update(Produto produto) {
        try {
            sql = "UPDATE produto SET nome = ?, descricao = ?, valor_unitario = ?, quant = ? WHERE id = ?;";
            ps = conecta.conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getValorUnitario());
            ps.setInt(4, produto.getQuant());
            ps.setInt(5, produto.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public void deletar(Integer id) {
        try {
            sql = "DELETE FROM produto WHERE id = ?";
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }

    }
}
