/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SDAO;

import Config.Conecta;
import Model.Pessoas.Cliente;
import Model.Pessoas.Vendedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Venda.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class VendaSDAO {

    private Conecta conecta;
    public PreparedStatement ps;
    public ResultSet resultados;
    public String sql;
    public Conecta conexao = new Conecta();

    public void salvar(Venda venda) {
        sql = "INSERT INTO venda (id, valor, troco, fk_cliente, fk_vendedor, qtd_itens, tipoPix, tipoDinheiro, tipoCartao) values (?,?,?,?,?,?,?,?,?)";
        try {
            ps = conecta.conn.prepareStatement(sql);
            ps.setInt(1, venda.getId());
            ps.setDouble(2, venda.getValor());
            ps.setDouble(3, venda.getTroco());
            ps.setInt(4, venda.getVendedor().getId());
            ps.setInt(5, venda.getCliente().getId());
            ps.setInt(6, venda.getListaProd().size());
            ps.setFloat(7, venda.getTipoPix());
            ps.setFloat(8, venda.getTipoDinheiro());
            ps.setFloat(9, venda.getTipoCartao());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
    }

    public List<Venda> listar() {
        sql = "select v.id, v.valor, v.troco, v.tipoPix, v.tipoDinheiro, v.tipoCartao, c.id, c.nome, e.id, e.nome from venda v \n"
                + "inner join cliente c on c.id = v.fk_cliente\n"
                + "inner join vendedor e on e.id = v.fk_vendedor; ";
        List<Venda> listaVendas = null;
        ResultSet result = null;
        try {
            result = ps.executeQuery();
            ps = conecta.conn.prepareStatement(sql);
            while (result.next()) {
                if (listaVendas == null) {
                    listaVendas = new ArrayList<Venda>();
                }
                Venda venda = new Venda();
                venda.setCliente(new Cliente());
                venda.setVendedor(new Vendedor());
                venda.setId(Integer.parseInt(result.getString(1)));
                venda.setValor(Double.parseDouble(result.getString(2)));
                venda.setTroco(Double.parseDouble(result.getString(3)));
                venda.setTipoPix(Float.parseFloat(result.getString(4)));
                venda.setTipoDinheiro(Float.parseFloat(result.getString(5)));
                venda.setTipoCartao(Float.parseFloat(result.getString(6)));
                venda.getCliente().setId(Integer.parseInt(result.getString(7)));
                venda.getCliente().setNome(result.getString(8));
                venda.getVendedor().setId(Integer.parseInt(result.getString(9)));
                venda.getVendedor().setNome(result.getString(10));
                listaVendas.add(venda);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
        return listaVendas;
    }

    public Venda obterUltima() {
        sql = "SELECT MAX(id) qtdVendas FROM venda";
        ResultSet result = null;
        try {
            result = ps.executeQuery();
            ps = conecta.conn.prepareStatement(sql);
            if (result.next()) {
                Venda venda = new Venda();
                venda.setId(result.getInt(1));
                return venda;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
            return null;
        }
        return null;
    }

}
