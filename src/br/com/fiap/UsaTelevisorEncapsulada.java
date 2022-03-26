package br.com.fiap;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
		TelevisorEncapsulada tv1 = new TelevisorEncapsulada();
		tv1.setCanal(5);
		tv1.setVolume(40);
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		
		tv1.mostrar();
	}

}
