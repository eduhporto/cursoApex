package atividade02;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Calculadora");
	double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
	double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
	double resultado = 0;
	
	int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a op��o:\n1) Soma\n2) Subtra��o\n3) Multipli��o\n4) Divis�o"));
	
	//1 - soma
	//2 - subtracao
	//3 - multiplicacao
	//4 - divisao	
	
	switch (opcao) {
	case 1:
		resultado = num1+num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 2:
		resultado = num1-num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 3:
		resultado = num1*num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 4:
		resultado = num1/num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		
	default:
		JOptionPane.showMessageDialog(null, "Op��o n�o localizada.");
		
		
	}
	

	}

}
