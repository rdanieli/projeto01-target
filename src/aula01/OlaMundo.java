package aula01;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class OlaMundo {

	static Boolean meuBoolean = Boolean.TRUE;
	
	public static void main(String[] args) {
		
		String minhaString = "Target Trust";
		
		minhaString = minhaString.substring(9);
		
		Double wrapper = 2.0;
		double primitivo = 2.0;

		byte b = 1;
		
		wrapper = (double) b;
		
		System.out.println(minhaString);
		
		System.out.println(wrapper);
		System.out.println(primitivo);
		
		
		BigDecimal valorCheio = new BigDecimal("150.97");
		
		BigDecimal dezPorCentoDoValor = valorCheio.multiply(new BigDecimal("0.1"));
		
		System.out.println(dezPorCentoDoValor.setScale(2, RoundingMode.HALF_EVEN));
		
		System.out.println(meuBoolean);	
		
		System.out.println("Testando o Git.");
		
		
		OlaMundo olaMundo = new OlaMundo();
	
		double segundoValor = 1024.0;
		
		segundoValor = segundoValor - 100.0;
		
		double resultado = olaMundo.soma(1.0, segundoValor);
		
		System.out.println("O Resultado da minha soma é " + resultado);
	}

	public Double soma(Double p1, Double p2) {
		
		if(p1 > 10 && p2 > 10) {
			return p1 + p2;
		}
		
		return -1.0;
	}
	
}