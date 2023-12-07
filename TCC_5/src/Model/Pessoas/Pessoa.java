/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pessoas;

public abstract class Pessoa {

    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone) {
        super();
        this.nome = nome;
        this.telefone = telefone;
    }

}
