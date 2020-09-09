package com.mayab.calidad.UnitTestEjemplo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCalculadoraParametrizada {

	
	@Parameters
	public static Iterable data() {
		return Arrays.asList(new Object[][] {
			{4,2,2},{6,3,2},{5,5,1},{10,5,2}
		});
	}
	
	private float multiplierOne;
	private float multiplierTwo;
	private float expected;
	
	public TestCalculadoraParametrizada(float expected, float multiplierOne, float multiplierTwo) {
		this.multiplierOne = multiplierOne;
		this.multiplierTwo = multiplierTwo;
		this.expected = expected;
	}
	
	@Test
	public void MultiplicacionEnterosTest() {
		Assert.assertEquals(expected,multiplierOne*multiplierTwo,0);
	}

}
