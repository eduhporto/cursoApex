package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	//Pe�a valores at� que seja informado o n�mero zero, em seguida retorne a soma dos valores informados
		
	JOptionPane.showMessageDialog(null, "Informe n�meros para serem somados, cancele inserindo o n�mero ZERO.");
	
	double num = 0;
	double soma = 0;
	
	do {
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero").replace(",", "."));
		soma = num+soma;
		
	} while (num != 0);
	
	JOptionPane.showMessageDialog(null, "A soma dos n�meros �: " + String.valueOf(soma).replace(".", ","));
	
	
	}

}
