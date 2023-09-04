package calcular;

import controller.Ordena;

public class calculaTempo {

	public calculaTempo() {
		super();
	}

	public void tempo(int[] vetor) {
		Ordena ord = new Ordena();
		
		double tempoInicial1 = System.nanoTime();
		ord.ordenaBubble(vetor);
		double tempoFinal1 = System.nanoTime();
		double tempoTotal1 = tempoFinal1 - tempoInicial1;
		
		System.out.println("Tempo total: " +tempoTotal1+".s");
		
		double tempoInicial2 = System.nanoTime();
		ord.ordenaMerge(vetor);
		double tempoFinal2 = System.nanoTime();
		double tempoTotal2 = tempoFinal2 - tempoInicial2;
		
		System.out.println("Tempo total: " +tempoTotal2+".s");
		
		double tempoInicial3 = System.nanoTime();
		ord.ordenaQuick(vetor);
		double tempoFinal3 = System.nanoTime();
		double tempoTotal3 = tempoFinal3 - tempoInicial3;
		
		System.out.println("Tempo total: " +tempoTotal3+".s");
		
		
	}
}
