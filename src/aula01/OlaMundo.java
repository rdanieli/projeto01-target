package aula01;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class OlaMundo {

	static Boolean meuBoolean = Boolean.TRUE;
	
	public static void main(String[] args) {
		OlaMundo olaMundo = new OlaMundo();
		
		String numeroEmString1 = olaMundo.lerTeclado();
		Double numeroEmDouble1 = Double.valueOf(numeroEmString1);

		String numeroEmString2 = olaMundo.lerTeclado();
		Double numeroEmDouble2 = Double.valueOf(numeroEmString2);

		String numeroEmString3 = olaMundo.lerTeclado();
		Double numeroEmDouble3 = Double.valueOf(numeroEmString3);
		
		double resultado = olaMundo.media(numeroEmDouble1, numeroEmDouble2, numeroEmDouble3);
		
		System.out.println(String.format("O valor da média é: %.2f", resultado));
		
		if(resultado >= 7) {
			System.out.println("O Aluno foi aprovado!");
		} else {
			System.out.println("O Aluno foi reprovado!");
		}
	}

	public Double soma(Double p1, Double p2) {
		return p1 + p2;
	}
	

	public Double media(Double p1, Double p2, Double p3) {
		return (p1 + p2 + p3) / 3;
	}
	
	public String lerTeclado() {
		Scanner entradaConsole = new Scanner(System.in);
		
		return entradaConsole.next();
	}
}