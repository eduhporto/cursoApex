package exemplo12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// matriz 3 linha por 2 colunas (3 nomes e 3 idades)
		String[][] dados = new String[3][2];
		
		// la�o de repeticao
		for(int i=0; i <3; i++) {
			dados[i][0] = JOptionPane.showInputDialog("Informe o " + (i+1) + "� nome");
			dados[i][1] = JOptionPane.showInputDialog("Informe a " + (i+1) + "� idade");
		}
		
		//La�o - Listar
		String mensagem = "Dados informados:\n";
		for(int i=0; i<3; i++) {
			mensagem += dados[i][0] + " - " + dados[i][1] + "\n";
		}
		
		//exibir lista
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		

	}

}
