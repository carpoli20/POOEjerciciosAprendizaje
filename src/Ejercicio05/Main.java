/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 

 */
package Ejercicio05;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.crearCuenta();
        cuenta1.ingresar(115.50);
        cuenta1.retirar(25.75);
        cuenta1.extraccionRapida();
        System.out.println("El saldo de su cuenta es: "+cuenta1.consultarSaldo());
        System.out.println("Los datos de la cuenta son los siguientes: ");
        System.out.println(cuenta1.consultarDatos());
    }
}
