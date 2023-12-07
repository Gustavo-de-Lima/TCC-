/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Venda.ItemVenda;
import SDAO.ItemVendaSDAO;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ItemVendaController {

    public static String salvar(ItemVenda itensVenda) {
        String resposta = null;
        ItemVendaSDAO itemVendaSDAO = new ItemVendaSDAO();
        try {
            itemVendaSDAO.salvar(itensVenda);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<ItemVenda> obterItens(int idVenda) {
        List<ItemVenda> listaResposta = null;
        ItemVendaSDAO itemVendaSDAO = new ItemVendaSDAO();
        try {
            //listaResposta = ItensVendaMock.obterItens(idVenda);
            listaResposta = itemVendaSDAO.listarTodos(idVenda);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }

}
