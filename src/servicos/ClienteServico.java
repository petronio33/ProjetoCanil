package servicos;

import dados.daos.ClienteDAO;
import dados.entidades.Cliente;
import java.util.List;

public class ClienteServico {
    
//Atributo para representar a camada de dados
    private ClienteDAO dao = new ClienteDAO();
    
    public void salvar(Cliente a){
        //Fazer qualquer regra de negócio
        
        //Mandar o cliente para a camada de dados
        //para ser salvo no banco de dados
        dao.salvar(a);
    }
    
    /**
     * Solicita a camada DAO para buscar os clientes
     * cadastrados
     * @return 
     */
    public List<Cliente> listar(){
        
        //Qualquer regra de negócio (se aplicável)
        
        //Pedir a DAO para listar e retornar
        return dao.listar();
        
    }
    
    /**
     * Recebe um cliente e manda para a camada DAO atualizar 
     */
    public void editar(Cliente a){
        
        //Qualquer regra de negócio (se aplicável)
        
        
        //Mandar a DAO atualizar os dados no BD
        dao.editar(a);
        
    }
    
    /**
     *  Recebe um cliente para passar para a DAO excluir no BD
     */
    public void excluir(Cliente a){
        
        //Qualquer regra de negócio (se aplicável)
        
        //Mandar para a DAO excluir
        dao.excluir(a);
    }
}
