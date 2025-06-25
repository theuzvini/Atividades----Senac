package views;
import java.util.Scanner;

public class Home {
	Clientes clientes = new Clientes();
	public int v1 = 1,v2 = 2,v3 = 3,v4 =4, v5 = 5;
	Scanner input = new Scanner(System.in);
	public int logi;
	
	public void MenuC() {
		String Usuario = "No momento Null"; //Usuarios.UserC.toUpperCase();
		System.out.println("___________________________________________________________________________");
		System.out.println("|                                                                         |");
		System.out.println("|   SEJA BEM-VINDO  "+ Usuario +"       ° U ° !                           ");
		System.out.println("|                                                                         |");
		System.out.println("| ----------------------------------------------------------------------- |");
		System.out.println("|                                                                         |");
		System.out.println("|                                                                         |");
		System.out.println("|  [ 1 ] Meu Perfil        [ 2 ] Ver Produtos        [ 3 ] Notificações   |");
		System.out.println("|                                                                         |");
		System.out.println("|                                                                         |");
		System.out.println("|  [ 3 ] Ver Historico     [ 4 ] Meus Planos         [ 5 ] Configurações  |");
		System.out.println("|                                                                         |");
		System.out.println("|                                                                         |");
		System.out.println("__________________________________________________________________________");
		System.out.println("----");
		logi = input.nextInt();
		switch (logi) {
		case 1: 
			clientes.PerfilC();
			break;
		
		case 2: 
			
			break;
		
		case 3: 
			
			break;
		
		case 4: 
			
			break;
		
		case 5: 
			
			break;
			
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			MenuC();
		}
	}
	
	public void MenuA() {
		String Adm = "No momento Null";//Usuarios.UserA.toUpperCase();
		System.out.println("______________________________________________________________________________________");
		System.out.println("|                                                                                    |");
		System.out.println("|   SEJA BEM-VINDO  "+ Adm +"       ° U ° !                                      ");
		System.out.println("|                                                                                    |");
		System.out.println("| ---------------------------------------------------------------------------------- |");
		System.out.println("|                                                                                    |");
		System.out.println("|                                                                                    |");
		System.out.println("|  [ 1 ] Meu Perfil        [ 2 ] Área de Produtos        [ 3 ] Área de Assinaturas   |");
		System.out.println("|                                                                                    |");
		System.out.println("|                                                                                    |");
		System.out.println("|  [ 3 ] Ver Clientes      [ 4 ] Ver Estoque             [ 5 ] Configurações         |");
		System.out.println("|                                                                                    |");
		System.out.println("|                                                                                    |");
		System.out.println("______________________________________________________________________________________");
		System.out.println("----");
		logi = input.nextInt();
		switch (logi) {
		case 1: 
			clientes.PerfilA();
			break;
		
		case 2: 
			
			break;
		
		case 3: 
			clientes.Listar();
			break;
		
		case 4: 
			
			break;
		
		case 5: 
			
			break;
			
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			MenuC();
		}
	}
}
