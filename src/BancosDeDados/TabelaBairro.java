/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancosDeDados;

import dados.entidades.Bairro;
import javax.persistence.*;
import util.JPAUtil;

/**
 *
 * @author IFNMG
 */
public class TabelaBairro {
    public static void main(String[] args) {
        
        //Criando um objeto ator
        Bairro a1 = new Bairro();
        a1.setBairro("Centro");
        
        Bairro a2 = new Bairro();
        a2.setBairro("Aparecida");
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Mandando persistir o objeto
        gerenciador.persist(a1);
        gerenciador.persist(a2);
        
        //Finalizo a transação
        gerenciador.getTransaction().commit();
        
        //Fechar o gerenciador
        gerenciador.close();
        
    }
}
