/*
. Deberá además implementar los siguientes métodos: 



 */
package Ejercicio09;

/**
 *
 * @author cjalil
 */
public class Matematica {
    private double numero1;
    private double numero2;
/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set*/
    public Matematica() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    /*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor*/
    public double devolverMayor(){
        if (numero1>=numero2){
            return numero1;
        }else{
            return numero2;
        }
    }
    public double devolverMenor(){
        if (numero1<=numero2){
            return numero1;
        }else{
            return numero2;
        }
    }
    /*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.*/
    public double calcularPotencia(){
       double potencia= Math.pow(devolverMayor(), devolverMenor());    
       return Math.round(potencia*100.0)/100.0;
    }
    
/*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/
    public double calcularRaiz(){
        double raiz= Math.sqrt(Math.abs(devolverMenor()));
        return Math.round(raiz*100.0)/100.0;
    }
    
}
