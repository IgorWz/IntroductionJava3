package atividadeTres;

import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {

		int primeiroNumero,numeroFinal,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		primeiroNumero = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		numeroFinal = leia.nextInt();
		
		if(primeiroNumero < numeroFinal) {
			for(x=primeiroNumero; x<=numeroFinal; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					System.out.println("\nO número "+x+" É divisível por 3 e 5");
				}
			}
		}else {
			System.out.println("O intervlado não é válido, o primeiro número é maior que o segundo.");
		}
		
	}

}
