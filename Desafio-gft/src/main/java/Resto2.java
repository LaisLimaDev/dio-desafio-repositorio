////Desafio
//Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que 
//divididos por N dão resto igual a 2.


import java.io.IOException;
import java.util.Scanner;

public class Resto2 {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int i=0;
    	for (i=1;i<1000;i++) {
    		if (i%N==2) System.out.println(i);
    	}
	}
}