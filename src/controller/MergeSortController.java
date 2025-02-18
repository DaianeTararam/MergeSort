package controller;

public class MergeSortController{
	public MergeSortController(){
		super();
	}
	
	public void ordenar(int[] vetor) {
		merge(vetor, 0, vetor.length -1);
	}
	public void merge(int[] vetor, int inicio, int fim){
		int meio;
		if(inicio < fim){
			meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			intercala(vetor, inicio, fim, meio);
		}
	}
	
	public void intercala(int[] vetor, int inicio, int fim, int meio){
		int posicaoLivre, inicioVetor1, inicioVetor2;
		int aux[] = new int[vetor.length];
		inicioVetor1 = inicio;
		inicioVetor2 = meio + 1;
		posicaoLivre = inicio;
		
		while(inicioVetor1 <= meio && inicioVetor2 <= fim){
			if(vetor[inicioVetor1] <= vetor[inicioVetor2] ){
				aux[posicaoLivre++] = vetor[inicioVetor1++];
			}else{
				aux[posicaoLivre++]= vetor[inicioVetor2++];
			}
		}
		for(int i = inicioVetor1; i <= meio; i++)
			aux[posicaoLivre++] = vetor[i];
		for(int i = inicioVetor2; i<= fim;i++)
			aux[posicaoLivre++] = vetor[i];
		for(int i = inicio; i<= fim; i++)
			vetor[i] = aux[i];
	}
	
		
}
