package cl.ubb.agil;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {

	@Test
	public void DosMasTresEsCinco(){
	
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(2,3);
		
		assertThat(resultado,is(5));
	}
	
	@Test
	public void MenosUnoYSieteEsSeis(){
	
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(-1,7);
		
		assertThat(resultado,is(6));
	}	

}
