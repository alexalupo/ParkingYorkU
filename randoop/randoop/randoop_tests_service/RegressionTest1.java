package randoop.randoop_tests_service;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (short) 100, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 9, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) '#', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 90, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 600, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (-9), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) -1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) 'a', 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 210, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 210, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (-90), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (byte) -1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) '#', 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 245, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) 'a', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) -1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int3 = service.UserService.totalCost(8, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 35, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-9), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (byte) 100, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 200, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 245, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 600, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 100, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (byte) 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 10, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (byte) 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 63, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-10), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 600, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) '#', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 9, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 245, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int3 = service.UserService.totalCost((int) (byte) 0, 1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) '4', (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 8, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 10, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int int3 = service.UserService.totalCost((int) (byte) 0, 2, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-20) + "'", int3 == (-20));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int3 = service.UserService.totalCost(0, 9, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-1), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) 10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 700, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) 'a', 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 210, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-10), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 210, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (short) 1, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int3 = service.UserService.totalCost((int) (short) 0, 9, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-90), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-90), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 35, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 90, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (-90), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) 0, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (-20), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 90, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) ' ', 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 700, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 1, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 90, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 600, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 32, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (-20), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 245, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 200, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-10), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) 'a', 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-10), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 600, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 600, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 35, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 8, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) '4', (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (byte) 1, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 72, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) '4', (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 90, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 200, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (-20), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 1, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 600, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int3 = service.UserService.totalCost(0, (int) (short) 1, 700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 700 + "'", int3 == 700);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (short) 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (-20), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 72, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 0, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int3 = service.UserService.totalCost(2, 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 280 + "'", int3 == 280);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (byte) 100, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 280, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int3 = service.UserService.totalCost((int) (byte) 0, 7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 90, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int int3 = service.UserService.totalCost((int) (short) 1, 2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int3 = service.UserService.totalCost(0, 9, 700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6300 + "'", int3 == 6300);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (byte) 10, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 245, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-20), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 72, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int3 = service.UserService.totalCost(0, 2, 245);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 490 + "'", int3 == 490);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 490, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 210, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 32, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) ' ', 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 490, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (-10), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-20), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int3 = service.UserService.totalCost((int) (short) 0, 7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 1, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 8, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 245, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 2, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 200, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 490, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-90), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 7, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (byte) 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 7, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 200, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) -1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 280, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 63, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 35, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 9, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (byte) 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 245, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 63, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int int3 = service.UserService.totalCost(0, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 210, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 700, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-20), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) '4', 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) 'a', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 245, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 63, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (short) 1, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) ' ', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) ' ', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-9), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) '4', (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 63, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 700, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 8, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int int3 = service.UserService.totalCost(0, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 7, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 490, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (short) 1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) ' ', 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 10, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 72, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 72, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (short) 100, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-20), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 700, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) '4', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 0, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (-10), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 6300, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-20), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) '4', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 6300, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 7, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 700, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 700, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 280, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (-9), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 8, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 210, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 490, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (-9), (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (short) -1, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (-20), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (byte) 0, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) 'a', 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-90), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 280, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 100, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-10), (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (byte) -1, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 72, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 63, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 63, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (byte) -1, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 700, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 600, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (short) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-20), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (-90), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-1), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 245, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 35, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 32, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 35, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int3 = service.UserService.totalCost(2, 10, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-9), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (int) (byte) 0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) ' ', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 100, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 245, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 63, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 64, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 9, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-9), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 600, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (-1), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (byte) 10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 0, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int3 = service.UserService.totalCost(9, 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 6300, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 9, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (-90), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 63, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 90, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 245, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) ' ', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (byte) 10, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 700, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 210, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 245, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (short) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 64, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 72, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (byte) 10, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 6300, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int3 = service.UserService.totalCost(0, 2, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) (byte) 10, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 64, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 35, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-20), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-90), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 210, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) ' ', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-20), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 8, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) ' ', 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (-90), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 0, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 700, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 100, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 7, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (-20), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 700, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 72, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 10, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 210, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 6300, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 8, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 72, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) -1, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 6300, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 100, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 200, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 63, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 0, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 32, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 90, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 600, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 35, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 200, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 280, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (-10), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 490, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 72, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 63, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 490, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 210, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 700, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 100, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 490, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 600, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 2, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 6300, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 90, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 210, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 2, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 0, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 6300, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-90), 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 600, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) '#', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) -1, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 9, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 2, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 10, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 64, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 72, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 0, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 490, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (int) (short) -1, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 90, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 200, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 210, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 0, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 245, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 6300, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 245, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int3 = service.UserService.totalCost(0, 7, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 32, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 200, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int int3 = service.UserService.totalCost((int) (short) 1, 10, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 567 + "'", int3 == 567);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) '#', 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-7), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 10, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 600, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 210, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (-1), 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 567, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 64, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 245, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) '#', 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 280, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 210, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

