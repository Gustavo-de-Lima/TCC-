/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pessoas;

public class Cliente extends Pessoa {

    private Integer id;
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente() {

    }

    public Cliente(String nome, String telefone, Integer id, Endereco endereco) {
        super(nome, telefone);
        this.id = id;
        this.endereco = endereco;
    }

}
