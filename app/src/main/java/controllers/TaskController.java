/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import Model.Task;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConnectionFactory;

/**
 *
 * @author George
 */
public class TaskController {
    
    public void save(Task task){
        
        String sql = "INSERT INTO tasks ("
                + "idproject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "desdline,"
                + "createdAt,"
                + "updateAt,) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,task.getIdprojects());
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setBoolean(4,task.isCompleted());
            statement.setString(5,task.getNotes());
            statement.setDate(6,new Date(task.getDeadline().getTime()));
            statement.setDate(7,new Date(task.getCreatedAt().getTime()));
            statement.setDate(8,new Date(task.getUpdateAt().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Error ao inserir a tarefa");
        }finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement);
        }
    }
    
    
    public void update(Task task){ 
        
        String sql = "UPDATE tasks SET ("
                + "idproject = ?,"
                + "name = ?,"
                + "description = ?,"
                + "completed = ?,"
                + "notes = ?,"
                + "desdline = ?,"
                + "createdAt = ?,"
                + "updateAt = ?,"
                + "WHERE id = ?";
        
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            // Estabelecendo a conexão com o BD
            connection = ConnectionFactory.getConnection();
            // Preparando a Query
            statement = connection.prepareStatement(sql);
            statement.setInt(1,task.getIdprojects());
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setBoolean(4,task.isCompleted());
            statement.setString(5,task.getNotes());
            statement.setDate(6,new Date(task.getDeadline().getTime()));
            statement.setDate(7,new Date(task.getCreatedAt().getTime()));
            statement.setDate(8,new Date(task.getUpdateAt().getTime()));
            statement.setInt(9,task.getId());
            // Executando a Query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Error ao atualizar a tarefa");
        }
        
    }
    
    public void removeById(int taskId) throws SQLException{
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa");
        } finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement);
        }
    }
    
    public List<Task> getAll(int idprojects){
        
        String sql = "SELECT * FROM tasks WHERE idprojects = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        // Lista de Tarefas que será devolvida quando a chamado do método acontecer
        List<Task> tasks = new ArrayList<Task>();
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            // Setando os valores que correspondem ao filtro da busca
            statement.setInt(1,idprojects);
            // Valor retornado pela execução da Query
            resultSet = statement.executeQuery();
            //  Enquanto houver valores a serem percorridos no meu resultSet
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdateAt(resultSet.getDate("updatedAt"));
                tasks.add(task);
            } 
                    
            
        } catch (Exception ex) {
            throw new RuntimeException("Error ao salvar a tarefa");
        }finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement, resultSet);
        }
        // Listas de tarefas que foi criada e carregada pelo BD
        return tasks;
    }
    
}
