/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Pessoas.Cliente;
import SDAO.*;
import java.util.List;
public class ClienteController {
    
    public static String salvar(Cliente cliente){
        String resposta = null;
        try{
            ClienteSDAO clienteSDAO = new ClienteSDAO();
            clienteSDAO.salvar(cliente);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    public static List<Cliente> procurar(String nome){
        List<Cliente> listaResposta = null;
        ClienteSDAO clienteSDAO = new ClienteSDAO();
        try{
            if (nome == null || "".equals(nome)) {
                listaResposta = clienteSDAO.ListarTodos();
            } else {
                listaResposta = clienteSDAO.buscar(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }
    
    
    public static String atualizar(Cliente cliente){
        String resposta = null;
        ClienteSDAO clienteSDAO = new ClienteSDAO();
        
        try{
            clienteSDAO.update(cliente);
        }catch (Exception e){   
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    public static String excluir(Integer id){
        String resposta = null;
        ClienteSDAO clienteSDAO = new ClienteSDAO();
        try {   
            clienteSDAO.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    public static Cliente obter(Integer id) {
        Cliente cliente =  new Cliente();
        ClienteSDAO clienteSDAO = new ClienteSDAO();
        try 
        {
            cliente = clienteSDAO.ObterId(id);
        } 
        catch (Exception e){
            e.printStackTrace();
        }

        return cliente;
    }
    
}
