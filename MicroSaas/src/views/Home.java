package views;
import java.util.Scanner;

public class Home {
	// views.Usuarios usuarios = new views.Usuarios();
	Scanner input = new Scanner(System.in);
	
	public void Menu(Usuarios usuarios) {
		for (int i = 0; i < usuarios.idC; i++) {
			if (usuarios.nomeA[i].equalsIgnoreCase(usuarios.nomeV) && usuarios.cpfA[i].equals(usuarios.cpfV)) {
				System.out.println("Você entrou como "+ usuarios.nomeA[i]);
				System.out.println("_________________________________________");
				System.out.println("|                                       |");
				System.out.println("|   SEJA BEM-VINDO"+ usuarios.nomeA +"  |");
			} 	
		}
		
		System.out.println("|                                       |");
		System.out.println("| ------------------------------------- |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 1 ]   |   Area de Cadastro  |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 2 ]   |   Area de Login     |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 3 ]   |   Fechar Programa   |");
		System.out.println("|                                       |");
		System.out.println("_________________________________________");
		System.out.println("----");
	}
}
