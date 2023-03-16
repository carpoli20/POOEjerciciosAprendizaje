/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07;

/**
 *
 * @author cjalil
 */
public class Main {

    public static void main(String[] args) {
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad. 
         */
        Persona persona1 = new Persona();
        persona1.crearPersona();
        Persona persona2 = new Persona();
        persona2.crearPersona();
        Persona persona3 = new Persona();
        persona3.crearPersona();
        Persona persona4 = new Persona();
        persona4.crearPersona();
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("Calculos para la 1era persona: ");
        System.out.println("---------------------------");
        switch (persona1.calcularIMC()) {
            case -1:
                System.out.println("La persona con nombre "+persona1.getNombre()+" se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona con nombre "+persona1.getNombre()+"  se encuentra en su peso ideal");
                break;
            case 1:
                System.out.println("La persona con nombre "+persona1.getNombre()+"  se encuentra con sobrepeso");
                break;
            default:;
        }
        if(persona1.esMayorEdad()){
            System.out.println("La persona con nombre "+persona1.getNombre()+"  ES MAYOR de edad");
            
        } else{
            System.out.println("La persona con nombre "+persona1.getNombre()+"  ES MENOR de edad");
        }
        
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("Calculos para la segunda persona: ");
        System.out.println("---------------------------");
        switch (persona2.calcularIMC()) {
            case -1:
                System.out.println("La persona con nombre "+persona2.getNombre()+"  se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona con nombre "+persona2.getNombre()+" se encuentra en su peso ideal");
                break;
            case 1:
                System.out.println("La persona con nombre "+persona2.getNombre()+"  se encuentra con sobrepeso");
                break;
            default:;
        }
        if(persona2.esMayorEdad()){
            System.out.println("La persona ES MAYOR de edad");
            
        } else{
            System.out.println("La persona ES MENOR de edad");
        }
        
        
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("Calculos para la tercera persona: ");
        System.out.println("---------------------------");
        switch (persona3.calcularIMC()) {
            case -1:
                System.out.println("La persona con nombre "+persona3.getNombre()+"  se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona con nombre "+persona3.getNombre()+" se encuentra en su peso ideal");
                break;
            case 1:
                System.out.println("La persona con nombre "+persona3.getNombre()+"  se encuentra con sobrepeso");
                break;
            default:;
        }
        if(persona3.esMayorEdad()){
            System.out.println("La persona ES MAYOR de edad");
            
        } else{
            System.out.println("La persona ES MENOR de edad");
        }
        
        
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("Calculos para la cuarta persona: ");
        System.out.println("---------------------------");
        switch (persona4.calcularIMC()) {
            case -1:
                System.out.println("La persona con nombre "+persona4.getNombre()+"  se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona con nombre "+persona4.getNombre()+" se encuentra en su peso ideal");
                break;
            case 1:
                System.out.println("La persona con nombre "+persona4.getNombre()+"  se encuentra con sobrepeso");
                break;
            default:;
        }
        if(persona4.esMayorEdad()){
            System.out.println("La persona ES MAYOR de edad");
            
        } else{
            System.out.println("La persona ES MENOR de edad");
        }
        

    }
}
