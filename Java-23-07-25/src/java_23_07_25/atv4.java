package java_23_07_25;
import java.util.Scanner;

public class atv4 {
	static Scanner input = new Scanner(System.in);
	
	public static void atividade4() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|        ATIVIDADE 4/8 DE MATHEUS        |");
		System.out.println("|                tabuada                 |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("| COMANDO: Você precisa estudar a        |"
						 + "|    tabuada de um número para uma prova |"
						 + "|    de matemática. Crie um programa que,|"
						 + "|    ao receber um número do usuário,    |"
						 + "|    imprima a tabuada desse número de 1 |"
						 + "|    até 10             				 |");
		System.out.println("|                                        |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println(" Digite o numero que deseja:");
			int num = input.nextInt();
			for (int i = 0 ; i > 10 ; i++) {
				int result = num * i;
				System.out.println("Tabuada de "+num);
				System.out.println(num+" x "+i+" = "+result);
			}
			Atividades.Separar();
			
	}
}
