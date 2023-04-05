
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Movil {
    /* Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código.*/
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    private int[] codigo;
    
    /*A continuación, se implementarán los siguientes métodos: 
    Un constructor por defecto.*/
    public Movil() {
    }
    
    /* Un constructor con todos los atributos como parámetro.*/

    public Movil(String marca, double precio, String modelo, int memoriaRAM, int almacenamiento, int[] código) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = código;
    }
    /* Métodos getters y setters de cada atributo.*/

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCódigo(int[] código) {
        this.codigo = código;
    }
   
    /* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.*/
    public void cargarCelular(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la marca del móvil: ");
        marca=leer.next();
        System.out.print("Ingrese el precio: ");
        precio=formatearDecimales(leer.next());
        System.out.print("Ingrese el modelo: ");
        modelo=leer.next();
        System.out.print("Ingrese la memoria RAM (GB): ");
        memoriaRAM=leer.nextInt();
        System.out.print("Ingrese el almacenamiento (GB): ");
        almacenamiento=leer.nextInt();
        codigo=new int[7];
        ingresarCodigo(codigo);
        
       
        
    }
    
    /* Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo */
    
    public void ingresarCodigo(int[] codigo){
       
        Scanner leer1 = new Scanner(System.in);
        do{
             System.out.print("Ingrese el código ");
             String cadenaCodigo=leer1.next();
             
                if (cadenaCodigo.length()==7){
                    for (int i=0;i<7;i++){
                        codigo[i]=Integer.parseInt(cadenaCodigo.substring(i, i+1));
                    }
                    break;
                }else{
                    System.out.println("Código incompleto. El tamaño debe ser de 7 dígitos");
                }
            
        }while (true);
    }
    
    public void mostrarCelular(){
        System.out.println("*********************");
        System.out.println("DATOS DEL CELULAR");
        System.out.println("*********************");
        System.out.println("Marca: "+marca);
        System.out.println("Precio: "+precio);
        System.out.println("Modelo: "+modelo);
        System.out.println("Memoria RAM: "+memoriaRAM);
        System.out.println("Almacenamiento: "+almacenamiento);
       
        System.out.print("Código: ");
         for (int i=0;i<7;i++){
            System.out.print(codigo[i]);
        }
    }
    
    public double formatearDecimales(String numero){
        numero=numero.replace(',', '.');
      return Double.parseDouble(numero);
}
    
}
