package view;

import java.util.Random;

import controller.percorreController;

public class Principal  {

	public static void main(String[] args) {
        int par = 2;
        int impar = 1;
		Random aleatorio = new Random();
		int vAleatorio[] = new int[1000];

		for (int i = 0; i>=1000; i++) {
			vAleatorio[i] = aleatorio.nextInt(100)+1;
		}	
			
         
			percorreController threadVetor1 = new percorreController(par, vAleatorio);
			percorreController threadVetor2 = new percorreController(impar, vAleatorio);
			threadVetor1.start();
			threadVetor2.start();
		}
	}


