package fiap;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Berisvaldo", 1980);

		pessoa1.setNome("Leo");
		pessoa1.setAnoNascimento(1998);

		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.calculaIdade(2022));
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.calculaIdade(2022));

	}

}
