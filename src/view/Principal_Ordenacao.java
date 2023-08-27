package view;

import controller.OrdenacaoController;

public class Principal_Ordenacao {

	public static void main(String[] args) {
		int []vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int vetor2[] = {44, 43, 42, 41, 40, 39, 38};
		OrdenacaoController ord = new OrdenacaoController();
		
		/*Exibicao dos vetores não ordenados*/
			/*Vetor 1*/
		System.out.println("Vetor 1"); 
		for (int i : vetor1) {
			System.out.print(i+" ");
		}
		System.out.println();
			/*Vetor 2*/
		System.out.println("Vetor 2");
		for (int i : vetor2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		vetor1 = ord.bubbleSort(vetor1);
		vetor2 = ord.mergeSort(vetor2);
		
		/*Exibicao dos vetores ordenados*/
		System.out.println("Ordenação do vetor 1 por Bubble Sort");
		for (int i : vetor1) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		System.out.println("Ordenação do vetor 2 por Merge Sort");
		for (int i : vetor2) {
			System.out.print(i+" ");
		}
	}

}
