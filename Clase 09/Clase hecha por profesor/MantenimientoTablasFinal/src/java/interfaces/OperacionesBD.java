/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;


public interface OperacionesBD <T> {
    
    public boolean insert(T t);
    public boolean update(T t);
    public boolean delete(Object id);
    public T selectById(Object id);
    public ArrayList<T> selectAll();
    
}
