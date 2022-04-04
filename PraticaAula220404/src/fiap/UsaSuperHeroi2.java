package fiap;

import java.util.Scanner;

public class UsaSuperHeroi2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SuperHeroi sh2 = new SuperHeroi();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Super Heroi: ");
		sh2.setNome(scan.next());
		System.out.println("Digite o Id secreto do Super Heroi: ");
		sh2.setIdSecreta(scan.next());
		System.out.println("Digite o poder do Super Heroi: ");
		sh2.setPoder(scan.next());
		System.out.println("Digite a fraqueza do Super Heroi: ");
		sh2.setFraqueza(scan.next());
		System.out.println("Digite o nome do vilão do Super Heroi: ");
		sh2.setVilao(scan.next());
		
		
		System.out.println("\nNome do Super Heroi: " + sh2.getNome());
		System.out.println("Id secreto do Super Heroi: " + sh2.getIdSecreta());
		System.out.println("Poder do Super Heroi: " + sh2.getPoder());
		System.out.println("Fraqueza do Super Heroi: " + sh2.getFraqueza());
		System.out.println("Nome do vilão do Super Heroi: " + sh2.getVilao());
	}

}
