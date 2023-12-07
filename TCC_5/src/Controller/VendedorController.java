/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pessoas.Vendedor;
import SDAO.VendedorSDAO;
import java.util.List;


public class VendedorController {
    
    public static String salvar(Vendedor vendedor){
        String resposta = null;
        VendedorSDAO vendedorSDAO = new VendedorSDAO();
        try{
            vendedorSDAO.salvar(vendedor);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    
    public static List<Vendedor> procurar(String nome){
        List<Vendedor> listaResposta = null;
        VendedorSDAO vendedorSDAO = new VendedorSDAO();
        try{
            if (nome == null || "".equals(nome)) {
                listaResposta = vendedorSDAO.listarTodos();
            } else {
                listaResposta = vendedorSDAO.buscarNome(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }
    
    public static String atualizar(Vendedor vendedor){
        String resposta = null;
        VendedorSDAO vendedorSDAO = new VendedorSDAO();
        try{
            vendedorSDAO.update(vendedor);
        }catch (Exception e){   
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    public static String excluir(Integer id){
        String resposta = null;
        VendedorSDAO vendedorSDAO = new VendedorSDAO();
        try {   
            vendedorSDAO.deletar(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    public static Vendedor obter(Integer id) {
        Vendedor vendedor =  new Vendedor();
        VendedorSDAO vendedorSDAO = new VendedorSDAO();
        try 
        {
            vendedor = vendedorSDAO.localizar(id);
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        return vendedor;
    }
}
