/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketing.model;

/**
 *
 * @author Fulvio
 */
public class Campanha {
    private int id_campanhas;
    private String nome;
    private String periodo;
    private double valor;
    private String descricao;
    private String link;

    public Campanha() {
    }

    public Campanha(int id_campanhas, String nome, String periodo, double valor, String descricao, String link) {
        this.id_campanhas = id_campanhas;
        this.nome = nome;
        this.periodo = periodo;
        this.valor = valor;
        this.descricao = descricao;
        this.link = link;
    }

    public int getId_campanhas() {
        return id_campanhas;
    }

    public void setId_campanhas(int id_campanhas) {
        this.id_campanhas = id_campanhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    
}
