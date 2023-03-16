/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo. 
 */
package Ejercicio07;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
/*  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje 
*/
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre=leer.nextLine();
        System.out.print("Ingrese la edad: ");
        edad=leer.nextInt();
        do {
            System.out.print("Ingrese el sexo (H/M/O): ");
            String sex=leer.next();
            if (sex.toUpperCase().equals("H")||sex.toUpperCase().equals("M")||sex.toUpperCase().equals("O")){
                sexo=sex;
                break;
            } else{
                System.out.println("Información incorrecta. Debe ingresar H(Hombre), M(Mujer) u O(Otro)");
            }
        } while (true);
        System.out.print("Ingrese el peso (Kg): ");
        peso=leer.nextDouble();
        System.out.print("Ingrese la altura (centimetros): ");
        altura=leer.nextDouble();
        
        System.out.println("Se ha creado la persona con éxito\n");
    }
/*  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1. 
*/   
    public int calcularIMC(){
        double indice;
        
        indice=peso/(Math.pow((altura/100),2));
        if (indice<20){
            return -1;
        } else if (indice>=20&&indice<=25){
            return 0;
        } else {
            return 1;
        }
    }
/*  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    public boolean esMayorEdad(){
        if (edad>=18){
            return true;
        }else{
            return false;
        }
    }
}
