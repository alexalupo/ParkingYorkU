package randoop.randoop_tests_singleton;
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
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "1) test0003(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass2 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "2) test0004(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "3) test0005(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass2 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "4) test0007(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "5) test0008(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test0008(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setId((int) '#');
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "6) test0015(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        int int9 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "7) test0022(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "8) test0023(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "2) test0023(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        java.lang.String str11 = superManager0.getUserType();
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "9) test0024(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "3) test0024(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "10) test0027(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "11) test0033(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "4) test0033(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "1) test0033(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "1) test0033(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "12) test0038(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "13) test0039(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "5) test0039(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "14) test0042(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "15) test0043(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        int int9 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "16) test0044(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "17) test0045(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "6) test0045(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky "2) test0045(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "18) test0047(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "7) test0047(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean4 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "19) test0049(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "20) test0051(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "21) test0052(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        int int2 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "22) test0057(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "23) test0059(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "8) test0059(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test0059(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "24) test0061(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "25) test0062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "26) test0065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "27) test0068(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "28) test0070(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str11 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "29) test0071(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "9) test0071(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "30) test0072(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "31) test0074(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "32) test0076(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "10) test0076(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "33) test0077(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "11) test0077(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        superManager0.setName("");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "34) test0079(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) '#');
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "35) test0081(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "36) test0090(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "12) test0090(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "4) test0090(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "37) test0091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "38) test0093(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "39) test0095(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "40) test0098(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "13) test0098(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "5) test0098(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "41) test0099(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "14) test0099(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "6) test0099(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
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
// flaky "42) test0100(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "43) test0101(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky "15) test0101(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "44) test0103(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "16) test0103(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "7) test0103(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "45) test0104(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "17) test0104(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
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
// flaky "46) test0105(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "47) test0106(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "48) test0107(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "49) test0108(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "50) test0109(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "51) test0111(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "18) test0111(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "8) test0111(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
// flaky "2) test0111(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) '4');
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "52) test0113(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
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
// flaky "53) test0114(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "19) test0114(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "54) test0115(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "20) test0115(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "9) test0115(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "55) test0116(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "56) test0117(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "21) test0117(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "57) test0118(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "22) test0118(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        int int11 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "58) test0119(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "23) test0119(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "59) test0120(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "60) test0121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
// flaky "24) test0121(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky "10) test0121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "3) test0121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "1) test0121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "61) test0122(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "62) test0123(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "25) test0123(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getName();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "63) test0124(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "26) test0124(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "11) test0124(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "64) test0125(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "27) test0125(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "65) test0126(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "28) test0126(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "12) test0126(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "66) test0127(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "29) test0127(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "67) test0128(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "30) test0128(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky "13) test0128(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "68) test0129(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "69) test0130(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "70) test0131(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setId((int) '#');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setPassword("");
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        boolean boolean8 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "71) test0137(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "72) test0139(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        superManager0.setEmail("");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "73) test0140(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "74) test0141(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "75) test0142(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "31) test0142(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "76) test0144(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
// flaky "32) test0144(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "77) test0145(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "78) test0146(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setPassword("");
        superManager0.setId(10);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "79) test0148(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "33) test0148(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "80) test0149(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "81) test0150(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "34) test0150(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "82) test0151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "35) test0151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "83) test0152(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        superManager0.setId(97);
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        superManager0.setEmail("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "84) test0157(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "36) test0157(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getName();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getId();
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "85) test0165(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "86) test0167(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "37) test0167(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "14) test0167(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "87) test0168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "38) test0168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "88) test0171(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getName();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "89) test0173(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "90) test0174(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "39) test0174(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "91) test0175(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "92) test0176(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "40) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "15) test0176(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "93) test0177(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "41) test0177(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        java.lang.String str14 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "94) test0178(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "42) test0178(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "95) test0182(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "96) test0183(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "97) test0184(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("supermanager");
        java.lang.String str15 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "98) test0187(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "43) test0187(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "99) test0190(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "100) test0193(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "101) test0194(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "102) test0195(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "103) test0196(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "104) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
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
// flaky "105) test0200(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "44) test0200(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "106) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        boolean boolean10 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "107) test0204(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "108) test0205(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "109) test0207(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "110) test0208(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "45) test0208(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "111) test0211(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "46) test0211(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "112) test0212(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        superManager0.setId((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "113) test0214(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        superManager0.setId(97);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "114) test0216(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        boolean boolean4 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "115) test0217(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "116) test0218(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "47) test0218(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "16) test0218(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "117) test0219(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "48) test0219(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "17) test0219(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "4) test0219(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "118) test0220(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "49) test0220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "18) test0220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "119) test0221(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "120) test0222(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "121) test0223(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "50) test0223(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "122) test0225(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "51) test0225(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setId((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "123) test0234(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "124) test0235(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "125) test0237(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "52) test0237(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "19) test0237(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "126) test0238(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 1);
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "127) test0240(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setPassword("hi!");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        superManager0.setId((int) (byte) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        java.lang.String str12 = superManager0.getName();
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "128) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "129) test0247(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "130) test0248(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getId();
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
// flaky "131) test0249(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str7 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "132) test0250(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "133) test0251(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "134) test0252(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getPayRate();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "135) test0253(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        boolean boolean7 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "136) test0255(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "137) test0256(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setId((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "138) test0260(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "53) test0260(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        superManager0.setValidated(true);
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "139) test0261(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "54) test0261(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "140) test0263(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getUserType();
        java.lang.String str3 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setValidated(false);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "141) test0265(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "142) test0266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "55) test0266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str13 = superManager0.getUserType();
        int int14 = superManager0.getId();
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "143) test0267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "56) test0267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "20) test0267(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "5) test0267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
// flaky "2) test0267(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "144) test0268(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "57) test0268(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "21) test0268(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test0268(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "145) test0269(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "58) test0269(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) ' ');
        org.junit.Assert.assertNotNull(superManager0);
