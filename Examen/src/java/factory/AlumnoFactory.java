/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import conection.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entities.Alumno;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shb
 */
public class AlumnoFactory {

    Alumno alumno;
    Conector conector;

    public AlumnoFactory() {

    }

    public void insertar(Alumno alumno) throws SQLException {

        Conector conecta = new Conector();
        Connection conexion = conecta.getConnection();

        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("INSERT INTO alumnos(nombre, apellido, nro_documento) VALUES (?,?,?,?)");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNroDocumento());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("NO SE PUDO INSERTAR " + ex);
        }
    }

    public void actualizar() {
        
        Conector conecta = new Conector();
        Connection conexion = conecta.getConnection();

        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("UPDATE alumnos set(nombre = ?, apellido = ?, nro_documento = ?) where (id) ");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNroDocumento());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("NO SE PUDO MODIFICAR " + ex);
        }
    }

    public void eliminar(int id) {
        Conector conecta = new Conector();
        Connection conexion = conecta.getConnection();

        PreparedStatement ps;
        System.out.println("entro al delete");
        try {
            ps = conexion.prepareStatement("delete from alumno where id=?");
            ps.setInt(1,id);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("NO SE PUDO ELIMINAR");
        }
    }
    

}
