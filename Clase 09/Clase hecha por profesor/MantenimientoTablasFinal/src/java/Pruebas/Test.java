/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import daos.ClienteDAO;
import daos.LoginDAO;
import dtos.Cliente;
import dtos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Test {
    public static void main(String[] args) {
        
//        Usuario usuario = new Usuario("ivan@gmail.com","123456");
//        LoginDAO login = new LoginDAO();
//        
//        if (login.validarLogin(usuario)) {
//            System.out.println("Login exitoso");
//        } else {
//            System.out.println("Login no exitoso");
//        }

     //Cliente cliente = new Cliente(2,"Ricardo","Gareca","Martinez","carlos@gmail.com","97999878","344343");
//        ClienteDAO operaciones = new ClienteDAO();
//        ArrayList<Cliente> clientes = new ArrayList<>();      
//        clientes = operaciones.selectAll();
//        
//        for (Cliente cliente : clientes) {
//            System.out.println("Clientes");
//            System.out.print("Nombre :"+cliente.getNombre());
//            System.out.print("Apellido :"+cliente.getApellidoPat());
//            System.out.print("Correo:"+cliente.getCorreo());
//            System.out.println("----------------------");
//        }

     
         ClienteDAO cliente = new ClienteDAO();        
         if (cliente.delete(2)) {
             System.out.println("Eliminado");
            
        } else {
             System.out.println("No eliminado");
        }

        Cliente cliente1 =  cliente.selectById(1);
        try {
        System.out.println("id :"+cliente1.getId());
        System.out.println("Nombre :"+cliente1.getNombre());
        System.out.println("Apellido :"+cliente1.getApellidoPat());
      
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }
      
        
    }
    
}
