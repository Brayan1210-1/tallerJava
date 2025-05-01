package ejercicio3;
import java.util.Scanner;
public class MayorDeTres {

	public static void main(String[] args) {
		//instanciación del scanner
		Scanner sc = new Scanner(System.in);
		
		//obtención de los 3 números
  System.out.println(" ingrese el primer número ");
	int num1 = sc.nextInt();
	System.out.println(" Ingrese el segundo número ");
	int num2 = sc.nextInt();
	System.out.println(" Ingrese el tercer número ");
	int num3 = sc.nextInt();
	
	//Declaración e inicialización del número mayor
     int mayor = num1;
     
     //Bloque de control para obtener el número mayor
     if (num2 > mayor) mayor = num2;
     if (num3 > mayor) mayor = num3;
     
    //Imprimir el número mayor 
     System.out.println("El mayor de los tres es: " + mayor);
     sc.close();
	}

}
