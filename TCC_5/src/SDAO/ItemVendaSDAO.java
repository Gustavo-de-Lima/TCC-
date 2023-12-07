/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SDAO;

import Config.Conecta;
import Model.Venda.ItemVenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVendaSDAO {

    private Conecta conecta;
    public PreparedStatement ps;
    public ResultSet resultados;
    public String sql;
    public Conecta conexao = new Conecta();

    public void salvar(ItemVenda itemVenda) {
        sql = "INSERT INTO item_venda (cod_produto, id_venda, quant, valorUnitario)";
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, itemVenda.getCodProduto());
            ps.setInt(2, itemVenda.getIdVenda());
            ps.setDouble(3, itemVenda.getQuant());
            ps.setDouble(4, itemVenda.getValorUnitario());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public List<ItemVenda> listarTodos(Integer id) {
        sql = "SELECT cod_produto, id_venda, valorUnitario FROM item_venda WHERE id_venda = ?";
        List<ItemVenda> listaItensVenda = null;
        try {
            resultados = ps.executeQuery();
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, id);
            while (resultados.next()) {
                listaItensVenda = new ArrayList<ItemVenda>();
            }
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setCodProduto(Integer.parseInt(resultados.getString(1)));
            itemVenda.setIdVenda(Integer.parseInt(resultados.getString(2)));
            itemVenda.setValorUnitario(Double.parseDouble(resultados.getString(3)));
            listaItensVenda.add(itemVenda);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
        return listaItensVenda;
    }

}
