import java.util.Scanner;

public class Triangulo {
	
	public static int[][] triangulo (int numero){
		int[][] triangulo = new int[numero][numero];
		
		for (int i = 0; i < triangulo.length; i++){
			int num_array = i + 1;
			int num_acumulado = 0;
			for (int j = 0; j < triangulo[i].length; j++){
				if (j == 0){
					triangulo[i][j] = num_array;
				}
				else if (j <= i){
					num_acumulado = num_array -i;
					triangulo[i][j] = num_acumulado - (num_array - i); 
				}
				else {
					triangulo[i][j] = 0;
				}
			}
		}
		
		return triangulo;
	}

	public static void main(String[] args) {
		System.out.println("Escribe un numero:");
		
		Scanner lector = new Scanner (System.in);
		
		int numero = lector.nextInt();
		
		System.out.println(triangulo(numero));

	}

}
