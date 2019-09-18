/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados.entidades;

/**
 *
 * @author IFNMG
 */
public class Cachorro{
    private Integer  idCachorro;
    private Raca raça;
    private String nome;
    private String porte;
    private String sexo;
    private String ração;
    private String observacao;
    private Cliente dono;

    public Integer getIdCachorro() {
        return idCachorro;
    }

    public void setIdCachorro(Integer idCachorro) {
        this.idCachorro = idCachorro;
    }


    public Raca getRaça() {
        return raça;
    }

    public void setRaça(Raca raça) {
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRação() {
        return ração;
    }

    public void setRação(String ração) {
        this.ração = ração;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

}
