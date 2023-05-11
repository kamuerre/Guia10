/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos.Servicios;

import alumnos.Alumnos;
import alumnos.Entidades.Entidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camul
 */
public class Servicio {

    private ArrayList<Entidad> Estudiantado;
    private Scanner leer;

    public Servicio() {
        this.Estudiantado = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlumno() {
        String opcionSalir = "";

        do {
            System.out.println("Ingrese nombre del estudiante");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresar notas:" + (i + 1));
                notas.add(leer.nextInt());
            }
            Estudiantado.add(new Entidad(nombre, notas));
            System.out.println("¿Quiere agregar otro alumno?");
            opcionSalir = leer.next();

        } while (!opcionSalir.equalsIgnoreCase("n"));
    }

    public double Promediar() {
        System.out.println("¿Que alumno desea buscar?");
        String buscado = leer.next();
        double suma = 0;
        for (Entidad aux : Estudiantado) {
            if (aux.getNombre().equals(buscado)) {
                for (Integer nota : aux.getNotas()) {
                    suma += nota;
                }
            }
        }System.out.print("El Promedio del alumno"+ buscado + "es :");
        return suma / 3;
    }

}
