/*
 . Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20. 
 */
package Ejercicio10;


import java.util.Arrays;

/**
 *
 * @author cjalil
 */
public class Main {
    public static void main(String[] args) {
        double[] A= new double[50];
        double[] B= new double[20];
        inicializarRandom(A);
        System.out.print("Arreglo A: ");mostrarArreglo(A);
        Arrays.sort(A);
        for (int i=0;i<10;i++){
            B[i]=A[i];
        }
        for (int i=10;i<20;i++){
            B[i]=0.5;
        }
        System.out.println("------------------------");
        System.out.println("ARREGLOS RESULTANTES");
        System.out.print("Arreglo A: ");mostrarArreglo(A);
        System.out.print("Arreglo B: ");mostrarArreglo(B);
    }
    static void inicializarRandom(double[] arreglo){
        
        for(int i=0; i<arreglo.length;i++){
            arreglo[i]=Math.round((Math.random()*20+1)*100d)/100d;
            
        }
    }
    static void mostrarArreglo(double[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
}