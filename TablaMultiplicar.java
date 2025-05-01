package ejercicio4;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		
		//Instanciamos el scanner
Scanner sc = new Scanner(System.in);

  //Recolección del número por medio del scanner y un mensaje 
System.out.println(" Ingrese un número para saber su tabla de multiplicación");
  int num = sc.nextInt();
  
  //bucle for para imprimir 10 veces  la tabla de multiplicar del número ingresado
  for (int i=1; i<=10; i++) {
	  System.out.println(num + " x " + i + " = " + i*num );
  }
  sc.close();
	}

}
