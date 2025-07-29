package ferramentafacil;
import java.util.Scanner;

public class Produtos {
	public Scanner input = new Scanner(System.in);

	public void Cadastrar() {
		System.out.println("quantidade produto:");
		int qtd = input.nextInt();
		String produto[] = new String[qtd];
		String separa[] = new String[qtd];
		double valor[] = new double[qtd];
		int id[] = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Qual nome produto?");
			produto[i] = input.next();
			System.out.println("manual(0) ou eletrico(1)");
			separa[i] = input.next();
			if (separa[i] == "0") {
				separa[i] = "manual";
			} else {
				if (separa[i] == "1") {
					separa[i] = "eletrico";
				}
			}
			System.out.println("Qual o valor?");
			valor[i] = input.nextDouble();
			id[i] = i;
		}
		
	}
	
}
