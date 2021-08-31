package view;
import java.util.Random;
import ThreadVetor.ThreadVetor;
public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		int vetor[][] = new int[3][5];
		
		for(int a = 0; a < 3; a++) {
			for(int i = 0; i < 5; i++) {
				vetor[a][i] = gerador.nextInt(100);
			}
		}
		Thread one = new ThreadVetor(vetor[0], 1);
		Thread two = new ThreadVetor(vetor[1], 2);
		Thread three = new ThreadVetor(vetor[2], 3);
		
		one.start();
		two.start();
		three.start();
		
	}

}
