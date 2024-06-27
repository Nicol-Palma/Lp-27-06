/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.modelo.dao;

import java.util.List;
import pe.edu.upeu.modelo.entity.Alumno;

/**
 *
 * @author ADM
 */
public interface AlumnoDao {
    int createAlumno(Alumno t);
    int updateAlumno(Alumno t);
    int deleteAlumno(int id);
    Alumno readAlumno(int id);
    List<Alumno> readAll();
    
}
