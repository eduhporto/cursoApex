package atividade03;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "C�lculo de IMC");
	
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura").replace(",", "."));
	
	double imc = peso / (altura * altura);
	DecimalFormat doisDigitos = new DecimalFormat("0.00");
	
	if (imc < 15) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� muito abaixo do peso");
	
	}else if (imc < 17.5) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� abaixo do peso");
		
	}else if (imc < 25) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� com o peso normal");
	
	}else if (imc < 30) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� acima do peso");
		
	}else if (imc < 35) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� com obesidade I");
		
	}else if (imc < 40) {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + doisDigitos.format(imc) + " e voc� est� com obesidade II");
		
	}else {
		JOptionPane.showMessageDialog(null, "Seu IMC � de " + imc + " e voc� est� com obesidade III");
	}
		
		
		
		

	}

}
