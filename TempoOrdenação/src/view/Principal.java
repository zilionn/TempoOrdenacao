package view;

import calcular.calculaTempo;

public class Principal {

	public static void main(String[] args) {
		calculaTempo calcTemp = new calculaTempo();
		int[] vet = new int[1500];
		
		for (int i = 0; i < 1500; i++) {
		vet[i] = (int) (((Math.random() + 0.01 ) * 100));
		}
		
		calcTemp.tempo(vet);
	}

}
