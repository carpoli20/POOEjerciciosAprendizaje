/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.crearCurso();
        System.out.println("*************************");
        System.out.println("DATOS DEL CURSO");
        System.out.println("*************************");
        System.out.println("Nombre del curso: "+curso1.getNombreCurso());
    }
}
