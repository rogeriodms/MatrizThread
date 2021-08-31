package ThreadVetor;

public class ThreadVetor extends Thread {
	private int vetor[];
	private int numberThread;
	public ThreadVetor(int vetor[], int numberThread) {
		this.vetor = vetor;
		this.numberThread = numberThread;
	}
	
	@Override
	public void run() {
		int calc = 0;
		for(int i = 0 ; i < vetor.length; i++) {
			calc += vetor[i];
		}
		System.out.println("vetor "+ numberThread + " e a soma de seus valores é " + calc);
	}
}
