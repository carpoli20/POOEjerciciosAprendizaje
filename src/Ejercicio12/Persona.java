/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 
 
 
 
 */
package Ejercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona() throws ParseException{
        Scanner leer = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ingrese el nombre de la persona: ");
        nombre=leer.nextLine();
        System.out.print("Ingrese la fecha de nacimiento dd/mm/yyyy: ");
        fechaNacimiento=formato.parse(leer.nextLine());
    }
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
    public int calcularEdad(){
        Date fechaActual=new Date();
        return fechaActual.getYear()-fechaNacimiento.getYear();
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    public boolean menorQue(int edad){
        return (calcularEdad()<edad);
    }
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior. */
    public void mostrarPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento.toGMTString());
        System.out.println("Edad: "+calcularEdad()+" años");
    }
}
