package exemplo01;


public class Principal {

	public static void main(String[] args) {
		// Variavel 
		String texto = "Quarta aula de Java fundamentos";
		
		// Quantidade de caracteres
		System.out.println(texto.length());
		
		// Obter caractere (ele mostra no caso abaixo a primeira letra que seria o "Q"
		System.out.println(texto.charAt(0));
		
		// um la�o para usar as letras
		for(int i=0; i<texto.length(); i++) {
			System.out.println("0 " + (i+1) + "caractere � " + texto.charAt(i));
			
		}
		
		// Letras maiusculas e minusculas
		System.out.println(texto.toLowerCase());
		System.out.println(texto.toUpperCase());
		
		// Cortar caracteres - no caso abaixo ele s� vai mostrar as informa��es at� o 15 caractere
		System.out.println(texto.substring(15));
		// Neste caso ele pega apenas do caractere 15 at� o caractere 19
		System.out.println(texto.substring(15,19));
		
		// Remover espa�os no come�o e no final da variavel TRIM
		String nome = "    Luciano";
		System.out.println(nome.trim());
		
		// Verificar existencia de um caractere - o retorno � o n�mero da posicao do caractere
		String email = "eduardo@teste.com";
		System.out.println(email.indexOf("@"));
		
		// Codigo ASCII - para identifica��o de codigo de letra
		char letra = 'a';
		System.out.println((int) letra);
		
		// vetor de texto
		String cursos = "Html;JavaScript;Java;MySQL";
		
		// adicionando as strings em um vetor
		String[] vetor = cursos.split(";");
		
		// mostrando o tamanho de char da palavra
		System.out.println(vetor.length);
		
		// mostrando as palavras do vetor
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		
		
		
		
		
		
		
		
	}

}
