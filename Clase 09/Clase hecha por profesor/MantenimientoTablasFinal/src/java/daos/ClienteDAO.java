/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import conexion.Conexion;
import dtos.Cliente;
import interfaces.OperacionesBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class ClienteDAO implements OperacionesBD<Cliente> {

    private static final String sql_insert = "insert into cliente values(?,?,?,?,?,?)";
    private static final String sql_update = "update cliente set nombre=?,apellidoPat=?,apellidoMat=?,correo=?,celular=?,dni=? where id=?";
    private static final String sql_selectAll = "select * from cliente";
    private static final String sql_delete = "delete from cliente where id=?";
    private static final String sql_selectById="select * from cliente where id=?";
    private static PreparedStatement pstm = null;
    private static ResultSet res = null;
    private static Conexion con = Conexion.conectar();

    @Override
    public boolean insert(Cliente t) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareStatement(sql_insert);
            pstm.setString(1, t.getNombre());
            pstm.setString(2, t.getApellidoPat());
            pstm.setString(3, t.getApellidoMat());
            pstm.setString(4, t.getCorreo());
            pstm.setString(5, t.getCelular());
            pstm.setString(6, t.getDni());
            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            cerrarConexiones();
        }
        return resultado;
    }

    public void cerrarConexiones() {

        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.cerraConexion();
            }
        } catch (SQLException ex) {
            System.out.println("Error :" + ex.getMessage());
        }
    }

    @Override
    public boolean update(Cliente t) {
        boolean resultado = false;
        try {

            pstm = con.getCon().prepareStatement(sql_update);
            pstm.setString(1, t.getNombre());
            pstm.setString(2, t.getApellidoPat());
            pstm.setString(3, t.getApellidoMat());
            pstm.setString(4, t.getCorreo());
            pstm.setString(5, t.getCelular());
            pstm.setString(6, t.getDni());
            pstm.setInt(7, t.getId());
            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }
        } catch (Exception e) {
            System.out.println("Update:" + e.getMessage());
        } finally {
            cerrarConexiones();
        }
        return resultado;
    }

    @Override
    public boolean delete(Object id) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_delete);
            pstm.setInt(1, Integer.parseInt(id.toString()));

            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public Cliente selectById(Object id) {
        Cliente cliente=null;
        try {   
            pstm = con.getCon().prepareStatement(sql_selectById);
            pstm.setInt(1, Integer.parseInt(id.toString()));
            res=pstm.executeQuery();
            if (res!=null) {
                while(res.next()){
                cliente= new Cliente(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7) );
                }         
            }           
        } catch (Exception e) {

        } finally {
            cerrarConexiones();
        }
      return  cliente;
    }

    @Override
    public ArrayList<Cliente> selectAll() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            pstm = con.getCon().prepareStatement(sql_selectAll);
            res = pstm.executeQuery();

            while (res.next()) {
                listaClientes.add(new Cliente(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)));
            }

        } catch (Exception e) {
            System.out.println("Select all :" + e.getMessage());
        } finally {
            cerrarConexiones();
        }

        return listaClientes;
    }

}