// flaky "146) test0271(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "147) test0272(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getId();
        int int5 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "148) test0273(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
// flaky "59) test0273(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        superManager0.setId((int) (byte) 100);
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "149) test0274(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "60) test0274(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "22) test0274(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test0274(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "150) test0275(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
// flaky "151) test0277(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(true);
        boolean boolean14 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "152) test0279(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "61) test0279(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "23) test0279(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "153) test0280(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "154) test0281(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "62) test0281(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "155) test0282(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "156) test0283(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "157) test0284(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "63) test0284(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "158) test0285(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId(35);
        int int7 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getUserType();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "159) test0293(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "160) test0300(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        boolean boolean6 = superManager0.isValidated();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "161) test0302(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "162) test0304(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "64) test0304(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        int int11 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "163) test0306(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "65) test0306(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
// flaky "24) test0306(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "164) test0307(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "165) test0308(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "166) test0310(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "167) test0312(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "66) test0312(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.String str14 = superManager0.getUserType();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "168) test0316(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "67) test0316(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        superManager0.setName("");
        boolean boolean11 = superManager0.isValidated();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "169) test0317(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "170) test0319(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
// flaky "68) test0319(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        int int12 = superManager0.getId();
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "171) test0323(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "172) test0324(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "69) test0324(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "173) test0325(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "70) test0325(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "174) test0326(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "175) test0329(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "71) test0329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky "25) test0329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "176) test0331(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "177) test0332(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "72) test0332(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        boolean boolean5 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "178) test0335(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "179) test0337(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "180) test0339(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        superManager0.setId(97);
        superManager0.setEmail("hi!");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "181) test0340(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "73) test0340(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        boolean boolean5 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "182) test0345(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "183) test0346(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "74) test0346(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "184) test0347(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "185) test0348(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "75) test0348(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
// flaky "26) test0348(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "186) test0349(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "76) test0349(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "187) test0350(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "188) test0352(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "77) test0352(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "27) test0352(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) 0);
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "189) test0353(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "78) test0353(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "190) test0354(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "79) test0354(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "28) test0354(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "8) test0354(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "191) test0355(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "80) test0355(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "192) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "193) test0358(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "194) test0359(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "195) test0360(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setId((int) '4');
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "196) test0361(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "197) test0362(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "198) test0363(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "199) test0364(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "81) test0364(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "29) test0364(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "200) test0365(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setName("hi!");
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        superManager0.setPassword("hi!");
        int int14 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        boolean boolean14 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        boolean boolean15 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "201) test0369(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "82) test0369(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "30) test0369(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "9) test0369(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "202) test0370(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean6 = superManager0.isValidated();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "203) test0373(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "83) test0373(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        superManager0.setId((int) (byte) 0);
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "204) test0375(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "205) test0376(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "84) test0376(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "206) test0378(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "207) test0379(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "208) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "85) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "209) test0382(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "86) test0382(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        superManager0.setValidated(false);
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "210) test0384(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        boolean boolean8 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "211) test0389(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "87) test0389(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(true);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        superManager0.setId(52);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "212) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "88) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "31) test0392(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
// flaky "10) test0392(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "3) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "213) test0393(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "89) test0393(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "214) test0398(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "215) test0401(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "90) test0401(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "216) test0402(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "91) test0402(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        int int10 = superManager0.getId();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        superManager0.setId((int) (byte) -1);
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "217) test0404(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        boolean boolean10 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "218) test0406(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getId();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        superManager0.setName("");
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
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "219) test0409(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "220) test0410(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        superManager0.setName("");
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "221) test0412(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "222) test0414(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "92) test0414(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "32) test0414(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setId((int) ' ');
        org.junit.Assert.assertNotNull(superManager0);
// flaky "223) test0415(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "93) test0415(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        superManager0.setId(32);
        superManager0.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "224) test0417(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        superManager0.setId((int) (byte) -1);
        java.lang.String str17 = superManager0.getPassword();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "225) test0419(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "226) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky "227) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "228) test0422(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "94) test0422(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "229) test0423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        int int10 = superManager0.getId();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "230) test0424(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "95) test0424(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky "33) test0424(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "231) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
