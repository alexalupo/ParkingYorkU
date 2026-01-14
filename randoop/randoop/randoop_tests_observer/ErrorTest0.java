package randoop.randoop_tests_observer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        int int1 = parkingSpace0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = parkingSpace0.getLotID();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-100));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = parkingSpace0.getLotID();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setLocation("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = parkingSpace0.getLotID();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId(10);
        parkingSpace0.setId(0);
        java.lang.String str8 = parkingSpace0.getLocation();
        parkingSpace0.setLocation("");
        observer.ParkingLot parkingLot11 = parkingSpace0.getParkingLot();
        observer.ParkingLot parkingLot12 = parkingSpace0.getParkingLot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = parkingSpace0.getLotID();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        parkingSpace0.setId((-100));
        observer.ParkingLot parkingLot5 = parkingSpace0.getParkingLot();
        parkingSpace0.setTaken(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = parkingSpace0.getLotID();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        int int1 = parkingSpace0.getId();
        observer.ParkingLot parkingLot2 = parkingSpace0.getParkingLot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = parkingSpace0.getLotID();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        boolean boolean1 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        boolean boolean4 = parkingSpace0.isDisabled();
        parkingSpace0.setDisabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = parkingSpace0.getLotID();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        parkingSpace0.setDisabled(false);
        observer.ParkingLot parkingLot6 = parkingSpace0.getParkingLot();
        parkingSpace0.setId((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = parkingSpace0.getLotID();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        observer.ParkingLot parkingLot3 = parkingSpace0.getParkingLot();
        int int4 = parkingSpace0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = parkingSpace0.getLotID();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        observer.ParkingSpace parkingSpace0 = new observer.ParkingSpace();
        parkingSpace0.setDisabled(true);
        java.lang.String str3 = parkingSpace0.getLocation();
        boolean boolean4 = parkingSpace0.isTaken();
        parkingSpace0.setTaken(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = parkingSpace0.getLotID();
    }
}

