/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Venda;

import java.util.List;
import java.util.ArrayList;
import Model.Pessoas.*;

/**
 *
 * @author USUARIO
 */
public class Venda {

    private Integer id;
    private Double valor;
    private Double troco;
    private Vendedor Vendedor;
    private Cliente Cliente;
    private List<ItemVenda> listaProd = new ArrayList<ItemVenda>();
    private Float tipoDinheiro;
    private Float tipoPix;
    private Float tipoCartao;
    private Integer qtdItens;

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }

    public Venda() {
        listaProd = new ArrayList<ItemVenda>();
        Cliente = new Cliente();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public Vendedor getVendedor() {
        return Vendedor;
    }

    public void setVendedor(Vendedor Vendedor) {
        this.Vendedor = Vendedor;
    }

    public List<ItemVenda> getListaProd() {
        return listaProd;
    }

    public void setListaProd(ArrayList<ItemVenda> listaProd) {
        this.listaProd = listaProd;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Float getTipoDinheiro() {
        return tipoDinheiro;
    }

    public void setTipoDinheiro(Float tipoDinheiro) {
        this.tipoDinheiro = tipoDinheiro;
    }

    public Float getTipoPix() {
        return tipoPix;
    }

    public void setTipoPix(Float tipoPix) {
        this.tipoPix = tipoPix;
    }

    public Float getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(Float tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
    
    
    public void adicionarItem(ItemVenda itemVenda){
        this.listaProd.add(itemVenda);
    }

}
