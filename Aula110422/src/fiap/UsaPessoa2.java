package fiap;

import java.util.Scanner;

public class UsaPessoa2 {
	public static void main(String[] args) {
		Pessoa pessoa1;
		Scanner scan;
		String nome = "";
		int ano = 0;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			System.out.println("Digite ano de nascimento: ");
			ano = scan.nextInt();
			
			pessoa1 = new Pessoa(nome, ano);
			
			System.out.println("Nome: " + pessoa1.getNome());
			System.out.println("Idade: " + pessoa1.calculaIdade(2022));
			
		} catch (Exception e) {
			System.out.println("Algo deu errado...");
		}
		
	}

}
