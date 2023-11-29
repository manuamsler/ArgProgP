/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinaria1;

import com.mycompany.veterinaria1.clases.Mascota;
import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import com.mycompany.veterinaria1.clases.Turno;
import com.mycompany.veterinaria1.persistencia.ControladoraPersistencia;
import com.mycompany.veterinaria1.veterinariaDao.MascotaDAO;
import com.mycompany.veterinaria1.veterinariaDao.MascotaRepository;
import com.mycompany.veterinaria1.veterinariaDao.ProfesionalMedicoDAO;
import com.mycompany.veterinaria1.veterinariaDao.ProfesionalMedicoRepository;
import com.mycompany.veterinaria1.veterinariaDao.TurnoDAO;
import com.mycompany.veterinaria1.veterinariaDao.TurnoRepository;

/**
 *
 * @author Manu
 */
public class Veterinaria1 {

    public static void main(String[] args) {
       // ControladoraPersistencia ctrlPersis = new ControladoraPersistencia();
       
        //--------------Mascota--------------------
        
       System.out.println("--------------------------------------------------");
       
       MascotaDAO mDAO = new MascotaRepository();
       
      // Mascota mascota = new Mascota( 154 ,"Chiquita","perro");  
       
       //mDAO.guardar(mascota);
       
       System.out.println("Mascotas encontradas: " + mDAO.obtenerTodos());
       //--------------Medico---------------------
       
       System.out.println("--------------------------------------------------");
       
       ProfesionalMedicoDAO pMDAO = new ProfesionalMedicoRepository();
       
       //ProfesionalMedico profesionalMedico = new ProfesionalMedico(3,"Dra Belen");  
       
       //pMDAO.guardar(profesionalMedico);
       
       System.out.println("El Id del Profesional corresponde a : " + pMDAO.obtenerPorId(1));
       
       //-------------Turno------------------------
       
       System.out.println("--------------------------------------------------");
       
       TurnoDAO tDAO = new TurnoRepository();
       
      // Turno turno = new Turno();
       
      // tDAO.guardar(turno);
       
      
       //turno.setId();
     //  turno.setMascota(mascota);
      // turno.setMedico(profesionalMedico);
       
    }
}
