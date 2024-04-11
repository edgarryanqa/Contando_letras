package contador;

import java.util.Scanner;

public class CountLetter {

	
		public static void main(String[] args) { // Método principal
			
	        Scanner scanner = new Scanner(System.in);
	        // Cria um objeto Scanner para ler entrada do usuário
	        System.out.println("Digite uma frase:"); 
	        // Exibe uma mensagem solicitando ao usuário que digite uma frase
	        String frase = scanner.nextLine(); 
	        // Lê a frase fornecida pelo usuário e a armazena na variável 'frase'
	        
	        int count = 0; // Inicializa uma variável 'count' para contar o número de letras 'a'
	        for (int i = 0; i < frase.length(); i++) { 
	        	// Inicia um loop para percorrer cada caractere da frase
	            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') { 
	            	// Verifica se o caractere atual é 'a' ou 'A'
	                count++; // Incrementa o contador se o caractere for 'a' ou 'A'
	            }
	        }
	        
	        System.out.println("A quantidade de letras 'a' na frase é: " + count); // Exibe a quantidade de letras 'a' na frase
	    }
	}


