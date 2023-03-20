/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); 

 */
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        int anio, mes, dia;
        Scanner leer=new Scanner(System.in);
        /*instanciar en el main, una fecha usando la clase Date, para esto vamos a tener que crear 
        3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date.*/
        System.out.print("Ingrese el año: ");anio=leer.nextInt()-1900;
        mes=validarMes();
        dia=validarDia();
        Date fecha=new Date(anio, mes, dia);
        /*Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre 
        esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.*/
        Date fechaActual=new Date();
        System.out.println("La fecha ingresada es: "+fecha.toGMTString());
        System.out.println("Existen un total de "+Math.abs((fecha.getYear()-fechaActual.getYear()))+" años entre la fecha ingresada y la fecha actual");
        
    }
    static int validarMes(){
        Scanner leer1= new Scanner(System.in);
        int mes=0;
        do {
            System.out.print("Ingrese el mes (mm): ");
            mes=leer1.nextInt();
            if(mes>=1 && mes<=12){
                break;
                
            } else{
                System.out.println("Mes incorrecto. Debe estar entre 01 y 12");
            }
        }while (true);
        return mes-1;
    }
    
    static int validarDia(){
        Scanner leer1= new Scanner(System.in);
        int dia=0;
        do {
            System.out.print("Ingrese el dia (dd): ");
            dia=leer1.nextInt();
            if(dia>=1 && dia<=31){
                break;
                
            } else{
                System.out.println("Día incorrecto. Debe estar entre 1 y 31");
            }
        }while (true);
        return dia;
    }
}
