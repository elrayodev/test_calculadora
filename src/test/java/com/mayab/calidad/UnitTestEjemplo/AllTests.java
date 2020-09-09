package com.mayab.calidad.UnitTestEjemplo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, TestCalculadora.class, TestCalculadoraParametrizada.class })
public class AllTests {

}
