package controller;

import fernando.fatec.br.bubble.BubbleSort;
import fernando.fatec.br.merge.MergeSort;
import fernando.fatec.br.quick.QuickSort;

public class Ordena {

	public Ordena() {
		super();
	}

	public void ordenaBubble(int[] vetor) {
		BubbleSort bubble = new BubbleSort();
		vetor = bubble.bubbleSort(vetor);
		
		System.out.print("Ordenado por bubble - ");
	}	
			
	public void ordenaMerge(int [] vetor) {
		MergeSort merge = new MergeSort();
		int tamanho = vetor.length;
		vetor = merge.mergeSort(vetor, 0, tamanho - 1);
		
		System.out.print("\nOrdenado por merge - ");
	}

	public void ordenaQuick(int[] vet) {
		QuickSort quick = new QuickSort();
		quick.ordenar(vet, 0, vet.length - 1);
		
		System.out.print("\nOrdenado por quick - ");
	}
}
