/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */

public interface OperacionesBD <T> {
    
    /** <T> = Objetos de tipo T, esto se va a reemplazar por un dto*/
    
    // Métodos:
    public boolean insert(T t);   // Al insertar un dato de tipo T, regresa un objeto t
    public boolean update (T t);
    public boolean delete (Object id);
    public T selectById(Object id);
    public ArrayList<T> selectAll();
    
}
