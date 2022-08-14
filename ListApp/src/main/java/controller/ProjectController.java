package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConectionFactory;

public class ProjectController {
    
    //Salva o projeto
     public void saveProject (Project project){
         
         String sql = "INSERT INTO projects ("
                 + "name,"
                 + "description,"
                 + "createdAt,"
                 + "updatedAt) VALUES (?,?,?,?)";
         
         Connection conexao = null;
         PreparedStatement statement = null;
         
         try {
             //Cria uma conex�o com o banco
             conexao = ConectionFactory.getConnection();
             //Cria um prepareStatement, classe usada para executar uma query;
             statement = conexao.prepareStatement(sql);
             
             //Insere os valores
             statement.setString(1, project.getName());
             statement.setString(2, project.getDescription());
             statement.setDate(3, new Date(project.getCreatedAt().getTime()));
             statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
             
             //Manda executar
             statement.execute();
             
         } catch (Exception e) {
             throw new RuntimeException("Erro ao salvar o projeto" + e.getMessage(), e);
             
         }finally{
             ConectionFactory.closeConnection(conexao, statement);
         }
                 
     }
     
     public void updateProject (Project project){ 
         
         String sql = "UPDATE projects SET "
         		+ "name = ?, "
         		+ "description = ?, "
         		+ "createdAt = ?, "
         		+ "updatedAt = ? "
         		+ "WHERE projects.id = ?";
         
        Connection conexao = null;
        PreparedStatement statement = null;
        
         try {
              //Criação da conexão 
             conexao = ConectionFactory.getConnection();
              //Cria um prepareStatement, classe usada para executar uma query;
             statement = conexao.prepareStatement(sql);
             
             //Seta os valores
             statement.setString(1, project.getName());
             statement.setString(2, project.getDescription());
             statement.setDate(3, new Date(project.getCreatedAt().getTime()));
             statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
             statement.setInt(5, project.getId());
             
             //Executa a query
             statement.execute();
             
         } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o projeto " + e.getMessage(), e);
             
         }finally{
             ConectionFactory.closeConnection(conexao, statement);
         }
     }
     
     public void deleteProjectById (int projectId){
         
         String sql = "DELETE FROM projects WHERE id = ?";
         
         Connection conexao = null;
         PreparedStatement statement = null;
         
         try {
             conexao = ConectionFactory.getConnection();
             statement = conexao.prepareStatement(sql);
             statement.setInt(1, projectId);
             
             statement.execute();
             
         } catch (Exception e) {
             
             throw new RuntimeException("Erro ao remover o projeto" + e.getMessage(), e);
             
         }finally{
             ConectionFactory.closeConnection(conexao, statement);
         }
        }
     
     public List<Project> getAll(){
         
        String sql = "SELECT * FROM projects ";
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        
        List<Project> projects = new ArrayList<Project>();
        
         try {
             conexao = ConectionFactory.getConnection();
             statement = conexao.prepareStatement(sql);
                     
             resultado = statement.executeQuery();
             
             //Enquanto existir dados no banco de dados, fa�a:
             while(resultado.next()){
                 
                 Project project = new Project();
                 
                 project.setId(resultado.getInt("id"));
                 project.setName(resultado.getString("name"));
                 project.setDescription(resultado.getString("description"));
                 project.setCreatedAt(resultado.getDate("createdAt"));
                 project.setUpdatedAt(resultado.getDate("updatedAt"));
                 
                 projects.add(project);
             }
         } catch (Exception e) {
             throw new RuntimeException("Erro ao inserir o projeto "+ e.getMessage(), e);
             
         }  finally{
             
             ConectionFactory.closeConnection(conexao, statement, resultado);
         }
         
         return projects;
         
     }
     
}
/*UPDATE `projects` SET `name` = 'Novo projeto2' WHERE `projects`.`id` = 2;
 * 
 *  String sql = "UPDATE `projects` SET "
         		+ "`name` = ?, "
         		+ "`description` = ?, "
         		+ "`createdAt` = ?, "
         		+ "`updatedAt` = ? "
         		+ "WHERE `projects`.`id` = ?";
 */
 

