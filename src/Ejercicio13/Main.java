/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println(DecimalFormatSymbols.getInstance(Locale.US).getDecimalSeparator());
        Curso curso1 = new Curso();
        curso1.crearCurso();
        esperar();
        System.out.println("\n\n*************************");
        System.out.println("DATOS DEL CURSO");
        System.out.println("*************************");
        curso1.mostrarCurso();
    }
    
    static void esperar(){
        Scanner r=new Scanner(System.in);
        System.out.println("\nPresione Enter para visualizar los datos del curso...");
        r.nextLine();
}
}
