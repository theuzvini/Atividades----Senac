package views;
import java.util.Scanner;

public class Clientes {
	static Scanner input = new Scanner(System.in);
	public static int v1 = 1,v2 = 2,v3 = 3,v4 = 4;
	static public int logi;
	static public String DescricaoA, DescricaoC;
	
	public static void PerfilC() {
		String Usuario = Usuarios.UserC.toUpperCase(), CpfUSer = Usuarios.CpfC;
		Assinaturas assinaturas = new Assinaturas();
		Usuarios usuarios = new Usuarios();
		Home home = new Home();
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  ( FOTO ) "+ Usuario +"                                    |");
		System.out.println("|                                                            |");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("| Descrição:                                                 |");
		System.out.println("|           		"+ DescricaoC +"							  ");
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
			EditarC();
			break;
		case 2: 
			assinaturas.AssinaturaC();
			break;
		case 3: 
			System.out.println("O Usuario "+ Usuario + " saiu da conta!");
			usuarios.Separar();
			break;
		case 4: 
			home.MenuC();
			break;
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			PerfilC();
		}
	}
	
	public static void PerfilA() {
		String Adm = Usuarios.UserA.toUpperCase(), CpfAdm = Usuarios.CpfA;
		Assinaturas assinaturas = new Assinaturas();
		Usuarios usuarios = new Usuarios();
		Home home = new Home();
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  ( FOTO ) "+ Adm +"                                    |");
		System.out.println("|                                                            |");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("| Descrição:                                                 |");
		System.out.println("|           		"+ DescricaoA +"							  ");
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
			EditarA();
			break;
		case 2: 
			assinaturas.AssinaturaC();
			break;
		case 3: 
			usuarios.Separar();
			break;
		case 4: 
			home.MenuC();
			break;
		default:
			System.out.println("A opção " + logi + " não foi encontrada! tente novamente.");
			PerfilC();
		}
	}
	
	public static void Listar() {
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
				System.out.println("|Nome: "+Usuarios.nomeC[i]+" Cpf: ***            |"); 	
			}
			System.out.println("-----------------------------------");
			home.MenuA();
		}
	}
	
	public static void EditarC() {
		String Usuario = Usuarios.UserC.toUpperCase(), CpfUSer = Usuarios.CpfC;
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  Nome de Usuario:   "+ Usuario +"                           ");
		System.out.println("|  ------                                                    |");
		System.out.println("|  Cpf de Usuario:    "+ CpfUSer +"                           ");
		System.out.println("|  ------                                                    |");
		System.out.println("|  Descrição Atual:                                          |");
		System.out.println("|           		"+ DescricaoC +"							  ");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("|  [ 1 ]| Alterar descrição          [ 2 ] Voltar Perfil     |");
		System.out.println("|                                                            |");
		System.out.println("______________________________________________________________");
			logi = input.nextInt();
			input.nextLine();
		if (logi == v1) {
			System.out.println("Insira nova descrição:");
			DescricaoC = input.nextLine();
		} 
		if (logi == v2) {
			PerfilC();
		} 
		PerfilC();
	}
	
	public static void EditarA() {
		String Adm = Usuarios.UserA.toUpperCase(), CpfAdm = Usuarios.CpfA;  
		System.out.println("______________________________________________________________");
		System.out.println("|                                                            |");
		System.out.println("|  Nome de Usuario:   "+ Adm     +"                           ");
		System.out.println("|  ------                                                    |");
		System.out.println("|  Cpf de Usuario:    "+ CpfAdm +"                            ");
		System.out.println("|  ------                                                    |");
		System.out.println("|  Descrição Atual:                                          |");
		System.out.println("|           		"+ DescricaoA +"							  ");
		System.out.println("| ---------------------------------------------------------- |");
		System.out.println("|                                                            |");
		System.out.println("|  [ 1 ]| Alterar descrição          [ 2 ] Voltar Perfil     |");
		System.out.println("|                                                            |");
		System.out.println("______________________________________________________________");
			logi = input.nextInt();
			input.nextLine();
			if (logi == v1) {
				System.out.println("Insira nova descrição:");
				DescricaoA = input.nextLine();
				EditarC();
			} else {
				if (logi == v2) {
					PerfilC();
				} else {}
				System.out.println("sistema diz: - OPçÃO NÃO EXISTE! -");
				EditarC();
			}
	}
}
