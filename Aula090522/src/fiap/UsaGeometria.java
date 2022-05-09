package fiap;

import javax.swing.JOptionPane;

public class UsaGeometria {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Geometria geo = new Geometria();
		String aux, escolha = "sim";
		int area;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane
						.showInputDialog("Deseja calcular qual área?" + "\n(1) Quadrado\n(2) Retângulo\n(3) Círculo");
				area = Integer.parseInt(aux);
				switch (area) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do lado:");
					float lado1 = Float.parseFloat(aux);
					geo.calculaArea(lado1);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do lado:");
					float lado2 = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura:");
					float altura = Float.parseFloat(aux);
					geo.calculaArea(lado2, altura);
					break;

				case 3:
					aux = JOptionPane.showInputDialog("Digite o valor do raio:");
					double raio = Double.parseDouble(aux);
					geo.calculaArea(raio);
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
