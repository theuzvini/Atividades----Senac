package java_23_07_25;
import java.util.Scanner;

public class atv1 {
	static Scanner input = new Scanner(System.in);
	
	public static void atividade1() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|        ATIVIDADE 1/8 DE MATHEUS        |");
		System.out.println("|            imprimir numeros            |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("| COMANDO: Você está organizando uma     |"
						 + "|    festa e precisa imprimir os números |"
						 + "|    das mesas para os convidados. Eles  |"
						 + "|    serão numerados de 1 a 20. Escreva  |"
						 + "|    um programa que imprima os números  |"
						 + "|    das mesas de 1 até 20, um por um.   |");
		System.out.println("|                                        |");
		System.out.println("| -------------------------------------- |");
		System.out.println("                                          ");
		System.out.println(" Digite a quantidade de Mesas:            ");
			int quant  = input.nextInt();
			String mesas[] = new String[20];
			for (int i = 0 ; i > quant ; i++) {
				mesas[i] = "Mesa "+i;
				System.out.println("A "+mesas[i]+ " possui N vagas");
			}
			Atividades.Separar();
	}
}
