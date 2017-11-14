import java.util.Scanner;

public class Segidas {
	
	public static void serie1(){
		int numero = 0;
		for (int i = 0; i <= 210; i = i + numero){
			System.out.print(i + " ");
			numero = numero + 10;
		}
	}
	
	public static double serie2(int numero){
		double suma = 0;
		double division = 0;
		for (int i = 1; i <= numero; i++){
			division = (double)1/i;
			suma = suma + division;
		}
		
		return suma;
	}

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		
		serie1();
						
		System.out.println("Escribe un numero:");
		
		int numero = lector.nextInt();
		
		System.out.printf("%.2f", serie2(numero));

	}

}
