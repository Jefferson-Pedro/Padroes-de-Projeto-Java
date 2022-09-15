package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConectionFactory;


public class TaskController {

    //Salva a tarefa
    public static void saveTask(Task task) {

        String sql = "INSERT INTO tasks ("
                + "idProjects,"
                + " name, "
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES (?,?,?,?,?,?,?,?)";

        Connection conexao = null;
        PreparedStatement statement = null;

        try {
            conexao = ConectionFactory.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa; \n" + e.getMessage(), e);
        } finally {
            ConectionFactory.closeConnection(conexao, statement);

        }
    }
    
    //Atualiza a tarefa
    public void updateTask(Task task) {
        String sql = "UPDATE tasks SET "
        		+ "idProjects = ?, " //1
        		+ "name = ?, "		 //2
        		+ "description = ?, "//3
        		+ "notes = ?, "		//4
        		+ "completed = ?," 	//5
        		+ "deadline = ?, "	//6
        		+ "createdAt = ?, "	//7
        		+ "updatedAt = ? "	//8
        		+ "WHERE tasks.id = ?"; //9

        Connection conexao = null;
        PreparedStatement statement = null;

        try { 
            //Estavelece a conexãoo com o banco de dados
            conexao = ConectionFactory.getConnection();
            
            //Prepara a query (codigo sql)
            statement = conexao.prepareStatement(sql);
            
            //Insere os valores
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            
            //Executa a query
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa " + e.getMessage(), e);
        } finally {
            ConectionFactory.closeConnection(conexao, statement);
        }
    }

    //Remove uma tarefa
    public void removeTaskById(int taskId) throws SQLException {

        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conexao = null;
        PreparedStatement statement = null;

        try { 
            conexao = ConectionFactory.getConnection(); //Abre a conex�o com o banco de dados
            statement = conexao.prepareStatement(sql); // Prepara os comandos sql para serem executados
            
            statement.setInt(1, taskId); //muda a 1� interroga��o pelo numero escolhido
            statement.execute(); //Executa o comando sql

        } catch (Exception e) {

            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);

        } finally {
            ConectionFactory.closeConnection(conexao, statement);
        }
    }

    //Busca todas as tarefas
    public static List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null; //Guarda a resposta do banco de dados
        
        //Lista de Tarefas que ser� devolvida quando a chamada do m�todo acontecer
        List<Task> tasks = new ArrayList<Task>();
        
         try {
            conexao = ConectionFactory.getConnection();
            statement = conexao.prepareStatement(sql);
            
            //Setando valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            
            //Valor retornado pela execu��o da query
            statement.executeQuery();
            
             //Popula a lista do Java com os objetos do banco de dados;
            while(resultado.next()){
                
               //Cria uma nova tarefa
                Task task = new Task();
                task.setId(resultado.getInt("id"));
                task.setIdProject(resultado.getInt("idProject"));
                task.setName(resultado.getString("name"));
                task.setDescription(resultado.getString("description"));
                task.setCompleted (resultado.getBoolean("completed"));
                task.setNotes(resultado.getString("notes"));
                task.setDeadline(resultado.getDate("deadline"));
                task.setCreatedAt(resultado.getDate("createdAt"));
                task.setUpdatedAt(resultado.getDate("updatedAt"));
                
                tasks.add(task);
            }

        } catch (Exception e) {

            throw new RuntimeException("Erro ao retornar as tarefas; " + e.getMessage(), e);

        } finally {
            ConectionFactory.closeConnection(conexao, statement, resultado);
        }
        // Lista de tarefas que foi criada e carregada do banco de dados      
        return tasks;
    }
}
