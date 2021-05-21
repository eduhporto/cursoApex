package atividade04;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Conversão de moedas");
		
		int moeda1 = Integer.parseInt(JOptionPane.showInputDialog("De qual moeda deseja converter:\n1) Real\n2) Dólar\n3) Libra\n4) Euro"));
		double valToConvert = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser convertido").replace(",", "."));
		int moeda2 = Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda deseja converter:\n1) Real\n2) Dólar\n3) Libra\n4) Euro"));
		
		double conversion = 0; 
		DecimalFormat doisDigitos = new DecimalFormat("0.00");
		
		if (moeda1 == 1 && moeda2 == 2) {
			JOptionPane.showMessageDialog(null, "Conversão de moedas");
			conversion = valToConvert/5.28;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Dólares");
			
		}else if (moeda1 == 1 && moeda2 == 3) {
			conversion = valToConvert/7.49;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else if (moeda1 == 1 && moeda2 == 4) {
			conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 2 && moeda2 == 1) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 2 && moeda2 == 3) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else if (moeda1 == 2 && moeda2 == 4) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 3 && moeda2 == 1) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 3 && moeda2 == 2) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Dolares");
			
		}else if (moeda1 == 3 && moeda2 == 4) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 4 && moeda2 == 1) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 4 && moeda2 == 2) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Dolares");
			
		}else if (moeda1 == 4 && moeda2 == 3) {
			//conversion = valToConvert/6.46;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else {
			JOptionPane.showMessageDialog(null, "Opção não localizada");

		}
		
		
		
		
		
		
		
		
		
		

	}

}
