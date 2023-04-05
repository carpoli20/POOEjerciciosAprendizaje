/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        Movil MovilA=new Movil();
        MovilA.cargarCelular();
        esperar();
        MovilA.mostrarCelular();
    }
    static void esperar(){
        Scanner r=new Scanner(System.in);
        System.out.println("\nPresione Enter para visualizar los datos del celular...");
        r.nextLine();
   
}
}