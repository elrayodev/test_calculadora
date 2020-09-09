package com.mayab.calidad.UnitTestEjemplo;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora {

	//Before para inicializar antes de cada prueba test
		//BeforaClass una sola vez antes de todas las pruebas
		static Calculadora miCalculadora;
		
		/*
		@Before
		public void setup() {
			System.out.println("Before test---->");
			miCalculadora = new Calculadora();
		}
		*/
		
		@BeforeClass
		public static void setup() {
			System.out.println("Before test---->");
			miCalculadora = new Calculadora();
		}

		@Test
		public void SumaPositivosTest() {
			float numero1 = 4;
			float numero2 = 4;
			float expectedResult = 8f;
			float result = -1;
			//end setup
			
			result = miCalculadora.suma(numero1, numero2);
			//end exercise
			
			System.out.println("Ultimo resultado: " + miCalculadora.getUltimaResultado());
			
			//assertEquals(expectedResult,result,0);
			assertThat(result,is(expectedResult));
			//endVerify
			
		}
		
		@Test
		public void RestaNumerosTest() {
			float numero1 = 4;
			float numero2 = 2;
			float expectedResult = 2;
			float result = -1;
			//end setup
			
			result = miCalculadora.resta(numero1, numero2);
			//endExercise
			
			System.out.println("Ultimo resultado: " + miCalculadora.getUltimaResultado());

			
			assertEquals(expectedResult,result,0);
			//endVerify
			
		}
		
		@Test
		public void DividirNumerosEnterosTest() {
			float numero1 = 4;
			float numero2 = 4;
			float expectedResult = 1f;
			float result = -1;
			//endSetup
			
			result = miCalculadora.division(numero1, numero2);
			//endExercise
			
			assertThat(result,is(expectedResult));
			
		}
		
		@Test(expected=java.lang.ArithmeticException.class)
		public void DivisionCeroTest() {
			float numero1 = 4;
			float numero2 = 0;
			//endSetup
			
			miCalculadora.division(numero1, numero2);
			//endExercise
		}
		
		@After
		public void despues() {
			System.out.println(">>>> Despues de la prubea");
		}
		
		//After se ejecuta cada vez despues de cada prueba
		//AfterClass se ejecuta una vez despues de todas las pruebas	
	
}
