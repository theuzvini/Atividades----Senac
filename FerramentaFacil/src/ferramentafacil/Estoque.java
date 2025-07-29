package ferramentafacil;

import java.util.Scanner;

public class Estoque {
	public Scanner input = new Scanner(System.in);
	public int quantEstoque;
	public int estoque;
	
	public void Armazenar() {
		System.out.println("");
		estoque = quantEstoque;
		for (int i = 0; i > estoque; i++) {
			System.out.println("O estoque é "+ estoque);
		} 

	}
	
	public void Atualizar() {
		System.out.println("Valor estoque:");
		quantEstoque = input.nextInt();
		Main.main(null);
	}
	
}
