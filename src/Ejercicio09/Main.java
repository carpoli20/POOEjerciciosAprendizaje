/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
/* En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set.*/
        Matematica mat=new Matematica();
        mat.setNumero1(Math.round(Math.round(Math.random()*20+1)));
        mat.setNumero2(Math.round(Math.round(Math.random()*20+1)));
        int opcion=0;
        do{
            System.out.println("MENU DE OPCIONES\n1. Devolver mayor\n2. Calcular potencia\n3. Calcular raiz\n4. Mostrar valores\n5. Salir");
            Scanner leer=new Scanner(System.in);
            opcion=leer.nextInt();
            System.out.println("\n\n\n\n\n");
            switch (opcion){
                case 1: System.out.print("El mayor de los números es: "+mat.devolverMayor());esperar();break;
                case 2: System.out.print("\n"+mat.devolverMayor()+" elevado a la "+mat.devolverMenor()+" es igual a "+mat.calcularPotencia());esperar();break;
                case 3: System.out.print("La raiz cuadrada de "+mat.devolverMenor()+" es igual a: "+mat.calcularRaiz());esperar();break;
                case 4: System.out.print("Número 1= "+mat.getNumero1()+"\nNúmero 2= "+mat.getNumero2());esperar();break;
                case 5: System.out.println("Gracias por usar este programa");break;
                default: System.out.println("Opción no válida");
            }   
        }while(opcion!=5);
    }
    
    static void esperar(){
        Scanner r=new Scanner(System.in);
        System.out.println("\nPresione Enter para continuar...");
        r.nextLine();
}
}
