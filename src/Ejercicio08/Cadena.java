/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos: 

 */
package Ejercicio08;

/**
 *
 * @author cjalil
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }
    
    
    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud() {
        this.longitud = frase.length();
    }
/*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada. */ 
    public int mostrarVocales(){
        int contador=0;
        for (int i=0;i<longitud;i++){
            String letra=frase.substring(i,i+1).toLowerCase();
            if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
                contador++;
            }
        }
        return contador;
    }
    /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/  
    public void invertirFrase(){
        String fraseInvertida="";
        for(int i=longitud;i>0;i--){
        fraseInvertida+=frase.substring(i-1,i);
    }
        System.out.println("La frase invertida es: "+fraseInvertida);
    }
    
    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
  public void vecesRepetido(String letra){
      int contador=0;
      for (int i=0;i<longitud;i++){
            
            if(letra.toLowerCase().equals(frase.substring(i,i+1).toLowerCase())){
                contador++;
            }
        }
      
      System.out.println("El caracter "+letra+" se repite "+contador+" veces");
  }  
    
  /*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario. */
  public void compararLongitud(String frase){
      if(this.frase.length()==frase.length()){
          System.out.println("La frase ingresada tiene la misma longitud de la frase del objeto, "+longitud+" caracteres");
      } else{
          System.out.println("Las frases tienen distinto tamaño");
          System.out.println("      Frase ingresada: "+frase.length()+" caracteres");
          System.out.println("      Frase del objeto: "+this.frase.length()+" caracteres");
      }
  }
  /*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.  */
  public void unirFrases(String frase){
      this.frase+=" "+frase;
      System.out.println("La nueva frase es: "+this.frase);
  }
  
  /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.*/
  public void reemplazar(String letra){
      this.frase=this.frase.replaceAll("a", letra);
      System.out.println("La nueva frase es: " +this.frase);
  }
  
  /*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. */
  public boolean contiene(String letra){
      if(frase.contains(letra)){
          return true;
      } else {
          return false;
      }
  }
}
