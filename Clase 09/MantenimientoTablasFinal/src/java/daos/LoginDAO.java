/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import conexion.Conexion;
import dtos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    private static final String sql_select = "select * from usuario where correo=? and clave=?";
    private static final String slq_selectByMail = "select * from usuario where correo=?";
    private static PreparedStatement pstm = null;
    private static ResultSet res = null;
    private static Conexion con = Conexion.conectar();

    public boolean validarLogin(Usuario usuario) {
        boolean resultado = false;
        try {

            pstm = con.getCon().prepareStatement(sql_select);
            pstm.setString(1, usuario.getCorreo());
            pstm.setString(2, usuario.getClave());
            res = pstm.executeQuery();

            if (res.next()) {
                resultado = true;
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        } finally {
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
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return resultado;
    }

    public Usuario retonarDatos(String correo) {
        Usuario usuario = null;
        try {
            pstm = con.getCon().prepareStatement(slq_selectByMail);
            pstm.setString(1, correo);
            res = pstm.executeQuery();

            while (res.next()) {
                usuario = new Usuario(res.getString(1), res.getString(2));
            }

        } catch (Exception e) {

        }
     return usuario;
    }

}