// flaky "96) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setId(32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "232) test0428(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        int int15 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "233) test0430(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "97) test0430(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
// flaky "34) test0430(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        superManager0.setId((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getUserType();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "234) test0432(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "98) test0432(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "235) test0433(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setName("hi!");
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "236) test0435(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "99) test0435(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "237) test0436(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "100) test0436(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "35) test0436(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        boolean boolean10 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        superManager0.setId((int) 'a');
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "238) test0438(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "101) test0438(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        superManager0.setId((int) (byte) -1);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "239) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "102) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
// flaky "36) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        superManager0.setValidated(true);
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        superManager0.setId((int) 'a');
        superManager0.setId((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "240) test0443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "103) test0443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "241) test0444(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "104) test0444(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
// flaky "37) test0444(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        superManager0.setPassword("");
        int int13 = superManager0.getId();
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "242) test0447(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "243) test0450(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setEmail("hi!");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "244) test0451(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
// flaky "245) test0455(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "246) test0457(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
// flaky "247) test0458(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        superManager0.setId(97);
        superManager0.setEmail("hi!");
        int int18 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setValidated(false);
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        boolean boolean11 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        superManager0.setValidated(true);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        superManager0.setId((int) ' ');
        java.lang.String str14 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "248) test0466(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        java.lang.String str10 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "249) test0468(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "250) test0469(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "105) test0469(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "251) test0470(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
// flaky "106) test0470(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        boolean boolean6 = superManager0.isValidated();
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "252) test0473(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "253) test0474(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "supermanager" + "'", str16, "supermanager");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "254) test0480(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setEmail("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "255) test0483(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "256) test0484(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "107) test0484(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str14 = superManager0.getPassword();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "257) test0485(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "108) test0485(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "258) test0486(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setPassword("hi!");
        java.lang.String str9 = superManager0.getName();
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "259) test0488(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("hi!");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "260) test0489(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "109) test0489(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        int int10 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "261) test0490(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "110) test0490(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "262) test0491(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        int int15 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "263) test0493(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "111) test0493(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "38) test0493(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
// flaky "11) test0493(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "4) test0493(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "264) test0495(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "265) test0496(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setId(100);
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "266) test0498(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "112) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
// flaky "267) test0499(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}
