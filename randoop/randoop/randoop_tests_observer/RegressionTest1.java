package randoop.randoop_tests_observer;

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        booking8.setStartTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        observer.ParkingLot parkingLot11 = booking8.getParkingLot();
        observer.ParkingLot parkingLot12 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        factory.PaymentOption paymentOption63 = booking62.getPaymentOption();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(paymentOption63);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        int int21 = booking8.getTotalCost(35, (-6298500), 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-327523820) + "'", int21 == (-327523820));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        int int49 = parkingLot7.getId();
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot7.getSpaces();
        int int51 = parkingLot7.getId();
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(97, false, "hi!");
        booking8.setParkingLot(parkingLot23);
        booking8.setLicense("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        parkingSpace44.setId(35);
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
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        boolean boolean10 = parkingSpace9.isTaken();
        int int11 = parkingSpace9.getLotID();
        parkingSpace9.setId((int) '#');
        parkingSpace9.setTaken(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        int int33 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        boolean boolean19 = parkingLot9.isDisabled();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace(6500, "", false, false, parkingLot9);
        int int21 = parkingSpace20.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6500 + "'", int21 == 6500);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getId();
        observer.ParkingSpace parkingSpace12 = booking8.getParkingSpace();
        int int13 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        java.lang.String str31 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace(10, "", false, false, parkingLot7);
        java.lang.String str33 = parkingSpace32.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        parkingSpace19.setTaken(false);
        int int46 = parkingSpace19.getId();
        java.lang.String str47 = parkingSpace19.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        booking8.setLicense("");
        booking8.setStartTime((int) (short) 100);
        template.User user15 = null;
        booking8.setUser(user15);
        int int17 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        template.User user22 = null;
        booking8.setUser(user22);
        booking8.setId((-100));
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6298500) + "'", int20 == (-6298500));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        boolean boolean40 = parkingSpace32.isTaken();
        parkingSpace32.setLocation("");
        template.User user44 = null;
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace49 = new observer.ParkingSpace();
        parkingSpace49.setDisabled(true);
        boolean boolean52 = parkingSpace49.isTaken();
        factory.PaymentOption paymentOption55 = null;
        observer.Booking booking57 = new observer.Booking(100, user44, parkingLot48, parkingSpace49, (int) (byte) 1, (int) (short) 0, paymentOption55, "");
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        parkingSpace49.setParkingLot(parkingLot61);
        parkingLot61.setDisabled(false);
        parkingSpace32.setParkingLot(parkingLot61);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        parkingLot18.setId((int) (byte) 1);
        int int23 = parkingLot18.getId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        observer.ParkingSpace[] parkingSpaceArray5 = parkingLot3.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray6 = parkingLot3.getSpaces();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        org.junit.Assert.assertNotNull(parkingSpaceArray6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        parkingLot46.setDisabled(true);
        boolean boolean51 = parkingLot46.isDisabled();
        template.User user53 = null;
        observer.ParkingLot parkingLot54 = null;
        observer.ParkingSpace parkingSpace55 = null;
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(1, user53, parkingLot54, parkingSpace55, (int) 'a', (int) 'a', paymentOption58, "");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        observer.ParkingLot parkingLot64 = parkingSpace61.getParkingLot();
        booking60.setParkingSpace(parkingSpace61);
        booking60.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace();
        booking60.setParkingSpace(parkingSpace68);
        java.lang.String str70 = booking60.getLicense();
        observer.ParkingSpace parkingSpace71 = booking60.getParkingSpace();
        boolean boolean72 = parkingSpace71.isDisabled();
        parkingSpace71.setTaken(true);
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking(10, user1, parkingLot46, parkingSpace71, 4838, (int) 'a', paymentOption77, "");
        observer.ParkingSpace parkingSpace80 = new observer.ParkingSpace();
        parkingSpace80.setDisabled(true);
        java.lang.String str83 = parkingSpace80.getLocation();
        parkingSpace80.setDisabled(false);
        observer.ParkingLot parkingLot86 = parkingSpace80.getParkingLot();
        parkingSpace80.setDisabled(false);
        booking79.setParkingSpace(parkingSpace80);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(parkingLot64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(parkingSpace71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(parkingLot86);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        booking8.setEndTime((int) '4');
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        template.User user45 = null;
        observer.ParkingLot parkingLot46 = null;
        observer.ParkingSpace parkingSpace47 = null;
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(1, user45, parkingLot46, parkingSpace47, (int) 'a', (int) 'a', paymentOption50, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        observer.ParkingLot parkingLot56 = parkingSpace53.getParkingLot();
        booking52.setParkingSpace(parkingSpace53);
        booking52.setEndTime(0);
        factory.PaymentOption paymentOption60 = null;
        booking52.setPaymentOption(paymentOption60);
        observer.ParkingSpace parkingSpace62 = booking52.getParkingSpace();
        parkingSpace62.setLocation("");
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking((int) (byte) 0, user1, parkingLot40, parkingSpace62, (int) (byte) 1, (-22), paymentOption67, "hi!");
        boolean boolean70 = parkingLot40.isDisabled();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray42);
        org.junit.Assert.assertNull(parkingLot56);
        org.junit.Assert.assertNotNull(parkingSpace62);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        booking8.setId((int) (short) 10);
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(paymentOption18);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str21 = parkingLot20.getLocation();
        parkingSpace5.setParkingLot(parkingLot20);
        observer.ParkingLot parkingLot23 = parkingSpace5.getParkingLot();
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        parkingSpace24.setDisabled(true);
        java.lang.String str27 = parkingSpace24.getLocation();
        parkingSpace24.setDisabled(false);
        observer.ParkingLot parkingLot30 = parkingSpace24.getParkingLot();
        parkingSpace24.setDisabled(false);
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking((int) (byte) 0, user1, parkingLot23, parkingSpace24, (-970), 10, paymentOption35, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int38 = parkingSpace24.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(parkingLot23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(parkingLot30);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        observer.ParkingLot parkingLot16 = parkingSpace13.getParkingLot();
        booking12.setParkingSpace(parkingSpace13);
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
        parkingLot23.setDisabled(false);
        booking12.setParkingLot(parkingLot23);
        observer.ParkingSpace[] parkingSpaceArray39 = parkingLot23.getSpaces();
        template.User user41 = null;
        observer.ParkingLot parkingLot42 = null;
        observer.ParkingSpace parkingSpace43 = null;
        factory.PaymentOption paymentOption46 = null;
        observer.Booking booking48 = new observer.Booking(1, user41, parkingLot42, parkingSpace43, (int) 'a', (int) 'a', paymentOption46, "");
        observer.ParkingSpace parkingSpace49 = new observer.ParkingSpace();
        parkingSpace49.setDisabled(true);
        observer.ParkingLot parkingLot52 = parkingSpace49.getParkingLot();
        booking48.setParkingSpace(parkingSpace49);
        template.User user55 = null;
        observer.ParkingLot parkingLot59 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace60 = new observer.ParkingSpace();
        parkingSpace60.setDisabled(true);
        boolean boolean63 = parkingSpace60.isTaken();
        factory.PaymentOption paymentOption66 = null;
        observer.Booking booking68 = new observer.Booking(100, user55, parkingLot59, parkingSpace60, (int) (byte) 1, (int) (short) 0, paymentOption66, "");
        boolean boolean69 = parkingLot59.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray70 = new observer.ParkingSpace[] {};
        parkingLot59.setSpaces(parkingSpaceArray70);
        parkingLot59.setDisabled(false);
        booking48.setParkingLot(parkingLot59);
        observer.ParkingSpace[] parkingSpaceArray75 = parkingLot59.getSpaces();
        parkingLot23.setSpaces(parkingSpaceArray75);
        observer.ParkingSpace parkingSpace77 = new observer.ParkingSpace((-36470), "", true, false, parkingLot23);
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray34, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray39);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray39, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray70);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray70, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray75);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray75, new observer.ParkingSpace[] {});
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        booking25.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        booking25.setParkingSpace(parkingSpace33);
        java.lang.String str35 = booking25.getLicense();
        observer.ParkingSpace parkingSpace36 = booking25.getParkingSpace();
        boolean boolean37 = parkingSpace36.isTaken();
        java.lang.String str38 = parkingSpace36.getLocation();
        booking8.setParkingSpace(parkingSpace36);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(parkingLot29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        booking8.setEndTime(0);
        int int18 = booking8.getId();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-22) + "'", int18 == (-22));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(9900, false, "hi!");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        int int26 = booking8.getTotalCost(1, 310, (int) '4');
        factory.PaymentOption paymentOption27 = booking8.getPaymentOption();
        observer.ParkingLot parkingLot28 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16068 + "'", int26 == 16068);
        org.junit.Assert.assertNull(paymentOption27);
        org.junit.Assert.assertNull(parkingLot28);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        int int46 = parkingSpace33.getId();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        template.User user29 = booking8.getUser();
        int int33 = booking8.getTotalCost(10, 772200, 97);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 74902430 + "'", int33 == 74902430);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        template.User user13 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot21);
        parkingLot21.setId(2146977336);
        template.User user26 = null;
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        boolean boolean36 = parkingSpace33.isTaken();
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(100, user28, parkingLot32, parkingSpace33, (int) (byte) 1, (int) (short) 0, paymentOption39, "");
        observer.ParkingLot parkingLot45 = new observer.ParkingLot(0, false, "");
        parkingSpace33.setParkingLot(parkingLot45);
        parkingLot45.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot45.getSpaces();
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        parkingSpace50.setDisabled(true);
        java.lang.String str53 = parkingSpace50.getLocation();
        parkingSpace50.setDisabled(false);
        observer.ParkingLot parkingLot56 = parkingSpace50.getParkingLot();
        parkingSpace50.setId((int) (short) 1);
        factory.PaymentOption paymentOption61 = null;
        observer.Booking booking63 = new observer.Booking((int) (short) 0, user26, parkingLot45, parkingSpace50, (int) (short) 1, 6500, paymentOption61, "");
        factory.PaymentOption paymentOption66 = null;
        observer.Booking booking68 = new observer.Booking((int) ' ', user13, parkingLot21, parkingSpace50, 52, 1100, paymentOption66, "hi!");
        parkingSpace0.setParkingLot(parkingLot21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(parkingLot56);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        int int23 = booking8.getTotalCost((-13858600), 100, 4838);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1671086136) + "'", int23 == (-1671086136));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        java.lang.String str26 = parkingSpace0.getLocation();
        java.lang.String str27 = parkingSpace0.getLocation();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        template.User user55 = null;
        observer.ParkingLot parkingLot59 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace60 = new observer.ParkingSpace();
        parkingSpace60.setDisabled(true);
        boolean boolean63 = parkingSpace60.isTaken();
        factory.PaymentOption paymentOption66 = null;
        observer.Booking booking68 = new observer.Booking(100, user55, parkingLot59, parkingSpace60, (int) (byte) 1, (int) (short) 0, paymentOption66, "");
        parkingLot59.setId(0);
        int int71 = parkingLot59.getId();
        parkingLot59.setLocation("");
        booking53.setParkingLot(parkingLot59);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(false);
        parkingSpace5.setDisabled(false);
        java.lang.String str10 = parkingSpace5.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        java.lang.String str19 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        boolean boolean37 = parkingSpace3.isDisabled();
        observer.ParkingLot parkingLot38 = parkingSpace3.getParkingLot();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(parkingLot38);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        int int21 = booking8.getTotalCost(629847800, (-70), (-22));
        int int22 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 971751252 + "'", int21 == 971751252);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot19.getSpaces();
        parkingLot19.setId((int) (byte) -1);
        observer.ParkingSpace[] parkingSpaceArray38 = parkingLot19.getSpaces();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray35, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray38);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray38, new observer.ParkingSpace[] {});
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', true, "");
        boolean boolean4 = parkingLot3.isDisabled();
        boolean boolean5 = parkingLot3.isDisabled();
        parkingLot3.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int16 = booking8.getTotalCost((int) ' ', (-6298500), 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-62985320) + "'", int16 == (-62985320));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        parkingLot9.setId(0);
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace((-22), "hi!", false, true, parkingLot9);
        parkingLot9.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        int int57 = booking55.getId();
        java.lang.Class<?> wildcardClass58 = booking55.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray18, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot36);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNull(user56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        parkingLot46.setDisabled(true);
        boolean boolean51 = parkingLot46.isDisabled();
        template.User user53 = null;
        observer.ParkingLot parkingLot54 = null;
        observer.ParkingSpace parkingSpace55 = null;
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(1, user53, parkingLot54, parkingSpace55, (int) 'a', (int) 'a', paymentOption58, "");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        observer.ParkingLot parkingLot64 = parkingSpace61.getParkingLot();
        booking60.setParkingSpace(parkingSpace61);
        booking60.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace();
        booking60.setParkingSpace(parkingSpace68);
        java.lang.String str70 = booking60.getLicense();
        observer.ParkingSpace parkingSpace71 = booking60.getParkingSpace();
        boolean boolean72 = parkingSpace71.isDisabled();
        parkingSpace71.setTaken(true);
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking(10, user1, parkingLot46, parkingSpace71, 4838, (int) 'a', paymentOption77, "");
        java.lang.String str80 = parkingLot46.getLocation();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(parkingLot64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(parkingSpace71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        factory.PaymentOption paymentOption62 = booking8.getPaymentOption();
        java.lang.String str63 = booking8.getLicense();
        booking8.setId(310);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(paymentOption62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        observer.ParkingLot parkingLot65 = booking8.getParkingLot();
        booking8.setEndTime((-36470));
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertNull(parkingLot65);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        parkingSpace24.setTaken(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        template.User user29 = booking8.getUser();
        template.User user30 = null;
        booking8.setUser(user30);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot5.getSpaces();
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        boolean boolean30 = parkingSpace27.isTaken();
        factory.PaymentOption paymentOption33 = null;
        observer.Booking booking35 = new observer.Booking(100, user22, parkingLot26, parkingSpace27, (int) (byte) 1, (int) (short) 0, paymentOption33, "");
        boolean boolean36 = parkingLot26.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray37 = new observer.ParkingSpace[] {};
        parkingLot26.setSpaces(parkingSpaceArray37);
        parkingLot5.setSpaces(parkingSpaceArray37);
        parkingLot5.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray16, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray20, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray37, new observer.ParkingSpace[] {});
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        observer.ParkingLot parkingLot64 = parkingSpace51.getParkingLot();
        parkingSpace51.setDisabled(false);
        java.lang.String str67 = parkingSpace51.getLocation();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot64);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(16068, false, "hi!");
        parkingLot3.setLocation("hi!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        int int14 = booking8.getId();
        java.lang.String str15 = booking8.getLicense();
        observer.ParkingSpace parkingSpace16 = booking8.getParkingSpace();
        booking8.setEndTime(1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        java.lang.String str27 = parkingLot26.getLocation();
        int int28 = parkingLot26.getId();
        observer.ParkingLot parkingLot33 = null;
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot33);
        parkingSpace34.setDisabled(true);
        parkingSpace34.setLocation("hi!");
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((-100), user22, parkingLot26, parkingSpace34, (int) (byte) -1, (int) (short) 10, paymentOption41, "");
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot47.getSpaces();
        parkingLot26.setSpaces(parkingSpaceArray48);
        booking8.setParkingLot(parkingLot26);
        int int54 = booking8.getTotalCost(9900, (-22), 6500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-64493000) + "'", int54 == (-64493000));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        java.lang.String str22 = parkingSpace19.getLocation();
        observer.ParkingLot parkingLot23 = null;
        parkingSpace19.setParkingLot(parkingLot23);
        parkingSpace19.setTaken(true);
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        boolean boolean36 = parkingSpace33.isTaken();
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(100, user28, parkingLot32, parkingSpace33, (int) (byte) 1, (int) (short) 0, paymentOption39, "");
        boolean boolean42 = parkingLot32.isDisabled();
        parkingSpace19.setParkingLot(parkingLot32);
        parkingLot32.setLocation("hi!");
        booking8.setParkingLot(parkingLot32);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        template.User user17 = null;
        booking8.setUser(user17);
        int int22 = booking8.getTotalCost(0, (-166976), (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16697600 + "'", int22 == 16697600);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        int int17 = booking8.getId();
        int int18 = booking8.getId();
        java.lang.String str19 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(false);
        boolean boolean8 = parkingSpace5.isDisabled();
        boolean boolean9 = parkingSpace5.isTaken();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        observer.ParkingLot parkingLot45 = parkingSpace33.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(parkingLot45);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        template.User user63 = null;
        observer.ParkingLot parkingLot67 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace68 = new observer.ParkingSpace();
        parkingSpace68.setDisabled(true);
        boolean boolean71 = parkingSpace68.isTaken();
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking(100, user63, parkingLot67, parkingSpace68, (int) (byte) 1, (int) (short) 0, paymentOption74, "");
        observer.ParkingSpace[] parkingSpaceArray77 = parkingLot67.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray78 = parkingLot67.getSpaces();
        parkingLot46.setSpaces(parkingSpaceArray78);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray77);
        org.junit.Assert.assertNotNull(parkingSpaceArray78);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        int int54 = parkingSpace46.getId();
        parkingSpace46.setLocation("hi!");
        parkingSpace46.setTaken(true);
        parkingSpace46.setDisabled(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        factory.PaymentOption paymentOption22 = null;
        booking8.setPaymentOption(paymentOption22);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 10, true, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        parkingLot55.setLocation("hi!");
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
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.lang.String str25 = parkingSpace24.getLocation();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        boolean boolean15 = parkingSpace6.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        int int72 = booking61.getStartTime();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6500 + "'", int72 == 6500);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        booking8.setEndTime((-100));
        booking8.setLicense("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        template.User user26 = null;
        observer.ParkingLot parkingLot30 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot35 = null;
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot35);
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(0, user26, parkingLot30, parkingSpace36, (int) (short) -1, (int) (byte) 0, paymentOption39, "hi!");
        template.User user43 = null;
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        boolean boolean51 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking(100, user43, parkingLot47, parkingSpace48, (int) (byte) 1, (int) (short) 0, paymentOption54, "");
        observer.ParkingSpace[] parkingSpaceArray57 = parkingLot47.getSpaces();
        parkingLot30.setSpaces(parkingSpaceArray57);
        observer.ParkingSpace[] parkingSpaceArray59 = parkingLot30.getSpaces();
        parkingLot13.setSpaces(parkingSpaceArray59);
        int int61 = parkingLot13.getId();
        boolean boolean62 = parkingLot13.isDisabled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray57);
        org.junit.Assert.assertNotNull(parkingSpaceArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        java.lang.String str27 = parkingLot26.getLocation();
        int int28 = parkingLot26.getId();
        observer.ParkingLot parkingLot33 = null;
        observer.ParkingSpace parkingSpace34 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot33);
        parkingSpace34.setDisabled(true);
        parkingSpace34.setLocation("hi!");
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking((-100), user22, parkingLot26, parkingSpace34, (int) (byte) -1, (int) (short) 10, paymentOption41, "");
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot47.getSpaces();
        parkingLot26.setSpaces(parkingSpaceArray48);
        booking8.setParkingLot(parkingLot26);
        java.lang.String str51 = parkingLot26.getLocation();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        int int19 = booking8.getStartTime();
        template.User user20 = null;
        booking8.setUser(user20);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        observer.ParkingLot parkingLot16 = parkingSpace13.getParkingLot();
        booking12.setParkingSpace(parkingSpace13);
        booking12.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        booking12.setParkingSpace(parkingSpace20);
        java.lang.String str22 = booking12.getLicense();
        observer.ParkingSpace parkingSpace23 = booking12.getParkingSpace();
        template.User user24 = booking12.getUser();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        observer.ParkingLot parkingLot28 = parkingSpace25.getParkingLot();
        boolean boolean29 = parkingSpace25.isDisabled();
        booking12.setParkingSpace(parkingSpace25);
        template.User user32 = null;
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        boolean boolean40 = parkingSpace37.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(100, user32, parkingLot36, parkingSpace37, (int) (byte) 1, (int) (short) 0, paymentOption43, "");
        boolean boolean46 = parkingLot36.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray47 = new observer.ParkingSpace[] {};
        parkingLot36.setSpaces(parkingSpaceArray47);
        parkingLot36.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot36.getSpaces();
        parkingSpace25.setParkingLot(parkingLot36);
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace((-93322944), "", false, false, parkingLot36);
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        java.lang.String str62 = parkingLot61.getLocation();
        parkingLot61.setId((int) ' ');
        template.User user66 = null;
        observer.ParkingLot parkingLot70 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace71 = new observer.ParkingSpace();
        parkingSpace71.setDisabled(true);
        boolean boolean74 = parkingSpace71.isTaken();
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking(100, user66, parkingLot70, parkingSpace71, (int) (byte) 1, (int) (short) 0, paymentOption77, "");
        observer.ParkingSpace[] parkingSpaceArray80 = parkingLot70.getSpaces();
        parkingLot70.setId(97);
        observer.ParkingSpace[] parkingSpaceArray83 = parkingLot70.getSpaces();
        parkingLot61.setSpaces(parkingSpaceArray83);
        java.lang.String str85 = parkingLot61.getLocation();
        observer.ParkingSpace parkingSpace86 = new observer.ParkingSpace(10, "", false, false, parkingLot61);
        observer.ParkingSpace[] parkingSpaceArray87 = parkingLot61.getSpaces();
        parkingLot36.setSpaces(parkingSpaceArray87);
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray47);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray47, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray51, new observer.ParkingSpace[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray80);
        org.junit.Assert.assertNotNull(parkingSpaceArray83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray87);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        parkingLot5.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray34, new observer.ParkingSpace[] {});
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        parkingLot76.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        boolean boolean4 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        boolean boolean6 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot7 = parkingSpace0.getParkingLot();
        observer.ParkingLot parkingLot8 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        booking8.setId(10);
        template.User user22 = null;
        booking8.setUser(user22);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        booking84.setEndTime((int) (short) 10);
        template.User user87 = booking84.getUser();
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
        org.junit.Assert.assertNull(user87);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        observer.ParkingSpace[] parkingSpaceArray5 = parkingLot3.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray6 = parkingLot3.getSpaces();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        org.junit.Assert.assertNotNull(parkingSpaceArray6);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int11 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        booking8.setId(0);
        booking8.setLicense("hi!");
        booking8.setEndTime((-64493000));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        int int21 = booking8.getTotalCost((int) (byte) -1, (int) '#', 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3492 + "'", int21 == 3492);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        boolean boolean20 = parkingLot5.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        parkingSpace46.setTaken(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpace46);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        observer.ParkingLot parkingLot64 = parkingSpace51.getParkingLot();
        boolean boolean65 = parkingSpace51.isTaken();
        parkingSpace51.setTaken(true);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        factory.PaymentOption paymentOption14 = null;
        booking8.setPaymentOption(paymentOption14);
        template.User user16 = booking8.getUser();
        java.lang.String str17 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        observer.ParkingLot parkingLot42 = booking8.getParkingLot();
        int int43 = booking8.getStartTime();
        int int44 = booking8.getStartTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray40);
        org.junit.Assert.assertNotNull(parkingLot42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        java.lang.String str20 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        int int18 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(5148, false, "hi!");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) 10);
        booking8.setId(563000);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        booking8.setEndTime((int) (short) -1);
        factory.PaymentOption paymentOption21 = null;
        booking8.setPaymentOption(paymentOption21);
        int int23 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        parkingSpace19.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        parkingSpace37.setDisabled(false);
        parkingSpace37.setTaken(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(parkingSpace37);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        factory.PaymentOption paymentOption18 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(paymentOption18);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        booking61.setId((-990));
        template.User user66 = null;
        observer.ParkingLot parkingLot67 = null;
        observer.ParkingSpace parkingSpace68 = null;
        factory.PaymentOption paymentOption71 = null;
        observer.Booking booking73 = new observer.Booking(1, user66, parkingLot67, parkingSpace68, (int) 'a', (int) 'a', paymentOption71, "");
        observer.ParkingSpace parkingSpace74 = new observer.ParkingSpace();
        parkingSpace74.setDisabled(true);
        observer.ParkingLot parkingLot77 = parkingSpace74.getParkingLot();
        booking73.setParkingSpace(parkingSpace74);
        booking73.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace81 = new observer.ParkingSpace();
        booking73.setParkingSpace(parkingSpace81);
        java.lang.String str83 = booking73.getLicense();
        observer.ParkingSpace parkingSpace84 = booking73.getParkingSpace();
        template.User user85 = booking73.getUser();
        observer.ParkingSpace parkingSpace86 = new observer.ParkingSpace();
        parkingSpace86.setDisabled(true);
        observer.ParkingLot parkingLot89 = parkingSpace86.getParkingLot();
        boolean boolean90 = parkingSpace86.isDisabled();
        booking73.setParkingSpace(parkingSpace86);
        java.lang.String str92 = parkingSpace86.getLocation();
        observer.ParkingLot parkingLot93 = parkingSpace86.getParkingLot();
        booking61.setParkingSpace(parkingSpace86);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(parkingLot77);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(parkingSpace84);
        org.junit.Assert.assertNull(user85);
        org.junit.Assert.assertNull(parkingLot89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(parkingLot93);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        template.User user30 = null;
        observer.ParkingLot parkingLot31 = null;
        observer.ParkingSpace parkingSpace32 = null;
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(1, user30, parkingLot31, parkingSpace32, (int) 'a', (int) 'a', paymentOption35, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setDisabled(true);
        observer.ParkingLot parkingLot41 = parkingSpace38.getParkingLot();
        booking37.setParkingSpace(parkingSpace38);
        booking37.setEndTime(0);
        factory.PaymentOption paymentOption45 = null;
        booking37.setPaymentOption(paymentOption45);
        observer.ParkingSpace parkingSpace47 = booking37.getParkingSpace();
        observer.ParkingLot parkingLot52 = null;
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot52);
        booking37.setParkingSpace(parkingSpace53);
        template.User user56 = null;
        observer.ParkingLot parkingLot60 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        boolean boolean64 = parkingSpace61.isTaken();
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking(100, user56, parkingLot60, parkingSpace61, (int) (byte) 1, (int) (short) 0, paymentOption67, "");
        observer.ParkingLot parkingLot73 = new observer.ParkingLot(0, false, "");
        parkingSpace61.setParkingLot(parkingLot73);
        parkingSpace53.setParkingLot(parkingLot73);
        boolean boolean76 = parkingLot73.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray77 = parkingLot73.getSpaces();
        java.lang.String str78 = parkingLot73.getLocation();
        booking8.setParkingLot(parkingLot73);
        parkingLot73.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(parkingLot41);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        observer.ParkingSpace parkingSpace13 = booking8.getParkingSpace();
        booking8.setLicense("hi!");
        observer.ParkingLot parkingLot16 = booking8.getParkingLot();
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingSpace13);
        org.junit.Assert.assertNull(parkingLot16);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        java.lang.String str68 = booking61.getLicense();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        parkingLot21.setId(1100);
        parkingLot21.setDisabled(false);
        parkingLot21.setDisabled(true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
        observer.ParkingLot parkingLot38 = parkingSpace32.getParkingLot();
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        java.lang.String str43 = parkingLot42.getLocation();
        parkingLot42.setId((int) ' ');
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot42.getSpaces();
        parkingSpace32.setParkingLot(parkingLot42);
        observer.ParkingSpace[] parkingSpaceArray48 = parkingLot42.getSpaces();
        parkingLot42.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingLot38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        int int18 = booking8.getEndTime();
        int int19 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
        int int47 = parkingSpace24.getLotID();
        java.lang.String str48 = parkingSpace24.getLocation();
        parkingSpace24.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        int int24 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        observer.ParkingSpace parkingSpace11 = booking8.getParkingSpace();
        booking8.setId((int) (short) 100);
        int int14 = booking8.getId();
        org.junit.Assert.assertNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        parkingLot25.setId((-186496));
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(870, false, "");
        java.lang.String str6 = parkingLot5.getLocation();
        template.User user8 = null;
        observer.ParkingLot parkingLot9 = null;
        observer.ParkingSpace parkingSpace10 = null;
        factory.PaymentOption paymentOption13 = null;
        observer.Booking booking15 = new observer.Booking(1, user8, parkingLot9, parkingSpace10, (int) 'a', (int) 'a', paymentOption13, "");
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        parkingSpace16.setDisabled(true);
        observer.ParkingLot parkingLot19 = parkingSpace16.getParkingLot();
        booking15.setParkingSpace(parkingSpace16);
        booking15.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace23 = new observer.ParkingSpace();
        booking15.setParkingSpace(parkingSpace23);
        java.lang.String str25 = booking15.getLicense();
        observer.ParkingSpace parkingSpace26 = booking15.getParkingSpace();
        template.User user27 = booking15.getUser();
        booking15.setStartTime((int) (short) 100);
        observer.ParkingSpace parkingSpace30 = booking15.getParkingSpace();
        parkingSpace30.setDisabled(true);
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking((-166976), user1, parkingLot5, parkingSpace30, (-6298500), (-990), paymentOption35, "hi!");
        parkingSpace30.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(parkingLot19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertNotNull(parkingSpace30);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        boolean boolean44 = parkingSpace33.isTaken();
        observer.ParkingLot parkingLot45 = parkingSpace33.getParkingLot();
        java.lang.String str46 = parkingSpace33.getLocation();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(parkingLot45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        observer.ParkingSpace parkingSpace14 = booking8.getParkingSpace();
        java.lang.String str15 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace[] parkingSpaceArray9 = parkingLot7.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray9);
        parkingLot3.setLocation("");
        java.lang.String str13 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = booking13.getStartTime();
        java.lang.String str15 = booking13.getLicense();
        booking13.setEndTime((int) 'a');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5148 + "'", int14 == 5148);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        template.User user1 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot9);
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        int int12 = parkingSpace11.getId();
        parkingSpace11.setLocation("");
        parkingSpace11.setTaken(false);
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking((int) (short) 100, user1, parkingLot9, parkingSpace11, 52, (int) (byte) 0, paymentOption19, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '4', false, "hi!");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        parkingSpace0.setDisabled(true);
        parkingSpace0.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (byte) 1, true, "hi!");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        booking8.setId(2146977336);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
        booking8.setEndTime((int) ' ');
        booking8.setEndTime(74902430);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-100));
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        parkingSpace0.setTaken(false);
        parkingSpace0.setId(870);
        parkingSpace0.setTaken(true);
        parkingSpace0.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot5);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        boolean boolean4 = parkingSpace0.isDisabled();
        boolean boolean5 = parkingSpace0.isTaken();
        parkingSpace0.setId((int) (byte) 1);
        parkingSpace0.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        int int21 = parkingSpace3.getLotID();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setId(310);
        java.lang.String str9 = parkingLot3.getLocation();
        java.lang.String str10 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot19.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray36 = parkingLot19.getSpaces();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray35, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray36);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray36, new observer.ParkingSpace[] {});
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        boolean boolean58 = parkingSpace52.isDisabled();
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        int int22 = booking8.getTotalCost((int) (short) 0, 140866, 16068);
        int int23 = booking8.getEndTime();
        booking8.setEndTime(32);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2031532408) + "'", int22 == (-2031532408));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        java.lang.String str57 = parkingLot5.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parkingLot51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(32, false, "");
        template.User user7 = null;
        observer.ParkingLot parkingLot11 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot16);
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(0, user7, parkingLot11, parkingSpace17, (int) (short) -1, (int) (byte) 0, paymentOption20, "hi!");
        parkingSpace17.setTaken(true);
        parkingSpace17.setDisabled(true);
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(870, user1, parkingLot5, parkingSpace17, 9900, (int) (byte) 100, paymentOption29, "");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        int int62 = parkingLot11.getId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        observer.ParkingLot parkingLot24 = booking8.getParkingLot();
        factory.PaymentOption paymentOption25 = null;
        booking8.setPaymentOption(paymentOption25);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertNull(parkingLot24);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        boolean boolean8 = parkingSpace0.isTaken();
        parkingSpace0.setTaken(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        observer.ParkingLot parkingLot18 = booking8.getParkingLot();
        template.User user19 = booking8.getUser();
        observer.ParkingLot parkingLot20 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(parkingLot20);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        observer.ParkingLot parkingLot11 = parkingSpace8.getParkingLot();
        observer.ParkingSpace[] parkingSpaceArray12 = parkingLot11.getSpaces();
        org.junit.Assert.assertNotNull(parkingLot11);
        org.junit.Assert.assertNotNull(parkingSpaceArray12);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        observer.ParkingLot parkingLot16 = parkingSpace13.getParkingLot();
        booking12.setParkingSpace(parkingSpace13);
        booking12.setEndTime(0);
        factory.PaymentOption paymentOption20 = null;
        booking12.setPaymentOption(paymentOption20);
        observer.ParkingSpace parkingSpace22 = booking12.getParkingSpace();
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot27);
        booking12.setParkingSpace(parkingSpace28);
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        parkingSpace36.setParkingLot(parkingLot48);
        parkingSpace28.setParkingLot(parkingLot48);
        parkingLot48.setDisabled(true);
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace((-36470), "hi!", true, true, parkingLot48);
        boolean boolean54 = parkingSpace53.isDisabled();
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        parkingSpace46.setLocation("hi!");
        boolean boolean49 = parkingSpace46.isTaken();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(32, true, "");
        parkingLot3.setLocation("");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str4 = parkingLot3.getLocation();
        observer.ParkingSpace[] parkingSpaceArray5 = parkingLot3.getSpaces();
        java.lang.String str6 = parkingLot3.getLocation();
        int int7 = parkingLot3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        observer.ParkingLot parkingLot43 = new observer.ParkingLot(0, false, "");
        java.lang.String str44 = parkingLot43.getLocation();
        int int45 = parkingLot43.getId();
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot43);
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking(971751252, user1, parkingLot7, parkingSpace46, 310, (-1607647100), paymentOption49, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setDisabled(true);
        parkingLot3.setId((int) (short) -1);
        observer.ParkingSpace[] parkingSpaceArray11 = parkingLot3.getSpaces();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray11);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        booking8.setLicense("");
        int int23 = booking8.getTotalCost((int) (byte) -1, (-22), 16068);
        java.lang.String str24 = booking8.getLicense();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-337428) + "'", int23 == (-337428));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot27 = parkingSpace0.getParkingLot();
        parkingLot27.setDisabled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingLot27);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        observer.ParkingLot parkingLot66 = new observer.ParkingLot(0, false, "");
        java.lang.String str67 = parkingLot66.getLocation();
        parkingLot66.setId((int) ' ');
        parkingLot66.setId(310);
        java.lang.String str72 = parkingLot66.getLocation();
        observer.ParkingSpace[] parkingSpaceArray73 = parkingLot66.getSpaces();
        parkingLot18.setSpaces(parkingSpaceArray73);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNull(parkingLot46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray73);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        factory.PaymentOption paymentOption23 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(paymentOption23);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        observer.ParkingLot parkingLot16 = parkingSpace13.getParkingLot();
        booking12.setParkingSpace(parkingSpace13);
        booking12.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace();
        booking12.setParkingSpace(parkingSpace20);
        java.lang.String str22 = booking12.getLicense();
        observer.ParkingSpace parkingSpace23 = booking12.getParkingSpace();
        boolean boolean24 = parkingSpace23.isDisabled();
        parkingSpace23.setTaken(false);
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        boolean boolean36 = parkingSpace33.isTaken();
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(100, user28, parkingLot32, parkingSpace33, (int) (byte) 1, (int) (short) 0, paymentOption39, "");
        boolean boolean42 = parkingLot32.isDisabled();
        parkingLot32.setLocation("");
        parkingLot32.setLocation("hi!");
        parkingSpace23.setParkingLot(parkingLot32);
        parkingSpace23.setTaken(false);
        boolean boolean50 = parkingSpace23.isDisabled();
        template.User user52 = null;
        observer.ParkingLot parkingLot56 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace();
        parkingSpace57.setDisabled(true);
        boolean boolean60 = parkingSpace57.isTaken();
        factory.PaymentOption paymentOption63 = null;
        observer.Booking booking65 = new observer.Booking(100, user52, parkingLot56, parkingSpace57, (int) (byte) 1, (int) (short) 0, paymentOption63, "");
        observer.ParkingSpace[] parkingSpaceArray66 = parkingLot56.getSpaces();
        parkingLot56.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray69 = parkingLot56.getSpaces();
        int int70 = parkingLot56.getId();
        parkingSpace23.setParkingLot(parkingLot56);
        observer.ParkingSpace parkingSpace72 = new observer.ParkingSpace((-9), "", false, true, parkingLot56);
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray66);
        org.junit.Assert.assertNotNull(parkingSpaceArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 5148 + "'", int70 == 5148);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
        int int22 = booking8.getId();
        int int23 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        int int23 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        booking56.setLicense("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parkingLot51);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        template.User user30 = null;
        booking8.setUser(user30);
        template.User user32 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        booking8.setEndTime(0);
        observer.ParkingLot parkingLot25 = new observer.ParkingLot(0, false, "");
        java.lang.String str26 = parkingLot25.getLocation();
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot25);
        parkingLot25.setDisabled(false);
        booking8.setParkingLot(parkingLot25);
        booking8.setStartTime(10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        booking8.setId((int) (byte) -1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
        observer.ParkingSpace parkingSpace32 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(parkingSpace32);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
        // The following exception was thrown during execution in test generation
        try {
            int int66 = parkingSpace51.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
        observer.ParkingLot parkingLot66 = parkingSpace51.getParkingLot();
        int int67 = parkingSpace51.getId();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        parkingLot38.setDisabled(true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
        org.junit.Assert.assertNotNull(parkingLot38);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        int int19 = booking8.getStartTime();
        java.lang.String str20 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        parkingSpace8.setDisabled(false);
        boolean boolean13 = parkingSpace8.isTaken();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        boolean boolean15 = parkingSpace6.isTaken();
        parkingSpace6.setTaken(true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = parkingSpace6.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        boolean boolean7 = parkingSpace5.isTaken();
        parkingSpace5.setId(32);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = parkingSpace5.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
        template.User user31 = null;
        observer.ParkingLot parkingLot32 = null;
        observer.ParkingSpace parkingSpace33 = null;
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking(1, user31, parkingLot32, parkingSpace33, (int) 'a', (int) 'a', paymentOption36, "");
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        observer.ParkingLot parkingLot42 = parkingSpace39.getParkingLot();
        booking38.setParkingSpace(parkingSpace39);
        booking38.setEndTime(0);
        factory.PaymentOption paymentOption46 = null;
        booking38.setPaymentOption(paymentOption46);
        observer.ParkingSpace parkingSpace48 = booking38.getParkingSpace();
        observer.ParkingLot parkingLot53 = null;
        observer.ParkingSpace parkingSpace54 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot53);
        booking38.setParkingSpace(parkingSpace54);
        int int56 = parkingSpace54.getId();
        booking8.setParkingSpace(parkingSpace54);
        booking8.setId((int) (byte) -1);
        template.User user61 = null;
        observer.ParkingLot parkingLot65 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot70 = null;
        observer.ParkingSpace parkingSpace71 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot70);
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking(0, user61, parkingLot65, parkingSpace71, (int) (short) -1, (int) (byte) 0, paymentOption74, "hi!");
        parkingSpace71.setTaken(true);
        parkingSpace71.setLocation("");
        booking8.setParkingSpace(parkingSpace71);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        int int12 = booking8.getEndTime();
        template.User user13 = null;
        booking8.setUser(user13);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        template.User user14 = booking8.getUser();
        factory.PaymentOption paymentOption15 = null;
        booking8.setPaymentOption(paymentOption15);
        booking8.setLicense("");
        template.User user20 = null;
        observer.ParkingLot parkingLot21 = null;
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        java.lang.String str25 = parkingSpace22.getLocation();
        observer.ParkingLot parkingLot26 = null;
        parkingSpace22.setParkingLot(parkingLot26);
        factory.PaymentOption paymentOption30 = null;
        observer.Booking booking32 = new observer.Booking((int) (short) 0, user20, parkingLot21, parkingSpace22, 5148, (int) (short) 100, paymentOption30, "");
        int int33 = parkingSpace22.getId();
        template.User user35 = null;
        observer.ParkingLot parkingLot39 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        boolean boolean43 = parkingSpace40.isTaken();
        factory.PaymentOption paymentOption46 = null;
        observer.Booking booking48 = new observer.Booking(100, user35, parkingLot39, parkingSpace40, (int) (byte) 1, (int) (short) 0, paymentOption46, "");
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot39.getSpaces();
        parkingLot39.setId((int) 'a');
        template.User user53 = null;
        observer.ParkingLot parkingLot57 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace58 = new observer.ParkingSpace();
        parkingSpace58.setDisabled(true);
        boolean boolean61 = parkingSpace58.isTaken();
        factory.PaymentOption paymentOption64 = null;
        observer.Booking booking66 = new observer.Booking(100, user53, parkingLot57, parkingSpace58, (int) (byte) 1, (int) (short) 0, paymentOption64, "");
        boolean boolean67 = parkingLot57.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray68 = new observer.ParkingSpace[] {};
        parkingLot57.setSpaces(parkingSpaceArray68);
        parkingLot39.setSpaces(parkingSpaceArray68);
        parkingSpace22.setParkingLot(parkingLot39);
        booking8.setParkingSpace(parkingSpace22);
        parkingSpace22.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray68);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray68, new observer.ParkingSpace[] {});
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        parkingSpace18.setLocation("");
        parkingSpace18.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        observer.ParkingLot parkingLot69 = parkingSpace3.getParkingLot();
        java.lang.Class<?> wildcardClass70 = parkingLot69.getClass();
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
        org.junit.Assert.assertNotNull(parkingLot69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        booking45.setLicense("hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
        observer.ParkingLot parkingLot54 = parkingSpace3.getParkingLot();
        template.User user56 = null;
        observer.ParkingLot parkingLot60 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        boolean boolean64 = parkingSpace61.isTaken();
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking(100, user56, parkingLot60, parkingSpace61, (int) (byte) 1, (int) (short) 0, paymentOption67, "");
        observer.ParkingSpace[] parkingSpaceArray70 = parkingLot60.getSpaces();
        parkingLot60.setId((int) 'a');
        template.User user74 = null;
        observer.ParkingLot parkingLot78 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace79 = new observer.ParkingSpace();
        parkingSpace79.setDisabled(true);
        boolean boolean82 = parkingSpace79.isTaken();
        factory.PaymentOption paymentOption85 = null;
        observer.Booking booking87 = new observer.Booking(100, user74, parkingLot78, parkingSpace79, (int) (byte) 1, (int) (short) 0, paymentOption85, "");
        boolean boolean88 = parkingLot78.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray89 = new observer.ParkingSpace[] {};
        parkingLot78.setSpaces(parkingSpaceArray89);
        parkingLot60.setSpaces(parkingSpaceArray89);
        parkingLot54.setSpaces(parkingSpaceArray89);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertNotNull(parkingLot54);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray70);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray89);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray89, new observer.ParkingSpace[] {});
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        boolean boolean81 = parkingSpace73.isTaken();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
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
        java.lang.String str68 = parkingSpace62.getLocation();
        // The following exception was thrown during execution in test generation
        try {
            int int69 = parkingSpace62.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        int int13 = booking8.getId();
        booking8.setStartTime((int) (byte) 100);
        template.User user16 = null;
        booking8.setUser(user16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(97, false, "hi!");
        parkingLot3.setId((int) (short) -1);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
        factory.PaymentOption paymentOption21 = null;
        booking8.setPaymentOption(paymentOption21);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        java.lang.String str7 = parkingLot3.getLocation();
        int int8 = parkingLot3.getId();
        parkingLot3.setDisabled(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        int int18 = booking8.getEndTime();
        booking8.setEndTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        booking8.setStartTime((int) (short) 100);
        factory.PaymentOption paymentOption20 = null;
        booking8.setPaymentOption(paymentOption20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(16068, true, "");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        java.lang.String str7 = parkingLot3.getLocation();
        int int8 = parkingLot3.getId();
        parkingLot3.setLocation("");
        parkingLot3.setLocation("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        parkingSpace22.setParkingLot(parkingLot34);
        parkingLot34.setDisabled(false);
        parkingSpace5.setParkingLot(parkingLot34);
        observer.ParkingSpace[] parkingSpaceArray39 = null;
        parkingLot34.setSpaces(parkingSpaceArray39);
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        java.lang.String str49 = parkingLot48.getLocation();
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot48);
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(310, user1, parkingLot34, parkingSpace50, (-93322944), 4838, paymentOption53, "hi!");
        parkingSpace50.setTaken(false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        template.User user21 = null;
        observer.ParkingLot parkingLot26 = null;
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot26);
        observer.ParkingLot parkingLot28 = parkingSpace27.getParkingLot();
        template.User user30 = null;
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace35 = new observer.ParkingSpace();
        parkingSpace35.setDisabled(true);
        boolean boolean38 = parkingSpace35.isTaken();
        factory.PaymentOption paymentOption41 = null;
        observer.Booking booking43 = new observer.Booking(100, user30, parkingLot34, parkingSpace35, (int) (byte) 1, (int) (short) 0, paymentOption41, "");
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        parkingSpace35.setParkingLot(parkingLot47);
        parkingLot47.setDisabled(false);
        parkingSpace27.setParkingLot(parkingLot47);
        template.User user53 = null;
        observer.ParkingLot parkingLot54 = null;
        observer.ParkingSpace parkingSpace55 = null;
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(1, user53, parkingLot54, parkingSpace55, (int) 'a', (int) 'a', paymentOption58, "");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        observer.ParkingLot parkingLot64 = parkingSpace61.getParkingLot();
        booking60.setParkingSpace(parkingSpace61);
        booking60.setEndTime(0);
        factory.PaymentOption paymentOption68 = null;
        booking60.setPaymentOption(paymentOption68);
        java.lang.String str70 = booking60.getLicense();
        int int71 = booking60.getId();
        observer.ParkingSpace parkingSpace72 = booking60.getParkingSpace();
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking(10, user21, parkingLot47, parkingSpace72, (int) (byte) 0, 0, paymentOption75, "");
        booking8.setParkingSpace(parkingSpace72);
        booking8.setId((-166976));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(parkingLot64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(parkingSpace72);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot22.getSpaces();
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
        parkingLot22.setSpaces(parkingSpaceArray45);
        parkingLot22.setId((-100));
        observer.ParkingSpace parkingSpace49 = new observer.ParkingSpace((int) '#', "", false, false, parkingLot22);
        parkingSpace49.setId(10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "hi!");
        boolean boolean4 = parkingLot3.isDisabled();
        parkingLot3.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        factory.PaymentOption paymentOption21 = booking8.getPaymentOption();
        booking8.setStartTime((int) (short) 1);
        booking8.setId(772200);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(paymentOption21);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        template.User user19 = null;
        booking8.setUser(user19);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(paymentOption18);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) (short) -1, "hi!", true, true, parkingLot7);
        java.lang.String str9 = parkingSpace8.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        observer.ParkingLot parkingLot14 = booking8.getParkingLot();
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        java.lang.String str22 = parkingSpace19.getLocation();
        observer.ParkingLot parkingLot23 = null;
        parkingSpace19.setParkingLot(parkingLot23);
        parkingSpace19.setTaken(true);
        template.User user28 = null;
        observer.ParkingLot parkingLot32 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace33 = new observer.ParkingSpace();
        parkingSpace33.setDisabled(true);
        boolean boolean36 = parkingSpace33.isTaken();
        factory.PaymentOption paymentOption39 = null;
        observer.Booking booking41 = new observer.Booking(100, user28, parkingLot32, parkingSpace33, (int) (byte) 1, (int) (short) 0, paymentOption39, "");
        boolean boolean42 = parkingLot32.isDisabled();
        parkingSpace19.setParkingLot(parkingLot32);
        template.User user45 = null;
        observer.ParkingLot parkingLot49 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot54 = null;
        observer.ParkingSpace parkingSpace55 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot54);
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(0, user45, parkingLot49, parkingSpace55, (int) (short) -1, (int) (byte) 0, paymentOption58, "hi!");
        template.User user62 = null;
        observer.ParkingLot parkingLot66 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace67 = new observer.ParkingSpace();
        parkingSpace67.setDisabled(true);
        boolean boolean70 = parkingSpace67.isTaken();
        factory.PaymentOption paymentOption73 = null;
        observer.Booking booking75 = new observer.Booking(100, user62, parkingLot66, parkingSpace67, (int) (byte) 1, (int) (short) 0, paymentOption73, "");
        observer.ParkingSpace[] parkingSpaceArray76 = parkingLot66.getSpaces();
        parkingLot49.setSpaces(parkingSpaceArray76);
        observer.ParkingSpace[] parkingSpaceArray78 = parkingLot49.getSpaces();
        parkingLot32.setSpaces(parkingSpaceArray78);
        observer.ParkingSpace parkingSpace80 = new observer.ParkingSpace(629847800, "hi!", false, false, parkingLot32);
        booking8.setParkingSpace(parkingSpace80);
        org.junit.Assert.assertNull(parkingSpace11);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray76);
        org.junit.Assert.assertNotNull(parkingSpaceArray78);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        int int15 = parkingSpace6.getId();
        template.User user17 = null;
        template.User user19 = null;
        observer.ParkingLot parkingLot23 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot28 = null;
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot28);
        factory.PaymentOption paymentOption32 = null;
        observer.Booking booking34 = new observer.Booking(0, user19, parkingLot23, parkingSpace29, (int) (short) -1, (int) (byte) 0, paymentOption32, "hi!");
        template.User user36 = null;
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace41 = new observer.ParkingSpace();
        parkingSpace41.setDisabled(true);
        boolean boolean44 = parkingSpace41.isTaken();
        factory.PaymentOption paymentOption47 = null;
        observer.Booking booking49 = new observer.Booking(100, user36, parkingLot40, parkingSpace41, (int) (byte) 1, (int) (short) 0, paymentOption47, "");
        observer.ParkingSpace[] parkingSpaceArray50 = parkingLot40.getSpaces();
        parkingLot23.setSpaces(parkingSpaceArray50);
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        java.lang.String str55 = parkingSpace52.getLocation();
        parkingSpace52.setDisabled(false);
        observer.ParkingLot parkingLot58 = parkingSpace52.getParkingLot();
        factory.PaymentOption paymentOption61 = null;
        observer.Booking booking63 = new observer.Booking((int) (short) 10, user17, parkingLot23, parkingSpace52, (int) (short) -1, 32, paymentOption61, "");
        observer.ParkingSpace[] parkingSpaceArray64 = parkingLot23.getSpaces();
        java.lang.String str65 = parkingLot23.getLocation();
        parkingSpace6.setParkingLot(parkingLot23);
        observer.ParkingSpace[] parkingSpaceArray67 = parkingLot23.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertNotNull(parkingSpaceArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray67);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        booking8.setLicense("hi!");
        template.User user22 = null;
        booking8.setUser(user22);
        template.User user24 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        parkingSpace51.setId(100);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        int int9 = parkingLot7.getId();
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot7);
        parkingLot7.setLocation("hi!");
        template.User user14 = null;
        observer.ParkingLot parkingLot15 = null;
        observer.ParkingSpace parkingSpace16 = new observer.ParkingSpace();
        parkingSpace16.setDisabled(true);
        java.lang.String str19 = parkingSpace16.getLocation();
        observer.ParkingLot parkingLot20 = null;
        parkingSpace16.setParkingLot(parkingLot20);
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking((int) (short) 0, user14, parkingLot15, parkingSpace16, 5148, (int) (short) 100, paymentOption24, "");
        int int27 = parkingSpace16.getId();
        observer.ParkingLot parkingLot31 = new observer.ParkingLot(10, true, "hi!");
        java.lang.String str32 = parkingLot31.getLocation();
        parkingSpace16.setParkingLot(parkingLot31);
        observer.ParkingLot parkingLot34 = parkingSpace16.getParkingLot();
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot34.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(parkingLot34);
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
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
        booking61.setId((-990));
        template.User user65 = booking61.getUser();
        int int69 = booking61.getTotalCost((-6298500), (-100), 629847800);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(user65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-274528512) + "'", int69 == (-274528512));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        template.User user1 = null;
        template.User user7 = null;
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace12 = new observer.ParkingSpace();
        parkingSpace12.setDisabled(true);
        boolean boolean15 = parkingSpace12.isTaken();
        factory.PaymentOption paymentOption18 = null;
        observer.Booking booking20 = new observer.Booking(100, user7, parkingLot11, parkingSpace12, (int) (byte) 1, (int) (short) 0, paymentOption18, "");
        observer.ParkingSpace[] parkingSpaceArray21 = parkingLot11.getSpaces();
        parkingLot11.setId(5148);
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace((int) 'a', "", false, false, parkingLot11);
        boolean boolean25 = parkingLot11.isDisabled();
        java.lang.String str26 = parkingLot11.getLocation();
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        int int28 = parkingSpace27.getId();
        parkingSpace27.setLocation("");
        factory.PaymentOption paymentOption33 = null;
        observer.Booking booking35 = new observer.Booking((-9), user1, parkingLot11, parkingSpace27, 1100, (-337428), paymentOption33, "");
        observer.ParkingLot parkingLot36 = booking35.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(parkingLot36);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        booking8.setId(9900);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-970) + "'", int23 == (-970));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "hi!");
        parkingLot3.setLocation("hi!");
        boolean boolean6 = parkingLot3.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
        booking84.setEndTime((int) (short) 10);
        observer.ParkingLot parkingLot87 = booking84.getParkingLot();
        int int88 = booking84.getEndTime();
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
        org.junit.Assert.assertNotNull(parkingLot87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((-64493000), "", true, false, parkingLot4);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        int int18 = booking8.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
        parkingSpace19.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        booking8.setStartTime((-1671086136));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingLot73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        template.User user35 = null;
        observer.ParkingLot parkingLot39 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        boolean boolean43 = parkingSpace40.isTaken();
        factory.PaymentOption paymentOption46 = null;
        observer.Booking booking48 = new observer.Booking(100, user35, parkingLot39, parkingSpace40, (int) (byte) 1, (int) (short) 0, paymentOption46, "");
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot39.getSpaces();
        parkingLot39.setId(5148);
        parkingLot39.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray54 = parkingLot39.getSpaces();
        observer.ParkingSpace parkingSpace55 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot39);
        parkingLot39.setId(100);
        int int58 = parkingLot39.getId();
        int int59 = parkingLot39.getId();
        parkingSpace29.setParkingLot(parkingLot39);
        boolean boolean61 = parkingSpace29.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertNotNull(parkingSpaceArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
        int int22 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
        boolean boolean54 = parkingLot9.isDisabled();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        observer.ParkingLot parkingLot11 = booking8.getParkingLot();
        int int12 = booking8.getStartTime();
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        java.lang.String str16 = parkingSpace13.getLocation();
        observer.ParkingLot parkingLot17 = null;
        parkingSpace13.setParkingLot(parkingLot17);
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        java.lang.String str23 = parkingLot22.getLocation();
        parkingSpace13.setParkingLot(parkingLot22);
        booking8.setParkingLot(parkingLot22);
        template.User user26 = booking8.getUser();
        booking8.setId(5148);
        observer.ParkingSpace parkingSpace29 = booking8.getParkingSpace();
        factory.PaymentOption paymentOption30 = null;
        booking8.setPaymentOption(paymentOption30);
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNull(parkingSpace29);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
        java.lang.String str16 = parkingSpace3.getLocation();
        java.lang.String str17 = parkingSpace3.getLocation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        parkingSpace19.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        template.User user45 = null;
        observer.ParkingLot parkingLot46 = null;
        observer.ParkingSpace parkingSpace47 = null;
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(1, user45, parkingLot46, parkingSpace47, (int) 'a', (int) 'a', paymentOption50, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        observer.ParkingLot parkingLot56 = parkingSpace53.getParkingLot();
        booking52.setParkingSpace(parkingSpace53);
        booking52.setEndTime(0);
        factory.PaymentOption paymentOption60 = null;
        booking52.setPaymentOption(paymentOption60);
        observer.ParkingSpace parkingSpace62 = booking52.getParkingSpace();
        parkingSpace62.setLocation("");
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking((int) (byte) 0, user1, parkingLot40, parkingSpace62, (int) (byte) 1, (-22), paymentOption67, "hi!");
        template.User user70 = booking69.getUser();
        int int71 = booking69.getStartTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray42);
        org.junit.Assert.assertNull(parkingLot56);
        org.junit.Assert.assertNotNull(parkingSpace62);
        org.junit.Assert.assertNull(user70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        template.User user1 = null;
        template.User user3 = null;
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        parkingLot22.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot22.getSpaces();
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        java.lang.String str30 = parkingSpace27.getLocation();
        parkingSpace27.setDisabled(false);
        observer.ParkingLot parkingLot33 = parkingSpace27.getParkingLot();
        parkingSpace27.setId((int) (short) 1);
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking((int) (short) 0, user3, parkingLot22, parkingSpace27, (int) (short) 1, 6500, paymentOption38, "");
        template.User user42 = null;
        observer.ParkingLot parkingLot43 = null;
        observer.ParkingSpace parkingSpace44 = null;
        factory.PaymentOption paymentOption47 = null;
        observer.Booking booking49 = new observer.Booking(1, user42, parkingLot43, parkingSpace44, (int) 'a', (int) 'a', paymentOption47, "");
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace();
        parkingSpace50.setDisabled(true);
        observer.ParkingLot parkingLot53 = parkingSpace50.getParkingLot();
        booking49.setParkingSpace(parkingSpace50);
        booking49.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace();
        booking49.setParkingSpace(parkingSpace57);
        java.lang.String str59 = booking49.getLicense();
        booking49.setLicense("hi!");
        template.User user62 = booking49.getUser();
        observer.ParkingSpace parkingSpace63 = booking49.getParkingSpace();
        factory.PaymentOption paymentOption66 = null;
        observer.Booking booking68 = new observer.Booking((-1671086136), user1, parkingLot22, parkingSpace63, (-36470), (int) (short) 1, paymentOption66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(parkingLot33);
        org.junit.Assert.assertNull(parkingLot53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(user62);
        org.junit.Assert.assertNotNull(parkingSpace63);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
        booking13.setStartTime(971751252);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 310 + "'", int19 == 310);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
        parkingSpace21.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
        booking8.setStartTime((-6298500));
        int int25 = booking8.getId();
        booking8.setStartTime(74902430);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
        booking8.setLicense("hi!");
        booking8.setLicense("hi!");
        booking8.setId((-93322944));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        observer.ParkingLot parkingLot12 = parkingSpace9.getParkingLot();
        booking8.setParkingSpace(parkingSpace9);
        parkingSpace9.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(2146977336, false, "");
        booking8.setParkingLot(parkingLot26);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        parkingSpace18.setDisabled(true);
        observer.ParkingLot parkingLot21 = parkingSpace18.getParkingLot();
        booking17.setParkingSpace(parkingSpace18);
        booking17.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        booking17.setParkingSpace(parkingSpace25);
        template.User user32 = null;
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        boolean boolean40 = parkingSpace37.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(100, user32, parkingLot36, parkingSpace37, (int) (byte) 1, (int) (short) 0, paymentOption43, "");
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot36.getSpaces();
        parkingLot36.setId(5148);
        parkingLot36.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot36.getSpaces();
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot36);
        parkingLot36.setId(100);
        int int55 = parkingLot36.getId();
        int int56 = parkingLot36.getId();
        int int57 = parkingLot36.getId();
        parkingSpace25.setParkingLot(parkingLot36);
        factory.PaymentOption paymentOption61 = null;
        observer.Booking booking63 = new observer.Booking(0, user1, parkingLot5, parkingSpace25, (-36470), (-327523820), paymentOption61, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(parkingLot21);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
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
        int int22 = booking8.getTotalCost((-6298500), (-970), (-93322944));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2105387136 + "'", int22 == 2105387136);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        boolean boolean22 = parkingSpace21.isDisabled();
        parkingSpace21.setDisabled(true);
        parkingSpace21.setId(10);
        parkingSpace21.setId(0);
        parkingSpace21.setDisabled(true);
        booking8.setParkingSpace(parkingSpace21);
        boolean boolean32 = parkingSpace21.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
        boolean boolean48 = parkingSpace36.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId((int) (short) 1);
        observer.ParkingSpace parkingSpace13 = booking8.getParkingSpace();
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        java.lang.String str17 = parkingSpace14.getLocation();
        observer.ParkingLot parkingLot18 = null;
        parkingSpace14.setParkingLot(parkingLot18);
        parkingSpace14.setTaken(true);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        boolean boolean31 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(100, user23, parkingLot27, parkingSpace28, (int) (byte) 1, (int) (short) 0, paymentOption34, "");
        boolean boolean37 = parkingLot27.isDisabled();
        parkingSpace14.setParkingLot(parkingLot27);
        int int39 = parkingSpace14.getId();
        int int40 = parkingSpace14.getId();
        booking8.setParkingSpace(parkingSpace14);
        org.junit.Assert.assertNull(parkingSpace13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        parkingSpace0.setTaken(true);
        parkingSpace0.setTaken(false);
        parkingSpace0.setTaken(true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = parkingSpace0.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        int int23 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 870 + "'", int22 == 870);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        parkingSpace5.setId(772200);
        parkingSpace5.setTaken(true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
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
        booking8.setId(0);
        booking8.setLicense("hi!");
        template.User user33 = booking8.getUser();
        int int34 = booking8.getId();
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(user33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        factory.PaymentOption paymentOption62 = booking8.getPaymentOption();
        java.lang.String str63 = booking8.getLicense();
        booking8.setId(22);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(paymentOption62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
        booking8.setStartTime((-166976));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        factory.PaymentOption paymentOption17 = null;
        booking8.setPaymentOption(paymentOption17);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
        booking8.setLicense("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
        java.lang.String str46 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingSpaceArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        template.User user25 = null;
        booking8.setUser(user25);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
        booking10.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        booking10.setParkingSpace(parkingSpace18);
        int int20 = booking10.getEndTime();
        int int21 = booking10.getId();
        template.User user22 = booking10.getUser();
        template.User user24 = null;
        template.User user26 = null;
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = null;
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(1, user26, parkingLot27, parkingSpace28, (int) 'a', (int) 'a', paymentOption31, "");
        booking33.setId((int) ' ');
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot41.getSpaces();
        parkingLot41.setId(5148);
        booking33.setParkingLot(parkingLot41);
        int int55 = parkingLot41.getId();
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace();
        parkingSpace56.setDisabled(true);
        java.lang.String str59 = parkingSpace56.getLocation();
        observer.ParkingLot parkingLot60 = null;
        parkingSpace56.setParkingLot(parkingLot60);
        factory.PaymentOption paymentOption64 = null;
        observer.Booking booking66 = new observer.Booking((int) 'a', user24, parkingLot41, parkingSpace56, (int) ' ', (int) (short) 10, paymentOption64, "");
        template.User user67 = booking66.getUser();
        observer.ParkingLot parkingLot68 = booking66.getParkingLot();
        booking10.setParkingLot(parkingLot68);
        template.User user71 = null;
        observer.ParkingLot parkingLot72 = null;
        observer.ParkingSpace parkingSpace73 = null;
        factory.PaymentOption paymentOption76 = null;
        observer.Booking booking78 = new observer.Booking(1, user71, parkingLot72, parkingSpace73, (int) 'a', (int) 'a', paymentOption76, "");
        int int82 = booking78.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        observer.ParkingSpace parkingSpace83 = new observer.ParkingSpace();
        parkingSpace83.setId((int) (short) -1);
        booking78.setParkingSpace(parkingSpace83);
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking(629847800, user1, parkingLot68, parkingSpace83, (-186496), 90, paymentOption89, "");
        template.User user92 = booking91.getUser();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5148 + "'", int55 == 5148);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(user67);
        org.junit.Assert.assertNotNull(parkingLot68);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5148 + "'", int82 == 5148);
        org.junit.Assert.assertNull(user92);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
        template.User user57 = null;
        observer.ParkingLot parkingLot61 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot66 = null;
        observer.ParkingSpace parkingSpace67 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot66);
        factory.PaymentOption paymentOption70 = null;
        observer.Booking booking72 = new observer.Booking(0, user57, parkingLot61, parkingSpace67, (int) (short) -1, (int) (byte) 0, paymentOption70, "hi!");
        template.User user74 = null;
        observer.ParkingLot parkingLot78 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace79 = new observer.ParkingSpace();
        parkingSpace79.setDisabled(true);
        boolean boolean82 = parkingSpace79.isTaken();
        factory.PaymentOption paymentOption85 = null;
        observer.Booking booking87 = new observer.Booking(100, user74, parkingLot78, parkingSpace79, (int) (byte) 1, (int) (short) 0, paymentOption85, "");
        observer.ParkingSpace[] parkingSpaceArray88 = parkingLot78.getSpaces();
        parkingLot61.setSpaces(parkingSpaceArray88);
        observer.ParkingSpace[] parkingSpaceArray90 = parkingLot61.getSpaces();
        booking8.setParkingLot(parkingLot61);
        template.User user92 = booking8.getUser();
        factory.PaymentOption paymentOption93 = null;
        booking8.setPaymentOption(paymentOption93);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray88);
        org.junit.Assert.assertNotNull(parkingSpaceArray90);
        org.junit.Assert.assertNull(user92);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
        parkingLot31.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray44 = parkingLot31.getSpaces();
        int int45 = parkingLot31.getId();
        template.User user47 = null;
        observer.ParkingLot parkingLot48 = null;
        observer.ParkingSpace parkingSpace49 = null;
        factory.PaymentOption paymentOption52 = null;
        observer.Booking booking54 = new observer.Booking(1, user47, parkingLot48, parkingSpace49, (int) 'a', (int) 'a', paymentOption52, "");
        observer.ParkingSpace parkingSpace55 = new observer.ParkingSpace();
        parkingSpace55.setDisabled(true);
        observer.ParkingLot parkingLot58 = parkingSpace55.getParkingLot();
        booking54.setParkingSpace(parkingSpace55);
        booking54.setEndTime(0);
        factory.PaymentOption paymentOption62 = null;
        booking54.setPaymentOption(paymentOption62);
        observer.ParkingSpace parkingSpace64 = booking54.getParkingSpace();
        int int65 = parkingSpace64.getId();
        factory.PaymentOption paymentOption68 = null;
        observer.Booking booking70 = new observer.Booking(0, user25, parkingLot31, parkingSpace64, 5148, 100, paymentOption68, "");
        booking8.setParkingLot(parkingLot31);
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
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
        parkingSpace21.setDisabled(true);
        observer.ParkingLot parkingLot33 = parkingSpace21.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertNull(parkingLot33);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingSpace11.setTaken(true);
        parkingSpace11.setDisabled(true);
        parkingSpace11.setLocation("hi!");
        boolean boolean23 = parkingSpace11.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        observer.ParkingLot parkingLot11 = booking8.getParkingLot();
        int int12 = booking8.getStartTime();
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        java.lang.String str16 = parkingSpace13.getLocation();
        observer.ParkingLot parkingLot17 = null;
        parkingSpace13.setParkingLot(parkingLot17);
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        java.lang.String str23 = parkingLot22.getLocation();
        parkingSpace13.setParkingLot(parkingLot22);
        booking8.setParkingLot(parkingLot22);
        template.User user26 = booking8.getUser();
        booking8.setId(5148);
        booking8.setEndTime(2105387136);
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(user26);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(9900, false, "");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        template.User user9 = null;
        observer.ParkingLot parkingLot13 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        boolean boolean17 = parkingSpace14.isTaken();
        factory.PaymentOption paymentOption20 = null;
        observer.Booking booking22 = new observer.Booking(100, user9, parkingLot13, parkingSpace14, (int) (byte) 1, (int) (short) 0, paymentOption20, "");
        boolean boolean23 = parkingLot13.isDisabled();
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace(6500, "", false, false, parkingLot13);
        int int25 = parkingLot13.getId();
        observer.ParkingSpace parkingSpace26 = new observer.ParkingSpace((-990), "hi!", false, true, parkingLot13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
        booking8.setLicense("");
        observer.ParkingSpace parkingSpace20 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(parkingSpace20);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingSpace11.setId((-70));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingSpace11.setTaken(true);
        parkingSpace11.setLocation("");
        parkingSpace11.setDisabled(true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
        parkingSpace53.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNull(parkingLot46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace();
        parkingSpace66.setDisabled(true);
        java.lang.String str69 = parkingSpace66.getLocation();
        observer.ParkingLot parkingLot70 = null;
        parkingSpace66.setParkingLot(parkingLot70);
        observer.ParkingLot parkingLot75 = new observer.ParkingLot(0, false, "");
        java.lang.String str76 = parkingLot75.getLocation();
        parkingSpace66.setParkingLot(parkingLot75);
        parkingLot75.setId(0);
        parkingSpace51.setParkingLot(parkingLot75);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        booking8.setId((int) (short) 1);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
        booking13.setLicense("hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
        observer.ParkingSpace parkingSpace55 = null;
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking((int) (short) -1, user1, parkingLot22, parkingSpace55, (-166976), 971751252, paymentOption58, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray51, new observer.ParkingSpace[] {});
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
        observer.ParkingLot parkingLot30 = new observer.ParkingLot(100, false, "hi!");
        booking8.setParkingLot(parkingLot30);
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
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
        parkingLot73.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingLot73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
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
        parkingLot20.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot20.getSpaces();
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        java.lang.String str28 = parkingSpace25.getLocation();
        parkingSpace25.setDisabled(false);
        observer.ParkingLot parkingLot31 = parkingSpace25.getParkingLot();
        parkingSpace25.setId((int) (short) 1);
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking((int) (short) 0, user1, parkingLot20, parkingSpace25, (int) (short) 1, 6500, paymentOption36, "");
        template.User user40 = null;
        observer.ParkingLot parkingLot41 = null;
        observer.ParkingSpace parkingSpace42 = null;
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(1, user40, parkingLot41, parkingSpace42, (int) 'a', (int) 'a', paymentOption45, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        observer.ParkingLot parkingLot51 = parkingSpace48.getParkingLot();
        booking47.setParkingSpace(parkingSpace48);
        booking47.setEndTime(0);
        factory.PaymentOption paymentOption55 = null;
        booking47.setPaymentOption(paymentOption55);
        observer.ParkingSpace parkingSpace57 = booking47.getParkingSpace();
        observer.ParkingLot parkingLot62 = null;
        observer.ParkingSpace parkingSpace63 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot62);
        booking47.setParkingSpace(parkingSpace63);
        template.User user66 = null;
        observer.ParkingLot parkingLot70 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace71 = new observer.ParkingSpace();
        parkingSpace71.setDisabled(true);
        boolean boolean74 = parkingSpace71.isTaken();
        factory.PaymentOption paymentOption77 = null;
        observer.Booking booking79 = new observer.Booking(100, user66, parkingLot70, parkingSpace71, (int) (byte) 1, (int) (short) 0, paymentOption77, "");
        observer.ParkingLot parkingLot83 = new observer.ParkingLot(0, false, "");
        parkingSpace71.setParkingLot(parkingLot83);
        parkingSpace63.setParkingLot(parkingLot83);
        boolean boolean86 = parkingLot83.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray87 = parkingLot83.getSpaces();
        java.lang.String str88 = parkingLot83.getLocation();
        int int89 = parkingLot83.getId();
        parkingLot83.setLocation("");
        parkingSpace25.setParkingLot(parkingLot83);
        boolean boolean93 = parkingSpace25.isTaken();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(parkingLot31);
        org.junit.Assert.assertNull(parkingLot51);
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
        booking10.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        booking10.setParkingSpace(parkingSpace18);
        int int20 = booking10.getEndTime();
        int int21 = booking10.getId();
        template.User user22 = booking10.getUser();
        template.User user24 = null;
        template.User user26 = null;
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = null;
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(1, user26, parkingLot27, parkingSpace28, (int) 'a', (int) 'a', paymentOption31, "");
        booking33.setId((int) ' ');
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot41.getSpaces();
        parkingLot41.setId(5148);
        booking33.setParkingLot(parkingLot41);
        int int55 = parkingLot41.getId();
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace();
        parkingSpace56.setDisabled(true);
        java.lang.String str59 = parkingSpace56.getLocation();
        observer.ParkingLot parkingLot60 = null;
        parkingSpace56.setParkingLot(parkingLot60);
        factory.PaymentOption paymentOption64 = null;
        observer.Booking booking66 = new observer.Booking((int) 'a', user24, parkingLot41, parkingSpace56, (int) ' ', (int) (short) 10, paymentOption64, "");
        template.User user67 = booking66.getUser();
        observer.ParkingLot parkingLot68 = booking66.getParkingLot();
        booking10.setParkingLot(parkingLot68);
        template.User user71 = null;
        observer.ParkingLot parkingLot72 = null;
        observer.ParkingSpace parkingSpace73 = null;
        factory.PaymentOption paymentOption76 = null;
        observer.Booking booking78 = new observer.Booking(1, user71, parkingLot72, parkingSpace73, (int) 'a', (int) 'a', paymentOption76, "");
        int int82 = booking78.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        observer.ParkingSpace parkingSpace83 = new observer.ParkingSpace();
        parkingSpace83.setId((int) (short) -1);
        booking78.setParkingSpace(parkingSpace83);
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking(629847800, user1, parkingLot68, parkingSpace83, (-186496), 90, paymentOption89, "");
        boolean boolean92 = parkingSpace83.isDisabled();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5148 + "'", int55 == 5148);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(user67);
        org.junit.Assert.assertNotNull(parkingLot68);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5148 + "'", int82 == 5148);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
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
        parkingLot25.setLocation("hi!");
        parkingLot25.setDisabled(true);
        java.lang.String str43 = parkingLot25.getLocation();
        parkingLot25.setId(52);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
        template.User user25 = null;
        booking8.setUser(user25);
        java.lang.String str27 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertNull(parkingLot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
        java.lang.Class<?> wildcardClass26 = parkingLot5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "");
        parkingLot3.setLocation("hi!");
        java.lang.String str6 = parkingLot3.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        int int22 = booking8.getTotalCost((int) ' ', 10, (-1));
        template.User user23 = null;
        booking8.setUser(user23);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot14 = null;
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot14);
        factory.PaymentOption paymentOption18 = null;
        observer.Booking booking20 = new observer.Booking(0, user5, parkingLot9, parkingSpace15, (int) (short) -1, (int) (byte) 0, paymentOption18, "hi!");
        int int21 = parkingLot9.getId();
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace((-1), "hi!", false, true, parkingLot9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
        parkingSpace19.setTaken(false);
        boolean boolean24 = parkingSpace19.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        int int9 = parkingLot7.getId();
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot7);
        template.User user12 = null;
        template.User user14 = null;
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace19 = new observer.ParkingSpace();
        parkingSpace19.setDisabled(true);
        boolean boolean22 = parkingSpace19.isTaken();
        factory.PaymentOption paymentOption25 = null;
        observer.Booking booking27 = new observer.Booking(100, user14, parkingLot18, parkingSpace19, (int) (byte) 1, (int) (short) 0, paymentOption25, "");
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot18.getSpaces();
        parkingLot18.setId(97);
        template.User user32 = null;
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        boolean boolean40 = parkingSpace37.isTaken();
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(100, user32, parkingLot36, parkingSpace37, (int) (byte) 1, (int) (short) 0, paymentOption43, "");
        observer.ParkingLot parkingLot49 = new observer.ParkingLot(0, false, "");
        parkingSpace37.setParkingLot(parkingLot49);
        boolean boolean51 = parkingSpace37.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) (byte) 1, user12, parkingLot18, parkingSpace37, (int) (byte) 100, 22, paymentOption54, "");
        observer.ParkingLot parkingLot57 = booking56.getParkingLot();
        boolean boolean58 = parkingLot57.isDisabled();
        parkingSpace10.setParkingLot(parkingLot57);
        int int60 = parkingSpace10.getLotID();
        boolean boolean61 = parkingSpace10.isDisabled();
        parkingSpace10.setDisabled(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parkingLot57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        template.User user1 = null;
        template.User user3 = null;
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        template.User user13 = null;
        booking12.setUser(user13);
        int int18 = booking12.getTotalCost((int) (short) -1, 5148, 0);
        java.lang.String str19 = booking12.getLicense();
        booking12.setEndTime(1);
        factory.PaymentOption paymentOption22 = null;
        booking12.setPaymentOption(paymentOption22);
        template.User user25 = null;
        observer.ParkingLot parkingLot29 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace30 = new observer.ParkingSpace();
        parkingSpace30.setDisabled(true);
        boolean boolean33 = parkingSpace30.isTaken();
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking(100, user25, parkingLot29, parkingSpace30, (int) (byte) 1, (int) (short) 0, paymentOption36, "");
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        parkingSpace30.setParkingLot(parkingLot42);
        observer.ParkingSpace[] parkingSpaceArray44 = parkingLot42.getSpaces();
        booking12.setParkingLot(parkingLot42);
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        boolean boolean47 = parkingSpace46.isDisabled();
        parkingSpace46.setDisabled(true);
        parkingSpace46.setId(10);
        parkingSpace46.setId(0);
        parkingSpace46.setDisabled(true);
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking((int) '4', user3, parkingLot42, parkingSpace46, (int) '#', 97, paymentOption58, "hi!");
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace();
        parkingSpace61.setDisabled(true);
        java.lang.String str64 = parkingSpace61.getLocation();
        observer.ParkingLot parkingLot65 = null;
        parkingSpace61.setParkingLot(parkingLot65);
        observer.ParkingLot parkingLot70 = new observer.ParkingLot(0, false, "");
        java.lang.String str71 = parkingLot70.getLocation();
        parkingSpace61.setParkingLot(parkingLot70);
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking((int) (short) 0, user1, parkingLot42, parkingSpace61, 52, 0, paymentOption75, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getStartTime();
        factory.PaymentOption paymentOption12 = null;
        booking8.setPaymentOption(paymentOption12);
        booking8.setStartTime((int) (short) 10);
        observer.ParkingSpace parkingSpace16 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-166976), true, "");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        boolean boolean4 = parkingSpace0.isDisabled();
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        boolean boolean6 = parkingSpace0.isDisabled();
        parkingSpace0.setId((int) (byte) 10);
        parkingSpace0.setDisabled(false);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
        parkingLot18.setId((int) (byte) 1);
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot18.getSpaces();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
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
        observer.ParkingSpace[] parkingSpaceArray28 = parkingLot9.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
        template.User user45 = booking43.getUser();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNull(user45);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
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
        observer.ParkingSpace parkingSpace26 = booking8.getParkingSpace();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-970) + "'", int23 == (-970));
        org.junit.Assert.assertNull(parkingSpace26);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
        java.lang.String str31 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace(10, "", false, false, parkingLot7);
        observer.ParkingSpace[] parkingSpaceArray33 = parkingLot7.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot7.getSpaces();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray33);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        int int1 = parkingSpace0.getId();
        observer.ParkingLot parkingLot2 = parkingSpace0.getParkingLot();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setDisabled(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(parkingLot2);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        parkingLot5.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray18 = parkingLot5.getSpaces();
        int int19 = parkingLot5.getId();
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot5.getSpaces();
        parkingLot5.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5148 + "'", int19 == 5148);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
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
        observer.ParkingLot parkingLot21 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(parkingLot21);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingSpace11.setTaken(true);
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(10, true, "hi!");
        parkingLot24.setLocation("hi!");
        parkingSpace11.setParkingLot(parkingLot24);
        int int28 = parkingSpace11.getId();
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        booking43.setLicense("");
        template.User user47 = null;
        observer.ParkingLot parkingLot48 = null;
        observer.ParkingSpace parkingSpace49 = null;
        factory.PaymentOption paymentOption52 = null;
        observer.Booking booking54 = new observer.Booking(1, user47, parkingLot48, parkingSpace49, (int) 'a', (int) 'a', paymentOption52, "");
        observer.ParkingSpace parkingSpace55 = new observer.ParkingSpace();
        parkingSpace55.setDisabled(true);
        observer.ParkingLot parkingLot58 = parkingSpace55.getParkingLot();
        booking54.setParkingSpace(parkingSpace55);
        booking54.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        booking54.setParkingSpace(parkingSpace62);
        java.lang.String str64 = booking54.getLicense();
        factory.PaymentOption paymentOption65 = booking54.getPaymentOption();
        template.User user67 = null;
        observer.ParkingLot parkingLot71 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot76 = null;
        observer.ParkingSpace parkingSpace77 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot76);
        factory.PaymentOption paymentOption80 = null;
        observer.Booking booking82 = new observer.Booking(0, user67, parkingLot71, parkingSpace77, (int) (short) -1, (int) (byte) 0, paymentOption80, "hi!");
        int int83 = parkingLot71.getId();
        booking54.setParkingLot(parkingLot71);
        parkingLot71.setLocation("hi!");
        parkingLot71.setDisabled(true);
        java.lang.String str89 = parkingLot71.getLocation();
        booking43.setParkingLot(parkingLot71);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(paymentOption65);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setTaken(false);
        observer.ParkingLot parkingLot8 = parkingSpace0.getParkingLot();
        observer.ParkingLot parkingLot9 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
        factory.PaymentOption paymentOption20 = null;
        booking8.setPaymentOption(paymentOption20);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
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
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        boolean boolean25 = parkingSpace24.isDisabled();
        booking22.setParkingSpace(parkingSpace24);
        int int27 = booking22.getStartTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-100) + "'", int23 == (-100));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        booking8.setId(1100);
        template.User user15 = booking8.getUser();
        int int19 = booking8.getTotalCost(0, 563000, (-629847809));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1068392648 + "'", int19 == 1068392648);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        boolean boolean20 = parkingSpace6.isDisabled();
        parkingSpace6.setLocation("");
        parkingSpace6.setId(870);
        parkingSpace6.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
        observer.ParkingSpace parkingSpace20 = booking13.getParkingSpace();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 310 + "'", int19 == 310);
        org.junit.Assert.assertNotNull(parkingSpace20);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
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
        java.lang.String str68 = parkingSpace62.getLocation();
        boolean boolean69 = parkingSpace62.isTaken();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot19.getSpaces();
        template.User user37 = null;
        observer.ParkingLot parkingLot38 = null;
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace();
        parkingSpace39.setDisabled(true);
        java.lang.String str42 = parkingSpace39.getLocation();
        observer.ParkingLot parkingLot43 = null;
        parkingSpace39.setParkingLot(parkingLot43);
        factory.PaymentOption paymentOption47 = null;
        observer.Booking booking49 = new observer.Booking((int) (short) 0, user37, parkingLot38, parkingSpace39, 5148, (int) (short) 100, paymentOption47, "");
        template.User user51 = null;
        observer.ParkingLot parkingLot55 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace();
        parkingSpace56.setDisabled(true);
        boolean boolean59 = parkingSpace56.isTaken();
        factory.PaymentOption paymentOption62 = null;
        observer.Booking booking64 = new observer.Booking(100, user51, parkingLot55, parkingSpace56, (int) (byte) 1, (int) (short) 0, paymentOption62, "");
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        parkingSpace56.setParkingLot(parkingLot68);
        parkingLot68.setDisabled(false);
        parkingSpace39.setParkingLot(parkingLot68);
        observer.ParkingSpace[] parkingSpaceArray73 = parkingLot68.getSpaces();
        parkingLot19.setSpaces(parkingSpaceArray73);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray30, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray35, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray73);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        parkingLot9.setId(0);
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace((-22), "hi!", false, true, parkingLot9);
        template.User user23 = null;
        template.User user25 = null;
        observer.ParkingLot parkingLot29 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace30 = new observer.ParkingSpace();
        parkingSpace30.setDisabled(true);
        boolean boolean33 = parkingSpace30.isTaken();
        factory.PaymentOption paymentOption36 = null;
        observer.Booking booking38 = new observer.Booking(100, user25, parkingLot29, parkingSpace30, (int) (byte) 1, (int) (short) 0, paymentOption36, "");
        observer.ParkingSpace[] parkingSpaceArray39 = parkingLot29.getSpaces();
        parkingLot29.setId(97);
        template.User user43 = null;
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        boolean boolean51 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking(100, user43, parkingLot47, parkingSpace48, (int) (byte) 1, (int) (short) 0, paymentOption54, "");
        observer.ParkingLot parkingLot60 = new observer.ParkingLot(0, false, "");
        parkingSpace48.setParkingLot(parkingLot60);
        boolean boolean62 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption65 = null;
        observer.Booking booking67 = new observer.Booking((int) (byte) 1, user23, parkingLot29, parkingSpace48, (int) (byte) 100, 22, paymentOption65, "");
        parkingLot29.setDisabled(false);
        parkingLot29.setDisabled(false);
        int int72 = parkingLot29.getId();
        parkingSpace21.setParkingLot(parkingLot29);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(false);
        boolean boolean8 = parkingSpace5.isDisabled();
        java.lang.Class<?> wildcardClass9 = parkingSpace5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        template.User user22 = null;
        booking8.setUser(user22);
        booking8.setEndTime((int) (byte) 1);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6298500) + "'", int20 == (-6298500));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        booking8.setStartTime(32);
        int int20 = booking8.getTotalCost((-6298500), (-22), (int) (byte) 100);
        factory.PaymentOption paymentOption21 = booking8.getPaymentOption();
        booking8.setId(4838);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 629847800 + "'", int20 == 629847800);
        org.junit.Assert.assertNull(paymentOption21);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
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
        factory.PaymentOption paymentOption19 = null;
        booking8.setPaymentOption(paymentOption19);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) '#', false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) (short) 0, "hi!", true, false, parkingLot7);
        java.lang.String str9 = parkingLot7.getLocation();
        int int10 = parkingLot7.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        parkingLot9.setId(0);
        int int14 = parkingLot9.getId();
        boolean boolean15 = parkingLot9.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray16 = parkingLot9.getSpaces();
        parkingLot9.setDisabled(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
        parkingLot18.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (byte) 0, true, "hi!");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingLot parkingLot22 = new observer.ParkingLot(0, false, "");
        parkingSpace10.setParkingLot(parkingLot22);
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot22.getSpaces();
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
        parkingLot22.setSpaces(parkingSpaceArray45);
        parkingLot22.setId((-100));
        observer.ParkingSpace parkingSpace49 = new observer.ParkingSpace((int) '#', "", false, false, parkingLot22);
        int int50 = parkingSpace49.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
        booking8.setEndTime((-93322944));
        int int27 = booking8.getStartTime();
        int int28 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-93322944) + "'", int28 == (-93322944));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
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
        template.User user24 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setTaken(false);
        int int8 = parkingSpace0.getId();
        int int9 = parkingSpace0.getId();
        java.lang.Class<?> wildcardClass10 = parkingSpace0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-100));
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        parkingSpace0.setTaken(false);
        parkingSpace0.setId(870);
        observer.ParkingLot parkingLot10 = parkingSpace0.getParkingLot();
        observer.ParkingLot parkingLot11 = parkingSpace0.getParkingLot();
        org.junit.Assert.assertNull(parkingLot5);
        org.junit.Assert.assertNull(parkingLot10);
        org.junit.Assert.assertNull(parkingLot11);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
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
        int int30 = parkingLot16.getId();
        parkingLot16.setDisabled(false);
        java.lang.String str33 = parkingLot16.getLocation();
        boolean boolean34 = parkingLot16.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5148 + "'", int30 == 5148);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        int int20 = booking8.getEndTime();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot10);
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(0, user1, parkingLot5, parkingSpace11, (int) (short) -1, (int) (byte) 0, paymentOption14, "hi!");
        parkingSpace11.setTaken(true);
        parkingSpace11.setDisabled(true);
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(10, true, "hi!");
        parkingLot24.setLocation("hi!");
        parkingSpace11.setParkingLot(parkingLot24);
        java.lang.String str28 = parkingSpace11.getLocation();
        parkingSpace11.setLocation("");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
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
        boolean boolean64 = parkingSpace33.isTaken();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parkingLot63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
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
        boolean boolean22 = parkingSpace18.isTaken();
        parkingSpace18.setTaken(false);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', true, "");
        boolean boolean4 = parkingLot3.isDisabled();
        boolean boolean5 = parkingLot3.isDisabled();
        int int6 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
        factory.PaymentOption paymentOption22 = null;
        booking8.setPaymentOption(paymentOption22);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
        parkingSpace24.setId((int) (short) 10);
        parkingSpace24.setDisabled(false);
        parkingSpace24.setId((-70));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(false);
        parkingSpace5.setDisabled(false);
        boolean boolean10 = parkingSpace5.isTaken();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        template.User user14 = booking8.getUser();
        factory.PaymentOption paymentOption15 = null;
        booking8.setPaymentOption(paymentOption15);
        booking8.setLicense("");
        factory.PaymentOption paymentOption19 = booking8.getPaymentOption();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
        booking8.setStartTime((int) (short) 1);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        template.User user17 = null;
        booking8.setUser(user17);
        template.User user19 = null;
        booking8.setUser(user19);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
        int int66 = parkingSpace51.getId();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        template.User user9 = null;
        booking8.setUser(user9);
        int int14 = booking8.getTotalCost((int) (short) -1, 5148, 0);
        int int15 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setId((int) (short) 1);
        observer.ParkingSpace parkingSpace13 = booking8.getParkingSpace();
        booking8.setStartTime((-6298500));
        org.junit.Assert.assertNull(parkingSpace13);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
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
        factory.PaymentOption paymentOption21 = null;
        booking8.setPaymentOption(paymentOption21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        int int26 = parkingSpace0.getId();
        parkingSpace0.setTaken(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(35, false, "");
        observer.ParkingSpace[] parkingSpaceArray4 = parkingLot3.getSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceArray4);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
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
        factory.PaymentOption paymentOption18 = null;
        booking8.setPaymentOption(paymentOption18);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getStartTime();
        factory.PaymentOption paymentOption12 = null;
        booking8.setPaymentOption(paymentOption12);
        booking8.setStartTime((int) (short) 10);
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
        parkingSpace22.setDisabled(false);
        booking8.setParkingSpace(parkingSpace22);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
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
        observer.ParkingLot parkingLot38 = parkingSpace32.getParkingLot();
        boolean boolean39 = parkingLot38.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingLot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
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
        observer.ParkingSpace parkingSpace25 = booking8.getParkingSpace();
        int int29 = booking8.getTotalCost((-62985320), 971751252, (-990));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2107977464 + "'", int29 == 2107977464);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        template.User user14 = booking13.getUser();
        template.User user16 = null;
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        java.lang.String str20 = parkingSpace17.getLocation();
        observer.ParkingLot parkingLot21 = null;
        parkingSpace17.setParkingLot(parkingLot21);
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        java.lang.String str27 = parkingLot26.getLocation();
        parkingSpace17.setParkingLot(parkingLot26);
        template.User user30 = null;
        observer.ParkingLot parkingLot31 = null;
        observer.ParkingSpace parkingSpace32 = null;
        factory.PaymentOption paymentOption35 = null;
        observer.Booking booking37 = new observer.Booking(1, user30, parkingLot31, parkingSpace32, (int) 'a', (int) 'a', paymentOption35, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setDisabled(true);
        observer.ParkingLot parkingLot41 = parkingSpace38.getParkingLot();
        booking37.setParkingSpace(parkingSpace38);
        booking37.setEndTime(0);
        factory.PaymentOption paymentOption45 = null;
        booking37.setPaymentOption(paymentOption45);
        observer.ParkingSpace parkingSpace47 = booking37.getParkingSpace();
        parkingSpace47.setLocation("");
        factory.PaymentOption paymentOption52 = null;
        observer.Booking booking54 = new observer.Booking(100, user16, parkingLot26, parkingSpace47, (int) (byte) 1, 5148, paymentOption52, "hi!");
        booking13.setParkingSpace(parkingSpace47);
        template.User user56 = booking13.getUser();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(parkingLot41);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertNull(user56);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
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
        observer.ParkingSpace[] parkingSpaceArray24 = parkingLot5.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray16, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray24, new observer.ParkingSpace[] {});
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
        booking8.setEndTime((int) (short) 100);
        observer.ParkingSpace parkingSpace25 = null;
        booking8.setParkingSpace(parkingSpace25);
        int int30 = booking8.getTotalCost((-1671086136), 35, 5148000);
        booking8.setStartTime((int) (short) 100);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 833896736 + "'", int30 == 833896736);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost((int) (short) 0, (int) (byte) 1, 10);
        booking8.setStartTime(4838);
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        java.lang.String str25 = parkingLot24.getLocation();
        observer.ParkingSpace[] parkingSpaceArray26 = parkingLot24.getSpaces();
        java.lang.String str27 = parkingLot24.getLocation();
        template.User user29 = null;
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = null;
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(1, user29, parkingLot30, parkingSpace31, (int) 'a', (int) 'a', paymentOption34, "");
        template.User user37 = null;
        booking36.setUser(user37);
        int int42 = booking36.getTotalCost((int) (short) -1, 5148, 0);
        factory.PaymentOption paymentOption43 = booking36.getPaymentOption();
        template.User user45 = null;
        observer.ParkingLot parkingLot46 = null;
        observer.ParkingSpace parkingSpace47 = null;
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(1, user45, parkingLot46, parkingSpace47, (int) 'a', (int) 'a', paymentOption50, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        observer.ParkingLot parkingLot56 = parkingSpace53.getParkingLot();
        booking52.setParkingSpace(parkingSpace53);
        booking52.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace60 = new observer.ParkingSpace();
        booking52.setParkingSpace(parkingSpace60);
        java.lang.String str62 = booking52.getLicense();
        observer.ParkingSpace parkingSpace63 = booking52.getParkingSpace();
        boolean boolean64 = parkingSpace63.isDisabled();
        parkingSpace63.setTaken(true);
        boolean boolean67 = parkingSpace63.isTaken();
        booking36.setParkingSpace(parkingSpace63);
        factory.PaymentOption paymentOption71 = null;
        observer.Booking booking73 = new observer.Booking(16068, user20, parkingLot24, parkingSpace63, 22, (int) 'a', paymentOption71, "");
        parkingLot24.setDisabled(false);
        booking8.setParkingLot(parkingLot24);
        observer.ParkingLot parkingLot80 = new observer.ParkingLot(0, false, "");
        java.lang.String str81 = parkingLot80.getLocation();
        parkingLot80.setId((int) ' ');
        parkingLot80.setId(310);
        observer.ParkingLot parkingLot89 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray90 = parkingLot89.getSpaces();
        parkingLot80.setSpaces(parkingSpaceArray90);
        parkingLot24.setSpaces(parkingSpaceArray90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(paymentOption43);
        org.junit.Assert.assertNull(parkingLot56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(parkingSpace63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray90);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
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
        parkingSpace51.setId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = parkingSpace51.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot62);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        boolean boolean19 = parkingLot9.isDisabled();
        observer.ParkingSpace parkingSpace20 = new observer.ParkingSpace(6500, "", false, false, parkingLot9);
        int int21 = parkingLot9.getId();
        parkingLot9.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "");
        parkingLot3.setLocation("hi!");
        java.lang.Class<?> wildcardClass6 = parkingLot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
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
        template.User user38 = null;
        template.User user40 = null;
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        java.lang.String str49 = parkingLot48.getLocation();
        int int50 = parkingLot48.getId();
        observer.ParkingSpace parkingSpace51 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot48);
        template.User user57 = null;
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        java.lang.String str62 = parkingLot61.getLocation();
        int int63 = parkingLot61.getId();
        observer.ParkingLot parkingLot68 = null;
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot68);
        parkingSpace69.setDisabled(true);
        parkingSpace69.setLocation("hi!");
        factory.PaymentOption paymentOption76 = null;
        observer.Booking booking78 = new observer.Booking((-100), user57, parkingLot61, parkingSpace69, (int) (byte) -1, (int) (short) 10, paymentOption76, "");
        observer.ParkingLot parkingLot82 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray83 = parkingLot82.getSpaces();
        parkingLot61.setSpaces(parkingSpaceArray83);
        observer.ParkingSpace parkingSpace85 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot61);
        parkingSpace85.setLocation("hi!");
        factory.PaymentOption paymentOption90 = null;
        observer.Booking booking92 = new observer.Booking(32, user40, parkingLot48, parkingSpace85, 100, 10, paymentOption90, "hi!");
        observer.ParkingSpace parkingSpace93 = null;
        factory.PaymentOption paymentOption96 = null;
        observer.Booking booking98 = new observer.Booking((int) '4', user38, parkingLot48, parkingSpace93, (-970), (-100), paymentOption96, "");
        parkingSpace3.setParkingLot(parkingLot48);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray83);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
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
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        boolean boolean25 = parkingSpace24.isDisabled();
        booking22.setParkingSpace(parkingSpace24);
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        java.lang.String str30 = parkingSpace27.getLocation();
        observer.ParkingLot parkingLot31 = null;
        parkingSpace27.setParkingLot(parkingLot31);
        observer.ParkingLot parkingLot36 = new observer.ParkingLot(0, false, "");
        java.lang.String str37 = parkingLot36.getLocation();
        parkingSpace27.setParkingLot(parkingLot36);
        parkingSpace24.setParkingLot(parkingLot36);
        java.lang.Class<?> wildcardClass40 = parkingLot36.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-100) + "'", int23 == (-100));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
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
        java.lang.String str26 = parkingSpace0.getLocation();
        int int27 = parkingSpace0.getLotID();
        parkingSpace0.setTaken(true);
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        java.lang.String str34 = parkingLot33.getLocation();
        parkingLot33.setId((int) ' ');
        template.User user38 = null;
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace();
        parkingSpace43.setDisabled(true);
        boolean boolean46 = parkingSpace43.isTaken();
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking(100, user38, parkingLot42, parkingSpace43, (int) (byte) 1, (int) (short) 0, paymentOption49, "");
        observer.ParkingSpace[] parkingSpaceArray52 = parkingLot42.getSpaces();
        parkingLot42.setId(97);
        observer.ParkingSpace[] parkingSpaceArray55 = parkingLot42.getSpaces();
        parkingLot33.setSpaces(parkingSpaceArray55);
        java.lang.String str57 = parkingLot33.getLocation();
        parkingLot33.setDisabled(false);
        template.User user61 = null;
        observer.ParkingLot parkingLot62 = null;
        observer.ParkingSpace parkingSpace63 = null;
        factory.PaymentOption paymentOption66 = null;
        observer.Booking booking68 = new observer.Booking(1, user61, parkingLot62, parkingSpace63, (int) 'a', (int) 'a', paymentOption66, "");
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        observer.ParkingLot parkingLot72 = parkingSpace69.getParkingLot();
        booking68.setParkingSpace(parkingSpace69);
        template.User user75 = null;
        observer.ParkingLot parkingLot79 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace80 = new observer.ParkingSpace();
        parkingSpace80.setDisabled(true);
        boolean boolean83 = parkingSpace80.isTaken();
        factory.PaymentOption paymentOption86 = null;
        observer.Booking booking88 = new observer.Booking(100, user75, parkingLot79, parkingSpace80, (int) (byte) 1, (int) (short) 0, paymentOption86, "");
        boolean boolean89 = parkingLot79.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray90 = new observer.ParkingSpace[] {};
        parkingLot79.setSpaces(parkingSpaceArray90);
        parkingLot79.setDisabled(false);
        booking68.setParkingLot(parkingLot79);
        observer.ParkingSpace[] parkingSpaceArray95 = parkingLot79.getSpaces();
        parkingLot33.setSpaces(parkingSpaceArray95);
        parkingSpace0.setParkingLot(parkingLot33);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray52);
        org.junit.Assert.assertNotNull(parkingSpaceArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(parkingLot72);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray90);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray90, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray95);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray95, new observer.ParkingSpace[] {});
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
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
        booking8.setStartTime(1100);
        observer.ParkingLot parkingLot31 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-629847809) + "'", int28 == (-629847809));
        org.junit.Assert.assertNull(parkingLot31);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = new observer.ParkingSpace();
        parkingSpace3.setDisabled(true);
        java.lang.String str6 = parkingSpace3.getLocation();
        observer.ParkingLot parkingLot7 = null;
        parkingSpace3.setParkingLot(parkingLot7);
        factory.PaymentOption paymentOption11 = null;
        observer.Booking booking13 = new observer.Booking((int) (short) 0, user1, parkingLot2, parkingSpace3, 5148, (int) (short) 100, paymentOption11, "");
        int int14 = booking13.getStartTime();
        int int18 = booking13.getTotalCost(870, 6500, (int) (byte) 100);
        booking13.setId((int) (byte) -1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5148 + "'", int14 == 5148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 563000 + "'", int18 == 563000);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
        parkingSpace52.setLocation("");
        org.junit.Assert.assertNull(parkingLot8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
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
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        java.lang.String str32 = parkingSpace29.getLocation();
        observer.ParkingLot parkingLot33 = null;
        parkingSpace29.setParkingLot(parkingLot33);
        parkingSpace29.setTaken(true);
        template.User user38 = null;
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace43 = new observer.ParkingSpace();
        parkingSpace43.setDisabled(true);
        boolean boolean46 = parkingSpace43.isTaken();
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking(100, user38, parkingLot42, parkingSpace43, (int) (byte) 1, (int) (short) 0, paymentOption49, "");
        boolean boolean52 = parkingLot42.isDisabled();
        parkingSpace29.setParkingLot(parkingLot42);
        template.User user55 = null;
        observer.ParkingLot parkingLot59 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot64 = null;
        observer.ParkingSpace parkingSpace65 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot64);
        factory.PaymentOption paymentOption68 = null;
        observer.Booking booking70 = new observer.Booking(0, user55, parkingLot59, parkingSpace65, (int) (short) -1, (int) (byte) 0, paymentOption68, "hi!");
        template.User user72 = null;
        observer.ParkingLot parkingLot76 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace77 = new observer.ParkingSpace();
        parkingSpace77.setDisabled(true);
        boolean boolean80 = parkingSpace77.isTaken();
        factory.PaymentOption paymentOption83 = null;
        observer.Booking booking85 = new observer.Booking(100, user72, parkingLot76, parkingSpace77, (int) (byte) 1, (int) (short) 0, paymentOption83, "");
        observer.ParkingSpace[] parkingSpaceArray86 = parkingLot76.getSpaces();
        parkingLot59.setSpaces(parkingSpaceArray86);
        observer.ParkingSpace[] parkingSpaceArray88 = parkingLot59.getSpaces();
        parkingLot42.setSpaces(parkingSpaceArray88);
        parkingLot23.setSpaces(parkingSpaceArray88);
        int int91 = parkingLot23.getId();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray86);
        org.junit.Assert.assertNotNull(parkingSpaceArray88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(97, false, "hi!");
        booking8.setParkingLot(parkingLot23);
        parkingLot23.setDisabled(false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(parkingSpace19);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        parkingSpace5.setDisabled(false);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        observer.ParkingLot parkingLot38 = parkingSpace32.getParkingLot();
        observer.ParkingLot parkingLot42 = new observer.ParkingLot(0, false, "");
        java.lang.String str43 = parkingLot42.getLocation();
        parkingLot42.setId((int) ' ');
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot42.getSpaces();
        parkingSpace32.setParkingLot(parkingLot42);
        observer.ParkingLot parkingLot48 = parkingSpace32.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingLot38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(parkingLot48);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        template.User user3 = null;
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(97);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        boolean boolean31 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(100, user23, parkingLot27, parkingSpace28, (int) (byte) 1, (int) (short) 0, paymentOption34, "");
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        parkingSpace28.setParkingLot(parkingLot40);
        boolean boolean42 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (byte) 1, user3, parkingLot9, parkingSpace28, (int) (byte) 100, 22, paymentOption45, "");
        parkingLot9.setDisabled(true);
        parkingSpace0.setParkingLot(parkingLot9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
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
        booking8.setEndTime((-6298500));
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(paymentOption20);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        int int15 = parkingSpace6.getId();
        parkingSpace6.setId((-732701696));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        parkingLot9.setId(0);
        int int14 = parkingLot9.getId();
        boolean boolean15 = parkingLot9.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray16 = parkingLot9.getSpaces();
        int int17 = parkingLot9.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
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
        boolean boolean31 = parkingLot25.isDisabled();
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-62985320), false, "hi!");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        parkingLot3.setDisabled(true);
        parkingLot3.setId((int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
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
        int int77 = booking8.getId();
        java.lang.Class<?> wildcardClass78 = booking8.getClass();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parkingLot73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
        observer.ParkingSpace parkingSpace19 = booking8.getParkingSpace();
        int int20 = booking8.getStartTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
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
        int int52 = parkingLot44.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) (short) 1, true, "hi!");
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
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
        booking8.setLicense("hi!");
        booking8.setEndTime((-274528512));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
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
        observer.ParkingLot parkingLot24 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(parkingLot24);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
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
        parkingSpace51.setId((int) (short) 100);
        parkingSpace51.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(parkingLot62);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
        java.lang.String str54 = parkingSpace3.getLocation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray49, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingLot53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(6500, true, "");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
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
        booking10.setParkingLot(parkingLot21);
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot21.getSpaces();
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setId((int) (short) -1);
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(140866, user1, parkingLot21, parkingSpace38, (int) (byte) 10, 90, paymentOption43, "");
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        java.lang.String str54 = parkingLot53.getLocation();
        int int55 = parkingLot53.getId();
        observer.ParkingSpace parkingSpace56 = new observer.ParkingSpace((int) (byte) 100, "hi!", false, true, parkingLot53);
        parkingLot53.setLocation("hi!");
        parkingSpace38.setParkingLot(parkingLot53);
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray37, new observer.ParkingSpace[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
        parkingSpace19.setTaken(false);
        boolean boolean46 = parkingSpace19.isDisabled();
        template.User user48 = null;
        observer.ParkingLot parkingLot52 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        boolean boolean56 = parkingSpace53.isTaken();
        factory.PaymentOption paymentOption59 = null;
        observer.Booking booking61 = new observer.Booking(100, user48, parkingLot52, parkingSpace53, (int) (byte) 1, (int) (short) 0, paymentOption59, "");
        observer.ParkingSpace[] parkingSpaceArray62 = parkingLot52.getSpaces();
        parkingLot52.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray65 = parkingLot52.getSpaces();
        int int66 = parkingLot52.getId();
        parkingSpace19.setParkingLot(parkingLot52);
        java.lang.String str68 = parkingSpace19.getLocation();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray62);
        org.junit.Assert.assertNotNull(parkingSpaceArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5148 + "'", int66 == 5148);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
        boolean boolean59 = parkingLot40.isDisabled();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        boolean boolean6 = parkingSpace5.isDisabled();
        observer.ParkingLot parkingLot7 = parkingSpace5.getParkingLot();
        observer.ParkingLot parkingLot8 = parkingSpace5.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        template.User user1 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot9);
        parkingLot9.setId(2146977336);
        template.User user14 = null;
        template.User user16 = null;
        observer.ParkingLot parkingLot20 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace();
        parkingSpace21.setDisabled(true);
        boolean boolean24 = parkingSpace21.isTaken();
        factory.PaymentOption paymentOption27 = null;
        observer.Booking booking29 = new observer.Booking(100, user16, parkingLot20, parkingSpace21, (int) (byte) 1, (int) (short) 0, paymentOption27, "");
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(0, false, "");
        parkingSpace21.setParkingLot(parkingLot33);
        parkingLot33.setDisabled(false);
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot33.getSpaces();
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setDisabled(true);
        java.lang.String str41 = parkingSpace38.getLocation();
        parkingSpace38.setDisabled(false);
        observer.ParkingLot parkingLot44 = parkingSpace38.getParkingLot();
        parkingSpace38.setId((int) (short) 1);
        factory.PaymentOption paymentOption49 = null;
        observer.Booking booking51 = new observer.Booking((int) (short) 0, user14, parkingLot33, parkingSpace38, (int) (short) 1, 6500, paymentOption49, "");
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking((int) ' ', user1, parkingLot9, parkingSpace38, 52, 1100, paymentOption54, "hi!");
        java.lang.String str57 = booking56.getLicense();
        java.lang.Class<?> wildcardClass58 = booking56.getClass();
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(parkingLot44);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
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
        observer.ParkingLot parkingLot17 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertNull(parkingLot17);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
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
        int int59 = booking55.getTotalCost(772200, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray18, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot36);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 772100 + "'", int59 == 772100);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace8 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot7);
        parkingSpace8.setId(0);
        parkingSpace8.setTaken(true);
        parkingSpace8.setTaken(false);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        observer.ParkingSpace parkingSpace4 = new observer.ParkingSpace();
        parkingSpace4.setDisabled(true);
        java.lang.String str7 = parkingSpace4.getLocation();
        observer.ParkingLot parkingLot8 = null;
        parkingSpace4.setParkingLot(parkingLot8);
        parkingSpace4.setTaken(true);
        template.User user13 = null;
        observer.ParkingLot parkingLot17 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        parkingSpace18.setDisabled(true);
        boolean boolean21 = parkingSpace18.isTaken();
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking(100, user13, parkingLot17, parkingSpace18, (int) (byte) 1, (int) (short) 0, paymentOption24, "");
        boolean boolean27 = parkingLot17.isDisabled();
        parkingSpace4.setParkingLot(parkingLot17);
        template.User user30 = null;
        observer.ParkingLot parkingLot34 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot39 = null;
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot39);
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(0, user30, parkingLot34, parkingSpace40, (int) (short) -1, (int) (byte) 0, paymentOption43, "hi!");
        template.User user47 = null;
        observer.ParkingLot parkingLot51 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        boolean boolean55 = parkingSpace52.isTaken();
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(100, user47, parkingLot51, parkingSpace52, (int) (byte) 1, (int) (short) 0, paymentOption58, "");
        observer.ParkingSpace[] parkingSpaceArray61 = parkingLot51.getSpaces();
        parkingLot34.setSpaces(parkingSpaceArray61);
        observer.ParkingSpace[] parkingSpaceArray63 = parkingLot34.getSpaces();
        parkingLot17.setSpaces(parkingSpaceArray63);
        observer.ParkingSpace parkingSpace65 = new observer.ParkingSpace(629847800, "hi!", false, false, parkingLot17);
        observer.ParkingLot parkingLot73 = new observer.ParkingLot(310, true, "hi!");
        observer.ParkingSpace parkingSpace74 = new observer.ParkingSpace((-22), "hi!", true, true, parkingLot73);
        parkingLot73.setId(2146977336);
        parkingSpace65.setParkingLot(parkingLot73);
        java.lang.String str78 = parkingLot73.getLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray61);
        org.junit.Assert.assertNotNull(parkingSpaceArray63);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
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
        template.User user49 = booking45.getUser();
        observer.ParkingLot parkingLot50 = booking45.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingLot46);
        org.junit.Assert.assertNull(user49);
        org.junit.Assert.assertNotNull(parkingLot50);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot((int) '#', false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        int int9 = parkingLot7.getId();
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) (short) 1, "", true, true, parkingLot7);
        parkingSpace10.setDisabled(false);
        java.lang.Class<?> wildcardClass13 = parkingSpace10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(1, false, "");
        boolean boolean4 = parkingLot3.isDisabled();
        boolean boolean5 = parkingLot3.isDisabled();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        template.User user11 = booking8.getUser();
        factory.PaymentOption paymentOption12 = booking8.getPaymentOption();
        booking8.setId((int) (byte) -1);
        int int15 = booking8.getId();
        java.lang.Class<?> wildcardClass16 = booking8.getClass();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-337428), true, "hi!");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
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
        booking8.setStartTime(629850000);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
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
        int int18 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
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
        booking39.setStartTime((int) '#');
        int int45 = booking39.getTotalCost((int) (byte) 100, (int) (short) 10, (int) (short) -1);
        factory.PaymentOption paymentOption46 = null;
        booking39.setPaymentOption(paymentOption46);
        int int48 = booking39.getStartTime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 90 + "'", int45 == 90);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', true, "hi!");
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        template.User user5 = null;
        observer.ParkingLot parkingLot6 = null;
        observer.ParkingSpace parkingSpace7 = null;
        factory.PaymentOption paymentOption10 = null;
        observer.Booking booking12 = new observer.Booking(1, user5, parkingLot6, parkingSpace7, (int) 'a', (int) 'a', paymentOption10, "");
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        observer.ParkingLot parkingLot16 = parkingSpace13.getParkingLot();
        booking12.setParkingSpace(parkingSpace13);
        booking12.setEndTime(0);
        factory.PaymentOption paymentOption20 = null;
        booking12.setPaymentOption(paymentOption20);
        observer.ParkingSpace parkingSpace22 = booking12.getParkingSpace();
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot27);
        booking12.setParkingSpace(parkingSpace28);
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        parkingSpace36.setParkingLot(parkingLot48);
        parkingSpace28.setParkingLot(parkingLot48);
        boolean boolean51 = parkingLot48.isDisabled();
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace((int) ' ', "", false, true, parkingLot48);
        parkingSpace52.setId((-1));
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
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
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray27 = parkingLot26.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray27);
        int int29 = parkingLot5.getId();
        observer.ParkingLot parkingLot37 = new observer.ParkingLot((int) '#', false, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace((int) (short) 0, "hi!", true, false, parkingLot37);
        observer.ParkingSpace[] parkingSpaceArray39 = parkingLot37.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray39);
        parkingLot5.setDisabled(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray39);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
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
        java.lang.String str44 = booking8.getLicense();
        observer.ParkingLot parkingLot45 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(parkingLot45);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
        int int19 = booking8.getStartTime();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        template.User user21 = booking8.getUser();
        int int25 = booking8.getTotalCost((-327523820), 16068, (-93322944));
        template.User user27 = null;
        template.User user29 = null;
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = null;
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(1, user29, parkingLot30, parkingSpace31, (int) 'a', (int) 'a', paymentOption34, "");
        observer.ParkingSpace parkingSpace37 = new observer.ParkingSpace();
        parkingSpace37.setDisabled(true);
        observer.ParkingLot parkingLot40 = parkingSpace37.getParkingLot();
        booking36.setParkingSpace(parkingSpace37);
        template.User user43 = null;
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        boolean boolean51 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking(100, user43, parkingLot47, parkingSpace48, (int) (byte) 1, (int) (short) 0, paymentOption54, "");
        boolean boolean57 = parkingLot47.isDisabled();
        observer.ParkingSpace[] parkingSpaceArray58 = new observer.ParkingSpace[] {};
        parkingLot47.setSpaces(parkingSpaceArray58);
        parkingLot47.setDisabled(false);
        booking36.setParkingLot(parkingLot47);
        observer.ParkingSpace[] parkingSpaceArray63 = parkingLot47.getSpaces();
        observer.ParkingSpace parkingSpace64 = new observer.ParkingSpace();
        parkingSpace64.setId((int) (short) -1);
        factory.PaymentOption paymentOption69 = null;
        observer.Booking booking71 = new observer.Booking(140866, user27, parkingLot47, parkingSpace64, (int) (byte) 10, 90, paymentOption69, "");
        boolean boolean72 = parkingSpace64.isDisabled();
        observer.ParkingLot parkingLot73 = parkingSpace64.getParkingLot();
        booking8.setParkingSpace(parkingSpace64);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(paymentOption20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-732701696) + "'", int25 == (-732701696));
        org.junit.Assert.assertNull(parkingLot40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray58);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray58, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray63);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray63, new observer.ParkingSpace[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(parkingLot73);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        java.lang.String str8 = parkingSpace0.getLocation();
        int int9 = parkingSpace0.getId();
        parkingSpace0.setId((-64493000));
        parkingSpace0.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
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
        booking8.setLicense("");
        observer.ParkingLot parkingLot31 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        java.lang.String str36 = parkingLot35.getLocation();
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot35.getSpaces();
        parkingLot31.setSpaces(parkingSpaceArray37);
        boolean boolean39 = parkingLot31.isDisabled();
        parkingLot31.setId(0);
        booking8.setParkingLot(parkingLot31);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((-6298500), false, "hi!");
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        parkingLot9.setId(0);
        observer.ParkingSpace parkingSpace21 = new observer.ParkingSpace((-22), "hi!", false, true, parkingLot9);
        int int22 = parkingSpace21.getLotID();
        int int23 = parkingSpace21.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-22) + "'", int23 == (-22));
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        int int11 = booking8.getId();
        booking8.setEndTime(5148);
        template.User user14 = null;
        booking8.setUser(user14);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        parkingLot7.setDisabled(false);
        parkingLot7.setDisabled(true);
        parkingLot7.setId(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
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
        observer.ParkingLot parkingLot59 = parkingSpace46.getParkingLot();
        parkingSpace46.setLocation("");
        observer.ParkingLot parkingLot62 = parkingSpace46.getParkingLot();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5148 + "'", int45 == 5148);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(parkingLot59);
        org.junit.Assert.assertNull(parkingLot62);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        parkingLot3.setId((int) ' ');
        java.lang.String str7 = parkingLot3.getLocation();
        observer.ParkingSpace[] parkingSpaceArray8 = parkingLot3.getSpaces();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray8);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
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
        parkingSpace48.setDisabled(true);
        parkingSpace48.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray18, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot36);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
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
        factory.PaymentOption paymentOption24 = null;
        booking22.setPaymentOption(paymentOption24);
        java.lang.String str26 = booking22.getLicense();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-100) + "'", int23 == (-100));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        observer.ParkingLot parkingLot13 = booking8.getParkingLot();
        org.junit.Assert.assertNull(parkingLot13);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
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
        parkingLot44.setDisabled(true);
        parkingLot44.setId(870);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
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
        parkingSpace0.setDisabled(false);
        observer.ParkingLot parkingLot33 = new observer.ParkingLot(100, false, "");
        parkingSpace0.setParkingLot(parkingLot33);
        int int35 = parkingSpace0.getLotID();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
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
        observer.ParkingSpace[] parkingSpaceArray34 = parkingLot5.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray35 = parkingLot5.getSpaces();
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
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
        java.lang.String str68 = parkingSpace51.getLocation();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
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
        template.User user23 = booking8.getUser();
        int int24 = booking8.getStartTime();
        int int28 = booking8.getTotalCost(629850000, 3492, 0);
        factory.PaymentOption paymentOption29 = null;
        booking8.setPaymentOption(paymentOption29);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
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
        observer.ParkingLot parkingLot58 = parkingSpace21.getParkingLot();
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
        org.junit.Assert.assertNotNull(parkingLot58);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
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
        observer.ParkingSpace[] parkingSpaceArray25 = parkingLot13.getSpaces();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
        booking8.setStartTime((-6298500));
        factory.PaymentOption paymentOption25 = null;
        booking8.setPaymentOption(paymentOption25);
        booking8.setEndTime((int) (byte) 10);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
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
        booking10.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        booking10.setParkingSpace(parkingSpace18);
        java.lang.String str20 = booking10.getLicense();
        observer.ParkingSpace parkingSpace21 = booking10.getParkingSpace();
        template.User user22 = booking10.getUser();
        java.lang.String str23 = booking10.getLicense();
        factory.PaymentOption paymentOption24 = booking10.getPaymentOption();
        template.User user25 = null;
        booking10.setUser(user25);
        booking10.setEndTime(22);
        booking10.setId(870);
        observer.ParkingSpace parkingSpace31 = booking10.getParkingSpace();
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        observer.ParkingSpace[] parkingSpaceArray51 = parkingLot41.getSpaces();
        parkingLot41.setId(5148);
        parkingLot41.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray56 = parkingLot41.getSpaces();
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot41);
        parkingLot41.setId(100);
        int int60 = parkingLot41.getId();
        int int61 = parkingLot41.getId();
        parkingSpace31.setParkingLot(parkingLot41);
        parkingLot41.setDisabled(true);
        observer.ParkingSpace parkingSpace65 = new observer.ParkingSpace();
        boolean boolean66 = parkingSpace65.isDisabled();
        parkingSpace65.setDisabled(true);
        parkingSpace65.setId(10);
        parkingSpace65.setId(0);
        java.lang.String str73 = parkingSpace65.getLocation();
        parkingSpace65.setLocation("");
        observer.ParkingLot parkingLot76 = parkingSpace65.getParkingLot();
        factory.PaymentOption paymentOption79 = null;
        observer.Booking booking81 = new observer.Booking((int) 'a', user1, parkingLot41, parkingSpace65, (-22), 2107977464, paymentOption79, "");
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(paymentOption24);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray51);
        org.junit.Assert.assertNotNull(parkingSpaceArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(parkingLot76);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        java.lang.String str4 = parkingSpace0.getLocation();
        java.lang.String str5 = parkingSpace0.getLocation();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
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
        template.User user30 = null;
        booking8.setUser(user30);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        observer.ParkingLot parkingLot11 = booking8.getParkingLot();
        int int12 = booking8.getStartTime();
        int int13 = booking8.getStartTime();
        template.User user14 = null;
        booking8.setUser(user14);
        booking8.setLicense("");
        org.junit.Assert.assertNull(parkingLot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
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
        java.lang.String str21 = parkingSpace18.getLocation();
        boolean boolean22 = parkingSpace18.isTaken();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
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
        java.lang.Class<?> wildcardClass49 = parkingSpaceArray48.getClass();
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertNotNull(parkingSpaceArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        template.User user1 = null;
        template.User user7 = null;
        observer.ParkingLot parkingLot8 = null;
        observer.ParkingSpace parkingSpace9 = null;
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(1, user7, parkingLot8, parkingSpace9, (int) 'a', (int) 'a', paymentOption12, "");
        observer.ParkingSpace parkingSpace15 = new observer.ParkingSpace();
        parkingSpace15.setDisabled(true);
        observer.ParkingLot parkingLot18 = parkingSpace15.getParkingLot();
        booking14.setParkingSpace(parkingSpace15);
        booking14.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        booking14.setParkingSpace(parkingSpace22);
        java.lang.String str24 = booking14.getLicense();
        factory.PaymentOption paymentOption25 = booking14.getPaymentOption();
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
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        booking34.setParkingLot(parkingLot47);
        observer.ParkingSpace[] parkingSpaceArray49 = parkingLot47.getSpaces();
        java.lang.String str50 = parkingLot47.getLocation();
        booking14.setParkingLot(parkingLot47);
        java.lang.String str52 = parkingLot47.getLocation();
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace((int) ' ', "", true, true, parkingLot47);
        template.User user55 = null;
        observer.ParkingLot parkingLot56 = null;
        observer.ParkingSpace parkingSpace57 = null;
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking(1, user55, parkingLot56, parkingSpace57, (int) 'a', (int) 'a', paymentOption60, "");
        int int66 = booking62.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        observer.ParkingSpace parkingSpace67 = new observer.ParkingSpace();
        parkingSpace67.setId((int) (short) -1);
        booking62.setParkingSpace(parkingSpace67);
        observer.ParkingSpace parkingSpace71 = booking62.getParkingSpace();
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking(22, user1, parkingLot47, parkingSpace71, (-186496), (-1), paymentOption74, "hi!");
        int int77 = booking76.getEndTime();
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(paymentOption25);
        org.junit.Assert.assertNull(parkingLot38);
        org.junit.Assert.assertNotNull(parkingSpaceArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5148 + "'", int66 == 5148);
        org.junit.Assert.assertNotNull(parkingSpace71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
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
        observer.ParkingLot parkingLot28 = booking8.getParkingLot();
        int int29 = booking8.getEndTime();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int16 = booking8.getTotalCost(97, 32, (-100));
        java.lang.String str17 = booking8.getLicense();
        booking8.setStartTime((int) (short) 100);
        observer.ParkingSpace parkingSpace20 = null;
        booking8.setParkingSpace(parkingSpace20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6500 + "'", int16 == 6500);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
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
        template.User user23 = booking8.getUser();
        int int27 = booking8.getTotalCost((-1), 833896736, 16068);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1245193404) + "'", int27 == (-1245193404));
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
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
        template.User user22 = null;
        booking8.setUser(user22);
        booking8.setStartTime((-36470));
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6298500) + "'", int20 == (-6298500));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        observer.ParkingLot parkingLot7 = new observer.ParkingLot(0, false, "");
        java.lang.String str8 = parkingLot7.getLocation();
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot7);
        boolean boolean10 = parkingSpace9.isTaken();
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        java.lang.String str14 = parkingSpace11.getLocation();
        observer.ParkingLot parkingLot15 = null;
        parkingSpace11.setParkingLot(parkingLot15);
        parkingSpace11.setTaken(true);
        template.User user20 = null;
        observer.ParkingLot parkingLot24 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace25 = new observer.ParkingSpace();
        parkingSpace25.setDisabled(true);
        boolean boolean28 = parkingSpace25.isTaken();
        factory.PaymentOption paymentOption31 = null;
        observer.Booking booking33 = new observer.Booking(100, user20, parkingLot24, parkingSpace25, (int) (byte) 1, (int) (short) 0, paymentOption31, "");
        boolean boolean34 = parkingLot24.isDisabled();
        parkingSpace11.setParkingLot(parkingLot24);
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot46 = null;
        observer.ParkingSpace parkingSpace47 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot46);
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(0, user37, parkingLot41, parkingSpace47, (int) (short) -1, (int) (byte) 0, paymentOption50, "hi!");
        template.User user54 = null;
        observer.ParkingLot parkingLot58 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace();
        parkingSpace59.setDisabled(true);
        boolean boolean62 = parkingSpace59.isTaken();
        factory.PaymentOption paymentOption65 = null;
        observer.Booking booking67 = new observer.Booking(100, user54, parkingLot58, parkingSpace59, (int) (byte) 1, (int) (short) 0, paymentOption65, "");
        observer.ParkingSpace[] parkingSpaceArray68 = parkingLot58.getSpaces();
        parkingLot41.setSpaces(parkingSpaceArray68);
        observer.ParkingSpace[] parkingSpaceArray70 = parkingLot41.getSpaces();
        parkingLot24.setSpaces(parkingSpaceArray70);
        int int72 = parkingLot24.getId();
        observer.ParkingSpace[] parkingSpaceArray73 = new observer.ParkingSpace[] {};
        parkingLot24.setSpaces(parkingSpaceArray73);
        parkingSpace9.setParkingLot(parkingLot24);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray68);
        org.junit.Assert.assertNotNull(parkingSpaceArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray73);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray73, new observer.ParkingSpace[] {});
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(1, false, "");
        parkingLot5.setId((int) (short) -1);
        template.User user9 = null;
        observer.ParkingLot parkingLot10 = null;
        observer.ParkingSpace parkingSpace11 = null;
        factory.PaymentOption paymentOption14 = null;
        observer.Booking booking16 = new observer.Booking(1, user9, parkingLot10, parkingSpace11, (int) 'a', (int) 'a', paymentOption14, "");
        observer.ParkingSpace parkingSpace17 = new observer.ParkingSpace();
        parkingSpace17.setDisabled(true);
        observer.ParkingLot parkingLot20 = parkingSpace17.getParkingLot();
        booking16.setParkingSpace(parkingSpace17);
        booking16.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace24 = new observer.ParkingSpace();
        booking16.setParkingSpace(parkingSpace24);
        java.lang.String str26 = booking16.getLicense();
        observer.ParkingSpace parkingSpace27 = booking16.getParkingSpace();
        template.User user28 = booking16.getUser();
        java.lang.String str29 = booking16.getLicense();
        factory.PaymentOption paymentOption30 = booking16.getPaymentOption();
        template.User user31 = null;
        booking16.setUser(user31);
        java.lang.String str33 = booking16.getLicense();
        observer.ParkingLot parkingLot38 = null;
        observer.ParkingSpace parkingSpace39 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot38);
        observer.ParkingLot parkingLot40 = parkingSpace39.getParkingLot();
        booking16.setParkingSpace(parkingSpace39);
        java.lang.String str42 = parkingSpace39.getLocation();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(2105387136, user1, parkingLot5, parkingSpace39, (int) (byte) 10, (-186496), paymentOption45, "hi!");
        parkingSpace39.setDisabled(true);
        org.junit.Assert.assertNull(parkingLot20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(parkingSpace27);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(paymentOption30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(parkingLot40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
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
        observer.ParkingSpace parkingSpace47 = booking46.getParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5148 + "'", int21 == 5148);
        org.junit.Assert.assertNull(parkingLot34);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(parkingSpace47);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
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
        booking8.setId(10);
        factory.PaymentOption paymentOption22 = booking8.getPaymentOption();
        template.User user24 = null;
        observer.ParkingLot parkingLot25 = null;
        observer.ParkingSpace parkingSpace26 = null;
        factory.PaymentOption paymentOption29 = null;
        observer.Booking booking31 = new observer.Booking(1, user24, parkingLot25, parkingSpace26, (int) 'a', (int) 'a', paymentOption29, "");
        booking31.setId((int) ' ');
        booking31.setEndTime((int) (byte) -1);
        template.User user41 = null;
        observer.ParkingLot parkingLot45 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace46 = new observer.ParkingSpace();
        parkingSpace46.setDisabled(true);
        boolean boolean49 = parkingSpace46.isTaken();
        factory.PaymentOption paymentOption52 = null;
        observer.Booking booking54 = new observer.Booking(100, user41, parkingLot45, parkingSpace46, (int) (byte) 1, (int) (short) 0, paymentOption52, "");
        observer.ParkingSpace[] parkingSpaceArray55 = parkingLot45.getSpaces();
        parkingLot45.setId(5148);
        parkingLot45.setLocation("hi!");
        observer.ParkingSpace[] parkingSpaceArray60 = parkingLot45.getSpaces();
        observer.ParkingSpace parkingSpace61 = new observer.ParkingSpace((-1), "hi!", false, false, parkingLot45);
        observer.ParkingSpace[] parkingSpaceArray62 = parkingLot45.getSpaces();
        booking31.setParkingLot(parkingLot45);
        booking8.setParkingLot(parkingLot45);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray55);
        org.junit.Assert.assertNotNull(parkingSpaceArray60);
        org.junit.Assert.assertNotNull(parkingSpaceArray62);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
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
        int int70 = booking61.getStartTime();
        int int74 = booking61.getTotalCost(0, (-629847809), (-13858600));
        booking61.setId((-337428));
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 781258536 + "'", int74 == 781258536);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot((int) '#', true, "");
        int int4 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
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
        parkingSpace26.setDisabled(true);
        observer.ParkingLot parkingLot29 = parkingSpace26.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingLot29);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
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
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingSpace[] parkingSpaceArray45 = parkingLot35.getSpaces();
        observer.ParkingSpace[] parkingSpaceArray46 = parkingLot35.getSpaces();
        parkingLot16.setSpaces(parkingSpaceArray46);
        java.lang.Class<?> wildcardClass48 = parkingSpaceArray46.getClass();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertNotNull(parkingSpaceArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
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
        observer.ParkingLot parkingLot38 = parkingSpace32.getParkingLot();
        parkingSpace32.setTaken(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingLot38);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
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
        template.User user45 = null;
        observer.ParkingLot parkingLot46 = null;
        observer.ParkingSpace parkingSpace47 = null;
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(1, user45, parkingLot46, parkingSpace47, (int) 'a', (int) 'a', paymentOption50, "");
        observer.ParkingSpace parkingSpace53 = new observer.ParkingSpace();
        parkingSpace53.setDisabled(true);
        observer.ParkingLot parkingLot56 = parkingSpace53.getParkingLot();
        booking52.setParkingSpace(parkingSpace53);
        booking52.setEndTime(0);
        factory.PaymentOption paymentOption60 = null;
        booking52.setPaymentOption(paymentOption60);
        observer.ParkingSpace parkingSpace62 = booking52.getParkingSpace();
        parkingSpace62.setLocation("");
        factory.PaymentOption paymentOption67 = null;
        observer.Booking booking69 = new observer.Booking((int) (byte) 0, user1, parkingLot40, parkingSpace62, (int) (byte) 1, (-22), paymentOption67, "hi!");
        observer.ParkingLot parkingLot70 = booking69.getParkingLot();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray42);
        org.junit.Assert.assertNull(parkingLot56);
        org.junit.Assert.assertNotNull(parkingSpace62);
        org.junit.Assert.assertNotNull(parkingLot70);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        parkingSpace5.setDisabled(true);
        parkingSpace5.setLocation("hi!");
        boolean boolean10 = parkingSpace5.isDisabled();
        boolean boolean11 = parkingSpace5.isTaken();
        observer.ParkingLot parkingLot12 = parkingSpace5.getParkingLot();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        template.User user1 = null;
        template.User user3 = null;
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(97);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        boolean boolean31 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(100, user23, parkingLot27, parkingSpace28, (int) (byte) 1, (int) (short) 0, paymentOption34, "");
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        parkingSpace28.setParkingLot(parkingLot40);
        boolean boolean42 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (byte) 1, user3, parkingLot9, parkingSpace28, (int) (byte) 100, 22, paymentOption45, "");
        observer.ParkingLot parkingLot55 = new observer.ParkingLot(5148, true, "");
        parkingLot55.setDisabled(true);
        observer.ParkingSpace parkingSpace58 = new observer.ParkingSpace(0, "", false, true, parkingLot55);
        factory.PaymentOption paymentOption61 = null;
        observer.Booking booking63 = new observer.Booking(1, user1, parkingLot9, parkingSpace58, (-9), (int) (short) 1, paymentOption61, "hi!");
        int int64 = booking63.getEndTime();
        factory.PaymentOption paymentOption65 = null;
        booking63.setPaymentOption(paymentOption65);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
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
        template.User user49 = null;
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace54 = new observer.ParkingSpace();
        parkingSpace54.setDisabled(true);
        boolean boolean57 = parkingSpace54.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking(100, user49, parkingLot53, parkingSpace54, (int) (byte) 1, (int) (short) 0, paymentOption60, "");
        observer.ParkingLot parkingLot66 = new observer.ParkingLot(0, false, "");
        parkingSpace54.setParkingLot(parkingLot66);
        observer.ParkingSpace[] parkingSpaceArray68 = parkingLot66.getSpaces();
        parkingLot7.setSpaces(parkingSpaceArray68);
        parkingLot7.setDisabled(false);
        int int72 = parkingLot7.getId();
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(parkingLot42);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
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
        template.User user47 = null;
        observer.ParkingLot parkingLot51 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace52 = new observer.ParkingSpace();
        parkingSpace52.setDisabled(true);
        boolean boolean55 = parkingSpace52.isTaken();
        factory.PaymentOption paymentOption58 = null;
        observer.Booking booking60 = new observer.Booking(100, user47, parkingLot51, parkingSpace52, (int) (byte) 1, (int) (short) 0, paymentOption58, "");
        int int61 = parkingLot51.getId();
        booking45.setParkingLot(parkingLot51);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
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
        java.lang.String str44 = booking8.getLicense();
        observer.ParkingSpace parkingSpace45 = new observer.ParkingSpace();
        parkingSpace45.setDisabled(true);
        java.lang.String str48 = parkingSpace45.getLocation();
        observer.ParkingLot parkingLot49 = null;
        parkingSpace45.setParkingLot(parkingLot49);
        observer.ParkingLot parkingLot54 = new observer.ParkingLot(0, false, "");
        java.lang.String str55 = parkingLot54.getLocation();
        parkingSpace45.setParkingLot(parkingLot54);
        parkingLot54.setId(0);
        int int59 = parkingLot54.getId();
        parkingLot54.setLocation("");
        booking8.setParkingLot(parkingLot54);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNull(paymentOption19);
        org.junit.Assert.assertNull(parkingLot32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
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
        template.User user20 = null;
        observer.ParkingLot parkingLot21 = null;
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        java.lang.String str25 = parkingSpace22.getLocation();
        observer.ParkingLot parkingLot26 = null;
        parkingSpace22.setParkingLot(parkingLot26);
        factory.PaymentOption paymentOption30 = null;
        observer.Booking booking32 = new observer.Booking((int) (short) 0, user20, parkingLot21, parkingSpace22, 5148, (int) (short) 100, paymentOption30, "");
        int int33 = parkingSpace22.getId();
        boolean boolean34 = parkingSpace22.isTaken();
        java.lang.String str35 = parkingSpace22.getLocation();
        booking8.setParkingSpace(parkingSpace22);
        template.User user38 = null;
        template.User user40 = null;
        observer.ParkingLot parkingLot44 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot49 = null;
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot49);
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(0, user40, parkingLot44, parkingSpace50, (int) (short) -1, (int) (byte) 0, paymentOption53, "hi!");
        template.User user57 = null;
        observer.ParkingLot parkingLot61 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace62 = new observer.ParkingSpace();
        parkingSpace62.setDisabled(true);
        boolean boolean65 = parkingSpace62.isTaken();
        factory.PaymentOption paymentOption68 = null;
        observer.Booking booking70 = new observer.Booking(100, user57, parkingLot61, parkingSpace62, (int) (byte) 1, (int) (short) 0, paymentOption68, "");
        observer.ParkingSpace[] parkingSpaceArray71 = parkingLot61.getSpaces();
        parkingLot44.setSpaces(parkingSpaceArray71);
        observer.ParkingSpace parkingSpace73 = new observer.ParkingSpace();
        parkingSpace73.setDisabled(true);
        java.lang.String str76 = parkingSpace73.getLocation();
        parkingSpace73.setDisabled(false);
        observer.ParkingLot parkingLot79 = parkingSpace73.getParkingLot();
        factory.PaymentOption paymentOption82 = null;
        observer.Booking booking84 = new observer.Booking((int) (short) 10, user38, parkingLot44, parkingSpace73, (int) (short) -1, 32, paymentOption82, "");
        observer.ParkingSpace[] parkingSpaceArray85 = parkingLot44.getSpaces();
        boolean boolean86 = parkingLot44.isDisabled();
        booking8.setParkingLot(parkingLot44);
        template.User user88 = null;
        booking8.setUser(user88);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(paymentOption18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray71);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(parkingLot79);
        org.junit.Assert.assertNotNull(parkingSpaceArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
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
        int int30 = parkingLot16.getId();
        observer.ParkingLot parkingLot38 = new observer.ParkingLot(0, false, "");
        java.lang.String str39 = parkingLot38.getLocation();
        parkingLot38.setId((int) ' ');
        template.User user43 = null;
        observer.ParkingLot parkingLot47 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace48 = new observer.ParkingSpace();
        parkingSpace48.setDisabled(true);
        boolean boolean51 = parkingSpace48.isTaken();
        factory.PaymentOption paymentOption54 = null;
        observer.Booking booking56 = new observer.Booking(100, user43, parkingLot47, parkingSpace48, (int) (byte) 1, (int) (short) 0, paymentOption54, "");
        observer.ParkingSpace[] parkingSpaceArray57 = parkingLot47.getSpaces();
        parkingLot47.setId(97);
        observer.ParkingSpace[] parkingSpaceArray60 = parkingLot47.getSpaces();
        parkingLot38.setSpaces(parkingSpaceArray60);
        java.lang.String str62 = parkingLot38.getLocation();
        observer.ParkingSpace parkingSpace63 = new observer.ParkingSpace(10, "", false, false, parkingLot38);
        observer.ParkingSpace[] parkingSpaceArray64 = parkingLot38.getSpaces();
        parkingLot16.setSpaces(parkingSpaceArray64);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5148 + "'", int30 == 5148);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray57);
        org.junit.Assert.assertNotNull(parkingSpaceArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(parkingSpaceArray64);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingLot parkingLot18 = new observer.ParkingLot(0, false, "");
        parkingSpace6.setParkingLot(parkingLot18);
        boolean boolean20 = parkingSpace6.isTaken();
        boolean boolean21 = parkingSpace6.isDisabled();
        parkingSpace6.setDisabled(false);
        parkingSpace6.setDisabled(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
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
        int int30 = parkingLot16.getId();
        parkingLot16.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5148 + "'", int30 == 5148);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
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
        int int24 = booking8.getId();
        factory.PaymentOption paymentOption25 = null;
        booking8.setPaymentOption(paymentOption25);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
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
        booking10.setParkingLot(parkingLot21);
        template.User user38 = null;
        observer.ParkingLot parkingLot39 = null;
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        java.lang.String str43 = parkingSpace40.getLocation();
        observer.ParkingLot parkingLot44 = null;
        parkingSpace40.setParkingLot(parkingLot44);
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking((int) (short) 0, user38, parkingLot39, parkingSpace40, 5148, (int) (short) 100, paymentOption48, "");
        template.User user52 = null;
        observer.ParkingLot parkingLot56 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace57 = new observer.ParkingSpace();
        parkingSpace57.setDisabled(true);
        boolean boolean60 = parkingSpace57.isTaken();
        factory.PaymentOption paymentOption63 = null;
        observer.Booking booking65 = new observer.Booking(100, user52, parkingLot56, parkingSpace57, (int) (byte) 1, (int) (short) 0, paymentOption63, "");
        observer.ParkingLot parkingLot69 = new observer.ParkingLot(0, false, "");
        parkingSpace57.setParkingLot(parkingLot69);
        parkingLot69.setDisabled(false);
        parkingSpace40.setParkingLot(parkingLot69);
        factory.PaymentOption paymentOption76 = null;
        observer.Booking booking78 = new observer.Booking(52, user1, parkingLot21, parkingSpace40, (int) (short) 1, (-629847809), paymentOption76, "");
        observer.ParkingSpace[] parkingSpaceArray79 = parkingLot21.getSpaces();
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray79);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray79, new observer.ParkingSpace[] {});
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        observer.ParkingLot parkingLot4 = null;
        parkingSpace0.setParkingLot(parkingLot4);
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        java.lang.String str10 = parkingLot9.getLocation();
        parkingSpace0.setParkingLot(parkingLot9);
        parkingLot9.setLocation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        observer.ParkingLot parkingLot11 = new observer.ParkingLot(0, false, "");
        java.lang.String str12 = parkingLot11.getLocation();
        parkingLot11.setId((int) ' ');
        parkingSpace0.setParkingLot(parkingLot11);
        int int16 = parkingLot11.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(310, true, "hi!");
        parkingLot3.setLocation("");
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
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
        booking10.setParkingLot(parkingLot21);
        observer.ParkingSpace[] parkingSpaceArray37 = parkingLot21.getSpaces();
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace();
        parkingSpace38.setId((int) (short) -1);
        factory.PaymentOption paymentOption43 = null;
        observer.Booking booking45 = new observer.Booking(140866, user1, parkingLot21, parkingSpace38, (int) (byte) 10, 90, paymentOption43, "");
        parkingSpace38.setLocation("hi!");
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray32, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNotNull(parkingSpaceArray37);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray37, new observer.ParkingSpace[] {});
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
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
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray27 = parkingLot26.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray27);
        int int29 = parkingLot5.getId();
        observer.ParkingLot parkingLot37 = new observer.ParkingLot((int) '#', false, "");
        observer.ParkingSpace parkingSpace38 = new observer.ParkingSpace((int) (short) 0, "hi!", true, false, parkingLot37);
        observer.ParkingSpace[] parkingSpaceArray39 = parkingLot37.getSpaces();
        parkingLot5.setSpaces(parkingSpaceArray39);
        int int41 = parkingLot5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        template.User user1 = null;
        template.User user3 = null;
        template.User user5 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace();
        parkingSpace10.setDisabled(true);
        boolean boolean13 = parkingSpace10.isTaken();
        factory.PaymentOption paymentOption16 = null;
        observer.Booking booking18 = new observer.Booking(100, user5, parkingLot9, parkingSpace10, (int) (byte) 1, (int) (short) 0, paymentOption16, "");
        observer.ParkingSpace[] parkingSpaceArray19 = parkingLot9.getSpaces();
        parkingLot9.setId(97);
        template.User user23 = null;
        observer.ParkingLot parkingLot27 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace();
        parkingSpace28.setDisabled(true);
        boolean boolean31 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption34 = null;
        observer.Booking booking36 = new observer.Booking(100, user23, parkingLot27, parkingSpace28, (int) (byte) 1, (int) (short) 0, paymentOption34, "");
        observer.ParkingLot parkingLot40 = new observer.ParkingLot(0, false, "");
        parkingSpace28.setParkingLot(parkingLot40);
        boolean boolean42 = parkingSpace28.isTaken();
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking((int) (byte) 1, user3, parkingLot9, parkingSpace28, (int) (byte) 100, 22, paymentOption45, "");
        parkingLot9.setDisabled(false);
        template.User user51 = null;
        observer.ParkingLot parkingLot52 = null;
        observer.ParkingSpace parkingSpace53 = null;
        factory.PaymentOption paymentOption56 = null;
        observer.Booking booking58 = new observer.Booking(1, user51, parkingLot52, parkingSpace53, (int) 'a', (int) 'a', paymentOption56, "");
        observer.ParkingSpace parkingSpace59 = new observer.ParkingSpace();
        parkingSpace59.setDisabled(true);
        observer.ParkingLot parkingLot62 = parkingSpace59.getParkingLot();
        booking58.setParkingSpace(parkingSpace59);
        booking58.setEndTime(0);
        factory.PaymentOption paymentOption66 = null;
        booking58.setPaymentOption(paymentOption66);
        observer.ParkingSpace parkingSpace68 = booking58.getParkingSpace();
        parkingSpace68.setLocation("");
        java.lang.String str71 = parkingSpace68.getLocation();
        factory.PaymentOption paymentOption74 = null;
        observer.Booking booking76 = new observer.Booking((int) (short) 1, user1, parkingLot9, parkingSpace68, 772200, 35, paymentOption74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(parkingLot62);
        org.junit.Assert.assertNotNull(parkingSpace68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
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
        observer.ParkingLot parkingLot45 = parkingSpace44.getParkingLot();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertNotNull(parkingLot45);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
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
        int int19 = booking8.getStartTime();
        factory.PaymentOption paymentOption20 = booking8.getPaymentOption();
        template.User user21 = booking8.getUser();
        int int25 = booking8.getTotalCost((-327523820), 16068, (-93322944));
        java.lang.String str26 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(paymentOption20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-732701696) + "'", int25 == (-732701696));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        boolean boolean4 = parkingSpace0.isDisabled();
        boolean boolean5 = parkingSpace0.isTaken();
        parkingSpace0.setId((int) (byte) 1);
        parkingSpace0.setId(870);
        parkingSpace0.setLocation("hi!");
        observer.ParkingLot parkingLot12 = null;
        parkingSpace0.setParkingLot(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
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
        template.User user27 = null;
        observer.ParkingLot parkingLot28 = null;
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        parkingSpace29.setDisabled(true);
        java.lang.String str32 = parkingSpace29.getLocation();
        observer.ParkingLot parkingLot33 = null;
        parkingSpace29.setParkingLot(parkingLot33);
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking((int) (short) 0, user27, parkingLot28, parkingSpace29, 5148, (int) (short) 100, paymentOption37, "");
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(563000, user1, parkingLot20, parkingSpace29, (int) '4', 563000, paymentOption42, "hi!");
        booking44.setEndTime(10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray22);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
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
        booking8.setEndTime((-327523820));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
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
        int int22 = booking8.getTotalCost((int) (short) 0, 140866, 16068);
        observer.ParkingLot parkingLot27 = null;
        observer.ParkingSpace parkingSpace28 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot27);
        booking8.setParkingSpace(parkingSpace28);
        int int30 = booking8.getId();
        template.User user32 = null;
        observer.ParkingLot parkingLot33 = null;
        observer.ParkingSpace parkingSpace34 = null;
        factory.PaymentOption paymentOption37 = null;
        observer.Booking booking39 = new observer.Booking(1, user32, parkingLot33, parkingSpace34, (int) 'a', (int) 'a', paymentOption37, "");
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace();
        parkingSpace40.setDisabled(true);
        observer.ParkingLot parkingLot43 = parkingSpace40.getParkingLot();
        booking39.setParkingSpace(parkingSpace40);
        booking39.setEndTime(0);
        factory.PaymentOption paymentOption47 = null;
        booking39.setPaymentOption(paymentOption47);
        observer.ParkingSpace parkingSpace49 = booking39.getParkingSpace();
        int int50 = parkingSpace49.getId();
        boolean boolean51 = parkingSpace49.isDisabled();
        int int52 = parkingSpace49.getId();
        java.lang.String str53 = parkingSpace49.getLocation();
        boolean boolean54 = parkingSpace49.isTaken();
        booking8.setParkingSpace(parkingSpace49);
        parkingSpace49.setId((-93322944));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2031532408) + "'", int22 == (-2031532408));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(parkingLot43);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
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
        observer.ParkingSpace parkingSpace30 = booking8.getParkingSpace();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 870 + "'", int22 == 870);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-9) + "'", int26 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(parkingSpace30);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
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
        int int16 = booking13.getStartTime();
        int int20 = booking13.getTotalCost((int) '#', 5148, 629847800);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5148 + "'", int16 == 5148);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-813670600) + "'", int20 == (-813670600));
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        boolean boolean9 = parkingSpace6.isTaken();
        factory.PaymentOption paymentOption12 = null;
        observer.Booking booking14 = new observer.Booking(100, user1, parkingLot5, parkingSpace6, (int) (byte) 1, (int) (short) 0, paymentOption12, "");
        observer.ParkingSpace[] parkingSpaceArray15 = parkingLot5.getSpaces();
        int int16 = parkingLot5.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setId((int) (short) -1);
        parkingSpace0.setLocation("hi!");
        parkingSpace0.setId(1068392648);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
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
        booking8.setEndTime((int) (short) 100);
        booking8.setEndTime((-1245193404));
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
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
        template.User user63 = null;
        booking8.setUser(user63);
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
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
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
        observer.ParkingSpace[] parkingSpaceArray29 = parkingLot5.getSpaces();
        observer.ParkingLot parkingLot37 = new observer.ParkingLot((int) '#', false, "");
        java.lang.String str38 = parkingLot37.getLocation();
        int int39 = parkingLot37.getId();
        observer.ParkingSpace parkingSpace40 = new observer.ParkingSpace((int) (short) 1, "", true, true, parkingLot37);
        parkingSpace40.setDisabled(false);
        factory.PaymentOption paymentOption45 = null;
        observer.Booking booking47 = new observer.Booking(0, user1, parkingLot5, parkingSpace40, (-36470), 629847800, paymentOption45, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
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
        java.lang.String str58 = parkingSpace33.getLocation();
        parkingSpace33.setLocation("hi!");
        template.User user62 = null;
        observer.ParkingLot parkingLot66 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingLot parkingLot71 = null;
        observer.ParkingSpace parkingSpace72 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot71);
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking(0, user62, parkingLot66, parkingSpace72, (int) (short) -1, (int) (byte) 0, paymentOption75, "hi!");
        int int78 = parkingLot66.getId();
        parkingSpace33.setParkingLot(parkingLot66);
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
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot4);
        java.lang.String str6 = parkingSpace5.getLocation();
        parkingSpace5.setId(16697600);
        boolean boolean9 = parkingSpace5.isTaken();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
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
        template.User user23 = booking8.getUser();
        int int24 = booking8.getStartTime();
        template.User user25 = booking8.getUser();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNull(user25);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
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
        int int44 = booking8.getTotalCost((-186496), (int) ' ', 629850000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(paymentOption15);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 125385216 + "'", int44 == 125385216);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
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
        template.User user23 = null;
        booking8.setUser(user23);
        java.lang.String str25 = booking8.getLicense();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
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
        int int56 = booking55.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray18);
        org.junit.Assert.assertArrayEquals(parkingSpaceArray18, new observer.ParkingSpace[] {});
        org.junit.Assert.assertNull(parkingLot36);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-70) + "'", int56 == (-70));
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(22, true, "hi!");
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
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
        factory.PaymentOption paymentOption24 = booking8.getPaymentOption();
        template.User user25 = null;
        booking8.setUser(user25);
        factory.PaymentOption paymentOption27 = booking8.getPaymentOption();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(paymentOption24);
        org.junit.Assert.assertNull(paymentOption27);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        booking8.setStartTime(10);
        booking8.setEndTime((int) 'a');
        booking8.setEndTime((-100));
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
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
        int int47 = parkingSpace46.getId();
        parkingSpace46.setDisabled(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        observer.ParkingSpace parkingSpace4 = new observer.ParkingSpace();
        parkingSpace4.setDisabled(true);
        java.lang.String str7 = parkingSpace4.getLocation();
        observer.ParkingLot parkingLot8 = null;
        parkingSpace4.setParkingLot(parkingLot8);
        parkingSpace4.setTaken(true);
        template.User user13 = null;
        observer.ParkingLot parkingLot17 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        parkingSpace18.setDisabled(true);
        boolean boolean21 = parkingSpace18.isTaken();
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking(100, user13, parkingLot17, parkingSpace18, (int) (byte) 1, (int) (short) 0, paymentOption24, "");
        boolean boolean27 = parkingLot17.isDisabled();
        parkingSpace4.setParkingLot(parkingLot17);
        parkingLot17.setLocation("hi!");
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace((-732701696), "hi!", true, false, parkingLot17);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
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
        factory.PaymentOption paymentOption24 = booking8.getPaymentOption();
        booking8.setLicense("hi!");
        observer.ParkingLot parkingLot31 = null;
        observer.ParkingSpace parkingSpace32 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot31);
        boolean boolean33 = parkingSpace32.isDisabled();
        boolean boolean34 = parkingSpace32.isTaken();
        parkingSpace32.setId(32);
        int int37 = parkingSpace32.getId();
        booking8.setParkingSpace(parkingSpace32);
        java.lang.String str39 = booking8.getLicense();
        factory.PaymentOption paymentOption40 = booking8.getPaymentOption();
        booking8.setLicense("hi!");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertNull(paymentOption24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(paymentOption40);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        observer.ParkingSpace parkingSpace9 = new observer.ParkingSpace();
        parkingSpace9.setDisabled(true);
        java.lang.String str12 = parkingSpace9.getLocation();
        parkingSpace9.setDisabled(false);
        int int15 = parkingSpace9.getId();
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
        parkingSpace35.setTaken(false);
        template.User user40 = null;
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace45 = new observer.ParkingSpace();
        parkingSpace45.setDisabled(true);
        boolean boolean48 = parkingSpace45.isTaken();
        factory.PaymentOption paymentOption51 = null;
        observer.Booking booking53 = new observer.Booking(100, user40, parkingLot44, parkingSpace45, (int) (byte) 1, (int) (short) 0, paymentOption51, "");
        boolean boolean54 = parkingLot44.isDisabled();
        parkingLot44.setLocation("");
        parkingLot44.setLocation("hi!");
        parkingSpace35.setParkingLot(parkingLot44);
        parkingSpace35.setTaken(false);
        boolean boolean62 = parkingSpace35.isDisabled();
        template.User user64 = null;
        observer.ParkingLot parkingLot68 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace69 = new observer.ParkingSpace();
        parkingSpace69.setDisabled(true);
        boolean boolean72 = parkingSpace69.isTaken();
        factory.PaymentOption paymentOption75 = null;
        observer.Booking booking77 = new observer.Booking(100, user64, parkingLot68, parkingSpace69, (int) (byte) 1, (int) (short) 0, paymentOption75, "");
        observer.ParkingSpace[] parkingSpaceArray78 = parkingLot68.getSpaces();
        parkingLot68.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray81 = parkingLot68.getSpaces();
        int int82 = parkingLot68.getId();
        parkingSpace35.setParkingLot(parkingLot68);
        parkingSpace9.setParkingLot(parkingLot68);
        booking8.setParkingSpace(parkingSpace9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray78);
        org.junit.Assert.assertNotNull(parkingSpaceArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5148 + "'", int82 == 5148);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        template.User user1 = null;
        observer.ParkingLot parkingLot9 = new observer.ParkingLot((int) (byte) 100, false, "");
        observer.ParkingSpace parkingSpace10 = new observer.ParkingSpace((int) 'a', "hi!", false, false, parkingLot9);
        parkingSpace10.setId(0);
        observer.ParkingLot parkingLot13 = parkingSpace10.getParkingLot();
        template.User user19 = null;
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        java.lang.String str24 = parkingLot23.getLocation();
        int int25 = parkingLot23.getId();
        observer.ParkingLot parkingLot30 = null;
        observer.ParkingSpace parkingSpace31 = new observer.ParkingSpace((int) (byte) 0, "hi!", true, false, parkingLot30);
        parkingSpace31.setDisabled(true);
        parkingSpace31.setLocation("hi!");
        factory.PaymentOption paymentOption38 = null;
        observer.Booking booking40 = new observer.Booking((-100), user19, parkingLot23, parkingSpace31, (int) (byte) -1, (int) (short) 10, paymentOption38, "");
        observer.ParkingLot parkingLot44 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace[] parkingSpaceArray45 = parkingLot44.getSpaces();
        parkingLot23.setSpaces(parkingSpaceArray45);
        observer.ParkingSpace parkingSpace47 = new observer.ParkingSpace((int) (byte) 10, "", true, true, parkingLot23);
        factory.PaymentOption paymentOption50 = null;
        observer.Booking booking52 = new observer.Booking(870, user1, parkingLot13, parkingSpace47, 90, 10, paymentOption50, "hi!");
        int int53 = booking52.getEndTime();
        org.junit.Assert.assertNotNull(parkingLot13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
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
        booking8.setEndTime((-93322944));
        int int27 = booking8.getStartTime();
        template.User user28 = null;
        booking8.setUser(user28);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
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
        parkingLot28.setDisabled(true);
        int int46 = parkingLot28.getId();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
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
        booking8.setStartTime(1100);
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(32, false, "");
        booking8.setParkingLot(parkingLot34);
        template.User user36 = null;
        booking8.setUser(user36);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-629847809) + "'", int28 == (-629847809));
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
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
        factory.PaymentOption paymentOption42 = booking8.getPaymentOption();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray40);
        org.junit.Assert.assertNull(paymentOption42);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
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
        template.User user85 = booking84.getUser();
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
        org.junit.Assert.assertNull(user85);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
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
        observer.ParkingLot parkingLot16 = booking8.getParkingLot();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertNull(paymentOption13);
        org.junit.Assert.assertNull(parkingLot16);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(0, false, "");
        java.lang.String str4 = parkingLot3.getLocation();
        template.User user6 = null;
        observer.ParkingLot parkingLot10 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace11 = new observer.ParkingSpace();
        parkingSpace11.setDisabled(true);
        boolean boolean14 = parkingSpace11.isTaken();
        factory.PaymentOption paymentOption17 = null;
        observer.Booking booking19 = new observer.Booking(100, user6, parkingLot10, parkingSpace11, (int) (byte) 1, (int) (short) 0, paymentOption17, "");
        observer.ParkingSpace[] parkingSpaceArray20 = parkingLot10.getSpaces();
        parkingLot10.setId(97);
        observer.ParkingSpace[] parkingSpaceArray23 = parkingLot10.getSpaces();
        parkingLot3.setSpaces(parkingSpaceArray23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray20);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
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
        booking39.setStartTime((int) '#');
        int int45 = booking39.getTotalCost((int) (byte) 100, (int) (short) 10, (int) (short) -1);
        template.User user47 = null;
        template.User user49 = null;
        observer.ParkingLot parkingLot53 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace54 = new observer.ParkingSpace();
        parkingSpace54.setDisabled(true);
        boolean boolean57 = parkingSpace54.isTaken();
        factory.PaymentOption paymentOption60 = null;
        observer.Booking booking62 = new observer.Booking(100, user49, parkingLot53, parkingSpace54, (int) (byte) 1, (int) (short) 0, paymentOption60, "");
        observer.ParkingSpace[] parkingSpaceArray63 = parkingLot53.getSpaces();
        parkingLot53.setId(97);
        template.User user67 = null;
        observer.ParkingLot parkingLot71 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace72 = new observer.ParkingSpace();
        parkingSpace72.setDisabled(true);
        boolean boolean75 = parkingSpace72.isTaken();
        factory.PaymentOption paymentOption78 = null;
        observer.Booking booking80 = new observer.Booking(100, user67, parkingLot71, parkingSpace72, (int) (byte) 1, (int) (short) 0, paymentOption78, "");
        observer.ParkingLot parkingLot84 = new observer.ParkingLot(0, false, "");
        parkingSpace72.setParkingLot(parkingLot84);
        boolean boolean86 = parkingSpace72.isTaken();
        factory.PaymentOption paymentOption89 = null;
        observer.Booking booking91 = new observer.Booking((int) (byte) 1, user47, parkingLot53, parkingSpace72, (int) (byte) 100, 22, paymentOption89, "");
        parkingLot53.setDisabled(false);
        parkingLot53.setDisabled(false);
        booking39.setParkingLot(parkingLot53);
        parkingLot53.setDisabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 90 + "'", int45 == 90);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray63);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        template.User user1 = null;
        observer.ParkingLot parkingLot5 = new observer.ParkingLot(10, true, "");
        observer.ParkingSpace parkingSpace6 = new observer.ParkingSpace();
        parkingSpace6.setDisabled(true);
        java.lang.String str9 = parkingSpace6.getLocation();
        parkingSpace6.setDisabled(false);
        int int12 = parkingSpace6.getId();
        template.User user14 = null;
        observer.ParkingLot parkingLot15 = null;
        observer.ParkingSpace parkingSpace16 = null;
        factory.PaymentOption paymentOption19 = null;
        observer.Booking booking21 = new observer.Booking(1, user14, parkingLot15, parkingSpace16, (int) 'a', (int) 'a', paymentOption19, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        observer.ParkingLot parkingLot25 = parkingSpace22.getParkingLot();
        booking21.setParkingSpace(parkingSpace22);
        booking21.setEndTime((int) (byte) 1);
        observer.ParkingSpace parkingSpace29 = new observer.ParkingSpace();
        booking21.setParkingSpace(parkingSpace29);
        java.lang.String str31 = booking21.getLicense();
        observer.ParkingSpace parkingSpace32 = booking21.getParkingSpace();
        boolean boolean33 = parkingSpace32.isDisabled();
        parkingSpace32.setTaken(false);
        template.User user37 = null;
        observer.ParkingLot parkingLot41 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace42 = new observer.ParkingSpace();
        parkingSpace42.setDisabled(true);
        boolean boolean45 = parkingSpace42.isTaken();
        factory.PaymentOption paymentOption48 = null;
        observer.Booking booking50 = new observer.Booking(100, user37, parkingLot41, parkingSpace42, (int) (byte) 1, (int) (short) 0, paymentOption48, "");
        boolean boolean51 = parkingLot41.isDisabled();
        parkingLot41.setLocation("");
        parkingLot41.setLocation("hi!");
        parkingSpace32.setParkingLot(parkingLot41);
        parkingSpace32.setTaken(false);
        boolean boolean59 = parkingSpace32.isDisabled();
        template.User user61 = null;
        observer.ParkingLot parkingLot65 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace();
        parkingSpace66.setDisabled(true);
        boolean boolean69 = parkingSpace66.isTaken();
        factory.PaymentOption paymentOption72 = null;
        observer.Booking booking74 = new observer.Booking(100, user61, parkingLot65, parkingSpace66, (int) (byte) 1, (int) (short) 0, paymentOption72, "");
        observer.ParkingSpace[] parkingSpaceArray75 = parkingLot65.getSpaces();
        parkingLot65.setId(5148);
        observer.ParkingSpace[] parkingSpaceArray78 = parkingLot65.getSpaces();
        int int79 = parkingLot65.getId();
        parkingSpace32.setParkingLot(parkingLot65);
        parkingSpace6.setParkingLot(parkingLot65);
        factory.PaymentOption paymentOption84 = null;
        observer.Booking booking86 = new observer.Booking(971751252, user1, parkingLot5, parkingSpace6, (-990), (-732701696), paymentOption84, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(parkingLot25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray75);
        org.junit.Assert.assertNotNull(parkingSpaceArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5148 + "'", int79 == 5148);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
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
        boolean boolean23 = parkingSpace19.isDisabled();
        boolean boolean24 = parkingSpace19.isDisabled();
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
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
        template.User user47 = booking45.getUser();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingLot46);
        org.junit.Assert.assertNull(user47);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setEndTime((int) (byte) -1);
        int int13 = booking8.getEndTime();
        booking8.setEndTime(2146977336);
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        int int31 = parkingSpace22.getId();
        parkingSpace22.setTaken(false);
        booking8.setParkingSpace(parkingSpace22);
        parkingSpace22.setId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
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
        template.User user17 = null;
        observer.ParkingLot parkingLot21 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace22 = new observer.ParkingSpace();
        parkingSpace22.setDisabled(true);
        boolean boolean25 = parkingSpace22.isTaken();
        factory.PaymentOption paymentOption28 = null;
        observer.Booking booking30 = new observer.Booking(100, user17, parkingLot21, parkingSpace22, (int) (byte) 1, (int) (short) 0, paymentOption28, "");
        observer.ParkingLot parkingLot34 = new observer.ParkingLot(0, false, "");
        parkingSpace22.setParkingLot(parkingLot34);
        parkingLot34.setDisabled(false);
        parkingSpace5.setParkingLot(parkingLot34);
        observer.ParkingSpace[] parkingSpaceArray39 = null;
        parkingLot34.setSpaces(parkingSpaceArray39);
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        java.lang.String str49 = parkingLot48.getLocation();
        observer.ParkingSpace parkingSpace50 = new observer.ParkingSpace(1, "hi!", true, true, parkingLot48);
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking(310, user1, parkingLot34, parkingSpace50, (-93322944), 4838, paymentOption53, "hi!");
        observer.ParkingLot parkingLot56 = booking55.getParkingLot();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(parkingLot56);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
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
        booking8.setId(16068);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(parkingLot32);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        template.User user9 = null;
        template.User user11 = null;
        template.User user13 = null;
        observer.ParkingLot parkingLot17 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace18 = new observer.ParkingSpace();
        parkingSpace18.setDisabled(true);
        boolean boolean21 = parkingSpace18.isTaken();
        factory.PaymentOption paymentOption24 = null;
        observer.Booking booking26 = new observer.Booking(100, user13, parkingLot17, parkingSpace18, (int) (byte) 1, (int) (short) 0, paymentOption24, "");
        observer.ParkingSpace[] parkingSpaceArray27 = parkingLot17.getSpaces();
        parkingLot17.setId(97);
        template.User user31 = null;
        observer.ParkingLot parkingLot35 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace36 = new observer.ParkingSpace();
        parkingSpace36.setDisabled(true);
        boolean boolean39 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption42 = null;
        observer.Booking booking44 = new observer.Booking(100, user31, parkingLot35, parkingSpace36, (int) (byte) 1, (int) (short) 0, paymentOption42, "");
        observer.ParkingLot parkingLot48 = new observer.ParkingLot(0, false, "");
        parkingSpace36.setParkingLot(parkingLot48);
        boolean boolean50 = parkingSpace36.isTaken();
        factory.PaymentOption paymentOption53 = null;
        observer.Booking booking55 = new observer.Booking((int) (byte) 1, user11, parkingLot17, parkingSpace36, (int) (byte) 100, 22, paymentOption53, "");
        observer.ParkingLot parkingLot63 = new observer.ParkingLot(5148, true, "");
        parkingLot63.setDisabled(true);
        observer.ParkingSpace parkingSpace66 = new observer.ParkingSpace(0, "", false, true, parkingLot63);
        factory.PaymentOption paymentOption69 = null;
        observer.Booking booking71 = new observer.Booking(1, user9, parkingLot17, parkingSpace66, (-9), (int) (short) 1, paymentOption69, "hi!");
        observer.ParkingSpace parkingSpace72 = new observer.ParkingSpace(90, "hi!", true, false, parkingLot17);
        int int73 = parkingLot17.getId();
        observer.ParkingSpace[] parkingSpaceArray74 = parkingLot17.getSpaces();
        observer.ParkingSpace parkingSpace75 = new observer.ParkingSpace((-970), "hi!", true, false, parkingLot17);
        parkingSpace75.setId((-274528512));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(parkingSpaceArray74);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
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
        boolean boolean44 = parkingSpace33.isTaken();
        boolean boolean45 = parkingSpace33.isTaken();
        boolean boolean46 = parkingSpace33.isDisabled();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = parkingSpace33.getLotID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.ParkingLot.getId()\" because \"this.parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5148 + "'", int32 == 5148);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
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
        parkingSpace33.setId(9900);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray31);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        booking8.setId(1100);
        observer.ParkingLot parkingLot15 = booking8.getParkingLot();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertNull(parkingLot15);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
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
        boolean boolean58 = parkingLot32.isDisabled();
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test968");
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
        parkingLot15.setLocation("hi!");
        int int47 = parkingLot15.getId();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test969");
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
        template.User user30 = null;
        booking8.setUser(user30);
        booking8.setId(563000);
        booking8.setLicense("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test970");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, true, "hi!");
        parkingLot3.setDisabled(false);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test971");
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
        booking8.setId(0);
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test972");
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
        boolean boolean55 = parkingSpace3.isTaken();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test973");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        booking8.setId((int) ' ');
        booking8.setStartTime((int) (short) 1);
        observer.ParkingSpace parkingSpace13 = new observer.ParkingSpace();
        parkingSpace13.setDisabled(true);
        java.lang.String str16 = parkingSpace13.getLocation();
        observer.ParkingLot parkingLot17 = null;
        parkingSpace13.setParkingLot(parkingLot17);
        parkingSpace13.setTaken(true);
        template.User user22 = null;
        observer.ParkingLot parkingLot26 = new observer.ParkingLot(0, false, "");
        observer.ParkingSpace parkingSpace27 = new observer.ParkingSpace();
        parkingSpace27.setDisabled(true);
        boolean boolean30 = parkingSpace27.isTaken();
        factory.PaymentOption paymentOption33 = null;
        observer.Booking booking35 = new observer.Booking(100, user22, parkingLot26, parkingSpace27, (int) (byte) 1, (int) (short) 0, paymentOption33, "");
        boolean boolean36 = parkingLot26.isDisabled();
        parkingSpace13.setParkingLot(parkingLot26);
        boolean boolean38 = parkingLot26.isDisabled();
        parkingLot26.setId((int) 'a');
        booking8.setParkingLot(parkingLot26);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test974");
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
        template.User user22 = null;
        booking8.setUser(user22);
        int int27 = booking8.getTotalCost(4838, (-990), (int) ' ');
        factory.PaymentOption paymentOption28 = null;
        booking8.setPaymentOption(paymentOption28);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(paymentOption12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6298500) + "'", int20 == (-6298500));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-186496) + "'", int27 == (-186496));
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test975");
        observer.ParkingLot parkingLot4 = null;
        observer.ParkingSpace parkingSpace5 = new observer.ParkingSpace((int) '4', "hi!", false, true, parkingLot4);
        observer.ParkingLot parkingLot6 = parkingSpace5.getParkingLot();
        parkingSpace5.setLocation("hi!");
        observer.ParkingLot parkingLot9 = parkingSpace5.getParkingLot();
        parkingSpace5.setTaken(false);
        parkingSpace5.setDisabled(false);
        observer.ParkingSpace parkingSpace14 = new observer.ParkingSpace();
        parkingSpace14.setDisabled(true);
        java.lang.String str17 = parkingSpace14.getLocation();
        observer.ParkingLot parkingLot18 = null;
        parkingSpace14.setParkingLot(parkingLot18);
        observer.ParkingLot parkingLot23 = new observer.ParkingLot(0, false, "");
        java.lang.String str24 = parkingLot23.getLocation();
        parkingSpace14.setParkingLot(parkingLot23);
        parkingLot23.setId(0);
        parkingLot23.setLocation("");
        int int30 = parkingLot23.getId();
        parkingSpace5.setParkingLot(parkingLot23);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test976");
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
        parkingSpace25.setLocation("");
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentOption22);
        org.junit.Assert.assertNotNull(parkingSpace25);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test977");
        observer.ParkingLot parkingLot3 = new observer.ParkingLot(10, false, "hi!");
        int int4 = parkingLot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test978");
        template.User user1 = null;
        observer.ParkingLot parkingLot2 = null;
        observer.ParkingSpace parkingSpace3 = null;
        factory.PaymentOption paymentOption6 = null;
        observer.Booking booking8 = new observer.Booking(1, user1, parkingLot2, parkingSpace3, (int) 'a', (int) 'a', paymentOption6, "");
        int int12 = booking8.getTotalCost((int) (byte) 1, (int) (byte) 100, (int) '4');
        int int13 = booking8.getEndTime();
        factory.PaymentOption paymentOption14 = null;
        booking8.setPaymentOption(paymentOption14);
        int int16 = booking8.getId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5148 + "'", int12 == 5148);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }
}

