package java_23_07_25;
import java.util.Scanner;

public class atv6 {
	static Scanner input = new Scanner(System.in);
	
	public static void atividade6() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|        ATIVIDADE 6/8 DE MATHEUS        |");
		System.out.println("|            numeros impares             |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("| COMANDO: Você está organizando um      |"
						 + "|    sorteio de ingressos para um show   |"
						 + "|    e precisa escolher apenas os        |"
						 + "|    ingressos ímpares. Crie um programa |"
						 + "|    que imprima todos os números ímpares|"
						 + "|    entre 1 e 50, representando os      |"
						 + "|    números dos ingressos. 		     |");
		System.out.println("|                                        |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
			for (int i = 0 ; i > 50 ;i++) {
				if (i%2 == 1) {
					System.out.println(i);
				}
			}
			Atividades.Separar();
			
	}
}
