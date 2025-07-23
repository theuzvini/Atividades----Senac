package java_23_07_25;
import java.util.Scanner;

public class atv3 {
	static Scanner input = new Scanner(System.in);
	
	public static void atividade3() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|        ATIVIDADE 3/8 DE MATHEUS        |");
		System.out.println("|          contagem regressiva           |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("| COMANDO: Você está programando o       |"
						 + "|    lançamento de um produto e precisa  |"
						 + "|    exibir uma contagem regressiva no   |"
						 + "|    site para criar suspense. Escreva um| "
						 + "|    programa que imprima a contagem     |" 
						 + "|    regressiva de 10 até 1 com uma pausa| "
						 + "|    de 1 segundo entre os números.		 |");
		System.out.println("|                                        |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
			for (int i = 10 ; i < 0 ; i--) {
				System.out.println("["+i+"]");
				if (i == 0) {
					System.out.println("O PRODUTO CHEGOU!");
				}
			}
			Atividades.Separar();
			
	}
}
