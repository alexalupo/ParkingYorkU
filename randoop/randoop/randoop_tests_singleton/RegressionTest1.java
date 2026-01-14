package randoop.randoop_tests_singleton;
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
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "1) test0501(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "1) test0501(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "1) test0501(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "1) test0501(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "2) test0503(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "3) test0508(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "4) test0509(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "2) test0509(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setId((-1));
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "5) test0513(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "6) test0514(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "3) test0514(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "7) test0515(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "8) test0516(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "4) test0516(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "2) test0516(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        int int11 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setValidated(false);
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "9) test0518(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        superManager0.setId(97);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "10) test0520(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getName();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "11) test0523(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "12) test0524(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "5) test0524(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
// flaky "3) test0524(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "13) test0525(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        superManager0.setId((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "14) test0526(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setValidated(true);
        superManager0.setPassword("supermanager");
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        superManager0.setId((int) (byte) -1);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "15) test0529(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("supermanager");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setId(1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "16) test0534(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "6) test0534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "17) test0535(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "18) test0536(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "7) test0536(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "4) test0536(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        int int9 = superManager0.getPayRate();
        superManager0.setId((int) (short) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "19) test0537(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 1);
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        boolean boolean8 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setId((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setName("hi!");
        boolean boolean14 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "20) test0552(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        boolean boolean5 = superManager0.isValidated();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "21) test0553(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "8) test0553(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "5) test0553(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "22) test0554(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "23) test0555(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "24) test0558(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "25) test0560(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        java.lang.String str3 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
// flaky "26) test0561(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "27) test0562(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "28) test0563(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "9) test0563(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "6) test0563(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "29) test0565(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "30) test0566(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "31) test0568(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "10) test0568(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
// flaky "7) test0568(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "2) test0568(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        int int13 = superManager0.getId();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "32) test0569(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getName();
        boolean boolean14 = superManager0.isValidated();
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "33) test0570(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "11) test0570(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "8) test0570(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setName("hi!");
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "34) test0572(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setId((int) (byte) -1);
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "35) test0574(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "36) test0575(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        superManager0.setId((int) (byte) -1);
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "37) test0577(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) 'a');
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "38) test0578(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        int int8 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        superManager0.setValidated(false);
        superManager0.setName("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "39) test0582(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "12) test0582(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "40) test0585(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId(35);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setId((int) '4');
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setName("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "41) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "42) test0590(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getId();
        boolean boolean12 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "43) test0591(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "13) test0591(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
// flaky "9) test0591(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        int int11 = superManager0.getId();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setId((-1));
        superManager0.setId((int) ' ');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        superManager0.setValidated(false);
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "44) test0596(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "14) test0596(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId(0);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "45) test0598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        boolean boolean16 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        int int4 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "46) test0602(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
// flaky "15) test0602(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getName();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "47) test0604(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        boolean boolean10 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        java.lang.String str8 = superManager0.getName();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "48) test0610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "49) test0611(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("supermanager");
        superManager0.setId(52);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getName();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str16 = superManager0.getEmail();
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "50) test0616(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setPassword("hi!");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setId(35);
        superManager0.setPassword("hi!");
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "51) test0618(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "16) test0618(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "52) test0619(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        superManager0.setEmail("");
        boolean boolean13 = superManager0.isValidated();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "53) test0620(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "17) test0620(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "10) test0620(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setPassword("");
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "54) test0622(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "18) test0622(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "11) test0622(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
// flaky "3) test0622(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        int int5 = superManager0.getPayRate();
        superManager0.setEmail("");
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "55) test0624(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "19) test0624(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "12) test0624(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "4) test0624(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
// flaky "1) test0624(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "56) test0625(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "20) test0625(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "13) test0625(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        int int19 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "57) test0626(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "21) test0626(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.String str3 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        superManager0.setId((int) 'a');
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        boolean boolean10 = superManager0.isValidated();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "58) test0632(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "59) test0633(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(true);
        int int11 = superManager0.getId();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getPayRate();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((int) (short) 0);
        boolean boolean8 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "60) test0637(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "61) test0638(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "62) test0639(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "22) test0639(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getName();
        superManager0.setPassword("supermanager");
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "63) test0640(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "64) test0641(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "23) test0641(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.String str14 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "65) test0643(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "24) test0643(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
// flaky "14) test0643(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setId((int) (byte) -1);
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setId(1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "66) test0647(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        superManager0.setId((int) '#');
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setName("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        java.lang.String str16 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "67) test0650(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setName("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "68) test0651(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "69) test0652(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "70) test0653(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setId((int) (short) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        int int14 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "71) test0659(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "72) test0660(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("hi!");
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "73) test0661(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "25) test0661(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        boolean boolean14 = superManager0.isValidated();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "74) test0664(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "26) test0664(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setId(100);
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        java.lang.String str5 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getName();
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 10);
        superManager0.setId((int) (byte) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setValidated(false);
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getEmail();
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        boolean boolean11 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.isValidated();
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        int int6 = superManager0.getId();
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "75) test0679(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "76) test0680(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "27) test0680(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "77) test0682(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "28) test0682(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "78) test0686(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "79) test0687(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        java.lang.String str3 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "80) test0688(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "81) test0689(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setId((int) '#');
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getId();
        superManager0.setName("hi!");
        int int13 = superManager0.getPayRate();
        boolean boolean14 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("hi!");
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "82) test0693(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "83) test0694(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "84) test0695(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getId();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "85) test0696(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "29) test0696(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "86) test0697(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "30) test0697(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getPassword();
        superManager0.setId((int) 'a');
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "87) test0698(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) 10);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "88) test0699(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "31) test0699(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setId(0);
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setPassword("");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        superManager0.setId(97);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "89) test0705(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getId();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getPayRate();
        superManager0.setName("");
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setId(1);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "90) test0709(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getEmail();
        superManager0.setId((int) (byte) 1);
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "91) test0712(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "32) test0712(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        superManager0.setPassword("");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "92) test0717(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "33) test0717(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "93) test0718(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "34) test0718(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "15) test0718(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "5) test0718(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "94) test0719(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        boolean boolean17 = superManager0.isValidated();
        java.lang.String str18 = superManager0.getEmail();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "95) test0721(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "35) test0721(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        superManager0.setId(1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("hi!");
        int int8 = superManager0.getId();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setId((int) 'a');
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        superManager0.setEmail("");
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "96) test0728(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "97) test0729(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "98) test0731(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "99) test0734(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getPayRate();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "100) test0735(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "101) test0737(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "36) test0737(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "16) test0737(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "102) test0738(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "37) test0738(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "103) test0739(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 10);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "104) test0741(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        java.lang.String str5 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setPassword("hi!");
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "105) test0746(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "38) test0746(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "17) test0746(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("hi!");
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "106) test0748(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str7 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        boolean boolean5 = superManager0.isValidated();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getName();
        java.lang.String str11 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        boolean boolean11 = superManager0.isValidated();
        java.lang.String str12 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setId((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "107) test0754(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getName();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "108) test0756(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "39) test0756(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "18) test0756(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "6) test0756(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "109) test0757(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "110) test0758(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "40) test0758(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "19) test0758(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "111) test0759(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "41) test0759(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "20) test0759(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "112) test0760(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "113) test0761(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "42) test0761(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "114) test0762(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "43) test0762(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "21) test0762(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "115) test0763(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "44) test0763(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "22) test0763(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getPayRate();
        superManager0.setId((int) (short) -1);
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "116) test0765(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "117) test0767(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "45) test0767(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "23) test0767(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        boolean boolean11 = superManager0.isValidated();
        java.lang.String str12 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        superManager0.setEmail("supermanager");
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((-1));
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "118) test0774(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "119) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "120) test0776(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "121) test0778(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        superManager0.setId(1);
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        superManager0.setPassword("supermanager");
        boolean boolean18 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setName("");
        boolean boolean11 = superManager0.isValidated();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setEmail("hi!");
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        boolean boolean13 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "122) test0785(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setName("supermanager");
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "123) test0790(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "46) test0790(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "124) test0791(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        superManager0.setEmail("");
        int int18 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setName("");
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "125) test0793(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setPassword("");
        superManager0.setEmail("");
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "126) test0795(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "127) test0798(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "47) test0798(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        int int11 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "128) test0804(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getPassword();
        int int13 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "129) test0805(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "48) test0805(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "24) test0805(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "130) test0806(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "49) test0806(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "25) test0806(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "7) test0806(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "2) test0806(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "1) test0806(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "131) test0807(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setValidated(true);
        java.lang.String str13 = superManager0.getName();
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "132) test0812(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "50) test0812(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "26) test0812(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "8) test0812(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setName("");
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "133) test0813(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("hi!");
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "134) test0816(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "51) test0816(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "135) test0818(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getId();
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "136) test0820(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setValidated(false);
        superManager0.setName("");
        java.lang.String str15 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "137) test0823(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "52) test0823(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) -1);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getName();
        boolean boolean10 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        java.lang.String str14 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str17 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "138) test0826(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "53) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "27) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "9) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "3) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setName("");
        java.lang.String str13 = superManager0.getPassword();
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "139) test0827(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
// flaky "54) test0827(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "140) test0828(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "55) test0828(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "28) test0828(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "141) test0829(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "56) test0829(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "142) test0830(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "57) test0830(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setEmail("supermanager");
        superManager0.setId((int) (short) 100);
        java.lang.String str17 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "143) test0831(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str12 = superManager0.getUserType();
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("");
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "144) test0834(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        boolean boolean11 = superManager0.isValidated();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "145) test0836(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "58) test0836(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        int int9 = superManager0.getId();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "146) test0838(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
        superManager0.setId(0);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "147) test0839(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        superManager0.setValidated(true);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        int int5 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setValidated(false);
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "148) test0849(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setName("");
        java.lang.String str13 = superManager0.getEmail();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "149) test0850(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getName();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        java.lang.String str14 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "150) test0855(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "151) test0857(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        int int9 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "152) test0858(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        boolean boolean11 = superManager0.isValidated();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((int) (short) 0);
        boolean boolean8 = superManager0.isValidated();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setName("supermanager");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setId((int) (byte) 1);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getUserType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        superManager0.setId(97);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "153) test0873(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
// flaky "59) test0873(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        int int4 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "154) test0876(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "155) test0877(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "60) test0877(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "29) test0877(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "10) test0877(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((int) (short) 0);
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "156) test0880(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setValidated(false);
        superManager0.setEmail("");
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        int int13 = superManager0.getPayRate();
        boolean boolean14 = superManager0.isValidated();
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "157) test0886(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setId(0);
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "158) test0890(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "61) test0890(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "159) test0891(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        superManager0.setId(32);
        java.lang.String str13 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 1);
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setId((int) (byte) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setId((int) (byte) 1);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getUserType();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getName();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "160) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "62) test0907(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "30) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        boolean boolean10 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "161) test0908(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        java.lang.String str14 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str17 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setValidated(false);
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        superManager0.setId((int) (byte) -1);
        java.lang.String str14 = superManager0.getName();
        int int15 = superManager0.getId();
        superManager0.setName("hi!");
        int int18 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "162) test0913(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "63) test0913(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(0);
        int int11 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "163) test0916(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "64) test0916(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setValidated(true);
        java.lang.String str13 = superManager0.getName();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "164) test0918(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "65) test0918(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.String str19 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        int int13 = superManager0.getPayRate();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
// flaky "165) test0921(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setEmail("hi!");
        superManager0.setId((int) (byte) 1);
        int int15 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        boolean boolean10 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "166) test0927(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        boolean boolean16 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "167) test0929(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "66) test0929(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "168) test0930(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        boolean boolean13 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "169) test0931(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        int int6 = superManager0.getId();
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setPassword("hi!");
        int int7 = superManager0.getId();
        superManager0.setValidated(true);
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "170) test0940(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "67) test0940(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "31) test0940(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        superManager0.setValidated(true);
        int int8 = superManager0.getId();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "171) test0942(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "68) test0942(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "172) test0943(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "69) test0943(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        int int14 = superManager0.getId();
        boolean boolean15 = superManager0.isValidated();
        java.lang.String str16 = superManager0.getUserType();
        java.lang.String str17 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "173) test0945(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        int int6 = superManager0.getId();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "174) test0946(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky "70) test0946(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "175) test0947(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "71) test0947(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        superManager0.setId(0);
        java.lang.String str16 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "176) test0948(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.lang.String str16 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "177) test0952(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setId(100);
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "178) test0953(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setPassword("");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "179) test0956(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "72) test0956(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "32) test0956(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "11) test0956(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("");
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "180) test0957(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "181) test0958(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        int int12 = superManager0.getPayRate();
        int int13 = superManager0.getPayRate();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setEmail("supermanager");
        java.lang.String str15 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "182) test0961(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "73) test0961(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "33) test0961(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setId((int) (byte) 0);
        int int16 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getName();
        superManager0.setPassword("");
        superManager0.setValidated(false);
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        superManager0.setId(10);
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        boolean boolean12 = superManager0.isValidated();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setId((int) (byte) 100);
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        superManager0.setEmail("");
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        int int4 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("hi!");
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "183) test0976(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getUserType();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getId();
        superManager0.setName("hi!");
        int int13 = superManager0.getPayRate();
        java.lang.String str14 = superManager0.getName();
        java.lang.String str15 = superManager0.getPassword();
        int int16 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        superManager0.setName("hi!");
        java.lang.String str13 = superManager0.getUserType();
        superManager0.setValidated(false);
        java.lang.String str16 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "184) test0981(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setId(35);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "185) test0982(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 1);
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "186) test0985(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "187) test0986(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "74) test0986(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setId(0);
        java.lang.String str4 = superManager0.getName();
        boolean boolean5 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "188) test0987(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getId();
        boolean boolean12 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "189) test0988(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "75) test0988(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky "34) test0988(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        boolean boolean8 = superManager0.isValidated();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "190) test0990(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "76) test0990(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "35) test0990(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.String str14 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "191) test0993(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
// flaky "77) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("hi!");
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "192) test0994(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "78) test0994(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("hi!");
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        int int14 = superManager0.getId();
        int int15 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "193) test0997(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        superManager0.setId(0);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "194) test0998(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(0);
        int int11 = superManager0.getId();
        int int12 = superManager0.getId();
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setId(100);
        int int12 = superManager0.getId();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }
}
