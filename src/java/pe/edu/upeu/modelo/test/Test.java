/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.modelo.test;

import com.google.gson.Gson;
import pe.edu.upeu.modelo.config.Conexion;
import pe.edu.upeu.modelo.dao.AlumnoDao;
import pe.edu.upeu.modelo.dao.UsuarioDao;
import pe.edu.upeu.modelo.daoimpl.AlumnoDaoImpl;
import pe.edu.upeu.modelo.daoimpl.UsuarioDaoImpl;
import pe.edu.upeu.modelo.entity.Alumno;

/**
 *
 * @author ADM
 */
public class Test {
 static UsuarioDao udao = new UsuarioDaoImpl();
 static AlumnoDao adao = new AlumnoDaoImpl();
 static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(g.toJson(adao.createAlumno(new Alumno(0,"Juan", "Tapia", "juantapia@gmail.com", "123456789"))));
        //System.out.println(g.toJson(adao.updateAlumno(new Alumno(1,"Juana", "Tapia", "juantapia@gmail.com", "123456789"))));
        //System.out.println(g.toJson(adao.deleteAlumno(1)));
        System.out.println(g.toJson(adao.readAlumno(2)));
    }
    static void todo(){
        if (Conexion.getConection()!=null) {
            System.out.println("Conectado");
        } else {
            System.out.println("Error");
        }
        System.out.println(g.toJson(udao.login("amiguel", "123")));
    }
}
