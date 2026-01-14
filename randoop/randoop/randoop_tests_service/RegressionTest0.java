package randoop.randoop_tests_service;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        service.ManagerService managerService0 = new service.ManagerService();
        java.lang.Class<?> wildcardClass1 = managerService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.createBooking("", "hi!", booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Booking.getLicense()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        service.UserService userService0 = new service.UserService();
        java.lang.Class<?> wildcardClass1 = userService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.createBooking("hi!", "", booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Booking.getLicense()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.createBooking("hi!", "hi!", booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Booking.getLicense()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int3 = service.UserService.totalCost((int) (byte) 1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.createBooking("", "", booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Booking.getLicense()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (int) (byte) -1, paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) ' ', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 90, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int3 = service.UserService.totalCost(1, 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int3 = service.UserService.totalCost((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) ' ', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 90, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 90, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (short) 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 90, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (int) (short) -1, paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (int) (byte) -1, paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int3 = service.UserService.totalCost((int) (short) 0, 9, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (int) (short) -1, paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("hi!", "hi!", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        service.ManagerService managerService0 = new service.ManagerService();
        // The following exception was thrown during execution in test generation
        try {
            managerService0.parkingSpaceEnableDisable("", "hi!", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int3 = service.UserService.totalCost((int) (byte) 1, 9, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) '4', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-9), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-1), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int3 = service.UserService.totalCost(9, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-9), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) 'a', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-1), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (short) 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 90, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (byte) 10, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 8, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (byte) -1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 90, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int3 = service.UserService.totalCost(0, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) '4', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int3 = service.UserService.totalCost(0, 8, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (-1), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-9), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int3 = service.UserService.totalCost((int) (byte) 0, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 90, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-9), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int int3 = service.UserService.totalCost(9, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (int) ' ', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-9), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int3 = service.UserService.totalCost(1, 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int3 = service.UserService.totalCost((int) (short) 0, 9, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int3 = service.UserService.totalCost((int) (short) 1, 8, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 700 + "'", int3 == 700);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) 1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (-9), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 9, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 72, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int3 = service.UserService.totalCost((int) (byte) 1, 8, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (-9), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '4', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) '#', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 8, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-9), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int3 = service.UserService.totalCost(7, 8, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 72, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int3 = service.UserService.totalCost(0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 1, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int3 = service.UserService.totalCost(8, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 32, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 200, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (short) -1, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 200, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 90, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int3 = service.UserService.totalCost(0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (-9), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (byte) 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) '#', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int3 = service.UserService.totalCost(1, 7, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 210 + "'", int3 == 210);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 210, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (-9), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (-10), 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), 210, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 700, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (-10), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (-10), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) '4', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 72, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, (int) (byte) -1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 7, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) ' ', 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 72, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, (int) (short) -1, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), 210, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 100, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 35, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (-9), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, 9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, 7, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 700, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 35, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 200, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 700, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int3 = service.UserService.totalCost(0, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 200, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-9), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (-10), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 90, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) 10, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-90) + "'", int3 == (-90));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 200, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (-9), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (-9), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int3 = service.UserService.totalCost(0, 7, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 245 + "'", int3 == 245);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-10), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (int) 'a', 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (-1), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), 245, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int3 = service.UserService.totalCost((int) (byte) 1, 8, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63 + "'", int3 == 63);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) '#', 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, 245, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 63, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) ' ', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("", booking2, (-90), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 700, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(32, (-10), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 63, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) 100, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 200, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, 72, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 90, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        service.UserService userService0 = new service.UserService();
        observer.Booking booking2 = null;
        factory.PaymentOption paymentOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editBookingTime("hi!", booking2, (-90), paymentOption4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-10), (int) '4', 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 90, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 72, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 0, (int) (short) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 245, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) (short) 100, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-90), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 72, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(8, 210, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 200, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, (-1), 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (-10), 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, 90, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 700, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 700, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(63, (int) '4', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', (-90), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '#', 8, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int3 = service.UserService.totalCost(1, 7, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 600 + "'", int3 == 600);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 200, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) -1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, 600, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 245, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(90, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (-10), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(210, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 0, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 700, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) '#', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (-90), 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-1), (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(1, 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int3 = service.UserService.totalCost((int) (short) 0, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, (-90), 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, 63, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (short) 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 1, 700, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), 0, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (-90), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(600, (int) (short) 100, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(7, 200, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(72, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 100, 700, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-90), (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(700, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(35, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) ' ', 210, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(200, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(245, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(100, (-90), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(0, 0, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((-9), (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int3 = service.UserService.totalCost(9, (int) (byte) 10, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(10, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (short) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) 'a', (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) '4', 700, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot exceed 24 hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) 1, 0, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: endTime must be greater than startTime!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost(9, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = service.UserService.totalCost((int) (byte) -1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

