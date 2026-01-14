package randoop.randoop_tests_service;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 567, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-20), 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 200, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 640, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 245, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 320, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 2016, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 120, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (-2), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 200, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 350, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 490, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (int) (short) 10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 810, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 504, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 0, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 200, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 4536, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) 10, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (-100), (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (-6), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-1), 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (-8), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 63, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 280, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 72, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 20, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 5040, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 810, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 32, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (int) (byte) 0, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 700, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-20), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 2, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 7, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-6), 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 320, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 63, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 120, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 810, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 64, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 210, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 640, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 20, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 0, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 200, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 1960, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 35, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (-90), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 50400, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 200, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 8, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-20), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 64, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 350, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 490, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 1, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 0, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 10, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 2016, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-48), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (-1), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (-2), 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 64, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-20), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 72, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 504, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-8), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 64, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 504, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-10), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 224, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (-6), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 245, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int3 = service.UserService.totalCost(9, 20, 50400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 554400 + "'", int3 == 554400);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 2016, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 567, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (-20), 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 210, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-48), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 567, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int int3 = service.UserService.totalCost(0, 1, 50400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50400 + "'", int3 == 50400);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 810, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 350, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 120, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 90, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 504, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 10, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-48), 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 490, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (-100), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 600, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), (-100), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 2016, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 1960, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) 'a', 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (-90), 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-6), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 210, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 5040, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 567, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-6), 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (-7), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 200, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 1, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 8, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (-90), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 554400, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 600, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (int) (short) 1, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 35, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-90), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 700, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 10, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 32, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 2016, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (int) 'a', 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 640, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 210, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 490, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 280, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 200, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, 32, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, (-90), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (-8), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (byte) 0, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) (short) -1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 100, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 6300, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 600, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 810, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 700, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-10), 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 120, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 245, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) (short) 100, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) '4', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) '#', (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 32, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (-7), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 6300, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, 320, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) -1, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 4536, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 210, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 5040, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 120, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 1, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 554400, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 5040, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 120, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (-9), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, 64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 4536, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 245, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 280, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 50400, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 20, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-6), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 72, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 640, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 300, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 35, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 280, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 280, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) -1, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 1960, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 210, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 0, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 1960, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 72, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, (-100), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 280, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 35, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 504, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 100, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) 0, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (-2), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 4536, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (int) 'a', 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 90, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-8), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-7), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 35, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 567, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 224, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 2016, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (-2), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (-6), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (-48), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 72, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 8, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 50400, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 640, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (int) (short) 10, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 640, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 300, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int3 = service.UserService.totalCost((int) (short) 1, 7, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 6300, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 4536, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 554400, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 7, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 120, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 224, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-10), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-100), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (int) (byte) -1, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int3 = service.UserService.totalCost((int) (short) 0, 1, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 64, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 504, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 1, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (-9), 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-90), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (-2), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 6300, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 120, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6, 64, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (int) (short) 1, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-6), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (short) 1, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 35, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-20), 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 490, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 245, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) 100, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (byte) -1, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-8), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (short) 1, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 280, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 490, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (byte) 100, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-7), (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 72, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, 600, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 810, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 700, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 63, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 64, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = service.UserService.totalCost((int) (short) 1, 9, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-720) + "'", int3 == (-720));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 50400, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 567, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, (-100), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 200, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), (int) (byte) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (int) ' ', 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 1, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (-20), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 72, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 210, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 245, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 600, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 320, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 50400, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 63, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 504, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (-10), 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 100, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 700, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 300, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) (byte) 10, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 640, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 554400, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 100, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) '4', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 20, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-720), 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 490, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (-8), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 1960, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), (-90), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 72, (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 120, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 504, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 700, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 2, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 63, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) '4', 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 0, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-20), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-20), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 90, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 490, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 8, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) 1, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 64, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 32, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 245, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-2), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 640, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 280, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 600, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 0, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 35, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 554400, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (-7), 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (-720), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-720), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-100), 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 350, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 2016, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 5040, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), (int) (byte) 0, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (short) 10, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) ' ', (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 200, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, 600, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 63, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 35, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 9, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 35, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 120, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 5040, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 9, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 0, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 200, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 20, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 120, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 2016, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 6, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 6, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-90), 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 20, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 63, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-1), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 320, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (-720), (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 1960, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 9, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-20), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 640, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-2), 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (-7), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 6, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (-90), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-720), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 554400, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 63, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (short) -1, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 1960, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 64, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 9, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 100, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 8, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 90, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 224, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 63, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (-100), 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) '4', 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int int3 = service.UserService.totalCost(0, 9, 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2700 + "'", int3 == 2700);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (-9), 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 120, (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-20), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 2, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (int) (byte) 1, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 224, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (int) '4', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 700, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 640, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 50400, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 9, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 567, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 245, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 63, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) -1, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 640, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 504, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 4536, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 640, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 224, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 280, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 5040, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (short) 0, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 8, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 0, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 4536, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), (-2), 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-6), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), 200, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 6, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 4536, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 210, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6, 280, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 32, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int int3 = service.UserService.totalCost((int) (short) 0, 20, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 50400, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) '#', (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 210, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 20, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), (-48), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 810, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) (byte) 10, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 6300, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-48), 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 224, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 490, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 600, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 504, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 200, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 200, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 0, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 32, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (-6), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 120, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 200, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

