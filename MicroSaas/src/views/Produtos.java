package views;
import java.util.Scanner;

public class Produtos {
	public int v1 = 1,v2 = 2,v3 = 3,v4 =4, v5 = 5;
	Scanner input = new Scanner(System.in);
	public int logi;
	
	public void verprodutos() {
		System.out.println("___________________________________________");
		System.out.println("|                                         |");
		System.out.println("|     VER PRODUTOS          quantidade:   |");
		System.out.println("|                                         |");
		System.out.println("| --------------------------------------- |");
		System.out.println("|                                         |");
		System.out.println("| [ 1 ] Ver Todos os produtos             |");
		System.out.println("|                                         |");
		System.out.println("| [ 2 ] Voltar ao menu                    |");
		System.out.println("|                                         |");
		System.out.println("___________________________________________");
			logi = input.nextInt();
		switch (logi) {
		case 1: 
			
			break;
		case 2: 
			
			break;
		default:
			System.out.println("Essa opção não existe!");
			verprodutos();
		}
	}
	
	public void areaproduto() {
		System.out.println("___________________________________________");
		System.out.println("|                                         |");
		System.out.println("|     AREA PRODUTO           ADMIN        |");
		System.out.println("|                                         |");
		System.out.println("| --------------------------------------- |");
		System.out.println("|                                         |");
		System.out.println("| [ 1 ] CRIAR PRODUTOS                    |");
		System.out.println("|                                         |");
		System.out.println("| [ 2 ] VER PRODUTOS                      |");
		System.out.println("|                                         |");
		System.out.println("| [ 3 ] VER VENDAS                        |");
		System.out.println("|                                         |");
		System.out.println("| [ 4 ] VER RELATORIOS                    |");
		System.out.println("|                                         |");
		System.out.println("| [ 5 ] VOLTAR AO MENU                    |");
		System.out.println("|                                         |");
		System.out.println("___________________________________________");
	}
}
