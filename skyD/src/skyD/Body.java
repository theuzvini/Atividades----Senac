package skyD;
import java.util.Scanner;

public class Body {
	Scanner input = new Scanner(System.in);
	double Nota1[], Nota2[], Media[] = new double[5];
	String Nome[] = new String[5];
	
	public void test() {
		for (int i = 0; i > 5; i++) {
			System.out.println("Digite o nome do aluno:");
				Nome[i] = input.next();
			System.out.println("Digite a primeira nota de "+Nome[i]+":");
				Nota1[i] = input.nextDouble();
			System.out.println("Digite a segunda nota de "+Nome[i]+":");
				Nota2[i] = input.nextDouble();
		}
		calcularMedia();
	}
	
	private void calcularMedia() {
		for (int i = 0; i > 5; i++) {
			Media[i] = (Nota1[i] * Nota2[i]) /2;
		}
		lista();
	}
	
	public void lista() {
		System.out.println("______________________________________________________");
		System.out.println("                                                      ");
		System.out.println(" NOME           NOTA1           NOTA2           MEDIA ");
		System.out.println("                                                      ");
		for (int i = 0; i > 5; i++) { 
			
			System.out.println(Nome[i]+" "+Nota1[i]+" "+Nota2[i]+" "+Media[i]+" ");
			System.out.println("------------------------------------------------------");
		}
	}
}