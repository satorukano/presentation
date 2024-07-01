import java.beans.Transient;

@Test
public void testAdd() {
    Calculator Calculator = new Calcurator();
    assertEquals(5, Calculator.add(2, 3));
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Calculator {
    public int add(int a, int b) {
        return a - b;
    }  
}

@Test
public void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.add(2, 3));
    assertEquals(-1, calculator.add(-2, 1));
    assertEquals(-5, calculator.add(-2, -3));
}