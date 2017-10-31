
public class Ejercicios {
	
	//funciones
	
	public static int max(int[] numeros) {
		int valorMax = 0;
		for (int i = 0; i < numeros.length; i++){
			if (i == 0){
				valorMax = numeros[i];
			}
			if(valorMax < numeros[i]){
				valorMax = numeros[i];
			}
		}
		return valorMax;

	}

	static int min(int[] numeros) {
		int valorMin = 0;
		for (int i = 0; i < numeros.length; i++){
			if (i == 0){
				valorMin = numeros[i];
			}
			if(valorMin > numeros[i]){
				valorMin = numeros[i];
			}
		}
		return valorMin;

	}

	static double media(int[] numeros) {
		int valores = 0;
		for(int i = 0; i < numeros.length; i ++){
			valores = valores + numeros[i];
		}
		
		int media = valores / numeros.length;
		
		return media;

	}
	
	static double aumento(double salario, double porcentaje){
		double nuevo_salario = 0;
		
		double aumento = salario * (porcentaje/100);
		
		return nuevo_salario = salario + aumento;
	}
	
	//procedimientos
	
	private static void escribir_array(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i ++){
			System.out.print(numeros[i]+" ");
		}

	}

	public static void main(String[] args) {
		
		int[] numeros = { 8, 5, 10, 14, 13, 8, 12 };
		
		
		
		System.out.println(max(numeros));
		
		System.out.println(min(numeros));
		
		System.out.println(media(numeros));
		
		escribir_array(numeros);
		
		double salario = 1000.4;
		
		double porcentaje = 1.5;
		
		double nuevo_salario = aumento(salario, porcentaje);
		
		System.out.printf("%.2f", nuevo_salario);
		

	}

}
