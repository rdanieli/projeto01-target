package aula01;

public class TrabalhandoComArrays {
	
	public static void main(String[] args) {
		TrabalhandoComArrays tca = new TrabalhandoComArrays();
		tca.executar();
	}

	private void executar() {
		Double[] listaDeNotas = new Double[10];
		
		listaDeNotas[0] = 2.5;
		
		int i = 1;
		while( i < 10 ) 
		{
			listaDeNotas[i] = listaDeNotas[i - 1] * 2.5;
			i++;
		}
		
		i = 0;
		double somaDeTodasAsNotas = 0;
		
//		continue: vai pra condição do primeiro ;
//		break;
		outer: while(i < listaDeNotas.length) {
			
			int j = 0;
			
			while(j < 10) {
				
				if(j == 2) {
					break outer;
				}
				
				System.out.println("Oi");
				j++;
			}
			
			somaDeTodasAsNotas += listaDeNotas[i];
			
			i++;
		}
		
		System.out.printf("A média de todas as notas é: %.2f", (somaDeTodasAsNotas / listaDeNotas.length));
	}
}
