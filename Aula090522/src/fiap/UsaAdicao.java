package fiap;

import javax.swing.JOptionPane;

public class UsaAdicao {
	public static void main(String[] args) {
		Adicao ad = new Adicao();
		String aux, escolha = "sim";
		int cond;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane
						.showInputDialog("Deseja calcular numeros Reais ou Inteiro?" + "\n(1) Inteiro\n(2) Real");
				cond = Integer.parseInt(aux);
				switch (cond) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:");
					int int1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do segundo número inteiro:");
					int int2 = Integer.parseInt(aux);
					ad.somaNumeros(int1, int2);
					break;
					
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do primeiro número real:");
					double real1 = Double.parseDouble(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do segundo número real:");
					double real2 = Double.parseDouble(aux);
					ad.somaNumeros(real1, real2);
					break;
					
				default:
					throw new Exception("Opção inálivda!");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? Sim ou Não?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!");
	}
}
