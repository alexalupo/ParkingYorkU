package randoop.randoop_tests_singleton;
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
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test1501(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "1) test1501(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "1) test1501(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "2) test1502(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        int int6 = superManager0.getId();
        superManager0.setValidated(true);
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "3) test1503(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        superManager0.setEmail("hi!");
        superManager0.setId((int) (short) -1);
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setId(0);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        java.lang.String str14 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getUserType();
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        superManager0.setId((int) (byte) 10);
        boolean boolean13 = superManager0.isValidated();
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "4) test1512(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "2) test1512(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId(35);
        int int7 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str14 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getEmail();
        boolean boolean13 = superManager0.isValidated();
        int int14 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        boolean boolean11 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "5) test1524(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky "3) test1524(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "6) test1525(RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "4) test1525(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getUserType();
        int int14 = superManager0.getPayRate();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "7) test1526(RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("supermanager");
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "8) test1527(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setId((int) ' ');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setPassword("");
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 10);
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getName();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setValidated(false);
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setId(100);
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getUserType();
        java.lang.String str14 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("supermanager");
        superManager0.setPassword("hi!");
        superManager0.setName("hi!");
        java.lang.String str15 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getName();
        superManager0.setValidated(true);
        superManager0.setName("");
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setId(52);
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) 10);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 10);
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        int int13 = superManager0.getPayRate();
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        int int14 = superManager0.getPayRate();
        int int15 = superManager0.getPayRate();
        java.lang.String str16 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        superManager0.setValidated(true);
        int int14 = superManager0.getId();
        boolean boolean15 = superManager0.isValidated();
        int int16 = superManager0.getPayRate();
        boolean boolean17 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setValidated(true);
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        superManager0.setId(100);
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "9) test1560(RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "5) test1560(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "2) test1560(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "1) test1560(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "10) test1561(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) -1);
        boolean boolean10 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setEmail("hi!");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        superManager0.setEmail("");
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int14 = superManager0.getPayRate();
        superManager0.setValidated(true);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getPayRate();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setId((int) '4');
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "11) test1569(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "6) test1569(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "12) test1570(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "7) test1570(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getName();
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "13) test1571(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setEmail("");
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId(100);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "14) test1576(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setId(97);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getName();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getPayRate();
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) 0);
        int int6 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId((int) (short) -1);
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        int int13 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getName();
        java.lang.String str18 = superManager0.getEmail();
        int int19 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        superManager0.setValidated(false);
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setId(10);
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setPassword("supermanager");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "15) test1591(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setId(100);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "16) test1593(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "8) test1593(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str11 = superManager0.getUserType();
        int int12 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setId((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "17) test1594(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "9) test1594(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        superManager0.setName("supermanager");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setName("");
        superManager0.setName("");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "18) test1597(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str13 = superManager0.getPassword();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "19) test1598(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str8 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "20) test1601(RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "21) test1602(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getUserType();
        boolean boolean14 = superManager0.isValidated();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getName();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) 10);
        int int10 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "22) test1611(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "23) test1612(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getName();
        superManager0.setPassword("");
        superManager0.setValidated(false);
        java.lang.String str14 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setEmail("hi!");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getName();
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "24) test1617(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        superManager0.setId((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "25) test1621(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getPassword();
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        boolean boolean8 = superManager0.isValidated();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        superManager0.setPassword("");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setValidated(false);
        int int12 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        superManager0.setId((int) (short) 100);
        java.lang.String str20 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        superManager0.setName("");
        int int12 = superManager0.getId();
        java.lang.String str13 = superManager0.getPassword();
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getEmail();
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        java.lang.String str16 = superManager0.getUserType();
        java.lang.String str17 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("supermanager");
        java.lang.String str12 = superManager0.getPassword();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getName();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("supermanager");
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        int int11 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getName();
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        int int6 = superManager0.getId();
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        int int11 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getName();
        superManager0.setId((int) 'a');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setId((int) (byte) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) ' ');
        superManager0.setId(97);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setEmail("");
        superManager0.setId(1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setName("");
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getId();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("");
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setName("hi!");
        superManager0.setId((int) (byte) -1);
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str8 = superManager0.getName();
        superManager0.setEmail("");
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getName();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        superManager0.setId((int) (short) 1);
        java.lang.String str9 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        java.lang.String str13 = superManager0.getUserType();
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        superManager0.setId((int) (byte) 100);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setName("");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setPassword("");
        superManager0.setValidated(false);
        java.lang.String str15 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("supermanager");
        superManager0.setPassword("");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getName();
        boolean boolean14 = superManager0.isValidated();
        java.lang.String str15 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "26) test1674(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        int int11 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        java.lang.String str14 = superManager0.getName();
        java.lang.String str15 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "27) test1676(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setId(97);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getEmail();
        int int13 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        superManager0.setPassword("");
        boolean boolean13 = superManager0.isValidated();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 10);
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getUserType();
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        boolean boolean12 = superManager0.isValidated();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getPayRate();
        int int11 = superManager0.getPayRate();
        superManager0.setId((-1));
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getName();
        boolean boolean14 = superManager0.isValidated();
        boolean boolean15 = superManager0.isValidated();
        java.lang.String str16 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        int int13 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getName();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setValidated(false);
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setName("hi!");
        int int14 = superManager0.getId();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setEmail("");
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setId((int) '4');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getEmail();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 10);
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) '4');
        java.lang.String str12 = superManager0.getName();
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getName();
        superManager0.setId(10);
        boolean boolean11 = superManager0.isValidated();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setName("");
        superManager0.setName("");
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getUserType();
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getName();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("");
        superManager0.setValidated(true);
        int int14 = superManager0.getPayRate();
        java.lang.String str15 = superManager0.getPassword();
        java.lang.String str16 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 100);
        java.lang.String str12 = superManager0.getEmail();
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) ' ');
        superManager0.setId(97);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((int) (short) 0);
        boolean boolean8 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("supermanager");
        superManager0.setPassword("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(true);
        java.lang.String str17 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("supermanager");
        superManager0.setId((int) (byte) 100);
        boolean boolean14 = superManager0.isValidated();
        java.lang.String str15 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getName();
        boolean boolean7 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getEmail();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "28) test1740(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "10) test1740(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
// flaky "3) test1740(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "2) test1740(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getPassword();
        int int13 = superManager0.getPayRate();
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "29) test1741(RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        superManager0.setValidated(true);
        superManager0.setId((int) (short) 1);
        int int18 = superManager0.getId();
        java.lang.String str19 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "30) test1742(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "11) test1742(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "4) test1742(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "31) test1743(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setId(100);
        int int12 = superManager0.getId();
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setName("supermanager");
        int int10 = superManager0.getPayRate();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("");
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        superManager0.setName("");
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setName("");
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getId();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("supermanager");
        superManager0.setPassword("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(true);
        boolean boolean17 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        boolean boolean7 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        int int12 = superManager0.getPayRate();
        boolean boolean13 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setPassword("hi!");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setId(35);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        java.lang.String str6 = superManager0.getName();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        superManager0.setValidated(false);
        java.lang.String str16 = superManager0.getName();
        superManager0.setValidated(true);
        superManager0.setName("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getUserType();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setEmail("");
        java.lang.String str13 = superManager0.getPassword();
        int int14 = superManager0.getPayRate();
        boolean boolean15 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        java.lang.String str14 = superManager0.getName();
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getUserType();
        int int13 = superManager0.getId();
        int int14 = superManager0.getPayRate();
        superManager0.setId((-1));
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId(0);
        boolean boolean14 = superManager0.isValidated();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setName("");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        superManager0.setName("supermanager");
        superManager0.setName("");
        int int16 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setValidated(false);
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "32) test1780(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "12) test1780(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        superManager0.setName("supermanager");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "33) test1782(RegressionTest3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
// flaky "13) test1782(RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setId((int) 'a');
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setId(100);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setValidated(true);
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setValidated(true);
        int int13 = superManager0.getId();
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) '4');
        superManager0.setEmail("");
        int int14 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setId(100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(false);
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getPayRate();
        superManager0.setId(0);
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        int int11 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("");
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        superManager0.setId((int) (short) 10);
        java.lang.String str9 = superManager0.getName();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        boolean boolean6 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        superManager0.setEmail("");
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str13 = superManager0.getPassword();
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        int int6 = superManager0.getId();
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getName();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        superManager0.setName("hi!");
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        superManager0.setName("hi!");
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.String str3 = superManager0.getUserType();
        superManager0.setId((int) (short) 10);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean13 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getName();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("supermanager");
        superManager0.setPassword("");
        java.lang.String str17 = superManager0.getPassword();
        boolean boolean18 = superManager0.isValidated();
        superManager0.setName("supermanager");
        int int21 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        superManager0.setPassword("hi!");
        int int16 = superManager0.getId();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setId((int) (byte) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) 10);
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getName();
        java.lang.String str15 = superManager0.getEmail();
        int int16 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }
}
