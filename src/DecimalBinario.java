import java.util.Scanner;

public class DecimalBinario {
	
	public static int contar_divisibles(int numero){
		int contador = 0;
		int numero2 = 1;
		while (numero > 0 && numero2 > 0){
			numero2 = numero / 2;
			contador++;
			
		}
		
		
		return contador;
	}
	
	public static int[] numero_a_binario(int numero){
		int[] numeros_binarios = new int[contar_divisibles(numero)];
		
		return numeros_binarios;
	}

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Escribe un numero");
		int numero = lector.nextInt();

	}

}
