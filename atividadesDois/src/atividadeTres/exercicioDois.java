package atividadeTres;

import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {

		int idade,menor=0,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma Idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			
		if(idade <= 21) {
			menor ++;
		}else if(idade >= 50) {
		    maior ++;
		}
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		}
		System.out.println("\nTotal de menores de 21: "+menor);
		System.out.println("\nTotal de maiores de 50: "+maior);
		
	}

}
