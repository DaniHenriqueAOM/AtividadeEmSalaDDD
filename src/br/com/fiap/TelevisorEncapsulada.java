package br.com.fiap;

public class TelevisorEncapsulada {

	private int volume, canal;
	
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa permitida (0 a 100)"); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		try {
			if (canal > 0 && canal <= 50) {
				this.canal = canal;
			} else {
				throw new Exception("Canal fora da faixa permitida(0 a 50)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void mostrar() {
		System.out.println("Volume: " + getVolume() + "\nCanal: " + getCanal());
	}
}