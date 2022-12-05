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
import Model.Projects;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConnectionFactory;

/**
 *
 * @author George
 */
public class ProjectController {
    
     public void save(Projects project){
        
        String sql = "INSERT INTO tasks ("
                + "name,"
                + "description,"
                + "createdAt,"
                + "updateAt,) VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdateAt().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Error ao inserir a tarefa");
        }finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement);
        }
    }
    
    
    public void update(Projects project){ 
        
        String sql = "UPDATE tasks SET ("
                + "name = ?,"
                + "description = ?,"
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
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdateAt().getTime()));
            statement.setInt(5,project.getId());
            // Executando a Query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Error ao atualizar a tarefa");
        }
        
    }
    
    public void removeById(int projectId) throws SQLException{
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, projectId);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa");
        } finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement);
        }
    }
    
    public List<Projects> getAll(){
        
        String sql = "SELECT * FROM tasks WHERE idprojects = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        // Lista de Tarefas que será devolvida quando a chamado do método acontecer
        List<Projects> projects = new ArrayList<Projects>();
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            // Valor retornado pela execução da Query
            resultSet = statement.executeQuery();
            //  Enquanto houver valores a serem percorridos no meu resultSet
            while(resultSet.next()){
                
                
                Projects project = new Projects();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdateAt(resultSet.getDate("updatedAt"));
                projects.add(project);
            } 
                    
            
        } catch (Exception ex) {
            throw new RuntimeException("Error ao salvar a tarefa");
        }finally {
            ConnectionFactory.closeConnection(connection, (com.mysql.jdbc.PreparedStatement) statement, resultSet);
        }
        // Listas de tarefas que foi criada e carregada pelo BD
        return projects;
    }
    
    
}
