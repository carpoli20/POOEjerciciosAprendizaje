/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. 
 */
package Ejercicio01;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Libro {

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;
    

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el ISBN: ");
        isbn=leer.nextLine();
            System.out.print("Ingrese el título: ");
        titulo=leer.nextLine();
            System.out.print("Ingrese el autor: ");
        autor=leer.nextLine();
            System.out.print("Ingrese el número de páginas: ");
        paginas=leer.nextInt();
    }
    
}
