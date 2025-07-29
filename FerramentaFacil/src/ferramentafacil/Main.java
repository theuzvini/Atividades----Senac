package ferramentafacil;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	static Entrada entrada = new Entrada();
	public static int logico;

	public static void main(String[] args) {
		System.out.println(" Entrar =1");
			logico = input.nextInt();
		try {
			if (logico == 0) {
				System.exit(0);
			}
			if (logico == 1) {
				entrada.entrar();
			}
		} catch (Exception e) {
			System.out.println("-inserir apenas valores mostrados!-");
		}
	}

}
