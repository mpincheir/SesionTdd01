package cl.ubb.agil;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {


	private Calculadora calculadora;

	@Before
	public void setup() {
		
		calculadora = new Calculadora();
	}
	
	
	@Test
	public void SumaDosMasTresEsCinco(){
			
		
		int resultado = calculadora.sumar(2,3);
		
		assertThat(resultado,is(5));
	}
	
	@Test
	public void SumaMenosUnoYSieteEsSeis(){
			
		
		int resultado = calculadora.sumar(-1,7);
		
		assertThat(resultado,is(6));
	}	
	
	@Test
	public void RestaDoscientosMenosSetentaYTresEsCientoveinticiete(){
		
	
		
		int resultado = calculadora.restar(200,73);
		
		assertThat(resultado,is(127));
	}
	
	@Test
	public void RestaMenosDiezYCincoEsMenosQuince(){
		
		
		int resultado = calculadora.restar(-10,5);
		
		assertThat(resultado,is(-15));
	}
	
	@Test
	public void DivisionDoceYTresEsCuatro(){
		
		
		int resultado = calculadora.division(12,3);
		
		assertThat(resultado,is(4));
	}
	
	@Test
	public void DivisionTreintaYSeisYSeisEsSeis(){
		
		int resultado = calculadora.division(36,6);
		
		assertThat(resultado,is(6));
	}

}
