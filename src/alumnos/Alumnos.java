/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import alumnos.Servicios.Servicio;

/**
 *
 * @author camul
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio Asistente = new Servicio();
        
        Asistente.crearAlumno();
        System.out.println( Asistente.Promediar());
        
        // TODO code application logic here
    }
    
}
