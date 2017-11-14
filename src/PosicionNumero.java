import java.util.Scanner;

public class PosicionNumero {
	
	public static char posicionNumero (int numero, int posicion){
		
		String cadena = Integer.toString(numero);
		char digito_numero = 0;
		for (int i = 1; i <= cadena.length(); i++){
			if (posicion == i){
				digito_numero = cadena.charAt(i-1);
			}
		}
				
		return digito_numero;
		
	}

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Escribe un numero:");
		
		int numero = lector.nextInt();
		
		System.out.println("Escribe la posicion del digito que quieres consultar:");
		
		int posicion = lector.nextInt();
		
		System.out.println(posicionNumero(numero, posicion));
		

	}

}
