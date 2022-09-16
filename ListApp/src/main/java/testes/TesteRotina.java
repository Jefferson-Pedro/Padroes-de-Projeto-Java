package testes;

import java.sql.SQLException;
import java.util.List;

import controller.ProjectController;
import controller.TaskController;
import model.Project;
import model.Task;

public class TesteRotina {

	public static void main(String[] args) throws SQLException {
		
		
        
        /*TaskController taskController = new TaskController();
        Task task = new Task();
         * 
         * task.setIdProject(1);
        task.setName("Avançar para aguas mais profundas");
        task.setDescription("Teste para ver se está funcionando -1");
        task.setNotes("Sem notas");
        task.setCompleted(true);
        
        TaskController.saveTask(task);*/
		
		TaskController taskController = new TaskController();
        Task task = new Task();
        
        task.setId(1);
		task.setIdProject(1);
		task.setName("Testando novo nome");
		task.setDescription("Se liga nessa mudança, Mestre Isidro!");
		task.setNotes("Deu certo, Mestreee!");
		task.setCompleted(true);
		
		taskController.updateTask(task);
		
		/*List<Task> tarefas = TaskController.getAll(1);
		System.out.println("Total de tarefas = " + tarefas.size());*/
        
        //taskController.removeTaskById(1);
		
		//-------------------------- CRIAÇÃO DE PROJETOS ------------------
        
    	/*ProjectController projectController = new ProjectController();
    	Project project = new Project();
    	
    	//project.setId(1);
    	project.setName("Novo Projeto");
        project.setDescription("Teste para ver se está funcionando");
        projectController.saveProject(project);
        //projectController.updateProject(project);*/
        
        /*List<Project> projetos = projectController.getAll();
        System.out.println("Total de projetos = " + projetos.size());
        
        projectController.deleteProjectById(3);*/
	}

}
