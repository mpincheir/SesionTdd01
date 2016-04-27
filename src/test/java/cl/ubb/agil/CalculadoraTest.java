package cl.ubb.agil;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {

	@Test
	public void SumaDosMasTresEsCinco(){
	
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(2,3);
		
		assertThat(resultado,is(5));
	}
	
	@Test
	public void SumaMenosUnoYSieteEsSeis(){
	
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(-1,7);
		
		assertThat(resultado,is(6));
	}	
	
	@Test
	public void RestaDoscientosMenosSetentaYTresEsCientoveinticiete(){
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.restar(200,73);
		
		assertThat(resultado,is(127));
	}
	
	@Test
	public void RestaMenosDiezYCincoEsMenosQuince(){
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.restar(-10,5);
		
		assertThat(resultado,is(-15));
	}	

}
