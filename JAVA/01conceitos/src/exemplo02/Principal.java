package exemplo02;

public class Principal {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// TIPO DE VARIAVEIS TEXTUAIS
		char letra = 'a';
		
		// N�o existe um tipo texto, apenas um tipo char... como funciona
		char[] letras = {'a', 'p', 'e', 'x'};
		
		// Como fazer mais f�cil (classe String)
		String texto = "Apex";
		
		// TRABALHANDO COM NUMEROS:
		// Inteiros
		byte valor1 = 127; // Menor n�mero que tem vai somente at� 127
		short valor2 = 32767; // Segundo, vai apenas at� 32767
		int valor3 = 1000000000; // Vai at� muitos bilh�es
		long valor4 = 100;
		
		// Quebrados
		float valor5 = 5.4f; // quando quer deixar pre-definido o valor, colocar um "f" no final
		double valor6 = 7.6; 
		
		// TRABALHANDO COM O L�GICO
		boolean estuda = true; // pode ser true, mas pode ser false tamb�m
		
		
	}
}
