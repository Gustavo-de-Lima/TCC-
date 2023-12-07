/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcc;

import Config.Conecta;
import GUI.MenuView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import SDAO.*;
import Model.Pessoas.*;
import Model.Produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class TCC {

    public static void main(String[] args) {

//        Endereco endereco = new Endereco("Rua Jose testa", "Cianorte",  "PR","Cianortinho");
//        Cliente cliente2 = new Cliente("Carol", "sim", 1, endereco);
//      
//        ClienteSDAO cliente = new ClienteSDAO();
//        byte inclusao = 1;
//        cliente.atualizar( inclusao);
        //cliente.salvar(cliente2);
        //cliente.salvar(cliente2);
//        Cliente cliente3 = cliente.localizar(1);
//        System.out.print(cliente3.getNome());
        //List<Cliente> listaRecebida = new ArrayList<Cliente>();
//          for(int i = 0; i < cliente.ListarTodos().size(); i++){
//              listaRecebida = cliente.ListarTodos();
//          }
//    
//          for(int i = 0; i < listaRecebida.size(); i++){
//              System.out.println(listaRecebida);
//          }
//          List<Cliente> nomeEncontrado = cliente.buscar("Carol");          
//          
//          for(int i = 0; i < nomeEncontrado.size(); i++){
//              System.out.println(nomeEncontrado.get(i));
//          }
//        Produto produto = new Produto(1, "Roupa", "roupas brancas", 10.0, 8);
//        ProdutoSDAO produtoSdao = new ProdutoSDAO();
        //produtoSdao.salvar(produto);
        //produtoSdao.update(produto);
//        List<Produto> lista = produtoSdao.buscarNome("Roupa");
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista);
//        }
//        Produto produtoAchado = produtoSdao.localizar(1);
//        String nome = produtoAchado.getNome();
//        System.out.println(nome);
        new MenuView().setVisible(true);
    }

}
