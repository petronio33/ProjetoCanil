package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    
    private static EntityManagerFactory fabrica
            = Persistence.createEntityManagerFactory("projetocanil");
    
    public static EntityManager getGerenciador(){
        return fabrica.createEntityManager();
    }
    
}
