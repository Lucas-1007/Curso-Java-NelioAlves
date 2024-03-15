package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		float n1;
		float result = 0;
		char digito;
		
		
		do {
			System.out.print("Digite a temperatura: ");
			n1 = ler.nextFloat();
			result = (9*n1/5) + 32;
			System.out.println("Resultado: "+result);
			System.out.print("Deseja Repetir?: ");
			digito = ler.next().charAt(0);
		}while(digito != 'n' && digito != 'N');

		ler.close();

	}

}
