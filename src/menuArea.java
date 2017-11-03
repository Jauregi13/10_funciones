import java.util.Scanner;

public class menuArea {
	
	public static double areaCirculo(int radio){
		
		double area = Math.PI*radio*radio;
		
		return area;
	}
	
	public static int areaCuadrado(int lado){
		
		int area = lado*lado;
		
		return area;
	}
	
	public static double areaTriangulo(int lado){
		
		double area = (Math.sqrt(3)/4*(lado*lado));
		return area;
	}

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

		final int CIRCULO = 1;
		final int CUADRADO = 2;
		final int TRIANGULO = 3;
		final int SALIR = 4;
		
		int opcion = 0;
		do {
			System.out.println("Elige una de estas opciones:");
			System.out.println("---------MENU---------");
			System.out.println(CIRCULO+". Calcular area del circulo");
			System.out.println(CUADRADO+". Calcular area del cuadrado");
			System.out.println(TRIANGULO+". Calcular area del triangulo equilatero");
			System.out.println(SALIR+". Fin del programa");
			
			opcion = lector.nextInt();
			
			switch(opcion){
			
			case CIRCULO:
				System.out.println("Escribe el radio del circulo (cm):");
				
				int radio = lector.nextInt();
				
				System.out.println("Este es el area del circulo: "+areaCirculo(radio));

				
				break;
				
			case CUADRADO:
				System.out.println("Escribe el lado del cuadrado (cm):");
				
				int ladoCuadrado = lector.nextInt();
				
				System.out.printf("Este es el area del cuadrado: "+areaCuadrado(ladoCuadrado));
				
				break;
			
			case TRIANGULO:
				System.out.println("Escribe el lado del triangulo (cm):");
				
				int ladoTriangulo = lector.nextInt();
				
				System.out.println("Este es el area del triangulo: "+areaTriangulo(ladoTriangulo));
				
				break;
			
			case SALIR:
				System.out.println("Saliendo...");
			
			}
		}
		
		while(opcion!= SALIR);
		
		System.out.println("Fin de programa");
		
		




	}

}
