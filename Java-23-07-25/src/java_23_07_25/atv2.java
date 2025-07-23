package java_23_07_25;
import java.util.Scanner;

public class atv2 {
	static Scanner input = new Scanner(System.in);
	
	public static void atividade2() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|        ATIVIDADE 2/8 DE MATHEUS        |");
		System.out.println("|            soma de numeros             |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("| COMANDO: Imagina que você está         |"
				         + "|    comprando um item de 1 a 100        |"
				         + "|    unidades, e cada unidade custa 1    |"
				         + "|    real. Você quer calcular o custo    |"
				         + "|    total da compra. Crie um programa   |"
				         + "|    que calcule e imprima o total gasto,|"
				         + "|    somando os valores de 1 a 100.      |");
		System.out.println("|                                        |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println(" Digite quantas unidades deseja: (1 - 100 unidades)");
			int un = input.nextInt();
			for (int i = 0 ; i > un ; i++) {}
			Atividades.Separar();
		
	}
}
