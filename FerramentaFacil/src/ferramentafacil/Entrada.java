package ferramentafacil;
import java.util.Scanner;

public class Entrada {
	public Scanner input = new Scanner(System.in);
	Estoque estoque = new Estoque();
	Produtos produtos = new Produtos();
	public int logico;

	public void entrar() {
		System.out.println("voltar =0 | ver loja =1 |cadastrar ferramenta =2 | consultar estoque =3 | atualizar quantidade =4");
			logico = input.nextInt();
		switch (logico) {
		case 0:
			Main.main(null);
			break;
		case 1:
			
			break;
		case 2:
			produtos.Cadastrar();
			break;
		case 3:
			estoque.Armazenar();
			break;
		case 4:
			estoque.Atualizar();
			break;
		default:
			System.out.println("-inserir apenas valores mostrados!-");
		}
	}
	
}
