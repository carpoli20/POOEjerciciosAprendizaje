/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno
 */
package Ejercicio13;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

//Un constructor por defecto. 
    public Curso() {
    }
//Un constructor con todos los atributos como parámetro. 
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
// Métodos getters y setters de cada atributo. 

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
/*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno. */
public void cargarAlumnos(String[] alumnos){
    Scanner leer=new Scanner(System.in);
    
    for (int i=0;i<alumnos.length;i++){
        System.out.print("Ingrese el nombre del alumno número "+(i+1)+": ");
        alumnos[i]=leer.nextLine();
        
    }
} 
/*Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos 
*/
public void crearCurso(){
    Scanner leer=new Scanner(System.in);
    System.out.print("Ingrese el nombre del curso: ");
    nombreCurso=leer.nextLine();
    System.out.print("Ingrese la cantidad de horas por día: ");
    cantidadHorasPorDia = leer.nextInt();
    System.out.print("Ingrese la cantidad de días por semana: ");
    cantidadDiasPorSemana = leer.nextInt();
    System.out.print("Ingrese el turno (mañana/tarde): ");
    turno = leer.next();
     System.out.print("Ingrese el precio x hora: ");
    String precio = leer.next();
    precioPorHora=formatearDecimales(precio);
    alumnos = new String[5];
    cargarAlumnos(alumnos);
}
/*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
public double calcularGananciaSemanal(){
    return cantidadHorasPorDia*precioPorHora*alumnos.length*cantidadDiasPorSemana;
}
public void mostrarCurso(){
    System.out.println("Nombre del curso: "+nombreCurso);
    System.out.println("Lista de Alumnos: ");
    for (int i=0;i<alumnos.length;i++){
        System.out.println("    "+(i+1)+".- "+alumnos[i]);
    }
    System.out.println("Horas por día: "+cantidadHorasPorDia);
    System.out.println("Días por semana: "+cantidadDiasPorSemana);
    System.out.println("Turno: "+turno);
    System.out.println("Precio por hora: "+precioPorHora+" dólares");
    System.out.println("Ganancia semanal: "+calcularGananciaSemanal()+" dólares");
}
public double formatearDecimales(String numero){
        numero=numero.replace(',', '.');
      return Double.parseDouble(numero);
}
}
