/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author José
 */
public class Estudiante {

    //Atributos estaticos de clase y Constantes
    private static int MIN_NOTA = 0;
    private static double MIN_MEDIA = 0.0;
    //Atributos
    private String nombre;
    private double notaMedia;
    private int numNotas;

    //Constructor/es
    /**
     * Constructor Estudiante de 3 parámetros que devuelve el nombre, la
     * notaMedia y todas las notas del alumno.
     *
     * @param nombre el nombre del alumno.
     * @param notaMedia la nota media del alumno.
     * @param numNotas el numero de notas que tiene el alumno.
     * @throws IllegalArgumentException En caso de que la nota y la media sea
     * inferior a 0.
     */
    public Estudiante(String nombre, double notaMedia, int numNotas) throws IllegalArgumentException {
        if (numNotas < MIN_NOTA) {
            throw new IllegalArgumentException(String.format("Datos iniciales erroneos: %d\n", numNotas));
        } else if (notaMedia < MIN_MEDIA) {
            throw new IllegalArgumentException(String.format("Datos iniciales erroneos: %d\n", notaMedia));
        }
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.numNotas = numNotas;
    }

    //Métodos getter y otro métodos
    /**
     * Método get que devuelve el nombre.
     *
     * @return devuelve el nombre del alumno.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Métodos get de la nota media.
     *
     * @return devuelve la nota media del alumno.
     */
    public double getNotaMedia() {
        return this.notaMedia;
    }

    /**
     * Método get del numero de las notas.
     *
     * @return devuelve las notas del alumno.
     */
    public int getNumNotas() {
        return this.numNotas;
    }

    /**
     * Método que actualiza la nota media de los alumnos.
     *
     * @param nuevaNota la nueva nota que se le itera a la media.
     * @return verdadero si la nueva nota es mayor que 0 y falso si la nueva
     * nota es inferior a 0.
     */
    public boolean actualizarNotaMedia(double nuevaNota) {
        if (nuevaNota >= 0) {
            this.notaMedia = ((this.notaMedia * (this.numNotas))
                    + nuevaNota) / (this.numNotas + 1);
            this.numNotas++;
            return true;
        }
        return false;
    }

    /**
     * Método que devuelve la nota media en letra.
     *
     * @return devuelve la nota media.
     */
    public char calificadorMedia() {
        char letraNota = ' ';
        if (this.notaMedia < 5.0) {
            return letraNota = 'F';
        } else if (this.notaMedia >= 5.0 && this.notaMedia < 6.0) {
            return letraNota = 'E';
        } else if (this.notaMedia >= 6.0 && this.notaMedia < 7.0) {
            return letraNota = 'D';
        } else if (this.notaMedia >= 7.0 && this.notaMedia < 8.0) {
            return letraNota = 'C';
        } else if (this.notaMedia >= 8.0 && this.notaMedia < 9.0) {
            return letraNota = 'B';
        } else if (this.notaMedia >= 9.0) {
            return letraNota = 'A';
        }
        return letraNota;
    }

    /**
     * Método toString.
     *
     * @return devuelve una cadena con el texto correspondiente al valor de los
     * atributos.
     */
    @Override
    public String toString() {
        return String.format("Estudiante: %s,nota media: %.1f,número de notas: %d",
                this.nombre, this.notaMedia, this.numNotas);
    }

}
