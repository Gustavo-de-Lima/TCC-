package Controller;

import Model.Produto.Produto;
import SDAO.ProdutoSDAO;
import java.util.List;

public class ProdutoController {

    public static String salvar(Produto produto) {
        String resposta = null;
        ProdutoSDAO produtoSDAO = new ProdutoSDAO();
        try {
            produtoSDAO.salvar(produto);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    public static List<Produto> procurar(String nome){
        List<Produto> listaResposta = null;
        ProdutoSDAO produtoSDAO = new ProdutoSDAO();
        try{
            if (nome == null || "".equals(nome)) {
                listaResposta = produtoSDAO.listarTodos();
            } else {
                listaResposta = produtoSDAO.buscarNome(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }

    public static String atualizar(Produto produto){
        String resposta = null;
        ProdutoSDAO produtoSDAO = new ProdutoSDAO();
        try{
            produtoSDAO.update(produto);
        }catch (Exception e){   
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    public static String excluir(Integer id){
        String resposta = null;
        ProdutoSDAO produtoSDAO = new ProdutoSDAO();
        try {   
            produtoSDAO.deletar(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    public static Produto obter(Integer id) {
        Produto produto = new Produto();
        ProdutoSDAO produtoSDAO = new ProdutoSDAO();
        try{
            produto = produtoSDAO.localizar(id);
        } catch (Exception e){
            e.printStackTrace();
        }
        return produto;
    }
}
