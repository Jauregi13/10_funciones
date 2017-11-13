
public class Ejercicios {
	
	//funciones
	/*
	 * Para sacar el valor maximo de los valores del array
	 * @param numeros array de integers
	 * @return un integer que sera el valor maximo
	 */
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
	/*
	 * Para sacar el valor minimo de los valores del array
	 * @param numeros array de integers
	 * @return un integer que sera el valor minimo
	 */

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
	/*
	 * recibira un array de numeros y
	 * devolvera un array con min y max
	 * @param numeros un array de integers
	 * @return array de integers de longitud 2, en el primer indice 
	 * */
	public static int[] min_max(int[] numeros){
		int valorMin = 0;
		int valorMax = 0;
		for (int i = 0; i < numeros.length; i++){
			if (i == 0){
				valorMin = numeros[i];
				valorMax = numeros[i];
			}
			if(valorMin > numeros[i]){
				valorMin = numeros[i];
			}
			if(valorMax < numeros[i]){
				valorMax = numeros[i];
			}
		}
		
		int[] valores = { valorMin, valorMax};
		return valores;
		
	}
	/*
	 * Funcion para sacar la media de los valores que estan dentro del array
	 * @param numeros array de integer
	 * @return la media de los numeros del array
	 */

	static double media(int[] numeros) {
		int valores = 0;
		for(int i = 0; i < numeros.length; i ++){
			valores = valores + numeros[i];
		}
		
		int media = valores / numeros.length;
		
		return media;

	}
	/*
	 * Calculo del aumento del salario segun el porcentaje y el valor del
	 * salario anterior
	 * @param salario el salario del trabajador
	 * @param porcentaje el porcentaje de la subida de sueldo
	 * @return el nuevo salario
	 */
	
	static double aumento(double salario, double porcentaje){
		double nuevo_salario = 0;
		
		double aumento = salario * (porcentaje/100);
		
		return nuevo_salario = salario + aumento;
	}
	
	//procedimientos
	
	/*
	 * @param numeros
	 */
	
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
		
		int[] minMax = min_max(numeros);
		
		System.out.println("\nEstos son los valores maximos y minimos del array:");
		
		System.out.println(minMax[1] + " " + minMax[0]);
	
		

	}

}
