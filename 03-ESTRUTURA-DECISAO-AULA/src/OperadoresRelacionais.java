public class OperadoresRelacionais {
	
	int valor1, valor2;
	
	public void testesLogicos() {
		
		/* < - menor que
		 <= - menor ou igual a
		 > - maior que
		 >= - maior ou igual a 
		 == - igual a
		 != - diferente de
		
		*/
		this.valor1 = 10;
		this.valor2 = 5;
		boolean resultado;
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " < " + this.valor2);
		resultado = valor1 < valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " <= " + this.valor2);
		resultado = valor1 <= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " > " + this.valor2);
		resultado = valor1 > valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " >= " + this.valor2);
		resultado = valor1 >= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " == " + this.valor2);
		resultado = valor1 == valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE L�GICO: " + this.valor1 + " != " + this.valor2);
		resultado = valor1  != valor2;
		System.out.println("RESULTADO: " + resultado);
		
		
	}

}
