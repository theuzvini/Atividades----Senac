package views;
import java.util.Scanner;

public class Usuarios {
	Home home = new Home();
	public static String[] nomeC = new String[10], cpfC = new String[10];
	public static String nomeV, cpfV;
	public static String UserC, UserA, CpfC, CpfA;
	public static String[] nomeA = new String[10], cpfA = new String[10];
	public static int logi, idC = 0, idA = 0, idV = 0;
	Scanner input = new Scanner(System.in);
	public int v1 = 1,v2 = 2,v3 = 3,v4 =4;
	public int verific = 0;
	
	public void Separar() {
		System.out.println("_________________________________________");
		System.out.println("|                                       |");
		System.out.println("|   	 SEJA BEM-VINDO AO SAAS!        |");
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
			logi = input.nextInt();
		try {
			if (logi == v1) {
				Cadastrar();
				//home.MenuC();
			}
			if (logi == v2) {
				Logar();
				//home.MenuA();
			}
			if (logi == v3) {
				System.out.println("-- Sistema diz: SISTEMA ENCERRADO --");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("-- Sistema diz: INSIRA APENAS NUMEROS --");
		}
	}
	
 	public void Cadastrar() {
		System.out.println("_________________________________________");
		System.out.println("|                                       |");
		System.out.println("|          SAAS --- CADASTRAR           |");
		System.out.println("|                                       |");
		System.out.println("| ------------------------------------- |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 1 ]   |   Cadastrar Cliente |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 2 ]   |   Cadastrar Admin   |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 3 ]   |   Voltar para inicio|");
		System.out.println("|                                       |");
		System.out.println("_________________________________________");
		System.out.println("----");
			logi = input.nextInt();
		try {
			if (logi == v1) {
				System.out.println("_________________________________________");
				System.out.println("|                                       |");
				System.out.println("|       SAAS --- CADASTRO CLIENTE       |");
				System.out.println("|                                       |");
				System.out.println("| ------------------------------------- |");
				System.out.println("|                                       |");
				System.out.println("|  1) Coloque seu Nome        *         |");
				System.out.println("|                                       |");
					nomeC[idC] = input.next();
				System.out.println("|                                       |");
				System.out.println("|  2) Coloque seu Cpf         *         |");
				System.out.println("|                                       |");
					cpfC[idC] = input.next();
				System.out.println("_________________________________________");
				System.out.println("--- Cliente Cadastrado! ---");
				idC++;
				Cadastrar();
			}
			if (logi == v2) {
				System.out.println("_________________________________________");
				System.out.println("|                                       |");
				System.out.println("|       SAAS --- CADASTRO ADMIN         |");
				System.out.println("|                                       |");
				System.out.println("| ------------------------------------- |");
				System.out.println("|                                       |");
				System.out.println("|  1) Coloque seu Nome        *         |");
				System.out.println("|                                       |");
					nomeA[idA] = input.next();
				System.out.println("|                                       |");
				System.out.println("|  2) Coloque seu Cpf         *         |");
				System.out.println("|                                       |");
					cpfA[idA] = input.next();
				System.out.println("_________________________________________");
				System.out.println("--- Admin Cadastrado! ---");
				idA = idA + 1;
				Cadastrar();
			}
			if (logi == v3) {
				Separar();
			}
		} catch (Exception e) {
			System.out.println("-- Sistema diz: INSIRA APENAS NUMEROS --");
		}
	} 
 	
 	public void Logar() {
 		System.out.println("_________________________________________");
		System.out.println("|                                       |");
		System.out.println("|             SAAS --- LOGIN            |");
		System.out.println("|                                       |");
		System.out.println("| ------------------------------------- |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 1 ]   |   Logar Cliente     |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 2 ]   |   Logar Admin       |");
		System.out.println("|                                       |");
		System.out.println("| INSERIR [ 3 ]   |   Voltar para inicio|");
		System.out.println("|                                       |");
		System.out.println("_________________________________________");
		System.out.println("----");
			logi = input.nextInt();
		try {
			if (logi == v1) {
				System.out.println("_________________________________________");
				System.out.println("|                                       |");
				System.out.println("|        SAAS --- LOGAR CLIENTE         |");
				System.out.println("|                                       |");
				System.out.println("| ------------------------------------- |");
				System.out.println("|                                       |");
				System.out.println("|  1) Coloque seu Nome Cadastrado   *   |");
				System.out.println("|                                       |");
					nomeV = input.next();
				System.out.println("|                                       |");
				System.out.println("|  2) Coloque seu Cpf Cadastrado    *   |");
				System.out.println("|                                       |");
					cpfV = input.next();
				System.out.println("_________________________________________");
				for (int i = 0; i < idC; i++) {
					if (nomeC[i].equalsIgnoreCase(nomeV) && cpfC[i].equals(cpfV)) {
						UserC = nomeC[i];
						CpfC = cpfC[i];
						verific = verific + 1;
					} 	
				}
				if (verific == 1) {
					System.out.println("Você entrou como "+ UserC);
					home.MenuC();
				} else {
					System.out.println("Nome ou Cpf invalidos!");
					Logar();
				}
			}
			if (logi == v2) {
				System.out.println("_________________________________________");
				System.out.println("|                                       |");
				System.out.println("|         SAAS --- LOGAR ADMIN          |");
				System.out.println("|                                       |");
				System.out.println("| ------------------------------------- |");
				System.out.println("|                                       |");
				System.out.println("|  1) Coloque seu Nome Cadastrado   *   |");
				System.out.println("|                                       |");
					nomeV = input.next();
				System.out.println("|                                       |");
				System.out.println("|  2) Coloque seu Cpf Cadastrado    *   |");
				System.out.println("|                                       |");
					cpfV = input.next();
				System.out.println("_________________________________________");
				for (int i = 0; i < idC; i++) {
					if (nomeA[i].equalsIgnoreCase(nomeV) && cpfA[i].equals(cpfV)) {
						UserA = nomeA[i];
						CpfA = cpfA[i];
						verific = verific + 1;
					} 	
				}
				if (verific == 1) {
					System.out.println("Você entrou como "+ UserA);
					home.MenuA();
				} else {
					System.out.println("Nome ou Cpf invalidos!");
					Logar();
				}
			}
			if (logi == v3) {
				Separar();
			}
		} catch (Exception e) {
			System.out.println("-- Sistema diz: INSIRA APENAS NUMEROS --");
		}
 	}
}
