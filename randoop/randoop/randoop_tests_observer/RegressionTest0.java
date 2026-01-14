package randoop.randoop_tests_observer;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingLot("", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateUser("", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.checkPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        observer.UpdateCSV updateCSV0 = new observer.UpdateCSV();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingSpace("", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateBooking("hi!", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateUser("hi!", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingLot("hi!", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        parkingSpace9.setId(1);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        java.lang.Class<?> wildcardClass17 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.checkPath("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = parkingSpace16.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        boolean boolean3 = parkingSpace0.isTaken();
        boolean boolean4 = parkingSpace0.isDisabled();
        java.lang.Class<?> wildcardClass5 = parkingSpace0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setId(1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.Class<?> wildcardClass18 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateBooking("", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId((int) 'a');
        template.User user19 = null;
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        parkingSpace24.setDisabled(true);
        boolean boolean27 = parkingSpace24.isTaken();
        factory.PaymentOption paymentOption30 = null;
        observer.Booking booking32 = new observer.Booking(100, user19, parkingLot23, parkingSpace24, (int) (byte) 1, (int) (short) 0, paymentOption30, "");
        boolean boolean33 = parkingLot23.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray34 = new observer.ParkingSpace[] {};
        parkingLot23.setSpaces(parkingSpaceArray34);
        parkingLot5.setSpaces(parkingSpaceArray34);
        java.lang.Class<?> wildcardClass37 = parkingLot5.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray34, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        java.lang.String str6 = parkingSpace0.getLocation();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = parkingSpace6.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        observer.ParkingSpace parkingSpace12 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        booking8.setStartTime(97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.ArrayList<java.lang.String[]> strArrayList2 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList2, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingSpace("hi!", (java.util.List<java.lang.String[]>) strArrayList2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getStartTime();
        java.lang.Class<?> wildcardClass20 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        parkingLot3.setId((int) (byte) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        java.lang.Class<?> wildcardClass20 = parkingLot18.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        int int21 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        java.lang.Class<?> wildcardClass54 = parkingLot53.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId(5148);
        parkingLot5.setLocation("hi!");
        parkingLot5.setId(0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        observer.ParkingSpace parkingSpace25 = booking8.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = parkingSpace25.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace25);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.List<java.lang.String[]> strArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateBooking("", strArrayList1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        int int4 = parkingSpace0.getId();
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = null;
        booking8.setUser(user20);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        java.lang.Class<?> wildcardClass11 = booking8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = parkingSpace9.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        booking8.setStartTime((int) (short) 100);
        int int23 = booking8.getStartTime();
        factory.PaymentOption paymentOption24 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNull(paymentOption24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        observer.ParkingSpace parkingSpace17 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(parkingSpace17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        // The following exception was thrown during execution in test generation
        try {
            int int44 = parkingSpace33.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = booking8.getParkingSpace();
        java.lang.String str21 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.List<java.lang.String[]> strArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingLot("hi!", strArrayList1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        java.lang.Class<?> wildcardClass17 = booking16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        parkingLot7.setId((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 0, true, "hi!");
        boolean boolean4 = parkingLot3.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray16 = parkingLot5.getSpaces();
        java.lang.Class<?> wildcardClass17 = parkingSpaceArray16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setId((int) (short) -1);
        booking8.setParkingSpace(parkingSpace20);
        booking8.setId(97);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        template.User user7 = null;
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        java.lang.String str11 = parkingSpace8.getLocation();
        observer.ParkingLot parkingLot12 = null;
        parkingSpace8.setParkingLot(parkingLot12);
        observer.ParkingLot parkingLot17 = new observer.ParkingLot(0, false, "");
        java.lang.String str18 = parkingLot17.getLocation();
        parkingSpace8.setParkingLot(parkingLot17);
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime(0);
        factory.PaymentOption paymentOption36 = null;
        booking28.setPaymentOption(paymentOption36);
        observer.ParkingSpace parkingSpace38 = booking28.getParkingSpace();
        parkingSpace38.setLocation("");
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(100, user7, parkingLot17, parkingSpace38, (int) (byte) 1, 5148, paymentOption43, "hi!");
        parkingSpace0.setParkingLot(parkingLot17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingSpace38);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId(97);
        observer.ParkingSpace[] parkingSpaceArray18 = parkingLot5.getSpaces();
        java.lang.Class<?> wildcardClass19 = parkingLot5.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption13 = booking8.getPaymentOption();
        booking8.setEndTime(97);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        template.User user31 = null;
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        observer.ParkingSpace parkingSpace50 = booking40.getParkingSpace();
        observer.ParkingLot parkingLot55 = null;
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot55);
        booking40.setParkingSpace(parkingSpace56);
        template.User user59 = null;
        observer.ParkingLot parkingLot63 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace64 = new observer.ParkingSpace();
        parkingSpace64.setDisabled(true);
        boolean boolean67 = parkingSpace64.isTaken();
        factory.PaymentOption paymentOption70 = null;
        observer.Booking booking72 = new observer.Booking(100, user59, parkingLot63, parkingSpace64, (int) (byte) 1, (int) (short) 0, paymentOption70, "");
        observer.ParkingLot parkingLot76 = new observer.ParkingLot(0, false, "");
        parkingSpace64.setParkingLot(parkingLot76);
        parkingSpace56.setParkingLot(parkingLot76);
        boolean boolean79 = parkingLot76.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray80 = parkingLot76.getSpaces();
        observer.ParkingSpace parkingSpace81 = new observer.ParkingSpace();
        parkingSpace81.setDisabled(true);
        java.lang.String str84 = parkingSpace81.getLocation();
        parkingSpace81.setDisabled(false);
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking((int) (byte) -1, user31, parkingLot76, parkingSpace81, (int) (short) 1, (int) (byte) 0, paymentOption89, "hi!");
        booking8.setParkingLot(parkingLot76);
        boolean boolean93 = parkingLot76.isDisabled();
        java.lang.Class<?> wildcardClass94 = parkingLot76.getClass();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        template.User user31 = null;
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        observer.ParkingSpace parkingSpace50 = booking40.getParkingSpace();
        observer.ParkingLot parkingLot55 = null;
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot55);
        booking40.setParkingSpace(parkingSpace56);
        template.User user59 = null;
        observer.ParkingLot parkingLot63 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace64 = new observer.ParkingSpace();
        parkingSpace64.setDisabled(true);
        boolean boolean67 = parkingSpace64.isTaken();
        factory.PaymentOption paymentOption70 = null;
        observer.Booking booking72 = new observer.Booking(100, user59, parkingLot63, parkingSpace64, (int) (byte) 1, (int) (short) 0, paymentOption70, "");
        observer.ParkingLot parkingLot76 = new observer.ParkingLot(0, false, "");
        parkingSpace64.setParkingLot(parkingLot76);
        parkingSpace56.setParkingLot(parkingLot76);
        boolean boolean79 = parkingLot76.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray80 = parkingLot76.getSpaces();
        observer.ParkingSpace parkingSpace81 = new observer.ParkingSpace();
        parkingSpace81.setDisabled(true);
        java.lang.String str84 = parkingSpace81.getLocation();
        parkingSpace81.setDisabled(false);
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking((int) (byte) -1, user31, parkingLot76, parkingSpace81, (int) (short) 1, (int) (byte) 0, paymentOption89, "hi!");
        booking8.setParkingLot(parkingLot76);
        template.User user93 = null;
        booking8.setUser(user93);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray80);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setId((int) (short) 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = booking8.getParkingSpace();
        booking8.setEndTime(97);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(parkingSpace20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        observer.ParkingLot parkingLot16 = booking8.getParkingLot();
        int int17 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        java.lang.Class<?> wildcardClass18 = booking8.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        observer.ParkingLot parkingLot68 = booking61.getParkingLot();
        parkingLot68.setLocation("");
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(parkingLot68);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace[] parkingSpaceArray9 = parkingLot7.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray9);
        boolean boolean11 = parkingLot3.isDisabled();
        boolean boolean12 = parkingLot3.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray13 = parkingLot3.getSpaces();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        template.User user15 = null;
        booking14.setUser(user15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        parkingLot7.setId((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = parkingLot7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        template.User user18 = null;
        booking8.setUser(user18);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = parkingSpace46.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        parkingLot7.setId((int) (short) 100);
        parkingLot7.setDisabled(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.Class<?> wildcardClass18 = parkingSpace16.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        int int14 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setDisabled(true);
        int int9 = parkingLot3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        parkingLot20.setId((int) (byte) -1);
        java.lang.Class<?> wildcardClass55 = parkingLot20.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        observer.ParkingLot parkingLot68 = booking61.getParkingLot();
        factory.PaymentOption paymentOption69 = null;
        booking61.setPaymentOption(paymentOption69);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(parkingLot68);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, true, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        observer.ParkingSpace parkingSpace11 = booking8.getParkingSpace();
        template.User user12 = null;
        booking8.setUser(user12);
        int int17 = booking8.getTotalCost((int) (short) 1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-70) + "'", int17 == (-70));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        booking16.setEndTime((int) (byte) 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        int int9 = parkingLot7.getId();
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot7);
        parkingSpace10.setTaken(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        booking8.setLicense("hi!");
        int int21 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        java.lang.Class<?> wildcardClass58 = booking8.getClass();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = parkingSpace5.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        parkingLot7.setDisabled(false);
        java.lang.String str48 = parkingLot7.getLocation();
        parkingLot7.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        java.lang.String str13 = booking8.getLicense();
        observer.ParkingSpace parkingSpace14 = booking8.getParkingSpace();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(parkingSpace14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        booking8.setEndTime((-1));
        template.User user16 = null;
        booking8.setUser(user16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(parkingSpace18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        template.User user44 = booking43.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = user44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user44);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-100));
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        parkingSpace0.setTaken(false);
        boolean boolean8 = parkingSpace0.isTaken();
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        java.lang.Class<?> wildcardClass14 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setId((int) (short) -1);
        booking8.setParkingSpace(parkingSpace20);
        template.User user24 = booking8.getUser();
        booking8.setId((int) (short) -1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        boolean boolean15 = parkingSpace3.isTaken();
        int int16 = parkingSpace3.getId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        int int15 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        parkingSpace51.setTaken(true);
        parkingSpace51.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.List<java.lang.String[]> strArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateBooking("hi!", strArrayList1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int13 = booking8.getId();
        java.lang.Class<?> wildcardClass14 = booking8.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        int int7 = parkingLot5.getId();
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot12);
        parkingSpace13.setDisabled(true);
        parkingSpace13.setLocation("hi!");
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking((-100), user1, parkingLot5, parkingSpace13, (int) (byte) -1, (int) (short) 10, paymentOption20, "");
        parkingLot5.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.List<java.lang.String[]> strArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingSpace("", strArrayList1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        java.lang.String str17 = booking8.getLicense();
        booking8.setEndTime(5148);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        parkingLot20.setLocation("hi!");
        parkingLot20.setDisabled(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        parkingSpace13.setParkingLot(parkingLot25);
        parkingLot25.setDisabled(false);
        parkingSpace5.setParkingLot(parkingLot25);
        boolean boolean30 = parkingLot25.isDisabled();
        java.lang.Class<?> wildcardClass31 = parkingLot25.getClass();
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot24 = parkingSpace21.getParkingLot();
        boolean boolean25 = parkingSpace21.isDisabled();
        booking8.setParkingSpace(parkingSpace21);
        java.lang.String str27 = parkingSpace21.getLocation();
        parkingSpace21.setDisabled(false);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = parkingSpace21.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getId();
        factory.PaymentOption paymentOption19 = null;
        booking8.setPaymentOption(paymentOption19);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        int int1 = parkingSpace0.getId();
        parkingSpace0.setDisabled(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        parkingSpace0.setDisabled(false);
        parkingSpace0.setTaken(true);
        parkingSpace0.setId((-6298500));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        template.User user15 = null;
        observer.ParkingLot parkingLot19 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setDisabled(true);
        boolean boolean23 = parkingSpace20.isTaken();
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(100, user15, parkingLot19, parkingSpace20, (int) (byte) 1, (int) (short) 0, paymentOption26, "");
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        parkingSpace20.setParkingLot(parkingLot32);
        parkingLot32.setDisabled(false);
        parkingSpace3.setParkingLot(parkingLot32);
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot32.getSpaces();
        parkingLot32.setLocation("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        parkingSpace18.setTaken(false);
        java.lang.Class<?> wildcardClass22 = parkingSpace18.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot30);
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(0, user21, parkingLot25, parkingSpace31, (int) (short) -1, (int) (byte) 0, paymentOption34, "hi!");
        int int37 = parkingLot25.getId();
        booking8.setParkingLot(parkingLot25);
        parkingLot25.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        java.lang.String str8 = parkingSpace0.getLocation();
        parkingSpace0.setLocation("");
        int int11 = parkingSpace0.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        int int26 = booking8.getTotalCost((int) (byte) 10, 32, (int) (byte) -1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-22) + "'", int26 == (-22));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isDisabled();
        parkingSpace19.setTaken(true);
        boolean boolean23 = parkingSpace19.isTaken();
        parkingSpace19.setTaken(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setId(310);
        java.lang.Class<?> wildcardClass9 = parkingLot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setId((int) (short) -1);
        booking8.setParkingSpace(parkingSpace20);
        int int24 = booking8.getId();
        factory.PaymentOption paymentOption25 = null;
        booking8.setPaymentOption(paymentOption25);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        template.User user1 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot6);
        observer.ParkingLot parkingLot8 = parkingSpace7.getParkingLot();
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        parkingSpace15.setParkingLot(parkingLot27);
        parkingLot27.setDisabled(false);
        parkingSpace7.setParkingLot(parkingLot27);
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        java.lang.String str50 = booking40.getLicense();
        int int51 = booking40.getId();
        observer.ParkingSpace parkingSpace52 = booking40.getParkingSpace();
        factory.PaymentOption paymentOption55 = null;
        observer.Booking booking57 = new observer.Booking(10, user1, parkingLot27, parkingSpace52, (int) (byte) 0, 0, paymentOption55, "");
        int int58 = parkingLot27.getId();
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.List<java.lang.String[]> strArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.UpdateCSV.updateParkingLot("", strArrayList1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        template.User user1 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        int int11 = parkingLot9.getId();
        observer.ParkingSpace parkingSpace12 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot9);
        template.User user18 = null;
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        java.lang.String str23 = parkingLot22.getLocation();
        int int24 = parkingLot22.getId();
        observer.ParkingLot parkingLot29 = null;
        observer.ParkingSpace parkingSpace30 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot29);
        parkingSpace30.setDisabled(true);
        parkingSpace30.setLocation("hi!");
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking((-100), user18, parkingLot22, parkingSpace30, (int) (byte) -1, (int) (short) 10, paymentOption37, "");
        observer.ParkingLot parkingLot43 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray44 = parkingLot43.getSpaces();
        parkingLot22.setSpaces(parkingSpaceArray44);
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot22);
        parkingSpace46.setLocation("hi!");
        factory.PaymentOption paymentOption51 = null;
        observer.Booking booking53 = new observer.Booking(32, user1, parkingLot9, parkingSpace46, 100, 10, paymentOption51, "hi!");
        booking53.setEndTime(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getStartTime();
        int int12 = booking8.getEndTime();
        int int13 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isDisabled();
        parkingSpace19.setTaken(false);
        template.User user24 = null;
        observer.ParkingLot parkingLot28 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        boolean boolean32 = parkingSpace29.isTaken();
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(100, user24, parkingLot28, parkingSpace29, (int) (byte) 1, (int) (short) 0, paymentOption35, "");
        boolean boolean38 = parkingLot28.isDisabled();
        parkingLot28.setLocation("");
        parkingLot28.setLocation("hi!");
        parkingSpace19.setParkingLot(parkingLot28);
        parkingSpace19.setTaken(true);
        parkingSpace19.setDisabled(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getStartTime();
        booking8.setStartTime((int) (byte) 100);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        int int4 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        parkingSpace5.setId((int) (short) 10);
        org.junit.Assert.assertNull(parkingLot6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertNull(paymentOption19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        parkingSpace0.setId(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        parkingLot7.setDisabled(false);
        java.lang.String str48 = parkingLot7.getLocation();
        int int49 = parkingLot7.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        booking8.setLicense("hi!");
        int int17 = booking8.getEndTime();
        int int21 = booking8.getTotalCost((-100), (int) (short) 10, (int) (byte) 10);
        java.lang.String str22 = booking8.getLicense();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1100 + "'", int21 == 1100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        booking8.setLicense("hi!");
        booking8.setId(10);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        int int27 = booking8.getTotalCost((-6298500), (int) (short) 0, 100);
        observer.ParkingLot parkingLot28 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 629850000 + "'", int27 == 629850000);
        org.junit.Assert.assertNull(parkingLot28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        int int54 = parkingSpace3.getLotID();
        int int55 = parkingSpace3.getLotID();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption21 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(paymentOption20);
        org.junit.Assert.assertNull(paymentOption21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        booking8.setParkingLot(parkingLot21);
        java.lang.String str23 = parkingLot21.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        booking8.setEndTime(22);
        booking8.setEndTime(870);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        factory.PaymentOption paymentOption14 = null;
        booking8.setPaymentOption(paymentOption14);
        booking8.setId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        template.User user18 = null;
        observer.ParkingLot parkingLot19 = null;
        observer.ParkingSpace parkingSpace20 = null;
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user18, parkingLot19, parkingSpace20, (int) 'a', (int) 'a', paymentOption23, "");
        template.User user26 = null;
        booking25.setUser(user26);
        int int31 = booking25.getTotalCost((int) (short) -1, 5148, 0);
        int int35 = booking25.getTotalCost(0, (int) (short) -1, 100);
        factory.PaymentOption paymentOption36 = booking25.getPaymentOption();
        template.User user38 = null;
        observer.ParkingLot parkingLot39 = null;
        observer.ParkingSpace parkingSpace40 = null;
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(1, user38, parkingLot39, parkingSpace40, (int) 'a', (int) 'a', paymentOption43, "");
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        observer.ParkingLot parkingLot49 = parkingSpace46.getParkingLot();
        booking45.setParkingSpace(parkingSpace46);
        booking45.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        booking45.setParkingSpace(parkingSpace53);
        java.lang.String str55 = booking45.getLicense();
        observer.ParkingSpace parkingSpace56 = booking45.getParkingSpace();
        boolean boolean57 = parkingSpace56.isDisabled();
        parkingSpace56.setTaken(true);
        booking25.setParkingSpace(parkingSpace56);
        booking8.setParkingSpace(parkingSpace56);
        observer.ParkingLot parkingLot62 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-100) + "'", int35 == (-100));
        org.junit.Assert.assertNull(paymentOption36);
        org.junit.Assert.assertNull(parkingLot49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(parkingSpace56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(parkingLot62);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        template.User user31 = null;
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        observer.ParkingSpace parkingSpace50 = booking40.getParkingSpace();
        observer.ParkingLot parkingLot55 = null;
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot55);
        booking40.setParkingSpace(parkingSpace56);
        template.User user59 = null;
        observer.ParkingLot parkingLot63 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace64 = new observer.ParkingSpace();
        parkingSpace64.setDisabled(true);
        boolean boolean67 = parkingSpace64.isTaken();
        factory.PaymentOption paymentOption70 = null;
        observer.Booking booking72 = new observer.Booking(100, user59, parkingLot63, parkingSpace64, (int) (byte) 1, (int) (short) 0, paymentOption70, "");
        observer.ParkingLot parkingLot76 = new observer.ParkingLot(0, false, "");
        parkingSpace64.setParkingLot(parkingLot76);
        parkingSpace56.setParkingLot(parkingLot76);
        boolean boolean79 = parkingLot76.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray80 = parkingLot76.getSpaces();
        observer.ParkingSpace parkingSpace81 = new observer.ParkingSpace();
        parkingSpace81.setDisabled(true);
        java.lang.String str84 = parkingSpace81.getLocation();
        parkingSpace81.setDisabled(false);
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking((int) (byte) -1, user31, parkingLot76, parkingSpace81, (int) (short) 1, (int) (byte) 0, paymentOption89, "hi!");
        booking8.setParkingLot(parkingLot76);
        int int96 = booking8.getTotalCost(100, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-990) + "'", int96 == (-990));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        observer.ParkingLot parkingLot46 = booking45.getParkingLot();
        int int47 = booking45.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingLot46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 22 + "'", int47 == 22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        template.User user14 = null;
        booking13.setUser(user14);
        int int19 = booking13.getTotalCost((int) (byte) 1, (int) ' ', (int) (short) 10);
        booking13.setEndTime(1100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 310 + "'", int19 == 310);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        template.User user16 = null;
        booking8.setUser(user16);
        int int18 = booking8.getStartTime();
        int int19 = booking8.getEndTime();
        template.User user20 = null;
        booking8.setUser(user20);
        template.User user22 = null;
        booking8.setUser(user22);
        template.User user25 = null;
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(97);
        template.User user45 = null;
        observer.ParkingLot parkingLot49 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        parkingSpace50.setDisabled(true);
        boolean boolean53 = parkingSpace50.isTaken();
        factory.PaymentOption paymentOption56 = null;
        observer.Booking booking58 = new observer.Booking(100, user45, parkingLot49, parkingSpace50, (int) (byte) 1, (int) (short) 0, paymentOption56, "");
        observer.ParkingLot parkingLot62 = new observer.ParkingLot(0, false, "");
        parkingSpace50.setParkingLot(parkingLot62);
        boolean boolean64 = parkingSpace50.isTaken();
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking((int) (byte) 1, user25, parkingLot31, parkingSpace50, (int) (byte) 100, 22, paymentOption67, "");
        observer.ParkingLot parkingLot70 = booking69.getParkingLot();
        boolean boolean71 = parkingLot70.isDisabled();
        booking8.setParkingLot(parkingLot70);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parkingLot70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        int int20 = parkingSpace6.getLotID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-70), true, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 100, true, "hi!");
        int int4 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        booking8.setStartTime((int) '4');
        template.User user22 = null;
        booking8.setUser(user22);
        observer.ParkingLot parkingLot24 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(parkingLot24);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        boolean boolean31 = parkingLot21.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray32 = new observer.ParkingSpace[] {};
        parkingLot21.setSpaces(parkingSpaceArray32);
        parkingLot21.setDisabled(false);
        booking8.setParkingLot(parkingLot21);
        observer.ParkingSpace parkingSpace37 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingSpace37);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        parkingSpace18.setTaken(false);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = parkingSpace18.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        observer.ParkingSpace[] parkingSpaceArray7 = parkingLot5.getSpaces();
        java.lang.String str8 = parkingLot5.getLocation();
        template.User user10 = null;
        observer.ParkingLot parkingLot11 = null;
        observer.ParkingSpace parkingSpace12 = null;
        factory.PaymentOption paymentOption15 = null;
        observer.Booking booking17 = new observer.Booking(1, user10, parkingLot11, parkingSpace12, (int) 'a', (int) 'a', paymentOption15, "");
        template.User user18 = null;
        booking17.setUser(user18);
        int int23 = booking17.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption24 = booking17.getPaymentOption();
        template.User user26 = null;
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = null;
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(1, user26, parkingLot27, parkingSpace28, (int) 'a', (int) 'a', paymentOption31, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        observer.ParkingLot parkingLot37 = parkingSpace34.getParkingLot();
        booking33.setParkingSpace(parkingSpace34);
        booking33.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        booking33.setParkingSpace(parkingSpace41);
        java.lang.String str43 = booking33.getLicense();
        observer.ParkingSpace parkingSpace44 = booking33.getParkingSpace();
        boolean boolean45 = parkingSpace44.isDisabled();
        parkingSpace44.setTaken(true);
        boolean boolean48 = parkingSpace44.isTaken();
        booking17.setParkingSpace(parkingSpace44);
        factory.PaymentOption paymentOption52 = null;
        observer.Booking booking54 = new observer.Booking(16068, user1, parkingLot5, parkingSpace44, 22, (int) 'a', paymentOption52, "");
        int int55 = parkingSpace44.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(paymentOption24);
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace();
        parkingSpace5.setDisabled(true);
        java.lang.String str8 = parkingSpace5.getLocation();
        observer.ParkingLot parkingLot9 = null;
        parkingSpace5.setParkingLot(parkingLot9);
        factory.PaymentOption paymentOption13 = null;
        observer.Booking booking15 = new observer.Booking((int) (short) 0, user3, parkingLot4, parkingSpace5, 5148, (int) (short) 100, paymentOption13, "");
        int int16 = parkingSpace5.getId();
        template.User user18 = null;
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        boolean boolean26 = parkingSpace23.isTaken();
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(100, user18, parkingLot22, parkingSpace23, (int) (byte) 1, (int) (short) 0, paymentOption29, "");
        observer.ParkingSpace[] parkingSpaceArray32 = parkingLot22.getSpaces();
        parkingLot22.setId((int) 'a');
        template.User user36 = null;
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        boolean boolean44 = parkingSpace41.isTaken();
        factory.PaymentOption paymentOption47 = null;
        observer.Booking booking49 = new observer.Booking(100, user36, parkingLot40, parkingSpace41, (int) (byte) 1, (int) (short) 0, paymentOption47, "");
        boolean boolean50 = parkingLot40.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray51 = new observer.ParkingSpace[] {};
        parkingLot40.setSpaces(parkingSpaceArray51);
        parkingLot22.setSpaces(parkingSpaceArray51);
        parkingSpace5.setParkingLot(parkingLot22);
        observer.ParkingLot parkingLot55 = parkingSpace5.getParkingLot();
        observer.ParkingLot parkingLot56 = parkingSpace5.getParkingLot();
        template.User user58 = null;
        observer.ParkingLot parkingLot59 = null;
        observer.ParkingSpace parkingSpace60 = null;
        factory.PaymentOption paymentOption63 = null;
        observer.Booking booking65 = new observer.Booking(1, user58, parkingLot59, parkingSpace60, (int) 'a', (int) 'a', paymentOption63, "");
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace();
        parkingSpace66.setDisabled(true);
        observer.ParkingLot parkingLot69 = parkingSpace66.getParkingLot();
        booking65.setParkingSpace(parkingSpace66);
        booking65.setEndTime(0);
        factory.PaymentOption paymentOption73 = null;
        booking65.setPaymentOption(paymentOption73);
        observer.ParkingSpace parkingSpace75 = booking65.getParkingSpace();
        parkingSpace75.setLocation("");
        parkingSpace75.setLocation("");
        factory.PaymentOption paymentOption82 = null;
        observer.Booking booking84 = new observer.Booking((int) 'a', user1, parkingLot56, parkingSpace75, 0, 0, paymentOption82, "");
        parkingLot56.setId(5148);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray51, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot55);
        org.junit.Assert.assertNotNull(parkingLot56);
        org.junit.Assert.assertNull(parkingLot69);
        org.junit.Assert.assertNotNull(parkingSpace75);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId(97);
        parkingLot5.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        java.lang.String str17 = booking8.getLicense();
        int int21 = booking8.getTotalCost((int) 'a', 6500, 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 140866 + "'", int21 == 140866);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        int int11 = parkingLot9.getId();
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot16);
        parkingSpace17.setDisabled(true);
        parkingSpace17.setLocation("hi!");
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking((-100), user5, parkingLot9, parkingSpace17, (int) (byte) -1, (int) (short) 10, paymentOption24, "");
        observer.ParkingLot parkingLot30 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot30.getSpaces();
        parkingLot9.setSpaces(parkingSpaceArray31);
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot9);
        parkingSpace33.setDisabled(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        factory.PaymentOption paymentOption21 = null;
        booking8.setPaymentOption(paymentOption21);
        booking8.setEndTime(0);
        int int25 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        parkingLot18.setId((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime(0);
        factory.PaymentOption paymentOption36 = null;
        booking28.setPaymentOption(paymentOption36);
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        booking28.setParkingLot(parkingLot41);
        observer.ParkingSpace[] parkingSpaceArray43 = parkingLot41.getSpaces();
        java.lang.String str44 = parkingLot41.getLocation();
        booking8.setParkingLot(parkingLot41);
        boolean boolean46 = parkingLot41.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingSpaceArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot24 = parkingSpace21.getParkingLot();
        boolean boolean25 = parkingSpace21.isDisabled();
        booking8.setParkingSpace(parkingSpace21);
        java.lang.String str27 = parkingSpace21.getLocation();
        parkingSpace21.setLocation("hi!");
        boolean boolean30 = parkingSpace21.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "");
        int int4 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        template.User user1 = null;
        observer.ParkingSpace parkingSpace2 = new observer.ParkingSpace();
        parkingSpace2.setDisabled(true);
        java.lang.String str5 = parkingSpace2.getLocation();
        observer.ParkingLot parkingLot6 = null;
        parkingSpace2.setParkingLot(parkingLot6);
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        parkingSpace2.setParkingLot(parkingLot11);
        template.User user15 = null;
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = null;
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(1, user15, parkingLot16, parkingSpace17, (int) 'a', (int) 'a', paymentOption20, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        observer.ParkingLot parkingLot26 = parkingSpace23.getParkingLot();
        booking22.setParkingSpace(parkingSpace23);
        booking22.setEndTime(0);
        factory.PaymentOption paymentOption30 = null;
        booking22.setPaymentOption(paymentOption30);
        observer.ParkingSpace parkingSpace32 = booking22.getParkingSpace();
        parkingSpace32.setLocation("");
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking(100, user1, parkingLot11, parkingSpace32, (int) (byte) 1, 5148, paymentOption37, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int40 = parkingSpace32.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNotNull(parkingSpace32);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot12.getSpaces();
        parkingLot12.setId(97);
        observer.ParkingSpace[] parkingSpaceArray25 = parkingLot12.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray25);
        observer.ParkingLot parkingLot30 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str31 = parkingLot30.getLocation();
        template.User user33 = null;
        observer.ParkingLot parkingLot37 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setDisabled(true);
        boolean boolean41 = parkingSpace38.isTaken();
        factory.PaymentOption paymentOption44 = null;
        observer.Booking booking46 = new observer.Booking(100, user33, parkingLot37, parkingSpace38, (int) (byte) 1, (int) (short) 0, paymentOption44, "");
        observer.ParkingSpace[] parkingSpaceArray47 = parkingLot37.getSpaces();
        parkingLot30.setSpaces(parkingSpaceArray47);
        parkingLot3.setSpaces(parkingSpaceArray47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray47);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        observer.ParkingSpace parkingSpace25 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        boolean boolean27 = parkingSpace25.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray16 = parkingLot5.getSpaces();
        parkingLot5.setLocation("hi!");
        int int19 = parkingLot5.getId();
        parkingLot5.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(5148, true, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace(10, "", false, false, parkingLot7);
        parkingLot7.setId((int) (byte) 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        parkingSpace13.setParkingLot(parkingLot25);
        parkingLot25.setDisabled(false);
        parkingSpace5.setParkingLot(parkingLot25);
        parkingLot25.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        booking8.setStartTime((-970));
        java.lang.Class<?> wildcardClass27 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        booking8.setLicense("hi!");
        template.User user21 = null;
        booking8.setUser(user21);
        int int23 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        int int14 = booking8.getId();
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        java.lang.String str16 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int61 = booking8.getTotalCost((int) (short) 0, (int) (byte) 0, (int) 'a');
        booking8.setLicense("");
        observer.ParkingSpace parkingSpace64 = booking8.getParkingSpace();
        observer.ParkingSpace parkingSpace65 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertNotNull(parkingSpace65);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        boolean boolean4 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        boolean boolean6 = parkingSpace0.isDisabled();
        parkingSpace0.setId(6500);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        factory.PaymentOption paymentOption19 = null;
        booking8.setPaymentOption(paymentOption19);
        booking8.setId(1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        boolean boolean20 = parkingSpace18.isDisabled();
        int int21 = parkingSpace18.getId();
        parkingSpace18.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        parkingLot20.setLocation("hi!");
        template.User user56 = null;
        observer.ParkingLot parkingLot57 = null;
        observer.ParkingSpace parkingSpace58 = null;
        factory.PaymentOption paymentOption61 = null;
        observer.Booking booking63 = new observer.Booking(1, user56, parkingLot57, parkingSpace58, (int) 'a', (int) 'a', paymentOption61, "");
        booking63.setId((int) ' ');
        template.User user67 = null;
        observer.ParkingLot parkingLot71 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace72 = new observer.ParkingSpace();
        parkingSpace72.setDisabled(true);
        boolean boolean75 = parkingSpace72.isTaken();
        factory.PaymentOption paymentOption78 = null;
        observer.Booking booking80 = new observer.Booking(100, user67, parkingLot71, parkingSpace72, (int) (byte) 1, (int) (short) 0, paymentOption78, "");
        observer.ParkingSpace[] parkingSpaceArray81 = parkingLot71.getSpaces();
        parkingLot71.setId(5148);
        booking63.setParkingLot(parkingLot71);
        int int85 = parkingLot71.getId();
        observer.ParkingSpace[] parkingSpaceArray86 = parkingLot71.getSpaces();
        parkingLot20.setSpaces(parkingSpaceArray86);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5148 + "'", int85 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray86);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        parkingSpace0.setParkingLot(parkingLot13);
        int int25 = parkingLot13.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        boolean boolean20 = parkingSpace18.isDisabled();
        int int21 = parkingSpace18.getId();
        java.lang.String str22 = parkingSpace18.getLocation();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = parkingSpace18.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        factory.PaymentOption paymentOption20 = null;
        booking8.setPaymentOption(paymentOption20);
        int int25 = booking8.getTotalCost(5148, (-70), (int) ' ');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-166976) + "'", int25 == (-166976));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        parkingSpace24.setParkingLot(parkingLot44);
        boolean boolean47 = parkingSpace24.isDisabled();
        boolean boolean48 = parkingSpace24.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        parkingLot5.setId((-990));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        booking8.setEndTime(22);
        int int27 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        boolean boolean4 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        java.lang.String str6 = parkingSpace0.getLocation();
        boolean boolean7 = parkingSpace0.isTaken();
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isDisabled();
        parkingSpace19.setTaken(true);
        java.lang.String str23 = parkingSpace19.getLocation();
        boolean boolean24 = parkingSpace19.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        booking8.setStartTime((int) (short) 100);
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        int int27 = booking8.getTotalCost((int) '4', (-990), (int) '#');
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-36470) + "'", int27 == (-36470));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        int int9 = parkingLot7.getId();
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot7);
        boolean boolean11 = parkingSpace10.isDisabled();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        booking8.setEndTime(22);
        java.lang.Class<?> wildcardClass18 = booking8.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        parkingSpace18.setDisabled(true);
        java.lang.String str21 = parkingSpace18.getLocation();
        observer.ParkingLot parkingLot22 = null;
        parkingSpace18.setParkingLot(parkingLot22);
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking((int) (short) 0, user16, parkingLot17, parkingSpace18, 5148, (int) (short) 100, paymentOption26, "");
        int int29 = parkingSpace18.getId();
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingSpace[] parkingSpaceArray45 = parkingLot35.getSpaces();
        parkingLot35.setId((int) 'a');
        template.User user49 = null;
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace54 = new observer.ParkingSpace();
        parkingSpace54.setDisabled(true);
        boolean boolean57 = parkingSpace54.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking(100, user49, parkingLot53, parkingSpace54, (int) (byte) 1, (int) (short) 0, paymentOption60, "");
        boolean boolean63 = parkingLot53.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray64 = new observer.ParkingSpace[] {};
        parkingLot53.setSpaces(parkingSpaceArray64);
        parkingLot35.setSpaces(parkingSpaceArray64);
        parkingSpace18.setParkingLot(parkingLot35);
        parkingLot35.setLocation("hi!");
        parkingSpace3.setParkingLot(parkingLot35);
        java.lang.Class<?> wildcardClass71 = parkingLot35.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray64);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray64, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        parkingLot7.setDisabled(false);
        parkingLot7.setDisabled(false);
        int int50 = parkingLot7.getId();
        java.lang.String str51 = parkingLot7.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot18.getSpaces();
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        boolean boolean30 = parkingSpace27.isTaken();
        factory.PaymentOption paymentOption33 = null;
        observer.Booking booking35 = new observer.Booking(100, user22, parkingLot26, parkingSpace27, (int) (byte) 1, (int) (short) 0, paymentOption33, "");
        observer.ParkingLot parkingLot39 = new observer.ParkingLot(0, false, "");
        parkingSpace27.setParkingLot(parkingLot39);
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot39.getSpaces();
        parkingLot18.setSpaces(parkingSpaceArray41);
        java.lang.String str43 = parkingLot18.getLocation();
        int int44 = parkingLot18.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        int int14 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        int int23 = booking8.getTotalCost((int) (byte) 10, 0, 97);
        observer.ParkingLot parkingLot24 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-970) + "'", int23 == (-970));
        org.junit.Assert.assertNull(parkingLot24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getId();
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(paymentOption19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        parkingSpace0.setParkingLot(parkingLot13);
        int int25 = parkingSpace0.getId();
        parkingSpace0.setTaken(true);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingSpace[] parkingSpaceArray43 = parkingLot33.getSpaces();
        parkingLot33.setId(5148);
        parkingLot33.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot33.getSpaces();
        parkingSpace0.setParkingLot(parkingLot33);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray43);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        booking8.setEndTime(22);
        booking8.setId(870);
        observer.ParkingSpace parkingSpace29 = booking8.getParkingSpace();
        parkingSpace29.setId(97);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace29);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        booking8.setId(32);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        template.User user20 = null;
        observer.ParkingLot parkingLot21 = null;
        observer.ParkingSpace parkingSpace22 = null;
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(1, user20, parkingLot21, parkingSpace22, (int) 'a', (int) 'a', paymentOption25, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        observer.ParkingLot parkingLot31 = parkingSpace28.getParkingLot();
        booking27.setParkingSpace(parkingSpace28);
        booking27.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace();
        booking27.setParkingSpace(parkingSpace35);
        java.lang.String str37 = booking27.getLicense();
        observer.ParkingSpace parkingSpace38 = booking27.getParkingSpace();
        template.User user39 = booking27.getUser();
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        observer.ParkingLot parkingLot43 = parkingSpace40.getParkingLot();
        boolean boolean44 = parkingSpace40.isDisabled();
        booking27.setParkingSpace(parkingSpace40);
        java.lang.String str46 = parkingSpace40.getLocation();
        parkingSpace40.setDisabled(false);
        booking8.setParkingSpace(parkingSpace40);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertNull(parkingLot31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(parkingLot43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption13 = booking8.getPaymentOption();
        booking8.setEndTime((int) (byte) 10);
        factory.PaymentOption paymentOption16 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertNull(paymentOption16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        template.User user51 = null;
        observer.ParkingLot parkingLot55 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace();
        parkingSpace56.setDisabled(true);
        boolean boolean59 = parkingSpace56.isTaken();
        factory.PaymentOption paymentOption62 = null;
        observer.Booking booking64 = new observer.Booking(100, user51, parkingLot55, parkingSpace56, (int) (byte) 1, (int) (short) 0, paymentOption62, "");
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        parkingSpace56.setParkingLot(parkingLot68);
        boolean boolean70 = parkingSpace56.isTaken();
        factory.PaymentOption paymentOption73 = null;
        observer.Booking booking75 = new observer.Booking(0, user1, parkingLot46, parkingSpace56, (-100), 6500, paymentOption73, "hi!");
        int int76 = parkingSpace56.getId();
        observer.ParkingLot parkingLot77 = parkingSpace56.getParkingLot();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(parkingLot77);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int58 = parkingSpace46.getId();
        java.lang.String str59 = parkingSpace46.getLocation();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot18.getSpaces();
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        boolean boolean30 = parkingSpace27.isTaken();
        factory.PaymentOption paymentOption33 = null;
        observer.Booking booking35 = new observer.Booking(100, user22, parkingLot26, parkingSpace27, (int) (byte) 1, (int) (short) 0, paymentOption33, "");
        observer.ParkingLot parkingLot39 = new observer.ParkingLot(0, false, "");
        parkingSpace27.setParkingLot(parkingLot39);
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot39.getSpaces();
        parkingLot18.setSpaces(parkingSpaceArray41);
        parkingLot18.setId(52);
        observer.ParkingSpace[] parkingSpaceArray45 = parkingLot18.getSpaces();
        int int46 = parkingLot18.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        observer.ParkingLot parkingLot68 = booking61.getParkingLot();
        template.User user69 = booking61.getUser();
        booking61.setStartTime(6500);
        factory.PaymentOption paymentOption72 = null;
        booking61.setPaymentOption(paymentOption72);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(parkingLot68);
        org.junit.Assert.assertNull(user69);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot12);
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(0, user3, parkingLot7, parkingSpace13, (int) (short) -1, (int) (byte) 0, paymentOption16, "hi!");
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        boolean boolean28 = parkingSpace25.isTaken();
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(100, user20, parkingLot24, parkingSpace25, (int) (byte) 1, (int) (short) 0, paymentOption31, "");
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot24.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray34);
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        java.lang.String str39 = parkingSpace36.getLocation();
        parkingSpace36.setDisabled(false);
        observer.ParkingLot parkingLot42 = parkingSpace36.getParkingLot();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (short) 10, user1, parkingLot7, parkingSpace36, (int) (short) -1, 32, paymentOption45, "");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot7.getSpaces();
        java.lang.String str49 = parkingLot7.getLocation();
        parkingLot7.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int13 = booking8.getId();
        booking8.setStartTime((int) (byte) 100);
        java.lang.String str16 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str19 = parkingLot18.getLocation();
        parkingSpace3.setParkingLot(parkingLot18);
        parkingLot18.setLocation("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        boolean boolean15 = parkingSpace3.isTaken();
        boolean boolean16 = parkingSpace3.isDisabled();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = parkingSpace3.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        template.User user44 = booking43.getUser();
        observer.ParkingLot parkingLot45 = booking43.getParkingLot();
        observer.ParkingLot parkingLot49 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        java.lang.String str54 = parkingLot53.getLocation();
        observer.ParkingSpace[] parkingSpaceArray55 = parkingLot53.getSpaces();
        parkingLot49.setSpaces(parkingSpaceArray55);
        parkingLot45.setSpaces(parkingSpaceArray55);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNotNull(parkingLot45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray55);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-6298500), false, "");
        boolean boolean4 = parkingLot3.isDisabled();
        parkingLot3.setId(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        int int19 = booking8.getTotalCost((int) (byte) 0, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "");
        parkingLot3.setId((int) 'a');
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        parkingSpace0.setDisabled(true);
        parkingSpace0.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        observer.ParkingLot parkingLot15 = booking8.getParkingLot();
        int int16 = booking8.getId();
        factory.PaymentOption paymentOption17 = null;
        booking8.setPaymentOption(paymentOption17);
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot7.getSpaces();
        int int47 = parkingLot7.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        boolean boolean4 = parkingLot3.isDisabled();
        parkingLot3.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        java.lang.String str17 = booking8.getLicense();
        template.User user19 = null;
        observer.ParkingLot parkingLot20 = null;
        observer.ParkingSpace parkingSpace21 = null;
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking(1, user19, parkingLot20, parkingSpace21, (int) 'a', (int) 'a', paymentOption24, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        observer.ParkingLot parkingLot30 = parkingSpace27.getParkingLot();
        booking26.setParkingSpace(parkingSpace27);
        booking26.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        booking26.setParkingSpace(parkingSpace34);
        java.lang.String str36 = booking26.getLicense();
        observer.ParkingSpace parkingSpace37 = booking26.getParkingSpace();
        booking8.setParkingSpace(parkingSpace37);
        java.lang.Class<?> wildcardClass39 = parkingSpace37.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        java.lang.String str19 = booking8.getLicense();
        java.lang.String str20 = booking8.getLicense();
        booking8.setId(10);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setDisabled(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        boolean boolean3 = parkingSpace0.isTaken();
        boolean boolean4 = parkingSpace0.isDisabled();
        boolean boolean5 = parkingSpace0.isDisabled();
        boolean boolean6 = parkingSpace0.isDisabled();
        template.User user8 = null;
        observer.ParkingLot parkingLot9 = null;
        observer.ParkingSpace parkingSpace10 = null;
        factory.PaymentOption paymentOption13 = null;
        observer.Booking booking15 = new observer.Booking(1, user8, parkingLot9, parkingSpace10, (int) 'a', (int) 'a', paymentOption13, "");
        booking15.setId((int) ' ');
        template.User user19 = null;
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        parkingSpace24.setDisabled(true);
        boolean boolean27 = parkingSpace24.isTaken();
        factory.PaymentOption paymentOption30 = null;
        observer.Booking booking32 = new observer.Booking(100, user19, parkingLot23, parkingSpace24, (int) (byte) 1, (int) (short) 0, paymentOption30, "");
        observer.ParkingSpace[] parkingSpaceArray33 = parkingLot23.getSpaces();
        parkingLot23.setId(5148);
        booking15.setParkingLot(parkingLot23);
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot23.getSpaces();
        parkingSpace0.setParkingLot(parkingLot23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        int int54 = parkingSpace3.getId();
        boolean boolean55 = parkingSpace3.isDisabled();
        parkingSpace3.setTaken(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        boolean boolean31 = parkingLot21.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray32 = new observer.ParkingSpace[] {};
        parkingLot21.setSpaces(parkingSpaceArray32);
        parkingLot21.setDisabled(false);
        booking8.setParkingLot(parkingLot21);
        factory.PaymentOption paymentOption37 = null;
        booking8.setPaymentOption(paymentOption37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        observer.ParkingSpace parkingSpace4 = new observer.ParkingSpace();
        parkingSpace4.setDisabled(true);
        java.lang.String str7 = parkingSpace4.getLocation();
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot13.getSpaces();
        parkingLot13.setId(5148);
        parkingLot13.setLocation("hi!");
        parkingSpace4.setParkingLot(parkingLot13);
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace((int) (short) 100, "", false, false, parkingLot13);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        booking8.setStartTime(1);
        int int20 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(5148, true, "");
        parkingLot7.setDisabled(true);
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace(0, "", false, true, parkingLot7);
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot14.getSpaces();
        parkingSpace10.setParkingLot(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        parkingLot22.setLocation("");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace(22, "hi!", false, true, parkingLot22);
        java.lang.String str27 = parkingSpace26.getLocation();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        java.lang.String str20 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        java.lang.String str8 = parkingSpace0.getLocation();
        parkingSpace0.setLocation("");
        observer.ParkingLot parkingLot11 = parkingSpace0.getParkingLot();
        observer.ParkingLot parkingLot12 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        booking8.setEndTime((-1));
        template.User user16 = null;
        booking8.setUser(user16);
        booking8.setLicense("hi!");
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        template.User user16 = null;
        booking8.setUser(user16);
        int int18 = booking8.getStartTime();
        int int19 = booking8.getEndTime();
        template.User user20 = null;
        booking8.setUser(user20);
        template.User user22 = booking8.getUser();
        booking8.setEndTime(90);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        boolean boolean19 = parkingLot9.isDisabled();
        parkingLot9.setLocation("");
        parkingLot9.setLocation("hi!");
        template.User user25 = null;
        observer.ParkingLot parkingLot29 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot34);
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(0, user25, parkingLot29, parkingSpace35, (int) (short) -1, (int) (byte) 0, paymentOption38, "hi!");
        template.User user42 = null;
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace47 = new observer.ParkingSpace();
        parkingSpace47.setDisabled(true);
        boolean boolean50 = parkingSpace47.isTaken();
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(100, user42, parkingLot46, parkingSpace47, (int) (byte) 1, (int) (short) 0, paymentOption53, "");
        observer.ParkingSpace[] parkingSpaceArray56 = parkingLot46.getSpaces();
        parkingLot29.setSpaces(parkingSpaceArray56);
        parkingLot9.setSpaces(parkingSpaceArray56);
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace((int) (byte) 0, "", true, false, parkingLot9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray56);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        boolean boolean20 = parkingLot18.isDisabled();
        java.lang.String str21 = parkingLot18.getLocation();
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot18.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        observer.ParkingSpace[] parkingSpaceArray5 = parkingLot3.getSpaces();
        parkingLot3.setDisabled(false);
        boolean boolean8 = parkingLot3.isDisabled();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', false, "hi!");
        observer.ParkingSpace[] parkingSpaceArray4 = parkingLot3.getSpaces();
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot14.getSpaces();
        parkingLot14.setId(5148);
        parkingLot14.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray29 = parkingLot14.getSpaces();
        observer.ParkingSpace parkingSpace30 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot14);
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot14.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray31);
        org.junit.Assert.assertNotNull(parkingSpaceArray4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot24 = parkingSpace21.getParkingLot();
        boolean boolean25 = parkingSpace21.isDisabled();
        booking8.setParkingSpace(parkingSpace21);
        java.lang.String str27 = parkingSpace21.getLocation();
        parkingSpace21.setLocation("hi!");
        observer.ParkingLot parkingLot30 = parkingSpace21.getParkingLot();
        parkingSpace21.setLocation("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = parkingSpace21.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(parkingLot30);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        int int11 = parkingLot9.getId();
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot16);
        parkingSpace17.setDisabled(true);
        parkingSpace17.setLocation("hi!");
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking((-100), user5, parkingLot9, parkingSpace17, (int) (byte) -1, (int) (short) 10, paymentOption24, "");
        observer.ParkingLot parkingLot30 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot30.getSpaces();
        parkingLot9.setSpaces(parkingSpaceArray31);
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot9);
        parkingSpace33.setLocation("hi!");
        parkingSpace33.setDisabled(false);
        observer.ParkingLot parkingLot38 = parkingSpace33.getParkingLot();
        template.User user40 = null;
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        java.lang.String str45 = parkingLot44.getLocation();
        parkingLot44.setId((int) ' ');
        parkingLot44.setDisabled(true);
        parkingLot44.setId((int) (short) -1);
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        boolean boolean55 = parkingSpace52.isTaken();
        boolean boolean56 = parkingSpace52.isDisabled();
        boolean boolean57 = parkingSpace52.isDisabled();
        parkingSpace52.setDisabled(false);
        factory.PaymentOption paymentOption62 = null;
        observer.Booking booking64 = new observer.Booking(1, user40, parkingLot44, parkingSpace52, 6500, 2146977336, paymentOption62, "");
        parkingSpace33.setParkingLot(parkingLot44);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
        org.junit.Assert.assertNotNull(parkingLot38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        int int20 = booking8.getTotalCost((-1), 870, 0);
        java.lang.String str21 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setId((int) (short) -1);
        parkingSpace0.setId(100);
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertNull(parkingLot5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        int int18 = booking8.getTotalCost(0, 629850000, 0);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        boolean boolean20 = parkingLot18.isDisabled();
        parkingLot18.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        int int33 = booking8.getTotalCost((-990), (int) (short) 0, 10);
        java.lang.String str34 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9900 + "'", int33 == 9900);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getStartTime();
        observer.ParkingLot parkingLot20 = booking8.getParkingLot();
        template.User user21 = null;
        booking8.setUser(user21);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(parkingLot20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        int int7 = parkingLot5.getId();
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot12);
        parkingSpace13.setDisabled(true);
        parkingSpace13.setLocation("hi!");
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking((-100), user1, parkingLot5, parkingSpace13, (int) (byte) -1, (int) (short) 10, paymentOption20, "");
        int int23 = booking22.getId();
        int int24 = booking22.getStartTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-100) + "'", int23 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        java.lang.String str62 = parkingLot61.getLocation();
        observer.ParkingSpace parkingSpace63 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot61);
        parkingLot61.setId((int) (short) 100);
        parkingLot61.setId(0);
        parkingSpace3.setParkingLot(parkingLot61);
        parkingLot61.setLocation("hi!");
        java.lang.Class<?> wildcardClass71 = parkingLot61.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingLot9.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(97);
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot18.getSpaces();
        parkingLot9.setSpaces(parkingSpaceArray31);
        java.lang.String str33 = parkingLot9.getLocation();
        template.User user35 = null;
        observer.ParkingLot parkingLot36 = null;
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        java.lang.String str40 = parkingSpace37.getLocation();
        observer.ParkingLot parkingLot41 = null;
        parkingSpace37.setParkingLot(parkingLot41);
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (short) 0, user35, parkingLot36, parkingSpace37, 5148, (int) (short) 100, paymentOption45, "");
        int int48 = parkingSpace37.getId();
        observer.ParkingLot parkingLot52 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str53 = parkingLot52.getLocation();
        parkingSpace37.setParkingLot(parkingLot52);
        observer.ParkingLot parkingLot55 = parkingSpace37.getParkingLot();
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking((int) '#', user5, parkingLot9, parkingSpace37, (int) (byte) -1, (int) (short) 1, paymentOption58, "hi!");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace(0, "", false, true, parkingLot9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(parkingLot55);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(90, true, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        int int71 = booking61.getTotalCost(16068, 32, (int) (byte) 0);
        int int72 = booking61.getStartTime();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot7);
        parkingLot7.setLocation("");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        booking8.setStartTime(629850000);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(100, false, "");
        parkingLot3.setDisabled(false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        booking8.setLicense("");
        booking8.setStartTime((int) (short) 100);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(paymentOption15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        parkingLot22.setLocation("");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace(22, "hi!", false, true, parkingLot22);
        parkingSpace26.setId((-166976));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        parkingLot5.setId((int) ' ');
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot14.getSpaces();
        parkingLot14.setId(97);
        observer.ParkingSpace[] parkingSpaceArray27 = parkingLot14.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray27);
        java.lang.String str29 = parkingLot5.getLocation();
        template.User user31 = null;
        observer.ParkingLot parkingLot32 = null;
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) (short) 0, user31, parkingLot32, parkingSpace33, 5148, (int) (short) 100, paymentOption41, "");
        int int44 = parkingSpace33.getId();
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str49 = parkingLot48.getLocation();
        parkingSpace33.setParkingLot(parkingLot48);
        observer.ParkingLot parkingLot51 = parkingSpace33.getParkingLot();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) '#', user1, parkingLot5, parkingSpace33, (int) (byte) -1, (int) (short) 1, paymentOption54, "hi!");
        boolean boolean57 = parkingSpace33.isDisabled();
        parkingSpace33.setId(22);
        java.lang.String str60 = parkingSpace33.getLocation();
        int int61 = parkingSpace33.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parkingLot51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 22 + "'", int61 == 22);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        int int23 = booking8.getTotalCost((int) (byte) 10, 0, 97);
        booking8.setLicense("hi!");
        template.User user26 = booking8.getUser();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-970) + "'", int23 == (-970));
        org.junit.Assert.assertNull(user26);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        parkingSpace16.setTaken(false);
        parkingSpace16.setTaken(false);
        parkingSpace16.setTaken(false);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        boolean boolean7 = parkingSpace5.isTaken();
        parkingSpace5.setId((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        factory.PaymentOption paymentOption18 = booking8.getPaymentOption();
        template.User user19 = booking8.getUser();
        booking8.setEndTime((int) (byte) 100);
        factory.PaymentOption paymentOption22 = null;
        booking8.setPaymentOption(paymentOption22);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(paymentOption18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        int int54 = parkingSpace3.getId();
        java.lang.String str55 = parkingSpace3.getLocation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        int int19 = booking8.getId();
        template.User user20 = null;
        booking8.setUser(user20);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot12.getSpaces();
        parkingLot12.setId(97);
        observer.ParkingSpace[] parkingSpaceArray25 = parkingLot12.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray25);
        boolean boolean27 = parkingLot3.isDisabled();
        java.lang.Class<?> wildcardClass28 = parkingLot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        template.User user1 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot6);
        observer.ParkingLot parkingLot8 = parkingSpace7.getParkingLot();
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        parkingSpace15.setParkingLot(parkingLot27);
        parkingLot27.setDisabled(false);
        parkingSpace7.setParkingLot(parkingLot27);
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        java.lang.String str50 = booking40.getLicense();
        int int51 = booking40.getId();
        observer.ParkingSpace parkingSpace52 = booking40.getParkingSpace();
        factory.PaymentOption paymentOption55 = null;
        observer.Booking booking57 = new observer.Booking(10, user1, parkingLot27, parkingSpace52, (int) (byte) 0, 0, paymentOption55, "");
        template.User user58 = null;
        booking57.setUser(user58);
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        boolean boolean3 = parkingSpace0.isTaken();
        boolean boolean4 = parkingSpace0.isDisabled();
        parkingSpace0.setId((int) (short) 100);
        boolean boolean7 = parkingSpace0.isTaken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(paymentOption19);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        booking8.setLicense("hi!");
        booking8.setId(10);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        int int27 = booking8.getTotalCost((-6298500), (int) (short) 0, 100);
        booking8.setId(10);
        int int30 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 629850000 + "'", int27 == 629850000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        parkingSpace24.setParkingLot(parkingLot44);
        boolean boolean47 = parkingLot44.isDisabled();
        parkingLot44.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) 10);
        int int16 = booking8.getTotalCost(4838, (-970), 16068);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-93322944) + "'", int16 == (-93322944));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        template.User user18 = null;
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        boolean boolean26 = parkingSpace23.isTaken();
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(100, user18, parkingLot22, parkingSpace23, (int) (byte) 1, (int) (short) 0, paymentOption29, "");
        observer.ParkingSpace[] parkingSpaceArray32 = parkingLot22.getSpaces();
        parkingLot22.setId(5148);
        parkingLot22.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot22.getSpaces();
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot22);
        observer.ParkingSpace[] parkingSpaceArray39 = parkingLot22.getSpaces();
        booking8.setParkingLot(parkingLot22);
        int int44 = booking8.getTotalCost(5148, 310, (-1));
        factory.PaymentOption paymentOption45 = booking8.getPaymentOption();
        int int46 = booking8.getId();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertNotNull(parkingSpaceArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4838 + "'", int44 == 4838);
        org.junit.Assert.assertNull(paymentOption45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        booking8.setEndTime(22);
        template.User user19 = null;
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime(0);
        factory.PaymentOption paymentOption36 = null;
        booking28.setPaymentOption(paymentOption36);
        observer.ParkingSpace parkingSpace38 = booking28.getParkingSpace();
        observer.ParkingLot parkingLot43 = null;
        observer.ParkingSpace parkingSpace44 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot43);
        booking28.setParkingSpace(parkingSpace44);
        template.User user47 = null;
        observer.ParkingLot parkingLot51 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        boolean boolean55 = parkingSpace52.isTaken();
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(100, user47, parkingLot51, parkingSpace52, (int) (byte) 1, (int) (short) 0, paymentOption58, "");
        observer.ParkingLot parkingLot64 = new observer.ParkingLot(0, false, "");
        parkingSpace52.setParkingLot(parkingLot64);
        parkingSpace44.setParkingLot(parkingLot64);
        boolean boolean67 = parkingLot64.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray68 = parkingLot64.getSpaces();
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        java.lang.String str72 = parkingSpace69.getLocation();
        parkingSpace69.setDisabled(false);
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking((int) (byte) -1, user19, parkingLot64, parkingSpace69, (int) (short) 1, (int) (byte) 0, paymentOption77, "hi!");
        int int80 = parkingLot64.getId();
        booking8.setParkingLot(parkingLot64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray68);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot7.getSpaces();
        int int21 = parkingLot7.getId();
        template.User user23 = null;
        observer.ParkingLot parkingLot24 = null;
        observer.ParkingSpace parkingSpace25 = null;
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(1, user23, parkingLot24, parkingSpace25, (int) 'a', (int) 'a', paymentOption28, "");
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace();
        parkingSpace31.setDisabled(true);
        observer.ParkingLot parkingLot34 = parkingSpace31.getParkingLot();
        booking30.setParkingSpace(parkingSpace31);
        booking30.setEndTime(0);
        factory.PaymentOption paymentOption38 = null;
        booking30.setPaymentOption(paymentOption38);
        observer.ParkingSpace parkingSpace40 = booking30.getParkingSpace();
        int int41 = parkingSpace40.getId();
        factory.PaymentOption paymentOption44 = null;
        observer.Booking booking46 = new observer.Booking(0, user1, parkingLot7, parkingSpace40, 5148, 100, paymentOption44, "");
        java.lang.String str47 = parkingSpace40.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5148 + "'", int21 == 5148);
        org.junit.Assert.assertNull(parkingLot34);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        parkingSpace51.setTaken(true);
        parkingSpace51.setTaken(true);
        boolean boolean66 = parkingSpace51.isTaken();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        booking8.setLicense("");
        int int16 = booking8.getTotalCost((-70), 310, (-36470));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-13858600) + "'", int16 == (-13858600));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        parkingSpace24.setParkingLot(parkingLot44);
        boolean boolean47 = parkingLot44.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot44.getSpaces();
        java.lang.String str49 = parkingLot44.getLocation();
        boolean boolean50 = parkingLot44.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        int int62 = booking61.getEndTime();
        int int63 = booking61.getStartTime();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        observer.ParkingSpace[] parkingSpaceArray40 = parkingLot38.getSpaces();
        booking8.setParkingLot(parkingLot38);
        booking8.setEndTime((int) '#');
        observer.ParkingSpace parkingSpace44 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray40);
        org.junit.Assert.assertNull(parkingSpace44);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        template.User user1 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot6);
        observer.ParkingLot parkingLot8 = parkingSpace7.getParkingLot();
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        parkingSpace15.setParkingLot(parkingLot27);
        parkingLot27.setDisabled(false);
        parkingSpace7.setParkingLot(parkingLot27);
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        java.lang.String str50 = booking40.getLicense();
        int int51 = booking40.getId();
        observer.ParkingSpace parkingSpace52 = booking40.getParkingSpace();
        factory.PaymentOption paymentOption55 = null;
        observer.Booking booking57 = new observer.Booking(10, user1, parkingLot27, parkingSpace52, (int) (byte) 0, 0, paymentOption55, "");
        int int58 = parkingSpace52.getId();
        // The following exception was thrown during execution in test generation
        try {
            int int59 = parkingSpace52.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        template.User user11 = null;
        booking10.setUser(user11);
        int int16 = booking10.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str17 = booking10.getLicense();
        booking10.setEndTime(1);
        factory.PaymentOption paymentOption20 = null;
        booking10.setPaymentOption(paymentOption20);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        boolean boolean31 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(100, user23, parkingLot27, parkingSpace28, (int) (byte) 1, (int) (short) 0, paymentOption34, "");
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        parkingSpace28.setParkingLot(parkingLot40);
        observer.ParkingSpace[] parkingSpaceArray42 = parkingLot40.getSpaces();
        booking10.setParkingLot(parkingLot40);
        observer.ParkingSpace parkingSpace44 = new observer.ParkingSpace();
        boolean boolean45 = parkingSpace44.isDisabled();
        parkingSpace44.setDisabled(true);
        parkingSpace44.setId(10);
        parkingSpace44.setId(0);
        parkingSpace44.setDisabled(true);
        factory.PaymentOption paymentOption56 = null;
        observer.Booking booking58 = new observer.Booking((int) '4', user1, parkingLot40, parkingSpace44, (int) '#', 97, paymentOption56, "hi!");
        int int62 = booking58.getTotalCost((int) (short) -1, (int) (byte) -1, (-6298500));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        boolean boolean4 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        boolean boolean6 = parkingSpace0.isTaken();
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        int int15 = booking14.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isDisabled();
        parkingSpace19.setTaken(false);
        template.User user24 = null;
        observer.ParkingLot parkingLot28 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        boolean boolean32 = parkingSpace29.isTaken();
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(100, user24, parkingLot28, parkingSpace29, (int) (byte) 1, (int) (short) 0, paymentOption35, "");
        boolean boolean38 = parkingLot28.isDisabled();
        parkingLot28.setLocation("");
        parkingLot28.setLocation("hi!");
        parkingSpace19.setParkingLot(parkingLot28);
        parkingSpace19.setTaken(true);
        java.lang.String str46 = parkingSpace19.getLocation();
        parkingSpace19.setDisabled(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        observer.ParkingSpace parkingSpace25 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        java.lang.String str27 = parkingSpace25.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        parkingSpace0.setParkingLot(parkingLot9);
        parkingSpace0.setDisabled(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId((int) (short) 1);
        int int13 = booking8.getStartTime();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId((int) (short) 1);
        booking8.setId((int) ' ');
        factory.PaymentOption paymentOption15 = null;
        booking8.setPaymentOption(paymentOption15);
        template.User user17 = booking8.getUser();
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        factory.PaymentOption paymentOption19 = null;
        booking8.setPaymentOption(paymentOption19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(parkingLot18);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot24 = null;
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot24);
        parkingSpace25.setDisabled(false);
        boolean boolean28 = parkingSpace25.isDisabled();
        observer.ParkingLot parkingLot29 = parkingSpace25.getParkingLot();
        booking8.setParkingSpace(parkingSpace25);
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot38);
        booking8.setParkingLot(parkingLot38);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(parkingLot29);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        parkingSpace18.setLocation("");
        boolean boolean21 = parkingSpace18.isDisabled();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = parkingSpace18.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        booking8.setLicense("hi!");
        booking8.setId(10);
        template.User user24 = null;
        template.User user26 = null;
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = null;
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(1, user26, parkingLot27, parkingSpace28, (int) 'a', (int) 'a', paymentOption31, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        observer.ParkingLot parkingLot37 = parkingSpace34.getParkingLot();
        booking33.setParkingSpace(parkingSpace34);
        booking33.setEndTime(0);
        factory.PaymentOption paymentOption41 = null;
        booking33.setPaymentOption(paymentOption41);
        observer.ParkingSpace parkingSpace43 = booking33.getParkingSpace();
        observer.ParkingLot parkingLot48 = null;
        observer.ParkingSpace parkingSpace49 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot48);
        booking33.setParkingSpace(parkingSpace49);
        template.User user52 = null;
        observer.ParkingLot parkingLot56 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace();
        parkingSpace57.setDisabled(true);
        boolean boolean60 = parkingSpace57.isTaken();
        factory.PaymentOption paymentOption63 = null;
        observer.Booking booking65 = new observer.Booking(100, user52, parkingLot56, parkingSpace57, (int) (byte) 1, (int) (short) 0, paymentOption63, "");
        observer.ParkingLot parkingLot69 = new observer.ParkingLot(0, false, "");
        parkingSpace57.setParkingLot(parkingLot69);
        parkingSpace49.setParkingLot(parkingLot69);
        boolean boolean72 = parkingLot69.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray73 = parkingLot69.getSpaces();
        observer.ParkingSpace parkingSpace74 = new observer.ParkingSpace();
        parkingSpace74.setDisabled(true);
        java.lang.String str77 = parkingSpace74.getLocation();
        parkingSpace74.setDisabled(false);
        factory.PaymentOption paymentOption82 = null;
        observer.Booking booking84 = new observer.Booking((int) (byte) -1, user24, parkingLot69, parkingSpace74, (int) (short) 1, (int) (byte) 0, paymentOption82, "hi!");
        parkingSpace74.setTaken(true);
        booking8.setParkingSpace(parkingSpace74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertNotNull(parkingSpace43);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray73);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        booking8.setStartTime((int) (short) 100);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        parkingSpace23.setDisabled(true);
        parkingSpace23.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(parkingSpace23);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        observer.ParkingLot parkingLot68 = booking61.getParkingLot();
        template.User user69 = booking61.getUser();
        factory.PaymentOption paymentOption70 = booking61.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(parkingLot68);
        org.junit.Assert.assertNull(user69);
        org.junit.Assert.assertNull(paymentOption70);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        parkingLot5.setId((int) ' ');
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot14.getSpaces();
        parkingLot14.setId(97);
        observer.ParkingSpace[] parkingSpaceArray27 = parkingLot14.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray27);
        java.lang.String str29 = parkingLot5.getLocation();
        template.User user31 = null;
        observer.ParkingLot parkingLot32 = null;
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) (short) 0, user31, parkingLot32, parkingSpace33, 5148, (int) (short) 100, paymentOption41, "");
        int int44 = parkingSpace33.getId();
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str49 = parkingLot48.getLocation();
        parkingSpace33.setParkingLot(parkingLot48);
        observer.ParkingLot parkingLot51 = parkingSpace33.getParkingLot();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) '#', user1, parkingLot5, parkingSpace33, (int) (byte) -1, (int) (short) 1, paymentOption54, "hi!");
        boolean boolean57 = parkingSpace33.isDisabled();
        boolean boolean58 = parkingSpace33.isTaken();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parkingLot51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        template.User user44 = booking43.getUser();
        observer.ParkingLot parkingLot45 = booking43.getParkingLot();
        java.lang.String str46 = parkingLot45.getLocation();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNotNull(parkingLot45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        parkingSpace62.setLocation("");
        parkingSpace62.setTaken(false);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        boolean boolean4 = parkingSpace0.isTaken();
        parkingSpace0.setTaken(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 0, true, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(5148);
        parkingLot7.setLocation("hi!");
        observer.ParkingLot parkingLot29 = new observer.ParkingLot(0, false, "");
        java.lang.String str30 = parkingLot29.getLocation();
        int int31 = parkingLot29.getId();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot29);
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(10, user1, parkingLot7, parkingSpace32, (int) '#', 6500, paymentOption35, "hi!");
        boolean boolean38 = parkingSpace32.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        observer.ParkingSpace[] parkingSpaceArray11 = parkingLot9.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray11);
        boolean boolean13 = parkingLot5.isDisabled();
        parkingLot5.setId(0);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        boolean boolean35 = parkingLot25.isDisabled();
        java.lang.String str36 = parkingLot25.getLocation();
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace(1100, "hi!", false, false, parkingLot25);
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(629850000, user1, parkingLot5, parkingSpace37, (int) (short) -1, (int) ' ', paymentOption40, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        template.User user5 = null;
        template.User user7 = null;
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot13.getSpaces();
        parkingLot13.setId(97);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        boolean boolean46 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking((int) (byte) 1, user7, parkingLot13, parkingSpace32, (int) (byte) 100, 22, paymentOption49, "");
        observer.ParkingLot parkingLot59 = new observer.ParkingLot(5148, true, "");
        parkingLot59.setDisabled(true);
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace(0, "", false, true, parkingLot59);
        factory.PaymentOption paymentOption65 = null;
        observer.Booking booking67 = new observer.Booking(1, user5, parkingLot13, parkingSpace62, (-9), (int) (short) 1, paymentOption65, "hi!");
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace(90, "hi!", true, false, parkingLot13);
        java.lang.String str69 = parkingLot13.getLocation();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isDisabled();
        parkingSpace19.setTaken(true);
        boolean boolean23 = parkingSpace19.isTaken();
        parkingSpace19.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(5148, true, "hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        java.lang.String str25 = booking8.getLicense();
        java.lang.Class<?> wildcardClass26 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        parkingLot22.setLocation("");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace(22, "hi!", false, true, parkingLot22);
        parkingSpace26.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        template.User user1 = null;
        observer.ParkingSpace parkingSpace2 = new observer.ParkingSpace();
        parkingSpace2.setDisabled(true);
        java.lang.String str5 = parkingSpace2.getLocation();
        observer.ParkingLot parkingLot6 = null;
        parkingSpace2.setParkingLot(parkingLot6);
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        parkingSpace2.setParkingLot(parkingLot11);
        template.User user15 = null;
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = null;
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(1, user15, parkingLot16, parkingSpace17, (int) 'a', (int) 'a', paymentOption20, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        observer.ParkingLot parkingLot26 = parkingSpace23.getParkingLot();
        booking22.setParkingSpace(parkingSpace23);
        booking22.setEndTime(0);
        factory.PaymentOption paymentOption30 = null;
        booking22.setPaymentOption(paymentOption30);
        observer.ParkingSpace parkingSpace32 = booking22.getParkingSpace();
        parkingSpace32.setLocation("");
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking(100, user1, parkingLot11, parkingSpace32, (int) (byte) 1, 5148, paymentOption37, "hi!");
        int int40 = parkingSpace32.getId();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = parkingSpace32.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        booking8.setStartTime((int) '4');
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption23 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(paymentOption23);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        int int23 = booking8.getTotalCost((int) (byte) 10, 0, 97);
        booking8.setLicense("hi!");
        factory.PaymentOption paymentOption26 = null;
        booking8.setPaymentOption(paymentOption26);
        java.lang.String str28 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-970) + "'", int23 == (-970));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        observer.ParkingLot parkingLot15 = booking8.getParkingLot();
        int int16 = booking8.getId();
        int int17 = booking8.getStartTime();
        java.lang.String str18 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        template.User user18 = null;
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        boolean boolean26 = parkingSpace23.isTaken();
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(100, user18, parkingLot22, parkingSpace23, (int) (byte) 1, (int) (short) 0, paymentOption29, "");
        observer.ParkingSpace[] parkingSpaceArray32 = parkingLot22.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray32);
        parkingLot5.setLocation("hi!");
        int int36 = parkingLot5.getId();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        observer.ParkingSpace[] parkingSpaceArray7 = parkingLot3.getSpaces();
        java.lang.String str8 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        int int12 = booking8.getEndTime();
        booking8.setLicense("hi!");
        template.User user16 = null;
        template.User user18 = null;
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        boolean boolean28 = parkingSpace25.isTaken();
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(100, user20, parkingLot24, parkingSpace25, (int) (byte) 1, (int) (short) 0, paymentOption31, "");
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot24.getSpaces();
        parkingLot24.setId(97);
        template.User user38 = null;
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace();
        parkingSpace43.setDisabled(true);
        boolean boolean46 = parkingSpace43.isTaken();
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking(100, user38, parkingLot42, parkingSpace43, (int) (byte) 1, (int) (short) 0, paymentOption49, "");
        observer.ParkingLot parkingLot55 = new observer.ParkingLot(0, false, "");
        parkingSpace43.setParkingLot(parkingLot55);
        boolean boolean57 = parkingSpace43.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking((int) (byte) 1, user18, parkingLot24, parkingSpace43, (int) (byte) 100, 22, paymentOption60, "");
        observer.ParkingLot parkingLot70 = new observer.ParkingLot(5148, true, "");
        parkingLot70.setDisabled(true);
        observer.ParkingSpace parkingSpace73 = new observer.ParkingSpace(0, "", false, true, parkingLot70);
        factory.PaymentOption paymentOption76 = null;
        observer.Booking booking78 = new observer.Booking(1, user16, parkingLot24, parkingSpace73, (-9), (int) (short) 1, paymentOption76, "hi!");
        booking8.setParkingSpace(parkingSpace73);
        boolean boolean80 = parkingSpace73.isTaken();
        observer.ParkingLot parkingLot81 = parkingSpace73.getParkingLot();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(parkingLot81);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        observer.ParkingLot parkingLot22 = parkingSpace19.getParkingLot();
        boolean boolean23 = parkingSpace19.isDisabled();
        booking8.setParkingSpace(parkingSpace19);
        factory.PaymentOption paymentOption25 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertNull(parkingLot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(paymentOption25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        int int13 = parkingLot11.getId();
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot11);
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        java.lang.String str25 = parkingLot24.getLocation();
        int int26 = parkingLot24.getId();
        observer.ParkingLot parkingLot31 = null;
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot31);
        parkingSpace32.setDisabled(true);
        parkingSpace32.setLocation("hi!");
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking((-100), user20, parkingLot24, parkingSpace32, (int) (byte) -1, (int) (short) 10, paymentOption39, "");
        observer.ParkingLot parkingLot45 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot45.getSpaces();
        parkingLot24.setSpaces(parkingSpaceArray46);
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot24);
        parkingSpace48.setLocation("hi!");
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(32, user3, parkingLot11, parkingSpace48, 100, 10, paymentOption53, "hi!");
        observer.ParkingSpace parkingSpace56 = null;
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) '4', user1, parkingLot11, parkingSpace56, (-970), (-100), paymentOption59, "");
        java.lang.String str62 = parkingLot11.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        observer.ParkingLot parkingLot25 = booking8.getParkingLot();
        factory.PaymentOption paymentOption26 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot25);
        org.junit.Assert.assertNull(paymentOption26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        boolean boolean15 = parkingSpace3.isTaken();
        boolean boolean16 = parkingSpace3.isDisabled();
        int int17 = parkingSpace3.getId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot12);
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(0, user3, parkingLot7, parkingSpace13, (int) (short) -1, (int) (byte) 0, paymentOption16, "hi!");
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        boolean boolean28 = parkingSpace25.isTaken();
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(100, user20, parkingLot24, parkingSpace25, (int) (byte) 1, (int) (short) 0, paymentOption31, "");
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot24.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray34);
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        java.lang.String str39 = parkingSpace36.getLocation();
        parkingSpace36.setDisabled(false);
        observer.ParkingLot parkingLot42 = parkingSpace36.getParkingLot();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (short) 10, user1, parkingLot7, parkingSpace36, (int) (short) -1, 32, paymentOption45, "");
        observer.ParkingSpace[] parkingSpaceArray48 = null;
        parkingLot7.setSpaces(parkingSpaceArray48);
        parkingLot7.setId((-629847809));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        int int16 = booking8.getId();
        booking8.setEndTime(310);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(9900, true, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        int int14 = booking8.getId();
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        booking8.setLicense("");
        factory.PaymentOption paymentOption18 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(paymentOption18);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 0, true, "hi!");
        parkingLot3.setDisabled(false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        parkingLot9.setId((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot12.getSpaces();
        parkingLot12.setId(97);
        observer.ParkingSpace[] parkingSpaceArray25 = parkingLot12.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray25);
        java.lang.String str27 = parkingLot3.getLocation();
        parkingLot3.setDisabled(false);
        parkingLot3.setLocation("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace((int) 'a', "", false, false, parkingLot9);
        parkingLot9.setLocation("");
        template.User user26 = null;
        observer.ParkingLot parkingLot30 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace();
        parkingSpace31.setDisabled(true);
        boolean boolean34 = parkingSpace31.isTaken();
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking(100, user26, parkingLot30, parkingSpace31, (int) (byte) 1, (int) (short) 0, paymentOption37, "");
        observer.ParkingLot parkingLot43 = new observer.ParkingLot(0, false, "");
        parkingSpace31.setParkingLot(parkingLot43);
        observer.ParkingSpace[] parkingSpaceArray45 = parkingLot43.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot43.getSpaces();
        parkingLot9.setSpaces(parkingSpaceArray46);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isTaken();
        boolean boolean21 = parkingSpace19.isTaken();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = parkingSpace19.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        parkingSpace0.setDisabled(false);
        observer.ParkingLot parkingLot6 = parkingSpace0.getParkingLot();
        parkingSpace0.setId((int) (short) 1);
        parkingSpace0.setDisabled(false);
        int int11 = parkingSpace0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(5148);
        parkingLot7.setLocation("hi!");
        observer.ParkingLot parkingLot29 = new observer.ParkingLot(0, false, "");
        java.lang.String str30 = parkingLot29.getLocation();
        int int31 = parkingLot29.getId();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot29);
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(10, user1, parkingLot7, parkingSpace32, (int) '#', 6500, paymentOption35, "hi!");
        factory.PaymentOption paymentOption38 = null;
        booking37.setPaymentOption(paymentOption38);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        booking8.setStartTime(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        factory.PaymentOption paymentOption21 = null;
        booking8.setPaymentOption(paymentOption21);
        booking8.setEndTime(0);
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        booking8.setParkingSpace(parkingSpace25);
        template.User user30 = null;
        template.User user32 = null;
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot38.getSpaces();
        parkingLot38.setId(97);
        template.User user52 = null;
        observer.ParkingLot parkingLot56 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace();
        parkingSpace57.setDisabled(true);
        boolean boolean60 = parkingSpace57.isTaken();
        factory.PaymentOption paymentOption63 = null;
        observer.Booking booking65 = new observer.Booking(100, user52, parkingLot56, parkingSpace57, (int) (byte) 1, (int) (short) 0, paymentOption63, "");
        observer.ParkingLot parkingLot69 = new observer.ParkingLot(0, false, "");
        parkingSpace57.setParkingLot(parkingLot69);
        boolean boolean71 = parkingSpace57.isTaken();
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking((int) (byte) 1, user32, parkingLot38, parkingSpace57, (int) (byte) 100, 22, paymentOption74, "");
        observer.ParkingLot parkingLot84 = new observer.ParkingLot(5148, true, "");
        parkingLot84.setDisabled(true);
        observer.ParkingSpace parkingSpace87 = new observer.ParkingSpace(0, "", false, true, parkingLot84);
        factory.PaymentOption paymentOption90 = null;
        observer.Booking booking92 = new observer.Booking(1, user30, parkingLot38, parkingSpace87, (-9), (int) (short) 1, paymentOption90, "hi!");
        int int93 = parkingSpace87.getLotID();
        booking8.setParkingSpace(parkingSpace87);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 5148 + "'", int93 == 5148);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        int int15 = booking8.getTotalCost((-1), (int) (short) 0, 32);
        booking8.setEndTime(0);
        java.lang.Class<?> wildcardClass18 = booking8.getClass();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        observer.ParkingLot parkingLot22 = parkingSpace19.getParkingLot();
        boolean boolean23 = parkingSpace19.isDisabled();
        observer.ParkingLot parkingLot24 = parkingSpace19.getParkingLot();
        boolean boolean25 = parkingSpace19.isDisabled();
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        java.lang.String str36 = parkingLot35.getLocation();
        int int37 = parkingLot35.getId();
        observer.ParkingLot parkingLot42 = null;
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot42);
        parkingSpace43.setDisabled(true);
        parkingSpace43.setLocation("hi!");
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking((-100), user31, parkingLot35, parkingSpace43, (int) (byte) -1, (int) (short) 10, paymentOption50, "");
        observer.ParkingLot parkingLot56 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray57 = parkingLot56.getSpaces();
        parkingLot35.setSpaces(parkingSpaceArray57);
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot35);
        parkingLot35.setDisabled(false);
        int int62 = parkingLot35.getId();
        parkingSpace19.setParkingLot(parkingLot35);
        booking8.setParkingLot(parkingLot35);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(parkingLot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        booking8.setId(97);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        boolean boolean15 = parkingLot5.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray16 = new observer.ParkingSpace[] {};
        parkingLot5.setSpaces(parkingSpaceArray16);
        parkingLot5.setDisabled(false);
        parkingLot5.setId((int) (byte) 0);
        parkingLot5.setDisabled(true);
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str28 = parkingLot27.getLocation();
        template.User user30 = null;
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace();
        parkingSpace35.setDisabled(true);
        boolean boolean38 = parkingSpace35.isTaken();
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(100, user30, parkingLot34, parkingSpace35, (int) (byte) 1, (int) (short) 0, paymentOption41, "");
        observer.ParkingSpace[] parkingSpaceArray44 = parkingLot34.getSpaces();
        parkingLot27.setSpaces(parkingSpaceArray44);
        parkingLot5.setSpaces(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray16, new observer.ParkingSpace[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        int int15 = parkingSpace6.getId();
        boolean boolean16 = parkingSpace6.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        parkingLot7.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(97);
        observer.ParkingSpace[] parkingSpaceArray29 = parkingLot16.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray29);
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot7.getSpaces();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((-70), "", false, true, parkingLot7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        int int19 = booking8.getId();
        template.User user20 = booking8.getUser();
        booking8.setId((int) '#');
        booking8.setId(0);
        int int25 = booking8.getStartTime();
        factory.PaymentOption paymentOption26 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNull(paymentOption26);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        booking8.setLicense("hi!");
        template.User user21 = booking8.getUser();
        observer.ParkingSpace parkingSpace22 = booking8.getParkingSpace();
        factory.PaymentOption paymentOption23 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNull(paymentOption23);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        boolean boolean18 = parkingSpace16.isTaken();
        parkingSpace16.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        booking8.setStartTime((-70));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        booking8.setEndTime(22);
        booking8.setLicense("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        parkingLot5.setId((int) ' ');
        parkingLot5.setDisabled(true);
        parkingLot5.setId((int) (short) -1);
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        boolean boolean17 = parkingSpace13.isDisabled();
        boolean boolean18 = parkingSpace13.isDisabled();
        parkingSpace13.setDisabled(false);
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user1, parkingLot5, parkingSpace13, 6500, 2146977336, paymentOption23, "");
        int int29 = booking25.getTotalCost(22, (int) (byte) 100, 9900);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 772200 + "'", int29 == 772200);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        template.User user15 = null;
        booking8.setUser(user15);
        int int17 = booking8.getStartTime();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user12 = null;
        observer.ParkingLot parkingLot16 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        boolean boolean20 = parkingSpace17.isTaken();
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(100, user12, parkingLot16, parkingSpace17, (int) (byte) 1, (int) (short) 0, paymentOption23, "");
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot16.getSpaces();
        parkingLot16.setId(5148);
        booking8.setParkingLot(parkingLot16);
        boolean boolean30 = parkingLot16.isDisabled();
        parkingLot16.setId((int) '#');
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot36.getSpaces();
        parkingLot16.setSpaces(parkingSpaceArray37);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        parkingLot7.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot7.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        java.lang.String str25 = booking8.getLicense();
        booking8.setId((-1));
        template.User user29 = null;
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace();
        parkingSpace31.setDisabled(true);
        java.lang.String str34 = parkingSpace31.getLocation();
        observer.ParkingLot parkingLot35 = null;
        parkingSpace31.setParkingLot(parkingLot35);
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking((int) (short) 0, user29, parkingLot30, parkingSpace31, 5148, (int) (short) 100, paymentOption39, "");
        int int42 = parkingSpace31.getId();
        booking8.setParkingSpace(parkingSpace31);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int61 = booking8.getTotalCost((int) (short) 0, (int) (byte) 0, (int) 'a');
        booking8.setLicense("");
        observer.ParkingSpace parkingSpace64 = booking8.getParkingSpace();
        java.lang.Class<?> wildcardClass65 = parkingSpace64.getClass();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        boolean boolean17 = parkingLot7.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray18 = new observer.ParkingSpace[] {};
        parkingLot7.setSpaces(parkingSpaceArray18);
        parkingLot7.setDisabled(false);
        parkingLot7.setId((int) (byte) 0);
        template.User user25 = null;
        observer.ParkingLot parkingLot26 = null;
        observer.ParkingSpace parkingSpace27 = null;
        factory.PaymentOption paymentOption30 = null;
        observer.Booking booking32 = new observer.Booking(1, user25, parkingLot26, parkingSpace27, (int) 'a', (int) 'a', paymentOption30, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        observer.ParkingLot parkingLot36 = parkingSpace33.getParkingLot();
        booking32.setParkingSpace(parkingSpace33);
        booking32.setEndTime(0);
        factory.PaymentOption paymentOption40 = null;
        booking32.setPaymentOption(paymentOption40);
        observer.ParkingSpace parkingSpace42 = booking32.getParkingSpace();
        observer.ParkingLot parkingLot47 = null;
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot47);
        booking32.setParkingSpace(parkingSpace48);
        int int50 = parkingSpace48.getId();
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking((int) '#', user1, parkingLot7, parkingSpace48, (int) '#', (-70), paymentOption53, "hi!");
        template.User user56 = booking55.getUser();
        template.User user57 = null;
        booking55.setUser(user57);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray18, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot36);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNull(user56);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        booking8.setStartTime((int) '4');
        template.User user22 = null;
        booking8.setUser(user22);
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        java.lang.String str28 = parkingLot27.getLocation();
        parkingLot27.setId((int) ' ');
        template.User user32 = null;
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        boolean boolean40 = parkingSpace37.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(100, user32, parkingLot36, parkingSpace37, (int) (byte) 1, (int) (short) 0, paymentOption43, "");
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot36.getSpaces();
        parkingLot36.setId(97);
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot36.getSpaces();
        parkingLot27.setSpaces(parkingSpaceArray49);
        java.lang.String str51 = parkingLot27.getLocation();
        parkingLot27.setDisabled(false);
        int int54 = parkingLot27.getId();
        booking8.setParkingLot(parkingLot27);
        template.User user56 = null;
        booking8.setUser(user56);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "hi!");
        java.lang.Class<?> wildcardClass4 = parkingLot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        observer.ParkingSpace parkingSpace11 = booking8.getParkingSpace();
        booking8.setId(140866);
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        int int7 = parkingLot5.getId();
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot12);
        parkingSpace13.setDisabled(true);
        parkingSpace13.setLocation("hi!");
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking((-100), user1, parkingLot5, parkingSpace13, (int) (byte) -1, (int) (short) 10, paymentOption20, "");
        template.User user23 = booking22.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        booking8.setStartTime((int) (short) 100);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        boolean boolean24 = parkingSpace23.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        observer.ParkingLot parkingLot11 = booking8.getParkingLot();
        int int12 = booking8.getStartTime();
        booking8.setId((int) (short) 0);
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(5148);
        parkingLot7.setLocation("hi!");
        observer.ParkingLot parkingLot29 = new observer.ParkingLot(0, false, "");
        java.lang.String str30 = parkingLot29.getLocation();
        int int31 = parkingLot29.getId();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot29);
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(10, user1, parkingLot7, parkingSpace32, (int) '#', 6500, paymentOption35, "hi!");
        observer.ParkingSpace parkingSpace38 = booking37.getParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingSpace38);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        java.lang.String str9 = parkingSpace8.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        observer.ParkingLot parkingLot46 = booking45.getParkingLot();
        booking45.setLicense("");
        factory.PaymentOption paymentOption49 = booking45.getPaymentOption();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingLot46);
        org.junit.Assert.assertNull(paymentOption49);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        observer.ParkingSpace[] parkingSpaceArray40 = parkingLot38.getSpaces();
        booking8.setParkingLot(parkingLot38);
        booking8.setId((-970));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray40);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        observer.ParkingLot parkingLot68 = booking61.getParkingLot();
        template.User user69 = booking61.getUser();
        booking61.setLicense("hi!");
        template.User user72 = null;
        booking61.setUser(user72);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(parkingLot68);
        org.junit.Assert.assertNull(user69);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        template.User user15 = null;
        booking8.setUser(user15);
        observer.ParkingLot parkingLot17 = booking8.getParkingLot();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(parkingLot17);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        boolean boolean68 = parkingSpace62.isTaken();
        parkingSpace62.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        int int16 = booking8.getStartTime();
        template.User user18 = null;
        observer.ParkingLot parkingLot19 = null;
        observer.ParkingSpace parkingSpace20 = null;
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user18, parkingLot19, parkingSpace20, (int) 'a', (int) 'a', paymentOption23, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        observer.ParkingLot parkingLot29 = parkingSpace26.getParkingLot();
        booking25.setParkingSpace(parkingSpace26);
        booking25.setEndTime(0);
        factory.PaymentOption paymentOption33 = null;
        booking25.setPaymentOption(paymentOption33);
        observer.ParkingSpace parkingSpace35 = booking25.getParkingSpace();
        int int36 = parkingSpace35.getId();
        boolean boolean37 = parkingSpace35.isDisabled();
        observer.ParkingLot parkingLot38 = parkingSpace35.getParkingLot();
        booking8.setParkingSpace(parkingSpace35);
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(parkingLot29);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(parkingLot38);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        template.User user1 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot6);
        observer.ParkingLot parkingLot8 = parkingSpace7.getParkingLot();
        template.User user10 = null;
        observer.ParkingLot parkingLot14 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        boolean boolean18 = parkingSpace15.isTaken();
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(100, user10, parkingLot14, parkingSpace15, (int) (byte) 1, (int) (short) 0, paymentOption21, "");
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        parkingSpace15.setParkingLot(parkingLot27);
        parkingLot27.setDisabled(false);
        parkingSpace7.setParkingLot(parkingLot27);
        template.User user33 = null;
        observer.ParkingLot parkingLot34 = null;
        observer.ParkingSpace parkingSpace35 = null;
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(1, user33, parkingLot34, parkingSpace35, (int) 'a', (int) 'a', paymentOption38, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        observer.ParkingLot parkingLot44 = parkingSpace41.getParkingLot();
        booking40.setParkingSpace(parkingSpace41);
        booking40.setEndTime(0);
        factory.PaymentOption paymentOption48 = null;
        booking40.setPaymentOption(paymentOption48);
        java.lang.String str50 = booking40.getLicense();
        int int51 = booking40.getId();
        observer.ParkingSpace parkingSpace52 = booking40.getParkingSpace();
        factory.PaymentOption paymentOption55 = null;
        observer.Booking booking57 = new observer.Booking(10, user1, parkingLot27, parkingSpace52, (int) (byte) 0, 0, paymentOption55, "");
        int int58 = parkingSpace52.getId();
        java.lang.String str59 = parkingSpace52.getLocation();
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot9.getSpaces();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot9);
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot9.getSpaces();
        boolean boolean27 = parkingLot9.isDisabled();
        parkingLot9.setLocation("");
        java.lang.String str30 = parkingLot9.getLocation();
        boolean boolean31 = parkingLot9.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getEndTime();
        int int22 = booking8.getTotalCost((-990), 10, 5148);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5148000 + "'", int22 == 5148000);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        parkingSpace8.setParkingLot(parkingLot20);
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot20.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot20.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot20.getSpaces();
        int int25 = parkingLot20.getId();
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot30);
        observer.ParkingLot parkingLot32 = parkingSpace31.getParkingLot();
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking((int) (short) -1, user1, parkingLot20, parkingSpace31, (-36470), 0, paymentOption35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(parkingLot32);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        int int24 = booking8.getEndTime();
        int int28 = booking8.getTotalCost(629847800, (-9), (int) (short) 1);
        observer.ParkingLot parkingLot29 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-629847809) + "'", int28 == (-629847809));
        org.junit.Assert.assertNull(parkingLot29);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setId(310);
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray13 = parkingLot12.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray13);
        parkingLot3.setId(629850000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        parkingSpace0.setParkingLot(parkingLot13);
        int int25 = parkingSpace0.getLotID();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        factory.PaymentOption paymentOption17 = null;
        booking8.setPaymentOption(paymentOption17);
        int int19 = booking8.getId();
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        java.lang.String str28 = parkingLot27.getLocation();
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot27);
        parkingLot27.setDisabled(false);
        booking8.setParkingLot(parkingLot27);
        java.lang.Class<?> wildcardClass33 = parkingLot27.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        java.lang.String str14 = booking8.getLicense();
        template.User user15 = booking8.getUser();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingLot parkingLot62 = parkingSpace51.getParkingLot();
        parkingSpace51.setId(0);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot62);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        parkingSpace0.setParkingLot(parkingLot9);
        parkingSpace0.setLocation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int61 = booking8.getTotalCost((int) (short) 0, (int) (byte) 0, (int) 'a');
        booking8.setLicense("");
        observer.ParkingSpace parkingSpace64 = booking8.getParkingSpace();
        int int65 = parkingSpace64.getId();
        boolean boolean66 = parkingSpace64.isDisabled();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setId((int) (short) -1);
        parkingSpace0.setTaken(false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        int int22 = booking8.getTotalCost((-100), (-970), (int) (short) -1);
        int int26 = booking8.getTotalCost(10, (int) (short) 1, (int) (short) 1);
        int int27 = booking8.getStartTime();
        booking8.setLicense("hi!");
        template.User user31 = null;
        observer.ParkingLot parkingLot32 = null;
        observer.ParkingSpace parkingSpace33 = null;
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking(1, user31, parkingLot32, parkingSpace33, (int) 'a', (int) 'a', paymentOption36, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        observer.ParkingLot parkingLot42 = parkingSpace39.getParkingLot();
        booking38.setParkingSpace(parkingSpace39);
        booking38.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        booking38.setParkingSpace(parkingSpace46);
        java.lang.String str48 = booking38.getLicense();
        observer.ParkingSpace parkingSpace49 = booking38.getParkingSpace();
        template.User user50 = booking38.getUser();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        observer.ParkingLot parkingLot54 = parkingSpace51.getParkingLot();
        boolean boolean55 = parkingSpace51.isDisabled();
        booking38.setParkingSpace(parkingSpace51);
        template.User user58 = null;
        observer.ParkingLot parkingLot62 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace63 = new observer.ParkingSpace();
        parkingSpace63.setDisabled(true);
        boolean boolean66 = parkingSpace63.isTaken();
        factory.PaymentOption paymentOption69 = null;
        observer.Booking booking71 = new observer.Booking(100, user58, parkingLot62, parkingSpace63, (int) (byte) 1, (int) (short) 0, paymentOption69, "");
        boolean boolean72 = parkingLot62.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray73 = new observer.ParkingSpace[] {};
        parkingLot62.setSpaces(parkingSpaceArray73);
        parkingLot62.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray77 = parkingLot62.getSpaces();
        parkingSpace51.setParkingLot(parkingLot62);
        booking8.setParkingLot(parkingLot62);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 870 + "'", int22 == 870);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-9) + "'", int26 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertNull(user50);
        org.junit.Assert.assertNull(parkingLot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray73);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray73, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray77);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray77, new observer.ParkingSpace[] {});
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot13.getSpaces();
        parkingLot13.setId(5148);
        parkingLot13.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot13.getSpaces();
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace(16068, "hi!", false, true, parkingLot13);
        int int30 = parkingLot13.getId();
        template.User user32 = null;
        observer.ParkingLot parkingLot36 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot41 = null;
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot41);
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(0, user32, parkingLot36, parkingSpace42, (int) (short) -1, (int) (byte) 0, paymentOption45, "hi!");
        template.User user49 = null;
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace54 = new observer.ParkingSpace();
        parkingSpace54.setDisabled(true);
        boolean boolean57 = parkingSpace54.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking(100, user49, parkingLot53, parkingSpace54, (int) (byte) 1, (int) (short) 0, paymentOption60, "");
        observer.ParkingSpace[] parkingSpaceArray63 = parkingLot53.getSpaces();
        parkingLot36.setSpaces(parkingSpaceArray63);
        parkingLot13.setSpaces(parkingSpaceArray63);
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace((-36470), "", false, true, parkingLot13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5148 + "'", int30 == 5148);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray63);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption13 = booking8.getPaymentOption();
        booking8.setId((-22));
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        java.lang.String str24 = parkingLot23.getLocation();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot23);
        parkingLot23.setDisabled(false);
        booking8.setParkingLot(parkingLot23);
        parkingLot23.setLocation("hi!");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        template.User user44 = booking43.getUser();
        observer.ParkingLot parkingLot45 = booking43.getParkingLot();
        booking43.setId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNotNull(parkingLot45);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        boolean boolean4 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        parkingSpace24.setParkingLot(parkingLot44);
        boolean boolean47 = parkingLot44.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot44.getSpaces();
        java.lang.String str49 = parkingLot44.getLocation();
        int int50 = parkingLot44.getId();
        boolean boolean51 = parkingLot44.isDisabled();
        boolean boolean52 = parkingLot44.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        boolean boolean7 = parkingSpace5.isTaken();
        parkingSpace5.setId(32);
        parkingSpace5.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        template.User user5 = null;
        template.User user7 = null;
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot13.getSpaces();
        parkingLot13.setId(97);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        boolean boolean46 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking((int) (byte) 1, user7, parkingLot13, parkingSpace32, (int) (byte) 100, 22, paymentOption49, "");
        observer.ParkingLot parkingLot59 = new observer.ParkingLot(5148, true, "");
        parkingLot59.setDisabled(true);
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace(0, "", false, true, parkingLot59);
        factory.PaymentOption paymentOption65 = null;
        observer.Booking booking67 = new observer.Booking(1, user5, parkingLot13, parkingSpace62, (-9), (int) (short) 1, paymentOption65, "hi!");
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace(90, "hi!", true, false, parkingLot13);
        int int69 = parkingLot13.getId();
        java.lang.String str70 = parkingLot13.getLocation();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot18 = null;
        observer.ParkingSpace parkingSpace19 = null;
        factory.PaymentOption paymentOption22 = null;
        observer.Booking booking24 = new observer.Booking(1, user17, parkingLot18, parkingSpace19, (int) 'a', (int) 'a', paymentOption22, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        observer.ParkingLot parkingLot28 = parkingSpace25.getParkingLot();
        booking24.setParkingSpace(parkingSpace25);
        booking24.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        booking24.setParkingSpace(parkingSpace32);
        java.lang.String str34 = booking24.getLicense();
        observer.ParkingSpace parkingSpace35 = booking24.getParkingSpace();
        boolean boolean36 = parkingSpace35.isDisabled();
        parkingSpace35.setTaken(true);
        boolean boolean39 = parkingSpace35.isTaken();
        booking8.setParkingSpace(parkingSpace35);
        parkingSpace35.setId(772200);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        booking28.setParkingSpace(parkingSpace36);
        java.lang.String str38 = booking28.getLicense();
        observer.ParkingSpace parkingSpace39 = booking28.getParkingSpace();
        boolean boolean40 = parkingSpace39.isDisabled();
        parkingSpace39.setTaken(true);
        booking8.setParkingSpace(parkingSpace39);
        java.lang.Class<?> wildcardClass44 = booking8.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        observer.ParkingLot parkingLot11 = parkingSpace8.getParkingLot();
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        observer.ParkingSpace[] parkingSpaceArray31 = parkingLot21.getSpaces();
        parkingLot21.setId(5148);
        parkingLot21.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray36 = parkingLot21.getSpaces();
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot21);
        observer.ParkingSpace[] parkingSpaceArray38 = parkingLot21.getSpaces();
        parkingLot11.setSpaces(parkingSpaceArray38);
        parkingLot11.setLocation("");
        org.junit.Assert.assertNotNull(parkingLot11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
        org.junit.Assert.assertNotNull(parkingSpaceArray36);
        org.junit.Assert.assertNotNull(parkingSpaceArray38);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        boolean boolean15 = parkingLot5.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray16 = new observer.ParkingSpace[] {};
        parkingLot5.setSpaces(parkingSpaceArray16);
        parkingLot5.setDisabled(false);
        parkingLot5.setId((int) (byte) 0);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot32 = null;
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot32);
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking(0, user23, parkingLot27, parkingSpace33, (int) (short) -1, (int) (byte) 0, paymentOption36, "hi!");
        template.User user40 = null;
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace45 = new observer.ParkingSpace();
        parkingSpace45.setDisabled(true);
        boolean boolean48 = parkingSpace45.isTaken();
        factory.PaymentOption paymentOption51 = null;
        observer.Booking booking53 = new observer.Booking(100, user40, parkingLot44, parkingSpace45, (int) (byte) 1, (int) (short) 0, paymentOption51, "");
        observer.ParkingSpace[] parkingSpaceArray54 = parkingLot44.getSpaces();
        parkingLot27.setSpaces(parkingSpaceArray54);
        parkingLot5.setSpaces(parkingSpaceArray54);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray16, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray54);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        booking8.setEndTime((int) (short) 1);
        observer.ParkingLot parkingLot22 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(parkingLot22);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        template.User user18 = null;
        observer.ParkingLot parkingLot19 = null;
        observer.ParkingSpace parkingSpace20 = null;
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user18, parkingLot19, parkingSpace20, (int) 'a', (int) 'a', paymentOption23, "");
        template.User user26 = null;
        booking25.setUser(user26);
        int int31 = booking25.getTotalCost((int) (short) -1, 5148, 0);
        int int35 = booking25.getTotalCost(0, (int) (short) -1, 100);
        factory.PaymentOption paymentOption36 = booking25.getPaymentOption();
        template.User user38 = null;
        observer.ParkingLot parkingLot39 = null;
        observer.ParkingSpace parkingSpace40 = null;
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(1, user38, parkingLot39, parkingSpace40, (int) 'a', (int) 'a', paymentOption43, "");
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        observer.ParkingLot parkingLot49 = parkingSpace46.getParkingLot();
        booking45.setParkingSpace(parkingSpace46);
        booking45.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        booking45.setParkingSpace(parkingSpace53);
        java.lang.String str55 = booking45.getLicense();
        observer.ParkingSpace parkingSpace56 = booking45.getParkingSpace();
        boolean boolean57 = parkingSpace56.isDisabled();
        parkingSpace56.setTaken(true);
        booking25.setParkingSpace(parkingSpace56);
        booking8.setParkingSpace(parkingSpace56);
        int int62 = booking8.getEndTime();
        observer.ParkingLot parkingLot63 = null;
        booking8.setParkingLot(parkingLot63);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-100) + "'", int35 == (-100));
        org.junit.Assert.assertNull(paymentOption36);
        org.junit.Assert.assertNull(parkingLot49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(parkingSpace56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getStartTime();
        int int12 = booking8.getStartTime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        int int11 = parkingLot9.getId();
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot16);
        parkingSpace17.setDisabled(true);
        parkingSpace17.setLocation("hi!");
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking((-100), user5, parkingLot9, parkingSpace17, (int) (byte) -1, (int) (short) 10, paymentOption24, "");
        int int27 = booking26.getId();
        observer.ParkingLot parkingLot28 = booking26.getParkingLot();
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace(0, "", true, false, parkingLot28);
        observer.ParkingLot parkingLot30 = parkingSpace29.getParkingLot();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertNotNull(parkingLot28);
        org.junit.Assert.assertNotNull(parkingLot30);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        boolean boolean20 = parkingSpace18.isDisabled();
        int int21 = parkingSpace18.getId();
        java.lang.String str22 = parkingSpace18.getLocation();
        template.User user24 = null;
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = null;
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(1, user24, parkingLot25, parkingSpace26, (int) 'a', (int) 'a', paymentOption29, "");
        booking31.setId((int) ' ');
        template.User user35 = null;
        observer.ParkingLot parkingLot39 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        boolean boolean43 = parkingSpace40.isTaken();
        factory.PaymentOption paymentOption46 = null;
        observer.Booking booking48 = new observer.Booking(100, user35, parkingLot39, parkingSpace40, (int) (byte) 1, (int) (short) 0, paymentOption46, "");
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot39.getSpaces();
        parkingLot39.setId(5148);
        booking31.setParkingLot(parkingLot39);
        boolean boolean53 = parkingLot39.isDisabled();
        parkingLot39.setId((int) '#');
        parkingSpace18.setParkingLot(parkingLot39);
        boolean boolean57 = parkingLot39.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingLot5.setLocation("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int18 = booking8.getTotalCost(0, (int) (short) -1, 100);
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        booking28.setParkingSpace(parkingSpace36);
        java.lang.String str38 = booking28.getLicense();
        observer.ParkingSpace parkingSpace39 = booking28.getParkingSpace();
        boolean boolean40 = parkingSpace39.isDisabled();
        parkingSpace39.setTaken(true);
        booking8.setParkingSpace(parkingSpace39);
        factory.PaymentOption paymentOption44 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(paymentOption44);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        boolean boolean44 = parkingSpace33.isDisabled();
        boolean boolean45 = parkingSpace33.isDisabled();
        parkingSpace33.setId((int) '#');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((-70), false, "hi!");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace(0, "", false, false, parkingLot7);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        template.User user19 = null;
        template.User user21 = null;
        observer.ParkingLot parkingLot22 = null;
        observer.ParkingSpace parkingSpace23 = null;
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(1, user21, parkingLot22, parkingSpace23, (int) 'a', (int) 'a', paymentOption26, "");
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        observer.ParkingLot parkingLot32 = parkingSpace29.getParkingLot();
        booking28.setParkingSpace(parkingSpace29);
        booking28.setEndTime(0);
        factory.PaymentOption paymentOption36 = null;
        booking28.setPaymentOption(paymentOption36);
        observer.ParkingSpace parkingSpace38 = booking28.getParkingSpace();
        observer.ParkingLot parkingLot43 = null;
        observer.ParkingSpace parkingSpace44 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot43);
        booking28.setParkingSpace(parkingSpace44);
        template.User user47 = null;
        observer.ParkingLot parkingLot51 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        boolean boolean55 = parkingSpace52.isTaken();
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(100, user47, parkingLot51, parkingSpace52, (int) (byte) 1, (int) (short) 0, paymentOption58, "");
        observer.ParkingLot parkingLot64 = new observer.ParkingLot(0, false, "");
        parkingSpace52.setParkingLot(parkingLot64);
        parkingSpace44.setParkingLot(parkingLot64);
        boolean boolean67 = parkingLot64.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray68 = parkingLot64.getSpaces();
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        java.lang.String str72 = parkingSpace69.getLocation();
        parkingSpace69.setDisabled(false);
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking((int) (byte) -1, user19, parkingLot64, parkingSpace69, (int) (short) 1, (int) (byte) 0, paymentOption77, "hi!");
        observer.ParkingSpace parkingSpace80 = new observer.ParkingSpace();
        boolean boolean81 = parkingSpace80.isDisabled();
        parkingSpace80.setDisabled(true);
        boolean boolean84 = parkingSpace80.isDisabled();
        booking79.setParkingSpace(parkingSpace80);
        parkingSpace80.setLocation("");
        booking8.setParkingSpace(parkingSpace80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray68);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(100, false, "hi!");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace(140866, "hi!", false, true, parkingLot7);
        parkingLot7.setDisabled(false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        int int24 = booking8.getEndTime();
        booking8.setEndTime((-166976));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId((int) 'a');
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray49 = new observer.ParkingSpace[] {};
        parkingLot38.setSpaces(parkingSpaceArray49);
        parkingLot20.setSpaces(parkingSpaceArray49);
        parkingSpace3.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot53 = parkingSpace3.getParkingLot();
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        java.lang.String str62 = parkingLot61.getLocation();
        observer.ParkingSpace parkingSpace63 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot61);
        parkingLot61.setId((int) (short) 100);
        parkingLot61.setId(0);
        parkingSpace3.setParkingLot(parkingLot61);
        parkingSpace3.setLocation("hi!");
        java.lang.Class<?> wildcardClass71 = parkingSpace3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        boolean boolean19 = parkingLot9.isDisabled();
        parkingLot9.setLocation("");
        parkingLot9.setLocation("hi!");
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) (short) 10, "", true, true, parkingLot9);
        parkingSpace24.setId((int) (short) -1);
        boolean boolean27 = parkingSpace24.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        parkingSpace22.setParkingLot(parkingLot34);
        boolean boolean36 = parkingSpace22.isTaken();
        boolean boolean37 = parkingSpace22.isDisabled();
        booking8.setParkingSpace(parkingSpace22);
        factory.PaymentOption paymentOption39 = null;
        booking8.setPaymentOption(paymentOption39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        boolean boolean3 = parkingSpace0.isTaken();
        boolean boolean4 = parkingSpace0.isDisabled();
        boolean boolean5 = parkingSpace0.isDisabled();
        boolean boolean6 = parkingSpace0.isDisabled();
        boolean boolean7 = parkingSpace0.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, true, "hi!");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        int int46 = parkingSpace26.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        int int5 = parkingLot3.getId();
        boolean boolean6 = parkingLot3.isDisabled();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        parkingSpace0.setDisabled(false);
        int int6 = parkingSpace0.getId();
        java.lang.String str7 = parkingSpace0.getLocation();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        booking8.setStartTime((int) '4');
        observer.ParkingSpace parkingSpace22 = booking8.getParkingSpace();
        booking8.setStartTime(0);
        observer.ParkingSpace parkingSpace25 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNotNull(parkingSpace25);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        parkingSpace0.setParkingLot(parkingLot13);
        int int25 = parkingSpace0.getId();
        parkingSpace0.setId((-1));
        parkingSpace0.setId(100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        template.User user19 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        template.User user14 = null;
        booking13.setUser(user14);
        int int19 = booking13.getTotalCost((int) (byte) 1, (int) ' ', (int) (short) 10);
        booking13.setLicense("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 310 + "'", int19 == 310);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        booking8.setLicense("hi!");
        factory.PaymentOption paymentOption25 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(paymentOption25);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime(1);
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        java.lang.String str21 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(paymentOption20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int13 = booking8.getStartTime();
        factory.PaymentOption paymentOption14 = null;
        booking8.setPaymentOption(paymentOption14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        booking16.setId(32);
        observer.ParkingLot parkingLot19 = booking16.getParkingLot();
        java.lang.Class<?> wildcardClass20 = parkingLot19.getClass();
        org.junit.Assert.assertNotNull(parkingLot19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        boolean boolean63 = parkingSpace62.isDisabled();
        parkingSpace62.setDisabled(true);
        boolean boolean66 = parkingSpace62.isDisabled();
        booking61.setParkingSpace(parkingSpace62);
        int int68 = parkingSpace62.getId();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-22), false, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        int int16 = booking8.getStartTime();
        template.User user18 = null;
        observer.ParkingLot parkingLot19 = null;
        observer.ParkingSpace parkingSpace20 = null;
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user18, parkingLot19, parkingSpace20, (int) 'a', (int) 'a', paymentOption23, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        observer.ParkingLot parkingLot29 = parkingSpace26.getParkingLot();
        booking25.setParkingSpace(parkingSpace26);
        booking25.setEndTime(0);
        factory.PaymentOption paymentOption33 = null;
        booking25.setPaymentOption(paymentOption33);
        observer.ParkingSpace parkingSpace35 = booking25.getParkingSpace();
        int int36 = parkingSpace35.getId();
        boolean boolean37 = parkingSpace35.isDisabled();
        observer.ParkingLot parkingLot38 = parkingSpace35.getParkingLot();
        booking8.setParkingSpace(parkingSpace35);
        parkingSpace35.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(parkingLot29);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(parkingLot38);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot24 = parkingSpace21.getParkingLot();
        boolean boolean25 = parkingSpace21.isDisabled();
        booking8.setParkingSpace(parkingSpace21);
        java.lang.String str27 = parkingSpace21.getLocation();
        parkingSpace21.setLocation("hi!");
        observer.ParkingLot parkingLot30 = parkingSpace21.getParkingLot();
        parkingSpace21.setLocation("hi!");
        parkingSpace21.setLocation("hi!");
        parkingSpace21.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(parkingLot30);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime((int) (byte) 100);
        factory.PaymentOption paymentOption18 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(paymentOption18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        boolean boolean20 = parkingSpace18.isDisabled();
        observer.ParkingLot parkingLot21 = parkingSpace18.getParkingLot();
        parkingSpace18.setTaken(true);
        boolean boolean24 = parkingSpace18.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(parkingLot21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        observer.ParkingSpace parkingSpace13 = booking8.getParkingSpace();
        int int14 = booking8.getEndTime();
        observer.ParkingLot parkingLot15 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(parkingLot15);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int61 = booking8.getTotalCost((int) (short) 0, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass62 = booking8.getClass();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime((-36470));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        observer.ParkingSpace parkingSpace11 = booking8.getParkingSpace();
        template.User user12 = null;
        booking8.setUser(user12);
        template.User user14 = null;
        booking8.setUser(user14);
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = parkingSpace3.getId();
        boolean boolean15 = parkingSpace3.isTaken();
        boolean boolean16 = parkingSpace3.isDisabled();
        parkingSpace3.setLocation("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setId(310);
        parkingLot3.setDisabled(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        observer.ParkingLot parkingLot17 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(parkingLot17);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-166976));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(false);
        boolean boolean8 = parkingSpace5.isDisabled();
        parkingSpace5.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(5148, true, "");
        parkingLot7.setDisabled(true);
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace(0, "", false, true, parkingLot7);
        observer.ParkingLot parkingLot11 = parkingSpace10.getParkingLot();
        parkingLot11.setId((-9));
        org.junit.Assert.assertNotNull(parkingLot11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        booking8.setStartTime((int) (short) 100);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        parkingSpace23.setDisabled(true);
        template.User user27 = null;
        template.User user29 = null;
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace();
        parkingSpace31.setDisabled(true);
        java.lang.String str34 = parkingSpace31.getLocation();
        observer.ParkingLot parkingLot35 = null;
        parkingSpace31.setParkingLot(parkingLot35);
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking((int) (short) 0, user29, parkingLot30, parkingSpace31, 5148, (int) (short) 100, paymentOption39, "");
        template.User user43 = null;
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        boolean boolean51 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking(100, user43, parkingLot47, parkingSpace48, (int) (byte) 1, (int) (short) 0, paymentOption54, "");
        observer.ParkingLot parkingLot60 = new observer.ParkingLot(0, false, "");
        parkingSpace48.setParkingLot(parkingLot60);
        parkingLot60.setDisabled(false);
        parkingSpace31.setParkingLot(parkingLot60);
        observer.ParkingSpace[] parkingSpaceArray65 = null;
        parkingLot60.setSpaces(parkingSpaceArray65);
        observer.ParkingLot parkingLot74 = new observer.ParkingLot(0, false, "");
        java.lang.String str75 = parkingLot74.getLocation();
        observer.ParkingSpace parkingSpace76 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot74);
        factory.PaymentOption paymentOption79 = null;
        observer.Booking booking81 = new observer.Booking(310, user27, parkingLot60, parkingSpace76, (-93322944), 4838, paymentOption79, "hi!");
        parkingSpace23.setParkingLot(parkingLot60);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) '#', true, "");
        boolean boolean6 = parkingLot5.isDisabled();
        boolean boolean7 = parkingLot5.isDisabled();
        template.User user9 = null;
        template.User user11 = null;
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = null;
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(1, user11, parkingLot12, parkingSpace13, (int) 'a', (int) 'a', paymentOption16, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        observer.ParkingLot parkingLot22 = parkingSpace19.getParkingLot();
        booking18.setParkingSpace(parkingSpace19);
        booking18.setEndTime(0);
        factory.PaymentOption paymentOption26 = null;
        booking18.setPaymentOption(paymentOption26);
        observer.ParkingSpace parkingSpace28 = booking18.getParkingSpace();
        observer.ParkingLot parkingLot33 = null;
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot33);
        booking18.setParkingSpace(parkingSpace34);
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        observer.ParkingLot parkingLot54 = new observer.ParkingLot(0, false, "");
        parkingSpace42.setParkingLot(parkingLot54);
        parkingSpace34.setParkingLot(parkingLot54);
        boolean boolean57 = parkingLot54.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray58 = parkingLot54.getSpaces();
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace();
        parkingSpace59.setDisabled(true);
        java.lang.String str62 = parkingSpace59.getLocation();
        parkingSpace59.setDisabled(false);
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking((int) (byte) -1, user9, parkingLot54, parkingSpace59, (int) (short) 1, (int) (byte) 0, paymentOption67, "hi!");
        observer.ParkingLot parkingLot70 = parkingSpace59.getParkingLot();
        factory.PaymentOption paymentOption73 = null;
        observer.Booking booking75 = new observer.Booking((int) '4', user1, parkingLot5, parkingSpace59, (int) '#', 870, paymentOption73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(parkingLot22);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray58);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(parkingLot70);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        parkingLot5.setId((int) ' ');
        parkingLot5.setDisabled(true);
        parkingLot5.setId((int) (short) -1);
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        boolean boolean17 = parkingSpace13.isDisabled();
        boolean boolean18 = parkingSpace13.isDisabled();
        parkingSpace13.setDisabled(false);
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user1, parkingLot5, parkingSpace13, 6500, 2146977336, paymentOption23, "");
        parkingLot5.setDisabled(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId((int) (short) 1);
        booking8.setId((int) ' ');
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        int int16 = parkingSpace15.getId();
        parkingSpace15.setLocation("");
        booking8.setParkingSpace(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        booking8.setParkingLot(parkingLot21);
        parkingLot21.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        int int19 = parkingSpace18.getId();
        boolean boolean20 = parkingSpace18.isDisabled();
        int int21 = parkingSpace18.getId();
        java.lang.String str22 = parkingSpace18.getLocation();
        boolean boolean23 = parkingSpace18.isTaken();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = parkingSpace18.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        booking8.setStartTime(97);
        booking8.setEndTime((int) ' ');
        booking8.setLicense("hi!");
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        int int24 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(971751252, false, "hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "hi!");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        booking12.setId((int) ' ');
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId(5148);
        booking12.setParkingLot(parkingLot20);
        int int34 = parkingLot20.getId();
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot20.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray35);
        parkingLot3.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5148 + "'", int34 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        booking8.setLicense("hi!");
        template.User user21 = booking8.getUser();
        booking8.setId(310);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace[] parkingSpaceArray33 = parkingLot18.getSpaces();
        template.User user35 = null;
        observer.ParkingLot parkingLot36 = null;
        observer.ParkingSpace parkingSpace37 = null;
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(1, user35, parkingLot36, parkingSpace37, (int) 'a', (int) 'a', paymentOption40, "");
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace();
        parkingSpace43.setDisabled(true);
        observer.ParkingLot parkingLot46 = parkingSpace43.getParkingLot();
        booking42.setParkingSpace(parkingSpace43);
        booking42.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        booking42.setParkingSpace(parkingSpace50);
        java.lang.String str52 = booking42.getLicense();
        observer.ParkingSpace parkingSpace53 = booking42.getParkingSpace();
        boolean boolean54 = parkingSpace53.isDisabled();
        parkingSpace53.setTaken(true);
        boolean boolean57 = parkingSpace53.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking((-100), user1, parkingLot18, parkingSpace53, (int) (short) 1, 140866, paymentOption60, "");
        int int63 = booking62.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNull(parkingLot46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 140866 + "'", int63 == 140866);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        boolean boolean7 = parkingSpace5.isTaken();
        parkingSpace5.setId(32);
        java.lang.Class<?> wildcardClass10 = parkingSpace5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(870, false, "");
        parkingLot3.setId(971751252);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        int int19 = booking8.getId();
        template.User user20 = booking8.getUser();
        booking8.setId((int) '#');
        booking8.setId(0);
        booking8.setStartTime(9900);
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        boolean boolean36 = parkingSpace33.isTaken();
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(100, user28, parkingLot32, parkingSpace33, (int) (byte) 1, (int) (short) 0, paymentOption39, "");
        int int42 = parkingSpace33.getId();
        template.User user44 = null;
        template.User user46 = null;
        observer.ParkingLot parkingLot50 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot55 = null;
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot55);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking(0, user46, parkingLot50, parkingSpace56, (int) (short) -1, (int) (byte) 0, paymentOption59, "hi!");
        template.User user63 = null;
        observer.ParkingLot parkingLot67 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace();
        parkingSpace68.setDisabled(true);
        boolean boolean71 = parkingSpace68.isTaken();
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking(100, user63, parkingLot67, parkingSpace68, (int) (byte) 1, (int) (short) 0, paymentOption74, "");
        observer.ParkingSpace[] parkingSpaceArray77 = parkingLot67.getSpaces();
        parkingLot50.setSpaces(parkingSpaceArray77);
        observer.ParkingSpace parkingSpace79 = new observer.ParkingSpace();
        parkingSpace79.setDisabled(true);
        java.lang.String str82 = parkingSpace79.getLocation();
        parkingSpace79.setDisabled(false);
        observer.ParkingLot parkingLot85 = parkingSpace79.getParkingLot();
        factory.PaymentOption paymentOption88 = null;
        observer.Booking booking90 = new observer.Booking((int) (short) 10, user44, parkingLot50, parkingSpace79, (int) (short) -1, 32, paymentOption88, "");
        observer.ParkingSpace[] parkingSpaceArray91 = parkingLot50.getSpaces();
        java.lang.String str92 = parkingLot50.getLocation();
        parkingSpace33.setParkingLot(parkingLot50);
        booking8.setParkingLot(parkingLot50);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray77);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(parkingLot85);
        org.junit.Assert.assertNotNull(parkingSpaceArray91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(5148, true, "");
        parkingLot7.setDisabled(true);
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace(0, "", false, true, parkingLot7);
        boolean boolean11 = parkingSpace10.isTaken();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        int int13 = parkingLot11.getId();
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot11);
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        java.lang.String str25 = parkingLot24.getLocation();
        int int26 = parkingLot24.getId();
        observer.ParkingLot parkingLot31 = null;
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot31);
        parkingSpace32.setDisabled(true);
        parkingSpace32.setLocation("hi!");
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking((-100), user20, parkingLot24, parkingSpace32, (int) (byte) -1, (int) (short) 10, paymentOption39, "");
        observer.ParkingLot parkingLot45 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot45.getSpaces();
        parkingLot24.setSpaces(parkingSpaceArray46);
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot24);
        parkingSpace48.setLocation("hi!");
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(32, user3, parkingLot11, parkingSpace48, 100, 10, paymentOption53, "hi!");
        observer.ParkingSpace parkingSpace56 = null;
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) '4', user1, parkingLot11, parkingSpace56, (-970), (-100), paymentOption59, "");
        boolean boolean62 = parkingLot11.isDisabled();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        template.User user15 = null;
        observer.ParkingLot parkingLot19 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setDisabled(true);
        boolean boolean23 = parkingSpace20.isTaken();
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(100, user15, parkingLot19, parkingSpace20, (int) (byte) 1, (int) (short) 0, paymentOption26, "");
        boolean boolean29 = parkingLot19.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray30 = new observer.ParkingSpace[] {};
        parkingLot19.setSpaces(parkingSpaceArray30);
        parkingLot19.setDisabled(false);
        booking8.setParkingLot(parkingLot19);
        boolean boolean35 = parkingLot19.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        observer.ParkingLot parkingLot12 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingLot12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        java.lang.String str24 = parkingLot23.getLocation();
        int int25 = parkingLot23.getId();
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot23);
        template.User user28 = null;
        template.User user30 = null;
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace();
        parkingSpace35.setDisabled(true);
        boolean boolean38 = parkingSpace35.isTaken();
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(100, user30, parkingLot34, parkingSpace35, (int) (byte) 1, (int) (short) 0, paymentOption41, "");
        observer.ParkingSpace[] parkingSpaceArray44 = parkingLot34.getSpaces();
        parkingLot34.setId(97);
        template.User user48 = null;
        observer.ParkingLot parkingLot52 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        boolean boolean56 = parkingSpace53.isTaken();
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking(100, user48, parkingLot52, parkingSpace53, (int) (byte) 1, (int) (short) 0, paymentOption59, "");
        observer.ParkingLot parkingLot65 = new observer.ParkingLot(0, false, "");
        parkingSpace53.setParkingLot(parkingLot65);
        boolean boolean67 = parkingSpace53.isTaken();
        factory.PaymentOption paymentOption70 = null;
        observer.Booking booking72 = new observer.Booking((int) (byte) 1, user28, parkingLot34, parkingSpace53, (int) (byte) 100, 22, paymentOption70, "");
        observer.ParkingLot parkingLot73 = booking72.getParkingLot();
        boolean boolean74 = parkingLot73.isDisabled();
        parkingSpace26.setParkingLot(parkingLot73);
        booking8.setParkingLot(parkingLot73);
        java.lang.String str77 = parkingLot73.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingLot73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot17 = null;
        observer.ParkingSpace parkingSpace18 = null;
        factory.PaymentOption paymentOption21 = null;
        observer.Booking booking23 = new observer.Booking(1, user16, parkingLot17, parkingSpace18, (int) 'a', (int) 'a', paymentOption21, "");
        booking23.setId((int) ' ');
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingSpace[] parkingSpaceArray41 = parkingLot31.getSpaces();
        parkingLot31.setId(5148);
        booking23.setParkingLot(parkingLot31);
        int int45 = parkingLot31.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        java.lang.String str49 = parkingSpace46.getLocation();
        observer.ParkingLot parkingLot50 = null;
        parkingSpace46.setParkingLot(parkingLot50);
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) 'a', user14, parkingLot31, parkingSpace46, (int) ' ', (int) (short) 10, paymentOption54, "");
        booking8.setParkingSpace(parkingSpace46);
        int int61 = booking8.getTotalCost((int) (short) 0, (int) (byte) 0, (int) 'a');
        booking8.setLicense("");
        java.lang.String str64 = booking8.getLicense();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        java.lang.String str19 = booking8.getLicense();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        template.User user21 = null;
        booking8.setUser(user21);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot9.getSpaces();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace(16068, "hi!", false, true, parkingLot9);
        int int26 = parkingLot9.getId();
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot37 = null;
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(0, user28, parkingLot32, parkingSpace38, (int) (short) -1, (int) (byte) 0, paymentOption41, "hi!");
        template.User user45 = null;
        observer.ParkingLot parkingLot49 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        parkingSpace50.setDisabled(true);
        boolean boolean53 = parkingSpace50.isTaken();
        factory.PaymentOption paymentOption56 = null;
        observer.Booking booking58 = new observer.Booking(100, user45, parkingLot49, parkingSpace50, (int) (byte) 1, (int) (short) 0, paymentOption56, "");
        observer.ParkingSpace[] parkingSpaceArray59 = parkingLot49.getSpaces();
        parkingLot32.setSpaces(parkingSpaceArray59);
        parkingLot9.setSpaces(parkingSpaceArray59);
        parkingLot9.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5148 + "'", int26 == 5148);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray59);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-6298500), true, "hi!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        booking12.setId((int) ' ');
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingSpace[] parkingSpaceArray30 = parkingLot20.getSpaces();
        parkingLot20.setId(5148);
        booking12.setParkingLot(parkingLot20);
        boolean boolean34 = parkingLot20.isDisabled();
        parkingLot20.setId((int) '#');
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace(90, "", false, true, parkingLot20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        parkingSpace5.setLocation("hi!");
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        boolean boolean13 = parkingLot12.isDisabled();
        parkingSpace5.setParkingLot(parkingLot12);
        parkingSpace5.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot12 = null;
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot12);
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(0, user3, parkingLot7, parkingSpace13, (int) (short) -1, (int) (byte) 0, paymentOption16, "hi!");
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        boolean boolean28 = parkingSpace25.isTaken();
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(100, user20, parkingLot24, parkingSpace25, (int) (byte) 1, (int) (short) 0, paymentOption31, "");
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot24.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray34);
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        java.lang.String str39 = parkingSpace36.getLocation();
        parkingSpace36.setDisabled(false);
        observer.ParkingLot parkingLot42 = parkingSpace36.getParkingLot();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (short) 10, user1, parkingLot7, parkingSpace36, (int) (short) -1, 32, paymentOption45, "");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot7.getSpaces();
        template.User user50 = null;
        observer.ParkingLot parkingLot51 = null;
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        java.lang.String str55 = parkingSpace52.getLocation();
        observer.ParkingLot parkingLot56 = null;
        parkingSpace52.setParkingLot(parkingLot56);
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking((int) (short) 0, user50, parkingLot51, parkingSpace52, 5148, (int) (short) 100, paymentOption60, "");
        template.User user64 = null;
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        boolean boolean72 = parkingSpace69.isTaken();
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking(100, user64, parkingLot68, parkingSpace69, (int) (byte) 1, (int) (short) 0, paymentOption75, "");
        observer.ParkingLot parkingLot81 = new observer.ParkingLot(0, false, "");
        parkingSpace69.setParkingLot(parkingLot81);
        parkingLot81.setDisabled(false);
        parkingSpace52.setParkingLot(parkingLot81);
        observer.ParkingSpace[] parkingSpaceArray86 = parkingLot81.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray86);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray86);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace[] parkingSpaceArray33 = parkingLot18.getSpaces();
        template.User user35 = null;
        observer.ParkingLot parkingLot36 = null;
        observer.ParkingSpace parkingSpace37 = null;
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(1, user35, parkingLot36, parkingSpace37, (int) 'a', (int) 'a', paymentOption40, "");
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace();
        parkingSpace43.setDisabled(true);
        observer.ParkingLot parkingLot46 = parkingSpace43.getParkingLot();
        booking42.setParkingSpace(parkingSpace43);
        booking42.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        booking42.setParkingSpace(parkingSpace50);
        java.lang.String str52 = booking42.getLicense();
        observer.ParkingSpace parkingSpace53 = booking42.getParkingSpace();
        boolean boolean54 = parkingSpace53.isDisabled();
        parkingSpace53.setTaken(true);
        boolean boolean57 = parkingSpace53.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking((-100), user1, parkingLot18, parkingSpace53, (int) (short) 1, 140866, paymentOption60, "");
        template.User user64 = null;
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        boolean boolean72 = parkingSpace69.isTaken();
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking(100, user64, parkingLot68, parkingSpace69, (int) (byte) 1, (int) (short) 0, paymentOption75, "");
        observer.ParkingLot parkingLot81 = new observer.ParkingLot(0, false, "");
        parkingSpace69.setParkingLot(parkingLot81);
        observer.ParkingSpace[] parkingSpaceArray83 = parkingLot81.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray84 = parkingLot81.getSpaces();
        parkingLot18.setSpaces(parkingSpaceArray84);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNull(parkingLot46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray83);
        org.junit.Assert.assertNotNull(parkingSpaceArray84);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        booking8.setId((-1));
        int int28 = booking8.getEndTime();
        int int29 = booking8.getStartTime();
        observer.ParkingLot parkingLot30 = booking8.getParkingLot();
        int int34 = booking8.getTotalCost((-629847809), (int) (short) 100, 52);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1607647100) + "'", int34 == (-1607647100));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        boolean boolean7 = parkingSpace5.isDisabled();
        parkingSpace5.setTaken(false);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        template.User user15 = null;
        observer.ParkingLot parkingLot19 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setDisabled(true);
        boolean boolean23 = parkingSpace20.isTaken();
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(100, user15, parkingLot19, parkingSpace20, (int) (byte) 1, (int) (short) 0, paymentOption26, "");
        boolean boolean29 = parkingLot19.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray30 = new observer.ParkingSpace[] {};
        parkingLot19.setSpaces(parkingSpaceArray30);
        parkingLot19.setDisabled(false);
        booking8.setParkingLot(parkingLot19);
        int int38 = booking8.getTotalCost(6500, 22, (-6298500));
        booking8.setEndTime(9900);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2146977336 + "'", int38 == 2146977336);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-970), true, "hi!");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        template.User user8 = null;
        observer.ParkingLot parkingLot12 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        boolean boolean16 = parkingSpace13.isTaken();
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(100, user8, parkingLot12, parkingSpace13, (int) (byte) 1, (int) (short) 0, paymentOption19, "");
        observer.ParkingSpace[] parkingSpaceArray22 = parkingLot12.getSpaces();
        parkingLot12.setId(97);
        observer.ParkingSpace[] parkingSpaceArray25 = parkingLot12.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray25);
        java.lang.String str27 = parkingLot3.getLocation();
        parkingLot3.setDisabled(false);
        int int30 = parkingLot3.getId();
        parkingLot3.setId(971751252);
        template.User user34 = null;
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        boolean boolean42 = parkingSpace39.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(100, user34, parkingLot38, parkingSpace39, (int) (byte) 1, (int) (short) 0, paymentOption45, "");
        boolean boolean48 = parkingLot38.isDisabled();
        parkingLot38.setLocation("");
        parkingLot38.setLocation("hi!");
        template.User user54 = null;
        observer.ParkingLot parkingLot58 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot63 = null;
        observer.ParkingSpace parkingSpace64 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot63);
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking(0, user54, parkingLot58, parkingSpace64, (int) (short) -1, (int) (byte) 0, paymentOption67, "hi!");
        template.User user71 = null;
        observer.ParkingLot parkingLot75 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace76 = new observer.ParkingSpace();
        parkingSpace76.setDisabled(true);
        boolean boolean79 = parkingSpace76.isTaken();
        factory.PaymentOption paymentOption82 = null;
        observer.Booking booking84 = new observer.Booking(100, user71, parkingLot75, parkingSpace76, (int) (byte) 1, (int) (short) 0, paymentOption82, "");
        observer.ParkingSpace[] parkingSpaceArray85 = parkingLot75.getSpaces();
        parkingLot58.setSpaces(parkingSpaceArray85);
        parkingLot38.setSpaces(parkingSpaceArray85);
        parkingLot3.setSpaces(parkingSpaceArray85);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray85);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user23 = null;
        booking8.setUser(user23);
        java.lang.String str25 = booking8.getLicense();
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot30);
        observer.ParkingLot parkingLot32 = parkingSpace31.getParkingLot();
        booking8.setParkingSpace(parkingSpace31);
        observer.ParkingLot parkingLot38 = null;
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot38);
        parkingSpace39.setDisabled(true);
        parkingSpace39.setLocation("hi!");
        boolean boolean44 = parkingSpace39.isDisabled();
        booking8.setParkingSpace(parkingSpace39);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        parkingSpace8.setTaken(true);
        boolean boolean13 = parkingSpace8.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setId((int) (short) -1);
        booking8.setParkingSpace(parkingSpace20);
        template.User user24 = booking8.getUser();
        booking8.setEndTime((-1));
        int int27 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        int int24 = booking8.getEndTime();
        factory.PaymentOption paymentOption25 = null;
        booking8.setPaymentOption(paymentOption25);
        booking8.setStartTime((int) (short) 10);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        booking8.setLicense("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        booking8.setStartTime(32);
        observer.ParkingLot parkingLot17 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot17);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        booking8.setStartTime(1);
        template.User user20 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        template.User user16 = null;
        booking8.setUser(user16);
        int int18 = booking8.getStartTime();
        int int19 = booking8.getEndTime();
        template.User user20 = null;
        booking8.setUser(user20);
        template.User user22 = booking8.getUser();
        int int23 = booking8.getId();
        template.User user24 = null;
        booking8.setUser(user24);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        template.User user16 = null;
        booking8.setUser(user16);
        int int18 = booking8.getStartTime();
        int int19 = booking8.getEndTime();
        template.User user20 = null;
        booking8.setUser(user20);
        template.User user22 = booking8.getUser();
        int int23 = booking8.getId();
        int int24 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        booking8.setId((-1));
        int int28 = booking8.getId();
        int int29 = booking8.getId();
        observer.ParkingLot parkingLot30 = booking8.getParkingLot();
        int int31 = booking8.getId();
        int int32 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace();
        parkingSpace8.setDisabled(true);
        boolean boolean11 = parkingSpace8.isTaken();
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(100, user3, parkingLot7, parkingSpace8, (int) (byte) 1, (int) (short) 0, paymentOption14, "");
        observer.ParkingSpace[] parkingSpaceArray17 = parkingLot7.getSpaces();
        parkingLot7.setId(97);
        template.User user21 = null;
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace();
        parkingSpace26.setDisabled(true);
        boolean boolean29 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(100, user21, parkingLot25, parkingSpace26, (int) (byte) 1, (int) (short) 0, paymentOption32, "");
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        parkingSpace26.setParkingLot(parkingLot38);
        boolean boolean40 = parkingSpace26.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking((int) (byte) 1, user1, parkingLot7, parkingSpace26, (int) (byte) 100, 22, paymentOption43, "");
        observer.ParkingSpace parkingSpace46 = booking45.getParkingSpace();
        booking45.setLicense("");
        booking45.setId((int) '4');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpace46);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        template.User user51 = null;
        observer.ParkingLot parkingLot55 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace();
        parkingSpace56.setDisabled(true);
        boolean boolean59 = parkingSpace56.isTaken();
        factory.PaymentOption paymentOption62 = null;
        observer.Booking booking64 = new observer.Booking(100, user51, parkingLot55, parkingSpace56, (int) (byte) 1, (int) (short) 0, paymentOption62, "");
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        parkingSpace56.setParkingLot(parkingLot68);
        boolean boolean70 = parkingSpace56.isTaken();
        factory.PaymentOption paymentOption73 = null;
        observer.Booking booking75 = new observer.Booking(0, user1, parkingLot46, parkingSpace56, (-100), 6500, paymentOption73, "hi!");
        int int76 = booking75.getEndTime();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 6500 + "'", int76 == 6500);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        observer.ParkingSpace parkingSpace11 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot15 = new observer.ParkingLot(16068, false, "hi!");
        booking8.setParkingLot(parkingLot15);
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(true);
        parkingSpace5.setLocation("hi!");
        boolean boolean10 = parkingSpace5.isDisabled();
        parkingSpace5.setId((int) (byte) 100);
        boolean boolean13 = parkingSpace5.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        booking8.setStartTime(97);
        booking8.setId((int) (byte) 0);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot9.getSpaces();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace(16068, "hi!", false, true, parkingLot9);
        int int26 = parkingLot9.getId();
        java.lang.String str27 = parkingLot9.getLocation();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5148 + "'", int26 == 5148);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getStartTime();
        template.User user12 = booking8.getUser();
        booking8.setEndTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot7);
        parkingLot7.setDisabled(true);
        parkingLot7.setDisabled(true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        int int32 = parkingLot18.getId();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((int) 'a', user1, parkingLot18, parkingSpace33, (int) ' ', (int) (short) 10, paymentOption41, "");
        int int44 = booking43.getId();
        booking43.setLicense("");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        java.lang.String str18 = booking8.getLicense();
        int int19 = booking8.getId();
        booking8.setStartTime((int) '4');
        observer.ParkingSpace parkingSpace22 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNull(parkingLot23);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot14 = parkingSpace11.getParkingLot();
        booking10.setParkingSpace(parkingSpace11);
        booking10.setEndTime(0);
        factory.PaymentOption paymentOption18 = null;
        booking10.setPaymentOption(paymentOption18);
        observer.ParkingSpace parkingSpace20 = booking10.getParkingSpace();
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot25);
        booking10.setParkingSpace(parkingSpace26);
        template.User user29 = null;
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace();
        parkingSpace34.setDisabled(true);
        boolean boolean37 = parkingSpace34.isTaken();
        factory.PaymentOption paymentOption40 = null;
        observer.Booking booking42 = new observer.Booking(100, user29, parkingLot33, parkingSpace34, (int) (byte) 1, (int) (short) 0, paymentOption40, "");
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        parkingSpace34.setParkingLot(parkingLot46);
        parkingSpace26.setParkingLot(parkingLot46);
        boolean boolean49 = parkingLot46.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot46.getSpaces();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace();
        parkingSpace51.setDisabled(true);
        java.lang.String str54 = parkingSpace51.getLocation();
        parkingSpace51.setDisabled(false);
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking((int) (byte) -1, user1, parkingLot46, parkingSpace51, (int) (short) 1, (int) (byte) 0, paymentOption59, "hi!");
        parkingSpace51.setTaken(true);
        parkingSpace51.setLocation("hi!");
        parkingSpace51.setTaken(false);
        parkingSpace51.setDisabled(false);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        booking8.setStartTime(97);
        booking8.setEndTime((int) ' ');
        booking8.setId((int) (byte) 100);
        observer.ParkingSpace parkingSpace23 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(parkingSpace23);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        java.lang.String str21 = booking8.getLicense();
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption23 = null;
        booking8.setPaymentOption(paymentOption23);
        int int25 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        parkingLot11.setId((int) ' ');
        parkingSpace0.setParkingLot(parkingLot11);
        template.User user17 = null;
        observer.ParkingLot parkingLot18 = null;
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        java.lang.String str22 = parkingSpace19.getLocation();
        observer.ParkingLot parkingLot23 = null;
        parkingSpace19.setParkingLot(parkingLot23);
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking((int) (short) 0, user17, parkingLot18, parkingSpace19, 5148, (int) (short) 100, paymentOption27, "");
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        parkingSpace36.setParkingLot(parkingLot48);
        parkingLot48.setDisabled(false);
        parkingSpace19.setParkingLot(parkingLot48);
        observer.ParkingSpace[] parkingSpaceArray53 = null;
        parkingLot48.setSpaces(parkingSpaceArray53);
        parkingSpace0.setParkingLot(parkingLot48);
        boolean boolean56 = parkingSpace0.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        observer.ParkingLot parkingLot8 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot18 = null;
        observer.ParkingSpace parkingSpace19 = null;
        factory.PaymentOption paymentOption22 = null;
        observer.Booking booking24 = new observer.Booking(1, user17, parkingLot18, parkingSpace19, (int) 'a', (int) 'a', paymentOption22, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        observer.ParkingLot parkingLot28 = parkingSpace25.getParkingLot();
        booking24.setParkingSpace(parkingSpace25);
        booking24.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        booking24.setParkingSpace(parkingSpace32);
        java.lang.String str34 = booking24.getLicense();
        observer.ParkingSpace parkingSpace35 = booking24.getParkingSpace();
        boolean boolean36 = parkingSpace35.isDisabled();
        parkingSpace35.setTaken(true);
        boolean boolean39 = parkingSpace35.isTaken();
        booking8.setParkingSpace(parkingSpace35);
        parkingSpace35.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace((int) 'a', "", false, false, parkingLot9);
        boolean boolean23 = parkingLot9.isDisabled();
        parkingLot9.setId(9900);
        parkingLot9.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(5148);
        parkingLot9.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot9.getSpaces();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot9);
        parkingLot9.setId(100);
        int int28 = parkingLot9.getId();
        parkingLot9.setId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace();
        parkingSpace5.setDisabled(true);
        java.lang.String str8 = parkingSpace5.getLocation();
        observer.ParkingLot parkingLot9 = null;
        parkingSpace5.setParkingLot(parkingLot9);
        factory.PaymentOption paymentOption13 = null;
        observer.Booking booking15 = new observer.Booking((int) (short) 0, user3, parkingLot4, parkingSpace5, 5148, (int) (short) 100, paymentOption13, "");
        int int16 = parkingSpace5.getId();
        template.User user18 = null;
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        parkingSpace23.setDisabled(true);
        boolean boolean26 = parkingSpace23.isTaken();
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(100, user18, parkingLot22, parkingSpace23, (int) (byte) 1, (int) (short) 0, paymentOption29, "");
        observer.ParkingSpace[] parkingSpaceArray32 = parkingLot22.getSpaces();
        parkingLot22.setId((int) 'a');
        template.User user36 = null;
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        boolean boolean44 = parkingSpace41.isTaken();
        factory.PaymentOption paymentOption47 = null;
        observer.Booking booking49 = new observer.Booking(100, user36, parkingLot40, parkingSpace41, (int) (byte) 1, (int) (short) 0, paymentOption47, "");
        boolean boolean50 = parkingLot40.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray51 = new observer.ParkingSpace[] {};
        parkingLot40.setSpaces(parkingSpaceArray51);
        parkingLot22.setSpaces(parkingSpaceArray51);
        parkingSpace5.setParkingLot(parkingLot22);
        observer.ParkingLot parkingLot55 = parkingSpace5.getParkingLot();
        observer.ParkingLot parkingLot63 = new observer.ParkingLot(0, false, "");
        java.lang.String str64 = parkingLot63.getLocation();
        int int65 = parkingLot63.getId();
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot63);
        factory.PaymentOption paymentOption69 = null;
        observer.Booking booking71 = new observer.Booking(5148, user1, parkingLot55, parkingSpace66, (-166976), (-22), paymentOption69, "hi!");
        int int72 = parkingSpace66.getId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray51, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot55);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getStartTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId(100);
        java.lang.Class<?> wildcardClass13 = booking8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        template.User user27 = null;
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        parkingSpace32.setDisabled(true);
        boolean boolean35 = parkingSpace32.isTaken();
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking(100, user27, parkingLot31, parkingSpace32, (int) (byte) 1, (int) (short) 0, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        parkingSpace32.setParkingLot(parkingLot44);
        parkingSpace24.setParkingLot(parkingLot44);
        parkingLot44.setId((int) '4');
        java.lang.String str49 = parkingLot44.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        parkingSpace0.setDisabled(false);
        observer.ParkingLot parkingLot6 = parkingSpace0.getParkingLot();
        parkingSpace0.setId((int) (short) 1);
        parkingSpace0.setDisabled(false);
        boolean boolean11 = parkingSpace0.isDisabled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        booking8.setId((-1));
        java.lang.String str28 = booking8.getLicense();
        int int29 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(772200, false, "");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        int int18 = booking8.getEndTime();
        java.lang.String str19 = booking8.getLicense();
        java.lang.String str20 = booking8.getLicense();
        java.lang.String str21 = booking8.getLicense();
        booking8.setId((int) ' ');
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        booking16.setId(32);
        booking16.setLicense("");
        booking16.setId((int) (short) 1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        parkingLot11.setId((int) ' ');
        parkingSpace0.setParkingLot(parkingLot11);
        int int16 = parkingSpace0.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        parkingSpace8.setTaken(true);
        int int13 = parkingSpace8.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        parkingSpace0.setParkingLot(parkingLot13);
        int int25 = parkingSpace0.getId();
        int int26 = parkingSpace0.getLotID();
        int int27 = parkingSpace0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getId();
        template.User user19 = booking8.getUser();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        template.User user5 = null;
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        java.lang.String str9 = parkingSpace6.getLocation();
        observer.ParkingLot parkingLot10 = null;
        parkingSpace6.setParkingLot(parkingLot10);
        observer.ParkingLot parkingLot15 = new observer.ParkingLot(0, false, "");
        java.lang.String str16 = parkingLot15.getLocation();
        parkingSpace6.setParkingLot(parkingLot15);
        template.User user19 = null;
        observer.ParkingLot parkingLot20 = null;
        observer.ParkingSpace parkingSpace21 = null;
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking(1, user19, parkingLot20, parkingSpace21, (int) 'a', (int) 'a', paymentOption24, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        observer.ParkingLot parkingLot30 = parkingSpace27.getParkingLot();
        booking26.setParkingSpace(parkingSpace27);
        booking26.setEndTime(0);
        factory.PaymentOption paymentOption34 = null;
        booking26.setPaymentOption(paymentOption34);
        observer.ParkingSpace parkingSpace36 = booking26.getParkingSpace();
        parkingSpace36.setLocation("");
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(100, user5, parkingLot15, parkingSpace36, (int) (byte) 1, 5148, paymentOption41, "hi!");
        observer.ParkingSpace parkingSpace44 = new observer.ParkingSpace((-1), "", false, false, parkingLot15);
        int int45 = parkingSpace44.getLotID();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        boolean boolean19 = parkingLot9.isDisabled();
        java.lang.String str20 = parkingLot9.getLocation();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace(1100, "hi!", false, false, parkingLot9);
        java.lang.Class<?> wildcardClass22 = parkingSpace21.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        booking8.setLicense("hi!");
        int int28 = booking8.getId();
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId((int) 'a');
        java.lang.String str18 = parkingLot5.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        template.User user18 = null;
        observer.ParkingLot parkingLot19 = null;
        observer.ParkingSpace parkingSpace20 = null;
        factory.PaymentOption paymentOption23 = null;
        observer.Booking booking25 = new observer.Booking(1, user18, parkingLot19, parkingSpace20, (int) 'a', (int) 'a', paymentOption23, "");
        template.User user26 = null;
        booking25.setUser(user26);
        int int31 = booking25.getTotalCost((int) (short) -1, 5148, 0);
        int int35 = booking25.getTotalCost(0, (int) (short) -1, 100);
        factory.PaymentOption paymentOption36 = booking25.getPaymentOption();
        template.User user38 = null;
        observer.ParkingLot parkingLot39 = null;
        observer.ParkingSpace parkingSpace40 = null;
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(1, user38, parkingLot39, parkingSpace40, (int) 'a', (int) 'a', paymentOption43, "");
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        observer.ParkingLot parkingLot49 = parkingSpace46.getParkingLot();
        booking45.setParkingSpace(parkingSpace46);
        booking45.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        booking45.setParkingSpace(parkingSpace53);
        java.lang.String str55 = booking45.getLicense();
        observer.ParkingSpace parkingSpace56 = booking45.getParkingSpace();
        boolean boolean57 = parkingSpace56.isDisabled();
        parkingSpace56.setTaken(true);
        booking25.setParkingSpace(parkingSpace56);
        booking8.setParkingSpace(parkingSpace56);
        booking8.setEndTime(32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-100) + "'", int35 == (-100));
        org.junit.Assert.assertNull(paymentOption36);
        org.junit.Assert.assertNull(parkingLot49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(parkingSpace56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        int int19 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        template.User user15 = null;
        observer.ParkingLot parkingLot19 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setDisabled(true);
        boolean boolean23 = parkingSpace20.isTaken();
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(100, user15, parkingLot19, parkingSpace20, (int) (byte) 1, (int) (short) 0, paymentOption26, "");
        boolean boolean29 = parkingLot19.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray30 = new observer.ParkingSpace[] {};
        parkingLot19.setSpaces(parkingSpaceArray30);
        parkingLot19.setDisabled(false);
        booking8.setParkingLot(parkingLot19);
        template.User user36 = null;
        observer.ParkingLot parkingLot37 = null;
        observer.ParkingSpace parkingSpace38 = null;
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(1, user36, parkingLot37, parkingSpace38, (int) 'a', (int) 'a', paymentOption41, "");
        observer.ParkingSpace parkingSpace44 = new observer.ParkingSpace();
        parkingSpace44.setDisabled(true);
        observer.ParkingLot parkingLot47 = parkingSpace44.getParkingLot();
        booking43.setParkingSpace(parkingSpace44);
        booking43.setEndTime(0);
        factory.PaymentOption paymentOption51 = null;
        booking43.setPaymentOption(paymentOption51);
        observer.ParkingSpace parkingSpace53 = booking43.getParkingSpace();
        observer.ParkingLot parkingLot58 = null;
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot58);
        booking43.setParkingSpace(parkingSpace59);
        template.User user62 = null;
        observer.ParkingLot parkingLot66 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace67 = new observer.ParkingSpace();
        parkingSpace67.setDisabled(true);
        boolean boolean70 = parkingSpace67.isTaken();
        factory.PaymentOption paymentOption73 = null;
        observer.Booking booking75 = new observer.Booking(100, user62, parkingLot66, parkingSpace67, (int) (byte) 1, (int) (short) 0, paymentOption73, "");
        observer.ParkingLot parkingLot79 = new observer.ParkingLot(0, false, "");
        parkingSpace67.setParkingLot(parkingLot79);
        parkingSpace59.setParkingLot(parkingLot79);
        parkingLot79.setDisabled(true);
        booking8.setParkingLot(parkingLot79);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot47);
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        booking8.setStartTime(97);
        booking8.setEndTime((int) ' ');
        booking8.setLicense("hi!");
        observer.ParkingLot parkingLot23 = booking8.getParkingLot();
        factory.PaymentOption paymentOption24 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertNull(paymentOption24);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str15 = booking8.getLicense();
        booking8.setEndTime((int) (short) 100);
        booking8.setEndTime(32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        int int11 = parkingLot9.getId();
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot16);
        parkingSpace17.setDisabled(true);
        parkingSpace17.setLocation("hi!");
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking((-100), user5, parkingLot9, parkingSpace17, (int) (byte) -1, (int) (short) 10, paymentOption24, "");
        int int27 = booking26.getId();
        observer.ParkingLot parkingLot28 = booking26.getParkingLot();
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace(0, "", true, false, parkingLot28);
        int int30 = parkingSpace29.getLotID();
        java.lang.String str31 = parkingSpace29.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertNotNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int13 = booking8.getId();
        template.User user15 = null;
        observer.ParkingLot parkingLot19 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        parkingSpace20.setDisabled(true);
        boolean boolean23 = parkingSpace20.isTaken();
        factory.PaymentOption paymentOption26 = null;
        observer.Booking booking28 = new observer.Booking(100, user15, parkingLot19, parkingSpace20, (int) (byte) 1, (int) (short) 0, paymentOption26, "");
        observer.ParkingSpace[] parkingSpaceArray29 = parkingLot19.getSpaces();
        parkingLot19.setId((int) 'a');
        template.User user33 = null;
        observer.ParkingLot parkingLot37 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setDisabled(true);
        boolean boolean41 = parkingSpace38.isTaken();
        factory.PaymentOption paymentOption44 = null;
        observer.Booking booking46 = new observer.Booking(100, user33, parkingLot37, parkingSpace38, (int) (byte) 1, (int) (short) 0, paymentOption44, "");
        boolean boolean47 = parkingLot37.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray48 = new observer.ParkingSpace[] {};
        parkingLot37.setSpaces(parkingSpaceArray48);
        parkingLot19.setSpaces(parkingSpaceArray48);
        booking8.setParkingLot(parkingLot19);
        parkingLot19.setId(4838);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray48, new observer.ParkingSpace[] {});
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        factory.PaymentOption paymentOption16 = null;
        booking8.setPaymentOption(paymentOption16);
        observer.ParkingSpace parkingSpace18 = booking8.getParkingSpace();
        observer.ParkingLot parkingLot23 = null;
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot23);
        booking8.setParkingSpace(parkingSpace24);
        booking8.setId((-1));
        int int28 = booking8.getId();
        observer.ParkingSpace parkingSpace29 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(parkingSpace29);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user20 = booking8.getUser();
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot24 = parkingSpace21.getParkingLot();
        boolean boolean25 = parkingSpace21.isDisabled();
        booking8.setParkingSpace(parkingSpace21);
        java.lang.String str27 = parkingSpace21.getLocation();
        observer.ParkingLot parkingLot28 = parkingSpace21.getParkingLot();
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        java.lang.String str33 = parkingLot32.getLocation();
        parkingLot32.setId((int) ' ');
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot41.getSpaces();
        parkingLot41.setId(97);
        observer.ParkingSpace[] parkingSpaceArray54 = parkingLot41.getSpaces();
        parkingLot32.setSpaces(parkingSpaceArray54);
        boolean boolean56 = parkingLot32.isDisabled();
        parkingSpace21.setParkingLot(parkingLot32);
        parkingSpace21.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertNotNull(parkingSpaceArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        booking8.setId((int) (byte) -1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        booking8.setLicense("hi!");
        int int20 = booking8.getTotalCost((int) (short) -1, (-970), 6500);
        int int21 = booking8.getId();
        int int25 = booking8.getTotalCost(100, 5148000, 0);
        factory.PaymentOption paymentOption26 = null;
        booking8.setPaymentOption(paymentOption26);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6298500) + "'", int20 == (-6298500));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        template.User user1 = null;
        template.User user3 = null;
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = null;
        factory.PaymentOption paymentOption8 = null;
        observer.Booking booking10 = new observer.Booking(1, user3, parkingLot4, parkingSpace5, (int) 'a', (int) 'a', paymentOption8, "");
        booking10.setId((int) ' ');
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(5148);
        booking10.setParkingLot(parkingLot18);
        boolean boolean32 = parkingLot18.isDisabled();
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        java.lang.String str36 = parkingSpace33.getLocation();
        observer.ParkingLot parkingLot37 = null;
        parkingSpace33.setParkingLot(parkingLot37);
        parkingSpace33.setTaken(true);
        template.User user42 = null;
        observer.ParkingLot parkingLot46 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace47 = new observer.ParkingSpace();
        parkingSpace47.setDisabled(true);
        boolean boolean50 = parkingSpace47.isTaken();
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(100, user42, parkingLot46, parkingSpace47, (int) (byte) 1, (int) (short) 0, paymentOption53, "");
        boolean boolean56 = parkingLot46.isDisabled();
        parkingSpace33.setParkingLot(parkingLot46);
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking((-100), user1, parkingLot18, parkingSpace33, 563000, (int) (byte) 1, paymentOption60, "");
        observer.ParkingLot parkingLot63 = parkingSpace33.getParkingLot();
        parkingSpace33.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parkingLot63);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-990), true, "hi!");
        parkingLot3.setDisabled(true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption15 = booking8.getPaymentOption();
        template.User user17 = null;
        observer.ParkingLot parkingLot18 = null;
        observer.ParkingSpace parkingSpace19 = null;
        factory.PaymentOption paymentOption22 = null;
        observer.Booking booking24 = new observer.Booking(1, user17, parkingLot18, parkingSpace19, (int) 'a', (int) 'a', paymentOption22, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        observer.ParkingLot parkingLot28 = parkingSpace25.getParkingLot();
        booking24.setParkingSpace(parkingSpace25);
        booking24.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace();
        booking24.setParkingSpace(parkingSpace32);
        java.lang.String str34 = booking24.getLicense();
        observer.ParkingSpace parkingSpace35 = booking24.getParkingSpace();
        boolean boolean36 = parkingSpace35.isDisabled();
        parkingSpace35.setTaken(true);
        boolean boolean39 = parkingSpace35.isTaken();
        booking8.setParkingSpace(parkingSpace35);
        booking8.setEndTime(100);
        observer.ParkingSpace parkingSpace43 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parkingSpace43);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        booking8.setParkingSpace(parkingSpace16);
        java.lang.String str18 = booking8.getLicense();
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        boolean boolean20 = parkingSpace19.isTaken();
        java.lang.String str21 = parkingSpace19.getLocation();
        template.User user27 = null;
        observer.ParkingLot parkingLot28 = null;
        observer.ParkingSpace parkingSpace29 = null;
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(1, user27, parkingLot28, parkingSpace29, (int) 'a', (int) 'a', paymentOption32, "");
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace();
        parkingSpace35.setDisabled(true);
        observer.ParkingLot parkingLot38 = parkingSpace35.getParkingLot();
        booking34.setParkingSpace(parkingSpace35);
        booking34.setEndTime(0);
        factory.PaymentOption paymentOption42 = null;
        booking34.setPaymentOption(paymentOption42);
        observer.ParkingSpace parkingSpace44 = booking34.getParkingSpace();
        observer.ParkingLot parkingLot49 = null;
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot49);
        booking34.setParkingSpace(parkingSpace50);
        template.User user53 = null;
        observer.ParkingLot parkingLot57 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace58 = new observer.ParkingSpace();
        parkingSpace58.setDisabled(true);
        boolean boolean61 = parkingSpace58.isTaken();
        factory.PaymentOption paymentOption64 = null;
        observer.Booking booking66 = new observer.Booking(100, user53, parkingLot57, parkingSpace58, (int) (byte) 1, (int) (short) 0, paymentOption64, "");
        observer.ParkingLot parkingLot70 = new observer.ParkingLot(0, false, "");
        parkingSpace58.setParkingLot(parkingLot70);
        parkingSpace50.setParkingLot(parkingLot70);
        parkingLot70.setDisabled(true);
        observer.ParkingSpace parkingSpace75 = new observer.ParkingSpace((-36470), "hi!", true, true, parkingLot70);
        parkingSpace19.setParkingLot(parkingLot70);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(parkingLot38);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-100), false, "");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        booking8.setEndTime(0);
        java.lang.String str16 = booking8.getLicense();
        factory.PaymentOption paymentOption17 = null;
        booking8.setPaymentOption(paymentOption17);
        int int19 = booking8.getId();
        java.lang.Class<?> wildcardClass20 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

