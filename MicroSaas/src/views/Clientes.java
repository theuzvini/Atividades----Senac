package views;
import java.util.Scanner;

public class Clientes {
	Scanner input = new Scanner(System.in);
	public int v1 = 1,v2 = 2,v3 = 3,v4 = 4;
	public int logi;
	
	public void PerfilC() {
		Home home = new Home();
		String Usuario = "No momento Null";//Usuarios.UserC.toUpperCase();
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  ( FOTO ) "+ Usuario +"                                    |");
		System.out.println("|                                                            |");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("| Descrição:                                                 |");
		//System.out.println("  "+Descricao+"|                                             |"
		//		+ "                                                                      |"
		//		+ "                                                                      |"
		//		+ "                                                                      |");
		System.out.println("|                                                            |");
		System.out.println("|                                                            |");
		System.out.println("| [ 1 ] Editar Perfil     [ 2 ] Minhas Assinaturas           |");
		System.out.println("|                                                            |");
		System.out.println("| [ 3 ] Sair da Conta     [ 4 ] Voltar ao Menu               |");
		System.out.println("|                                                            |");
		System.out.println("______________________________________________________________");
		System.out.println("----");
		logi = input.nextInt();
		switch (logi) {
		case 1: 
			
			break;
		case 2: 
			
			break;
		case 3: 
	
			break;
		case 4: 
			home.MenuC();
			break;
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			PerfilC();
		}
	}
	
	public void PerfilA() {
		Home home = new Home();
		String Adm = "No momento Null";//Usuarios.UserA.toUpperCase();
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  ( FOTO ) "+ Adm +"                                    |");
		System.out.println("|                                                            |");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("| Descrição:                                                 |");
		//System.out.println("  "+Descricao+"|                                             |"
		//		+ "                                                                      |"
		//		+ "                                                                      |"
		//		+ "                                                                      |");
		System.out.println("|                                                            |");
		System.out.println("|                                                            |");
		System.out.println("| [ 1 ] Editar Perfil     [ 2 ] Minhas Assinaturas           |");
		System.out.println("|                                                            |");
		System.out.println("| [ 3 ] Sair da Conta     [ 4 ] Voltar ao Menu               |");
		System.out.println("|                                                            |");
		System.out.println("______________________________________________________________");
		System.out.println("----");
		logi = input.nextInt();
		switch (logi) {
		case 1: 
			
			break;
		case 2: 
			
			break;
		case 3: 
	
			break;
		case 4: 
			home.MenuC();
			break;
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			PerfilC();
		}
	}
	
	public void Listar() {
		Home home = new Home();
		System.out.println("_____________________________________________");
		System.out.println("|                                           |");
		System.out.println("|  ÁREA DE CLIENTES                         |");
		System.out.println("|                                           |");
		System.out.println("| ----------------------------------------- |");
		System.out.println("|                                           |");
		System.out.println("| [ 1 ] Ver todos os Clientes               |");
		System.out.println("|                                           |");
		System.out.println("| [ 2 ] Voltar ao Menu                      |");
		System.out.println("|                                           |");
		System.out.println("_____________________________________________");
		logi = input.nextInt();
		if (logi == 1) {
			System.out.println("-----------------------------------");
			for (int i = 0; i < Usuarios.idC; i++) {
				System.out.println("|                                     |");
				System.out.println("|Nome: "+Usuarios.nomeC[i]+"Cpf: "+Usuarios.cpfC+" |"); 	
			}
			System.out.println("-----------------------------------");
			home.MenuA();
		}
	}
}
