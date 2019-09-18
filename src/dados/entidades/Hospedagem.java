/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados.entidades;

import java.time.LocalDate;

/**
 *
 * @author IFNMG
 */
public class Hospedagem {
    private LocalDate data_entrada;
    private LocalDate data_saida;
    private String valor;
    private Cachorro cao;

    public LocalDate getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }

    public LocalDate getData_saida() {
        return data_saida;
    }

    public void setData_saida(LocalDate data_saida) {
        this.data_saida = data_saida;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Cachorro getCao() {
        return cao;
    }

    public void setCao(Cachorro cao) {
        this.cao = cao;
    }
}
