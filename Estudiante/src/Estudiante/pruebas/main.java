/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class_1.java to edit this template
 */
package Estudiante.pruebas;

/**
 *
 * @author José
 */
import Estudiante.Estudiante;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        Estudiante alumno1, alumno2, alumno3;
        // Variables de salida

        // Variables auxiliares
        //para calculos intermedios
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("¡ALUMNOS!");
        System.out.println("---------");
        System.out.println(" ");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println("Intento crear un estudiante de nombre Ricardo");
        try {
            alumno1 = new Estudiante("Ricardo", -1, -1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al intentar crear: " + ex.getMessage());
        }

        System.out.println("Vamos a crear dos objetos estudiante");
        alumno2 = new Estudiante("Antonio Bernal Campillo",
                0, 0);
        System.out.printf("Estudiante: %s , nota media: %.1f , número de notas: %d \n ",
                alumno2.getNombre(), alumno2.getNotaMedia(),
                alumno2.getNumNotas());
        System.out.println();
        alumno3 = new Estudiante("Francisco Cucharas Gómez",
                2.0, 1);
        System.out.printf("Estudiante: %s , nota media: %.2f , número de notas: %d \n ",
                alumno3.getNombre(), alumno3.getNotaMedia(),
                alumno3.getNumNotas());
        System.out.println();
        System.out.println("Actualizamos la nota media de Antonio con una nueva de 7.7");
        alumno2.actualizarNotaMedia(7.7);
        System.out.printf("Estudiante: %s , nota media: %.1f , número de notas: %d \n ",
                alumno2.getNombre(), alumno2.getNotaMedia(),
                alumno2.getNumNotas());
        System.out.println();
        System.out.println("Actualizamos la nota media de Francisco con una nueva nota de 7.5");
        alumno3.actualizarNotaMedia(7.5);
        System.out.printf("Estudiante: %s , nota media: %.2f , número de notas: %d \n ",
                alumno3.getNombre(), alumno3.getNotaMedia(),
                alumno3.getNumNotas());
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("Calificación de la media");
        System.out.println("-------------------------");
        System.out.printf("La calificación media de: %s es %s",
                alumno2.getNombre(), alumno2.calificadorMedia());
        System.out.println("Fin del programa.");
    }
}
