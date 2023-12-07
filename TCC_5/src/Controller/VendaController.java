/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Venda.Venda;
import SDAO.VendaSDAO;
import java.util.List;

public class VendaController {

    public static String salvar(Venda venda) {

        String resposta = null;
        VendaSDAO vendaSDAO = new VendaSDAO();
        try {
            vendaSDAO.salvar(venda);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<Venda> listar() {
        List<Venda> listaResposta = null;
        VendaSDAO vendaSDAO = new VendaSDAO();
        try {
            listaResposta = vendaSDAO.listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }
    
    public static Venda obterUltima() {
        Venda venda =  new Venda();
        VendaSDAO vendaSDAO = new VendaSDAO();
        try{
            venda = vendaSDAO.obterUltima();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        return venda;
        
    }
}
