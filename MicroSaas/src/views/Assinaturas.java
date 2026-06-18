package views;

public class Assinaturas {
	public void AssinaturaC() {
		String Usuario = Usuarios.UserC.toUpperCase();
		System.out.println("______________________________________________________________________");
		System.out.println("|                                                                    |");
		System.err.println("|                 ASSINATURAS DE: "+ Usuario +"                       ");
		System.out.println("|                                                                    |");
		System.out.println("| ------------------------------------------------------------------ |");
		System.out.println("|                                                                    |");
		System.out.println("| [ 1 ] Para Adicionar Assinatura      [ 2 ] Para Remover Assinatura |");
		System.out.println("|                                                                    |");
		System.out.println("| [ 3 ] Voltar para o Menu                                           |");
		System.out.println("|                                                                    |");
		System.out.println("______________________________________________________________________");
		System.out.println("---------");
	}
	
	public void AssinaturaA() {
		System.out.println("______________________________________________");
		System.out.println("|                                            |");
		System.out.println("|             ÁREA DE ASSINATURAS            |");
		System.out.println("|                                            |");
		System.out.println("| ------------------------------------------ |");
		System.out.println("|                                            |");
		System.out.println("|        [ 1 ] CRIAR ASSINATURAS             |");
		System.out.println("|                                            |");
		System.out.println("|        [ 2 ] VER ASSINATURAS               |");
		System.out.println("|                                            |");
		System.out.println("|        [ 3 ] VOLTAR AO MENU                |");
		System.out.println("|                                            |");
		System.out.println("______________________________________________");
		System.out.println("---------");
	}
	
}
