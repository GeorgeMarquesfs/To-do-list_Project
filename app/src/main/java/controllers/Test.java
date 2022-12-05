/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Model.Projects;

/**
 *
 * @author George
 */
public class Test {
    
    public static void main (String[] args){
        
        
        ProjectController projectController = new ProjectController();
        
        Projects project = new Projects();
        project.setName("projeto Teste");
        project.setDescription("description");
        projectController.save(project);
        
    }
    
}
