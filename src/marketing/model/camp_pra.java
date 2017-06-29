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
public class camp_pra {
    private int id_campanha;
    private int id_praca;

    public camp_pra() {
    }

    public camp_pra(int id_campanha, int id_praca) {
        this.id_campanha = id_campanha;
        this.id_praca = id_praca;
    }

    public int getId_campanha() {
        return id_campanha;
    }

    public void setId_campanha(int id_campanha) {
        this.id_campanha = id_campanha;
    }

    public int getId_praca() {
        return id_praca;
    }

    public void setId_praca(int id_praca) {
        this.id_praca = id_praca;
    }
    
    
            
    
}
