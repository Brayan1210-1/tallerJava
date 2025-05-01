package ejercicio5;
import java.util.Scanner;
public class ContarVocales {

	public static void main(String[] args) {
		//Crear la instancia del scanner
  Scanner sc = new Scanner(System.in);
  
  //Obtención de la palabra con el Scanner
  System.out.println(" Ingrese una palabra ");
  String palabra = sc.next();
  
  //Definición e iniciañización del contador para las vocales
  int contador = 0;
  
  //bucle for para contar las vocales en la palabra
  for (int i = 0; i < palabra.length(); i++) {
	    char c = Character.toLowerCase(palabra.charAt(i));
	    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	        contador++;
	    }
	}
  //Imprimir la palabra y el total de vocales
  System.out.println(" La palabra " + palabra + " tiene " + contador + " vocales.");
sc.close();
	}

}
