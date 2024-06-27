/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo.daoimpl;

import java.util.List;
import pe.edu.upeu.modelo.entity.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import pe.edu.upeu.modelo.config.Conexion;
import pe.edu.upeu.modelo.dao.AlumnoDao;

/**
 *
 * @author ADM
 */
public class AlumnoDaoImpl implements AlumnoDao {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int createAlumno(Alumno t) {
        int x = 0;
        String SQL = "INSERT INTO alumno(nombres, apellidos, correo, telefono) VALUES(?,?,?,?)";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setString(3, t.getCorreo());
            ps.setString(4, t.getTelefono());
            x = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return x;
    }

    @Override
    public int updateAlumno(Alumno t) {
        int x = 0;
        String SQL = "UPDATE alumno SET nombres=?, apellidos=?, correo=?, telefono=? WHERE idalumno=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setString(3, t.getCorreo());
            ps.setString(4, t.getTelefono());
            ps.setInt(5, t.getIdalumno());
            x = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return x;
    }

    @Override
    public int deleteAlumno(int id) {
        int x = 0;
        String SQL = "DELETE FROM alumno WHERE idalumno=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return x;
    }

    @Override
    public Alumno readAlumno(int id) {
        Alumno al = new Alumno();
        String SQL = "SELECT *FROM alumno WHERE idalumno=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                al.setIdalumno(rs.getInt("idalumno"));
                al.setNombres(rs.getString("nombres"));
                al.setApellidos(rs.getString("apellidos"));
                al.setCorreo(rs.getString("correo"));
                al.setTelefono(rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return al;
    }

    @Override
    public List<Alumno> readAll() {
        List<Alumno> lista = new ArrayList<>();
        String SQL = "SELECT *FROM alumno WHERE idalumno=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno al = new Alumno();
                al.setIdalumno(rs.getInt("idalumno"));
                al.setNombres(rs.getString("nombres"));
                al.setApellidos(rs.getString("apellidos"));
                al.setCorreo(rs.getString("correo"));
                al.setTelefono(rs.getString("telefono"));
                lista.add(al);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return lista;
    }

}
