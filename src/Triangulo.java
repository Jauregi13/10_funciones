import java.util.Scanner;

public class Triangulo {
	
	public static int[][] triangulo (int numero){
		int[][] triangulo = new int[numero][numero];
		
		for (int i = 0; i < triangulo.length; i++){
			for (int j = 0; j < triangulo[i].length; j++){
				if (j == 0){
					triangulo[i][j] = i + 1;
				}
				else if (j <= i){
					triangulo[i][j] = triangulo[i][j-1] - triangulo[i-1][0]; 
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
		
		int[][] triangulo = triangulo(numero);
		for (int i = 0; i < triangulo.length; i++){
			for(int j = 0; j < triangulo[i].length; j++){
				System.out.print(triangulo[i][j] +" ");
			}
			System.out.println("");
			
		}
		

	}

}
