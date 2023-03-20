/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08;

import java.util.Scanner;
import java.io.Console;
/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Cadena A=new Cadena();
        System.out.print("Ingrese la frase que se asignará al objeto: ");
        A.setFrase(leer.nextLine());
        A.setLongitud();
        System.out.println("Frase: "+A.getFrase()+", longitud: "+A.getLongitud());
        int opcion =0;
        do{
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Mostrar vocales \n2. Invertir Frase\n3. Contar ocurrencias de caracter\n4. Comparar longitud\n5. Unir frases\n6. Reemplazar\n7. Verificar letra contenida\n8. Mostrar frase\n9. Salir");
            opcion=leer.nextInt();
            switch (opcion){
                case 1: System.out.println("La frase del objeto tiene "+A.mostrarVocales()+ " vocales");esperar();break;
                case 2: A.invertirFrase();esperar();break;
                case 3: String caracter; System.out.print("Ingrese el caracter que desea contar en la frase: ");caracter=leer.next();A.vecesRepetido(caracter);esperar();break;
                case 4: System.out.print("Ingrese la frase a comparar: ");Scanner b=new Scanner(System.in);String ingreso=b.nextLine();A.compararLongitud(ingreso);esperar();break;
                case 5: System.out.print("Ingrese la frase a unir: ");Scanner c=new Scanner(System.in);String ingreso2=c.nextLine();A.unirFrases(ingreso2);esperar();break;
                case 6: System.out.print("Ingrese la letra que reemplazará a las 'A' de la frase: ");A.reemplazar(leer.next());esperar();break;
                case 7: System.out.print("Ingrese la letra cuya existencia en la frase desea verificar: ");Scanner d=new Scanner(System.in);String ingreso3=d.next();System.out.println("La frase contiene la letra "+ingreso3+" ? "+A.contiene(ingreso3));esperar();break;
                case 8: System.out.print("La frase actual es: "+A.getFrase()+"\n");esperar();break;
                case 9: System.out.println("Gracias por usar este programa");break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion!=9);
        
        
    }
    
    static void esperar(){
        Scanner r=new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        r.nextLine();
        
    }
    
    
}
