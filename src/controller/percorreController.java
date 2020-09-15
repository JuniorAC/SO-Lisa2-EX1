package controller;

public class percorreController extends Thread {
	private int N;
	int vAleatorio[] = new int[1000];	
	public percorreController (int Num, int vAleatorio[]) {
		this.N = Num;
		this.vAleatorio = vAleatorio;
	}

	public void run() {
		
		if (N ==1) {

			double tempoInicial = System.nanoTime();
			for (int i = 0 ; i < vAleatorio.length; i++)  {

			}	
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.print("\nVetor for ==> " + tempoTotal + "s.");
		}

		else if (N ==2) {
			
			double tempoInicial = System.nanoTime();

			for (int vetorAleatorio :vAleatorio ) {

			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.print("\nVetor Foreach ==> " + tempoTotal + "s.");
		}
	}	


}

