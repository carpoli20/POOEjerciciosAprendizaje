/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Cuenta {

    
    private int numeroCuenta;
    private long dni;
    private double saldo;
    private double interes;
/*  a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.*/
    public Cuenta() {
    }
    
    public Cuenta(int numeroCuenta, long dni, int saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }
/*  b) Agregar los métodos getters y setters correspondientes*/
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
/*  c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.*/    
    public void crearCuenta(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Número de cuenta: ");
        numeroCuenta=leer.nextInt();
        System.out.print("DNI del cliente: ");
        dni=leer.nextLong();
        System.out.print("Saldo: ");
        saldo=leer.nextDouble();
        System.out.print("Tasa de interés (en %): ");
        interes=leer.nextInt();
        
    }
 // d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.   
    public void ingresar(double ingreso){
        this.saldo+=ingreso;
        System.out.println("Se he realizado un depósito de "+ingreso+" a la cuenta de forma exitosa. Su nuevo saldo es "+saldo+"\n");
    }
/*  e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public void retirar(double retiro){
        if (saldo>=retiro){
            saldo-=retiro;
            System.out.println("Se he realizado un retiro de "+retiro+" de la cuenta de forma exitosa. Su nuevo saldo es "+saldo+"\n");
        } else{
            saldo=0;
            System.out.println("El saldo de la cuenta es 0.00");
        }
    }
    
/*  f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/    
    public void extraccionRapida(){
        double valor=saldo*0.2;
        saldo-=valor;
        System.out.println("Se realizó una extracción rápida de "+valor+" de forma exitosa. Su nuevo saldo es "+saldo+"\n");
    }
    
/*  g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/    
    public double consultarSaldo(){
        return saldo;
    }
    
/*  h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */    
    public String consultarDatos(){
        return ("Número de cuenta: "+numeroCuenta+"; DNI: "+dni+" ; Saldo: "+saldo+" ; Interés: "+interes);
    }
}
