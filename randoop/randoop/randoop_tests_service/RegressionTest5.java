package randoop.randoop_tests_service;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 6, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 50400, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-48), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 300, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        int int3 = service.UserService.totalCost(0, 2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) ' ', 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 0, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 63, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 200, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 2016, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 554400, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 300, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-1), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-90), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) 0, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (-10), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-8), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int3 = service.UserService.totalCost((int) (byte) 0, 2, 4536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9072 + "'", int3 == 9072);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 6300, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 90, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-8), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 2700, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 210, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 72, 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 567, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (-7), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 210 + "'", int3 == 210);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 300, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (-90), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 63, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-48), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 554400, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 100, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 280, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 245, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 5040, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 350, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-6), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-8), 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 210, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) ' ', 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 490, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (int) (byte) 1, (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, 72, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 72, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (-90), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-90), 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 63, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 504, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 567, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 6, 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 0, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 20, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-10), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 64, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 32, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (-90), 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 640, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, (-90), 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int int3 = service.UserService.totalCost(0, 6, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (-20), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 224, (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, 320, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 504, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6, (int) (byte) -1, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 20, 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 6, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-48), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-20), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (-6), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (short) 100, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, (-90), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 64, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 350, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 35, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 810, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-6), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 5040, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 9072, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 700, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 64, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 20, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, (int) '#', 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 63, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-10), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (int) (short) 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 9072, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 490, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 20, 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (-7), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 245, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-2), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 280, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (-6), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 700, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 72, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), (-2), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 245, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 4536, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 245, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 90, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 567, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 120, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 5040, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(554400, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 567, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 504, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 504, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) 1, (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (-100), 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (-6), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 63, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (-10), (-720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (int) '#', 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 9072, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (int) 'a', 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 63, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 300, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 120, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int int3 = service.UserService.totalCost((int) (byte) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (-1), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) '4', 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 10, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-20), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 120, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, (-720), 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), 20, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 72, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (-90), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int int3 = service.UserService.totalCost(1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 90, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 245, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 280, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-100), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 2, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), (-720), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, 128, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (byte) -1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 200, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 300, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-48), 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 32, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 2700, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 2016, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 300, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 700, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 554400, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 300, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 5040, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (int) '4', 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 35, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, (int) 'a', 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 810, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-6), 9072);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 100, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 810, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 810, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 640, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (-48), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 5040, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 280, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 6, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 6300, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 2016, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (-720), 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 100, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 0, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, 200, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 600, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 245, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 64, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 700, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 7, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 120, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6, 32, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 554400, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-8), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 640, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 5040, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (-100), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 224, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 504, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-9), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 4536, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 5040, 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, (-720), 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), 50400, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (-20), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (byte) 100, 9072);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), (-8), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 72, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 245, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) '4', (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 7, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6, (int) ' ', 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, 7, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 128, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 4536, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (int) (short) -1, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 4536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4536 + "'", int3 == 4536);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 1960, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (-720), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-9), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-720), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (byte) 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (int) (short) 100, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) 'a', (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (-9), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 280, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (short) 1, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 50400, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 100, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (byte) 1, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 2016, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) (byte) 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int int3 = service.UserService.totalCost(8, (int) (short) 10, 320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 567, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 5040, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 120, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-9), 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (-90), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (int) (byte) 100, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 63, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 640, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 4536, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 1, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 35, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 72, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 35, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 567, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 32, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-1), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 9072, 554400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 128, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), (int) (short) 100, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(4536, (int) (byte) -1, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 1960, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 128, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 2700, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 350, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (-7), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-100), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 100, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 300, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 9072, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 350, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 72, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (-9), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) ' ', 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) ' ', 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 300, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (-10), 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 567, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 320, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 210, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (-20), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2700, 300, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (short) 10, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 6300, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-48), (-9), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int3 = service.UserService.totalCost((int) (byte) 0, 2, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 240 + "'", int3 == 240);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (-6), 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 6300, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 35, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 504, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) ' ', (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 810, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 810, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 300, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) ' ', 2700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9072, 63, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, 120, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 6300, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 9, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (-10), 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (-90), (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 63, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, (int) (short) 1, 240);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-2), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) 'a', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (-1), 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 810, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) 'a', 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (byte) -1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 1, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 224, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-720), 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 35, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 90, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 72, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 0, 4536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

