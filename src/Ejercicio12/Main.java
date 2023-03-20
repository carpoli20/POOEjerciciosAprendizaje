/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner leer=new Scanner(System.in);
        Persona persona1=new Persona();
        persona1.crearPersona();
        System.out.println("La persona creada tiene "+persona1.calcularEdad()+ " años");
        System.out.print("Ingrese la edad de la segunda persona: ");int edad=leer.nextInt();
        if (persona1.menorQue(edad)){
            System.out.println(persona1.getNombre()+" ES MENOR que la segunda persona");
        } else{
            System.out.println(persona1.getNombre()+" NO ES MENOR que la segunda persona");
        }
        esperar();
        System.out.println("*************************");
        System.out.println("DATOS DE LA PERSONA");
        System.out.println("*************************");
        persona1.mostrarPersona();
    }
     static void esperar(){
        Scanner r=new Scanner(System.in);
        System.out.println("\nPresione Enter para continuar...");
        r.nextLine();
}
}
