package skyD;
import java.util.Scanner;

public class Body {
	Scanner input = new Scanner(System.in);
	double Nota1[], Nota2[] = new double[5];
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
	}	
}