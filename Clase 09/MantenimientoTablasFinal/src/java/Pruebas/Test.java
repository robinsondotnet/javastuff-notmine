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
        
//        if (login.validarLogin(usuario)) {
//            System.out.println("Login exitoso");
//        } else {
//            System.out.println("Login no exitoso");
//        }

// Probar Insert:
/**     Cliente cliente = new Cliente("Carlos", "García", "Martinez", "carlos@gmail.com", "979797979", "73647393");
        ClienteDAO operaciones = new ClienteDAO();
        
        if(operaciones.insert(cliente)){
            System.out.println("Exito");
        }else{
            System.out.println("Error");
        }                                       */



// Probar Update:
/**     Cliente cliente = new Cliente(2, "Ricardo", "Gareca", "Martinez", "carlos@gmail.com", "979797979", "73647393");
        ClienteDAO operaciones = new ClienteDAO();
        
        if(operaciones.update(cliente)){
            System.out.println("Exito");
        }else{
            System.out.println("Error");
        }                                        */

//Probar Delete
    ClienteDAO cliente = new ClienteDAO();

if (cliente.delete(2)){
    System.out.println("Eliminado");
}else{
    System.out.println("No eliminado");
}                                                

//Probar SelectById
Cliente cliente1 = cliente.selectById(1);
try{
System.out.println("id: "+cliente1.getId());
System.out.println("Nombre: "+cliente1.getId());
System.out.println("Apellido: "+cliente1.getId());

} catch (Exception e){
    System.out.println("Error: " +e.getMessage());
}     
        
// Probar ArrayList
/**     ClienteDAO operaciones = new ClienteDAO();
     ArrayList<Cliente> clientes = new ArrayList<>();
     
     clientes = operaciones.selectAll();
     
        for (Cliente cliente : clientes) {
            System.out.println("Clientes");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellidoPat());
            System.out.println("Correo: " + cliente.getCorreo());
            System.out.println("------------");
        }                                      */

    }
}
