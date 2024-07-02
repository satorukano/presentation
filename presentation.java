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






public boolean isEligible(int age, 
                          double salary, 
                          boolean isEmployed, 
                          boolean hasDegree) {

    if ((age > 20 && age < 30 && salary > 40000.0 && isEmployed) ||
        (age > 25 && hasDegree) ||
        (!isEmployed && salary < 30000.0 && hasDegree)) {
        return true;
    } else {
        return false;
    }
}

@Test
public void testCanBuy() {
    assertTrue(customer.canBuy(25, 50000.0, true, true));
    assertTrue(customer.canBuy(31, 50000.0, true, true));
    assertTrue(customer.canBuy(25, 50000.0, false, true));
}

public boolean canBuy(int age,
                      double salary, 
                      boolean isEmployed, 
                      boolean hasDegree) {
    if (isEligible(age, salary, isEmployed, hasDegree)) {
        return true;
    } else {
        return false;
    }
}



