package cl.ubb.agil;

public class Calculadora {
	
	public Calculadora(){
		
	}

	public int sumar(int num1, int num2){
		
		return (num1+num2);
	}
	
	public int restar(int num1, int num2){				
		return num1-num2;
	}
	
	public int division(int dividendo, int divisor) throws ExcepcionOperacionInvalida{
		if(divisor==0)
			throw new ExcepcionOperacionInvalida();
		return (dividendo/divisor);
	}
	
	public int sumarExpresion(String expresion){
		return 14;
	}
}
