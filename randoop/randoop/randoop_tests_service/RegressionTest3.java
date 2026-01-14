package randoop.randoop_tests_service;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (-7), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int int3 = service.UserService.totalCost(7, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 300 + "'", int3 == 300);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (-90), 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 72, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-20), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 200, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 1960, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, 245, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 35, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 90, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 5040, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) '4', 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 1960, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 567, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 0, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-9), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int3 = service.UserService.totalCost((int) (byte) 0, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 224, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 280, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-90), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 320, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 63, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 7, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-90), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 72, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (-10), 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 320, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 245, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 200, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 10, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) -1, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, (int) 'a', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 245, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 63, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 300, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 6300, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (short) 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (-20), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 1960, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 504, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 640, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int int3 = service.UserService.totalCost(0, 20, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 600, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 100, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 200, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (byte) 10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (-20), 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 504, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 245, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 8, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 600, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 224, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 72, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 72, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 504, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 2016, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(810, (-90), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 700, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        int int3 = service.UserService.totalCost(0, 1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 100, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-7), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (short) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-7), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 700, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-7), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 2, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, (-7), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 0, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 245, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) (byte) -1, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 600, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-90), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 320, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 128, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 1, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 20, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 1, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 200, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 224, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (-7), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-2), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 0, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) '4', 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 810, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 0, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 490, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, (int) ' ', 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 280, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 90, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (-8), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (byte) 10, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 64, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-8), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 300, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) ' ', 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 1960, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) (byte) 10, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 0, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) '4', 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 1, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 1960, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 35, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 2016, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (-100), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-2), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 224, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (byte) 100, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 245, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-9), 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (-7), 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 2016, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int3 = service.UserService.totalCost(2, (int) (byte) 10, 6300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50400 + "'", int3 == 50400);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 245, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int3 = service.UserService.totalCost((int) (byte) 0, 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (-20), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 600, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 490, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (-8), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), (int) (byte) 100, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-2), 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 640, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-1), 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, (-8), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int3 = service.UserService.totalCost((int) (byte) 1, 7, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, (int) (short) -1, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 200, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) (byte) -1, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 6300, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 5040, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 640, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 600, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 320, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 490, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (short) -1, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 5040, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 90, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (-7), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-90), 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) (short) 1, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 64, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (-9), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-20), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 490, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (int) (byte) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 320, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 700, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) ' ', (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 5040, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) '4', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 245, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int int3 = service.UserService.totalCost(0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-6), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 100, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 20, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 5040, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (int) (byte) 1, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 35, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 567, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 640, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 10, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), 1, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) '4', 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 5040, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (short) -1, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (short) 100, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 63, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 504, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (-2), 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, 490, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 6300, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 200, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 200, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 1, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-8), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, 90, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 280, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 20, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, (int) (short) 10, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 5040, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 490, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 280, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-90), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 0, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 504, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 2016, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 9, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 32, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 35, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (int) (byte) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 224, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 9, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 320, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) '4', 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 35, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 90, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 640, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 6300, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 90, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 72, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-6), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 50400, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (short) 100, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 63, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (-7), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 128, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-100), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63 + "'", int3 == 63);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int int3 = service.UserService.totalCost(0, 10, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-20) + "'", int3 == (-20));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (short) -1, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 504, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 245, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 640, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 640, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (-1), 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 280, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) -1, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (-90), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-10), 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 245, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 5040, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 64, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 5040, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 1960, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (byte) -1, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, (int) ' ', 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 640, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1960, 640, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 63, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, 100, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) '#', 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) (short) 100, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 280, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(64, 2016, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (int) 'a', (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (-20), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, 7, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 63, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 200, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (int) (byte) 0, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = service.UserService.totalCost(0, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 350 + "'", int3 == 350);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (int) '#', 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 245, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 63, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (-8), 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (-6), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 224, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 2016, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 320, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) 10, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 72, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) 100, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (int) (short) 10, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 224, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-6), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, 567, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) 'a', 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 8, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 2016, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 280, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 20, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 600, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-6), 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 6300, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (short) 100, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 504, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 35, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(320, 2, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 567, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int int3 = service.UserService.totalCost(1, 7, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (int) (short) 100, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 700, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 280, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (int) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 90, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) '4', 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 567, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 64, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (byte) 10, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (byte) 1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 64, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-10), 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 90, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) 10, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(6300, (-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 64, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 320, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 224, 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-8), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-7), 10, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 6300, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 9, 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 320, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-2), 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) '4', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-6), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 10, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (-1), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 490, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 2016, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (-2), 567);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, 0, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 504, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 6300, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (-9), 2016);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 5040, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 700, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 350, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 5040, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, (int) (short) -1, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (int) (byte) 100, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 810, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 210, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 0, 224);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (-90), 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-6), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-90), 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 35, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 2016, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(490, (int) (short) 0, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, 72, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 128, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-10), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 100, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int int3 = service.UserService.totalCost(0, 1, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (-10), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(640, 300, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-8), 35, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 0, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 50400, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(20, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int int3 = service.UserService.totalCost(0, (int) (short) 1, 6300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6300 + "'", int3 == 6300);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 120, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(224, 1960, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), 120, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (short) -1, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 72, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 10, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-90) + "'", int3 == (-90));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 700, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (int) (short) -1, 5040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 128, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, 245, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int int3 = service.UserService.totalCost(0, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 0, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 810, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-1), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-90), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-20), 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 9, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 32, 1960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 320, 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) 'a', 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 210, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, 8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 0, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-6), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 350, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-7), 6300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) -1, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, (int) (byte) -1, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-2), 63, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 640, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(567, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(5040, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 1, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 90, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-20), (-90), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int3 = service.UserService.totalCost((int) (byte) 0, 8, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) (short) 1, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) 'a', 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (byte) 1, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(504, (int) (byte) 0, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (-100), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) '#', 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, 1, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 8, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 0, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 0, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(350, 280, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 32, 490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (-6), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, 700, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 224, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-1), 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (byte) 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(128, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(50400, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(300, (-20), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int3 = service.UserService.totalCost((int) (short) 1, 10, 504);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4536 + "'", int3 == 4536);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 10, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2016, (int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 200, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 2, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) 100, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 320, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 10, 50400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-6), 300, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(120, (-7), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(2, (int) (byte) 100, 640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-100), (int) (short) 1, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 280, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 300, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(280, 63, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

