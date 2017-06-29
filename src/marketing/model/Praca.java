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
public class Praca {
    private int id_praca;
    private String nome;
    private String tipo;
    private double valor_diario;

    public Praca() {
    }

    public Praca(int id_praca, String nome, String tipo, double valor_diario) {
        this.id_praca = id_praca;
        this.nome = nome;
        this.tipo = tipo;
        this.valor_diario = valor_diario;
    }

    public int getId_praca() {
        return id_praca;
    }

    public void setId_praca(int id_praca) {
        this.id_praca = id_praca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor_diario() {
        return valor_diario;
    }

    public void setValor_diario(double valor_diario) {
        this.valor_diario = valor_diario;
    }
    
    
    
}
