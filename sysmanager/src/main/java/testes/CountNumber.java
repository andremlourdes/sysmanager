package testes;

public class CountNumber {

	public static int countNumbers(int[] is, int number) {
		if(is!=null && is.length>0){
			
			//Exibindo os elementos do array 
			for (int i = 0; i<is.length; i++) {
				System.out.print(is[i] + ", ");
			}
			System.out.println();
			
			// Ordenando o array para crescente
			for (int i = 0; i < is.length-1; i++) {
				for (int j = i+1; j < is.length; j++) {
					if(is[i]>=is[j]) {
						int aux = is[i];
						is[i] = is[j];
						is[j] = aux;
					}
				}				 
			}
			
			//Exibindo os elementos do array j� ordenado e testando quantos s�o maiores 
			//que o n�mero informado.
			int bigger = 0;
			for (int i = 0; i< is.length; i++) {
				System.out.print(is[i] + ", ");
				if(is[i]<number){
					bigger++;
				}
			}
			System.out.println();			
			return bigger;
		}
		return -1;
	}

}
