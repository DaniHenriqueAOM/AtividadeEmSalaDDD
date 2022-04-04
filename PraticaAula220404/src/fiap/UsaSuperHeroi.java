package fiap;

public class UsaSuperHeroi {

	public static void main(String[] args) {
		SuperHeroi sh1 = new SuperHeroi();
		
		sh1.setNome("Miranha");
		sh1.setIdSecreta("Homem-aranha");
		sh1.setPoder("Soltar teia");
		sh1.setFraqueza("Fogo");
		sh1.setVilao("Dr. do Crime");

		System.out.println("Nome: " + sh1.getNome());
		System.out.println("Id Secreta: " + sh1.getIdSecreta());
		System.out.println("Poder: " + sh1.getPoder());
		System.out.println("Fraqueza: " + sh1.getFraqueza());
		System.out.println("Vilão: " + sh1.getVilao());
	}

}
