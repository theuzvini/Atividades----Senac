package java_23_07_25;
import java.util.Scanner;

public class Atividades {
	
	static Scanner input = new Scanner(System.in);
	public static int logico;

	public static void Separar() {
		System.out.println(" ________________________________________ ");
		System.out.println("|                                        |");
		System.out.println("|    PAINEL DE ATIVIDADES DE MATHEUS     |");
		System.out.println("|              23-07-2025                |");
		System.out.println("| -------------------------------------- |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 01     ||   Insira [ 1 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 02     ||   Insira [ 2 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 03     ||   Insira [ 3 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 04     ||   Insira [ 4 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 05     ||   Insira [ 5 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 06     ||   Insira [ 6 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 07     ||   Insira [ 7 ]   |");
		System.out.println("|                                        |");
		System.out.println("|   Atividade 08     ||   Insira [ 8 ]   |");
		System.out.println("|                                        |");
		System.out.println("|  ENCERRAR PROGRAMA ||   Insira [ 0 ]   |");
		System.out.println("|________________________________________|");
		System.out.println("|                                        |");
		System.out.print("| Insiro: ");
			logico = input.nextInt();
		System.out.println("|________________________________________|");
			switch (logico) {
			case 1: 
				atv1.atividade1();
				break;
			case 2: 
				atv2.atividade2();
				break;
			case 3: 
				atv3.atividade3();
				break;
			case 4: 
				atv4.atividade4();
				break;
			case 5: 
				//atv5.atividade5();
				break;
			case 6: 
				atv6.atividade6();
				break;
			case 7: 
				//atv7.atividade7();
				break;
			case 8: 
				//atv8.atividade8();
				break;
			case 0: 
				System.exit(0);
				break;
			default:
				throw new IllegalArgumentException("Valor Inexistente: " + logico);
			}
	}
}
