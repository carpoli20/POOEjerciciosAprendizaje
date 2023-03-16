/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. 

 */
package Ejercicio01;

/**
 *
 * @author Carlos
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Libro lib = new Libro();
        lib.cargarLibro();
        System.out.println("ISBN: "+lib.getIsbn());
        System.out.println("Título: "+lib.getTitulo());
        System.out.println("Autor: "+lib.getAutor());
        System.out.println("Número de páginas: "+lib.getPaginas());
    }
            
}
