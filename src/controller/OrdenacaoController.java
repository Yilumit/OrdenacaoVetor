package controller;

import vi.ordenacao.LibSort;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}

	public int[] bubbleSort(int []vetor) {	//Recebe um vetor para ordenar por Bubble Sort
		LibSort bSort = new LibSort();	//Referencia a biblioteca de ordenacao
		
		vetor = bSort.bubbleSort(vetor);//Chama a função Bubble Sort da biblioteca
		
		return vetor;	//Retorna o vetor ordenado
	}
	
	public int[] mergeSort(int []vetor) { //Recebe um vetor para ordenar por Merge Sort
		LibSort mSort = new LibSort();	//Referencia a biblioteca de ordenacao
		
		vetor = mSort.mergeSort(vetor, 0, vetor.length-1); //Chama a função Merge Sort da biblioteca com os parametros necessarios
		
		return vetor; //Retorna o vetor ordenado
	}
}
