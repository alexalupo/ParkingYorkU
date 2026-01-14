package randoop.randoop_tests_singleton;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        int int13 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "1) test1001(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "1) test1001(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "2) test1002(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "2) test1002(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        int int15 = superManager0.getPayRate();
        java.lang.String str16 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        int int10 = superManager0.getId();
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getId();
        int int11 = superManager0.getId();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setId((int) '4');
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setValidated(false);
        boolean boolean8 = superManager0.isValidated();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "3) test1012(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "4) test1016(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "3) test1016(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId(35);
        superManager0.setPassword("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "5) test1017(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "6) test1018(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "4) test1018(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "1) test1018(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky "1) test1018(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "1) test1018(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) 'a');
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        superManager0.setValidated(false);
        java.lang.String str18 = superManager0.getUserType();
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "supermanager" + "'", str18, "supermanager");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getName();
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
// flaky "7) test1029(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
// flaky "5) test1029(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "8) test1031(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "9) test1032(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "6) test1032(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getName();
        superManager0.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "10) test1033(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        superManager0.setId((int) (short) 100);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "11) test1037(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "7) test1037(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "2) test1037(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getPayRate();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "12) test1038(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "8) test1038(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        int int15 = superManager0.getId();
        java.lang.String str16 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (byte) 0);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "13) test1044(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "14) test1045(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "9) test1045(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "3) test1045(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        superManager0.setId((int) (byte) -1);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "15) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "16) test1047(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "10) test1047(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setValidated(true);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setEmail("");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "17) test1051(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "11) test1051(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "4) test1051(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        superManager0.setName("hi!");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setId((int) (byte) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "18) test1052(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        int int13 = superManager0.getId();
        superManager0.setId(52);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "19) test1054(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        superManager0.setId((int) (short) 10);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "20) test1059(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "21) test1060(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "22) test1061(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "23) test1062(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getPassword();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getUserType();
        superManager0.setPassword("");
        superManager0.setName("");
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setId(97);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int16 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setEmail("supermanager");
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        superManager0.setEmail("");
        boolean boolean18 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "24) test1074(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(0);
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getName();
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "25) test1077(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        superManager0.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "26) test1078(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "12) test1078(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setId((int) (byte) 0);
        superManager0.setId(10);
        superManager0.setEmail("hi!");
        boolean boolean16 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        superManager0.setName("supermanager");
        java.lang.String str21 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "27) test1081(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "13) test1081(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "5) test1081(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "supermanager" + "'", str21, "supermanager");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        int int7 = superManager0.getId();
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        boolean boolean17 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "28) test1085(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "14) test1085(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "29) test1086(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "15) test1086(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str14 = superManager0.getUserType();
        java.lang.String str15 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        superManager0.setValidated(true);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setName("hi!");
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        int int16 = superManager0.getId();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "30) test1091(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        java.lang.String str14 = superManager0.getEmail();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        int int15 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str6 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "31) test1102(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "32) test1103(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) -1);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "33) test1104(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setId((int) (short) 0);
        superManager0.setPassword("");
        java.lang.String str12 = superManager0.getName();
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "34) test1105(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getUserType();
        superManager0.setPassword("");
        java.lang.String str5 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "35) test1108(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky "16) test1108(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "6) test1108(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getPayRate();
        superManager0.setValidated(false);
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "36) test1109(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "17) test1109(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId(0);
        superManager0.setId((int) 'a');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setPassword("hi!");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        superManager0.setId((int) 'a');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        superManager0.setId((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId((int) (short) 1);
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setEmail("hi!");
        boolean boolean13 = superManager0.isValidated();
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getName();
        superManager0.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setId(100);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        superManager0.setPassword("supermanager");
        boolean boolean13 = superManager0.isValidated();
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        boolean boolean2 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        boolean boolean10 = superManager0.isValidated();
        boolean boolean11 = superManager0.isValidated();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "37) test1128(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 1);
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setId((-1));
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "38) test1130(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "18) test1130(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        superManager0.setId(32);
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "39) test1131(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setName("");
        superManager0.setValidated(false);
        int int12 = superManager0.getPayRate();
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "40) test1132(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.String str14 = superManager0.getUserType();
        superManager0.setId((int) 'a');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "41) test1133(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "42) test1134(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "19) test1134(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setPassword("hi!");
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "43) test1135(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
// flaky "20) test1135(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getPayRate();
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        superManager0.setId((int) (byte) 0);
        int int16 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        boolean boolean10 = superManager0.isValidated();
        superManager0.setName("");
        int int13 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "44) test1141(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getId();
        superManager0.setValidated(true);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setEmail("supermanager");
        superManager0.setEmail("supermanager");
        int int13 = superManager0.getId();
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setName("");
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setId(35);
        int int7 = superManager0.getPayRate();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(true);
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        boolean boolean15 = superManager0.isValidated();
        java.lang.String str16 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        superManager0.setName("");
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getName();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        superManager0.setId((int) (byte) 0);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "45) test1164(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "21) test1164(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        int int14 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        superManager0.setName("supermanager");
        superManager0.setId((int) (byte) 0);
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        boolean boolean6 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        superManager0.setId(97);
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "46) test1171(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        int int7 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "47) test1172(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId(10);
        int int9 = superManager0.getId();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        int int10 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "48) test1178(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        superManager0.setId(35);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setValidated(true);
        boolean boolean13 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setValidated(true);
        superManager0.setId(100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("");
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        superManager0.setId((int) (short) -1);
        superManager0.setId(52);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setPassword("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setId((int) 'a');
        java.lang.String str14 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        superManager0.setPassword("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getName();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        boolean boolean15 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getPassword();
        int int12 = superManager0.getId();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getUserType();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getName();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "49) test1203(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "50) test1204(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getUserType();
        int int13 = superManager0.getPayRate();
        superManager0.setId(10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        int int5 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getName();
        superManager0.setEmail("supermanager");
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "51) test1208(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "22) test1208(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setName("supermanager");
        int int10 = superManager0.getId();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "52) test1209(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "53) test1210(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "54) test1211(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "23) test1211(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getEmail();
        boolean boolean12 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        boolean boolean12 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "55) test1213(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "24) test1213(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "56) test1214(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getId();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "57) test1215(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        superManager0.setValidated(false);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getUserType();
        int int7 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getName();
        superManager0.setName("hi!");
        int int14 = superManager0.getId();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "58) test1220(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        int int9 = superManager0.getId();
        superManager0.setId((int) (short) 10);
        superManager0.setEmail("hi!");
        int int14 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getUserType();
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
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setEmail("hi!");
        superManager0.setPassword("hi!");
        superManager0.setName("");
        java.lang.String str17 = superManager0.getEmail();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "59) test1224(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "60) test1225(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getPassword();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "61) test1226(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "25) test1226(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
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
// flaky "62) test1228(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
// flaky "26) test1228(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        superManager0.setValidated(false);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setEmail("supermanager");
        boolean boolean12 = superManager0.isValidated();
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getUserType();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("");
        java.lang.String str9 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "63) test1232(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        int int16 = superManager0.getId();
        superManager0.setId(52);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        superManager0.setId((int) (byte) 10);
        int int15 = superManager0.getId();
        superManager0.setPassword("supermanager");
        int int18 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str12 = superManager0.getName();
        superManager0.setName("hi!");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setPassword("supermanager");
        java.lang.String str8 = superManager0.getName();
        superManager0.setEmail("");
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        superManager0.setName("");
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "64) test1238(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
// flaky "27) test1238(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "7) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
// flaky "65) test1239(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getId();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) -1);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getUserType();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getPassword();
        int int5 = superManager0.getId();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((int) (short) 0);
        java.lang.String str8 = superManager0.getEmail();
        superManager0.setId((int) ' ');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        boolean boolean18 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "66) test1248(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setId((int) (short) -1);
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "67) test1249(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        superManager0.setValidated(true);
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "68) test1250(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        java.lang.String str15 = superManager0.getName();
        superManager0.setId((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        int int7 = superManager0.getId();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        boolean boolean14 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getName();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        java.lang.String str6 = superManager0.getName();
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getId();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        boolean boolean4 = superManager0.isValidated();
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setId((int) '4');
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "69) test1266(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setId((int) (byte) -1);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "70) test1268(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setPassword("");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "71) test1269(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "28) test1269(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getPayRate();
        superManager0.setPassword("");
        java.lang.String str10 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "72) test1270(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "29) test1270(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setId((-1));
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
// flaky "73) test1271(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "30) test1271(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        superManager0.setName("hi!");
        superManager0.setId((int) '4');
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "74) test1272(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getName();
        int int11 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        boolean boolean8 = superManager0.isValidated();
        superManager0.setId((int) (short) 100);
        int int11 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        boolean boolean9 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        int int6 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setValidated(false);
        superManager0.setId((int) '4');
        org.junit.Assert.assertNotNull(superManager0);
// flaky "75) test1277(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "31) test1277(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test1277(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        java.lang.String str8 = superManager0.getUserType();
        boolean boolean9 = superManager0.isValidated();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getUserType();
        int int6 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        int int14 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        int int9 = superManager0.getPayRate();
        int int10 = superManager0.getPayRate();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) 'a');
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("supermanager");
        boolean boolean15 = superManager0.isValidated();
        int int16 = superManager0.getPayRate();
        int int17 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "76) test1285(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setId(52);
        superManager0.setId((int) '4');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setEmail("hi!");
        superManager0.setName("supermanager");
        java.lang.String str13 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        boolean boolean15 = superManager0.isValidated();
        superManager0.setId((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "77) test1288(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "32) test1288(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        superManager0.setValidated(false);
        superManager0.setName("");
        superManager0.setEmail("hi!");
        java.lang.String str17 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        int int14 = superManager0.getId();
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "78) test1293(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        superManager0.setPassword("");
        int int13 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str16 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setId(1);
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        int int5 = superManager0.getPayRate();
        boolean boolean6 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) -1);
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean4 = superManager0.isValidated();
        superManager0.setPassword("supermanager");
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setName("hi!");
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setEmail("");
        superManager0.setValidated(true);
        int int12 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setId(100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setId((int) (byte) 1);
        superManager0.setPassword("");
        java.lang.String str11 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getUserType();
        int int13 = superManager0.getPayRate();
        boolean boolean14 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) (short) 1);
        int int9 = superManager0.getPayRate();
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        java.lang.String str3 = superManager0.getName();
        int int4 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        int int7 = superManager0.getId();
        boolean boolean8 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        java.lang.String str11 = superManager0.getEmail();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setId(10);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.isValidated();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) (short) -1);
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getId();
        superManager0.setPassword("");
        boolean boolean8 = superManager0.isValidated();
        boolean boolean9 = superManager0.isValidated();
        java.lang.String str10 = superManager0.getEmail();
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        superManager0.setValidated(false);
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setId((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int int14 = superManager0.getId();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "79) test1320(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setEmail("");
        int int13 = superManager0.getPayRate();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean11 = superManager0.isValidated();
        superManager0.setPassword("hi!");
        superManager0.setId((int) (short) 100);
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "80) test1323(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setId(10);
        java.lang.String str11 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        superManager0.setEmail("hi!");
        java.lang.String str8 = superManager0.getUserType();
        int int9 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getUserType();
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        superManager0.setValidated(true);
        java.lang.String str17 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        java.lang.String str11 = superManager0.getUserType();
        boolean boolean12 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) '4');
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean5 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        superManager0.setEmail("supermanager");
        superManager0.setValidated(false);
        superManager0.setName("");
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "81) test1332(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        superManager0.setValidated(true);
        superManager0.setName("");
        int int12 = superManager0.getId();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "82) test1333(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        superManager0.setName("supermanager");
        int int12 = superManager0.getPayRate();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        superManager0.setName("hi!");
        int int8 = superManager0.getId();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setId((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setName("hi!");
        superManager0.setValidated(false);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "83) test1340(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "33) test1340(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setId((int) (byte) 0);
        java.lang.String str6 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getId();
        superManager0.setName("");
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        superManager0.setPassword("supermanager");
        java.lang.String str11 = superManager0.getEmail();
        int int12 = superManager0.getPayRate();
        superManager0.setValidated(true);
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        int int15 = superManager0.getPayRate();
        int int16 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getName();
        int int12 = superManager0.getPayRate();
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("supermanager");
        java.lang.String str7 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        int int15 = superManager0.getId();
        int int16 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("");
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "84) test1352(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setEmail("supermanager");
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        boolean boolean6 = superManager0.isValidated();
        superManager0.setEmail("");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
        int int10 = superManager0.getId();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getName();
        superManager0.setPassword("supermanager");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        superManager0.setName("");
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        superManager0.setPassword("hi!");
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        superManager0.setName("");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setPassword("");
        superManager0.setEmail("supermanager");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        int int2 = superManager0.getId();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        superManager0.setId((int) (byte) 1);
        java.lang.String str13 = superManager0.getPassword();
        superManager0.setEmail("hi!");
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setId((int) ' ');
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getName();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        int int13 = superManager0.getPayRate();
        java.lang.String str14 = superManager0.getPassword();
        boolean boolean15 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "85) test1370(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setEmail("");
        superManager0.setEmail("supermanager");
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        superManager0.setEmail("");
        superManager0.setId((int) '4');
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setId(0);
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        superManager0.setValidated(false);
        superManager0.setId((int) (byte) -1);
        java.lang.String str11 = superManager0.getUserType();
        java.lang.String str12 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "86) test1377(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        superManager0.setId((int) (byte) 0);
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getPassword();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        int int11 = superManager0.getId();
        int int12 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean10 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setName("hi!");
        superManager0.setPassword("");
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        superManager0.setValidated(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        int int7 = superManager0.getId();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        boolean boolean8 = superManager0.isValidated();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setValidated(true);
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setPassword("");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getUserType();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setValidated(true);
        java.lang.String str10 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "87) test1391(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.String str14 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky "88) test1394(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        boolean boolean2 = superManager0.isValidated();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setName("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean17 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getName();
        superManager0.setName("hi!");
        java.lang.String str11 = superManager0.getPassword();
        superManager0.setValidated(true);
        java.lang.String str14 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "89) test1397(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        superManager0.setEmail("hi!");
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        int int11 = superManager0.getId();
        java.lang.String str12 = superManager0.getUserType();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setValidated(false);
        superManager0.setId((int) 'a');
        java.lang.String str9 = superManager0.getName();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.String str14 = superManager0.getEmail();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("supermanager");
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getPayRate();
        superManager0.setId((int) (short) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getUserType();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str15 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getId();
        superManager0.setName("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        superManager0.setId((int) (byte) 100);
        int int7 = superManager0.getPayRate();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) ' ');
        int int4 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.String str15 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) ' ');
        superManager0.setId(97);
        java.lang.String str6 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setName("");
        superManager0.setId((int) '4');
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "90) test1411(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setPassword("");
        int int7 = superManager0.getId();
        int int8 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("supermanager");
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getUserType();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getUserType();
        int int5 = superManager0.getPayRate();
        superManager0.setName("supermanager");
        java.lang.String str8 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        superManager0.setPassword("");
        superManager0.setName("supermanager");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getUserType();
        boolean boolean9 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getPayRate();
        superManager0.setId((int) (short) 10);
        boolean boolean11 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
// flaky "91) test1421(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        superManager0.setId(100);
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "92) test1422(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getPayRate();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "93) test1423(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getUserType();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "94) test1424(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        boolean boolean8 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setEmail("hi!");
        boolean boolean13 = superManager0.isValidated();
        boolean boolean14 = superManager0.isValidated();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "95) test1426(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        superManager0.setName("supermanager");
        java.lang.String str19 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "96) test1427(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "34) test1427(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "9) test1427(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        superManager0.setPassword("");
        int int16 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) (short) 1);
        java.lang.String str9 = superManager0.getName();
        boolean boolean10 = superManager0.isValidated();
        int int11 = superManager0.getPayRate();
        java.lang.String str12 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setEmail("hi!");
        int int7 = superManager0.getId();
        superManager0.setId(100);
        java.lang.String str10 = superManager0.getName();
        superManager0.setPassword("supermanager");
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        boolean boolean7 = superManager0.isValidated();
        int int8 = superManager0.getId();
        int int9 = superManager0.getId();
        java.lang.String str10 = superManager0.getEmail();
        boolean boolean11 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "97) test1432(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
// flaky "35) test1432(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getUserType();
        superManager0.setId((int) 'a');
        superManager0.setPassword("hi!");
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getName();
        superManager0.setName("");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        int int3 = superManager0.getId();
        java.lang.String str4 = superManager0.getPassword();
        int int5 = superManager0.getPayRate();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "98) test1436(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "36) test1436(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getId();
        superManager0.setId((int) (short) 0);
        superManager0.setEmail("");
        superManager0.setPassword("");
        int int13 = superManager0.getPayRate();
        java.lang.String str14 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "99) test1437(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int18 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "100) test1438(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "supermanager" + "'", str17, "supermanager");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("hi!");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getUserType();
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "supermanager" + "'", str12, "supermanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        int int4 = superManager0.getId();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getPassword();
        int int10 = superManager0.getId();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        superManager0.setName("hi!");
        java.lang.String str8 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setName("");
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        superManager0.setPassword("supermanager");
        superManager0.setName("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.isValidated();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setId((int) (short) 1);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        superManager0.setId((int) (byte) -1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean15 = superManager0.isValidated();
        int int16 = superManager0.getId();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        int int6 = superManager0.getPayRate();
        int int7 = superManager0.getId();
        int int8 = superManager0.getPayRate();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        int int8 = superManager0.getPayRate();
        superManager0.setName("hi!");
        superManager0.setName("supermanager");
        superManager0.setValidated(true);
        boolean boolean15 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        superManager0.setEmail("hi!");
        superManager0.setName("");
        java.lang.String str10 = superManager0.getEmail();
        superManager0.setEmail("");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        superManager0.setId((int) (short) 1);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        int int6 = superManager0.getPayRate();
        superManager0.setEmail("hi!");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean9 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        java.lang.String str5 = superManager0.getUserType();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setId(0);
        java.lang.String str9 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        boolean boolean6 = superManager0.isValidated();
        superManager0.setName("supermanager");
        java.lang.String str9 = superManager0.getName();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        superManager0.setPassword("");
        int int11 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setName("");
        java.lang.String str5 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setName("supermanager");
        int int12 = superManager0.getPayRate();
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        java.lang.String str2 = superManager0.getName();
        boolean boolean3 = superManager0.isValidated();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("supermanager");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setValidated(true);
        superManager0.setPassword("");
        superManager0.setId((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        superManager0.setEmail("supermanager");
        int int10 = superManager0.getPayRate();
        superManager0.setId((int) (short) 100);
        java.lang.String str13 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setPassword("hi!");
        java.lang.String str8 = superManager0.getPassword();
        superManager0.setEmail("supermanager");
        superManager0.setId((int) (byte) 100);
        int int13 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        int int5 = superManager0.getId();
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        int int3 = superManager0.getPayRate();
        superManager0.setEmail("supermanager");
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        int int1 = superManager0.getPayRate();
        java.lang.String str2 = superManager0.getName();
        superManager0.setId((int) '#');
        superManager0.setValidated(true);
        int int7 = superManager0.getId();
        superManager0.setValidated(false);
        boolean boolean10 = superManager0.isValidated();
        java.lang.String str11 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "supermanager" + "'", str2, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getName();
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "supermanager" + "'", str9, "supermanager");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setId((int) (byte) 10);
        java.lang.String str4 = superManager0.getName();
        int int5 = superManager0.getPayRate();
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        superManager0.setId((int) (byte) 0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        superManager0.setName("");
        int int6 = superManager0.getPayRate();
        superManager0.setPassword("hi!");
        int int9 = superManager0.getId();
        int int10 = superManager0.getPayRate();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setName("");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setName("");
        superManager0.setId(0);
        superManager0.setId(0);
        int int10 = superManager0.getId();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getName();
        int int8 = superManager0.getId();
        java.lang.String str9 = superManager0.getName();
        superManager0.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        int int4 = superManager0.getPayRate();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getUserType();
        superManager0.setName("hi!");
        superManager0.setEmail("");
        superManager0.setName("supermanager");
        superManager0.setName("");
        java.lang.String str15 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str15 = superManager0.getEmail();
        superManager0.setId((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "supermanager" + "'", str13, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        java.lang.String str5 = superManager0.getName();
        java.lang.String str6 = superManager0.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            superManager0.createManagementAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File does not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean6 = superManager0.isValidated();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setValidated(false);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setPassword("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        java.lang.String str7 = superManager0.getName();
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "101) test1480(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        superManager0.setValidated(true);
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str10 = superManager0.getUserType();
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "supermanager" + "'", str7, "supermanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "supermanager" + "'", str1, "supermanager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getName();
        superManager0.setName("");
        int int7 = superManager0.getPayRate();
        int int8 = superManager0.getPayRate();
        int int9 = superManager0.getPayRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        java.lang.String str5 = superManager0.getName();
        int int6 = superManager0.getId();
        superManager0.setPassword("supermanager");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        boolean boolean3 = superManager0.isValidated();
        superManager0.setPassword("");
        superManager0.setEmail("hi!");
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        superManager0.setEmail("hi!");
        boolean boolean8 = superManager0.isValidated();
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.setValidated(false);
        int int7 = superManager0.getPayRate();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        superManager0.setId((int) ' ');
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setValidated(true);
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setId((int) (byte) 10);
        int int6 = superManager0.getId();
        boolean boolean7 = superManager0.isValidated();
        java.lang.String str8 = superManager0.getUserType();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "supermanager" + "'", str8, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "supermanager" + "'", str10, "supermanager");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        int int2 = superManager0.getPayRate();
        java.lang.String str3 = superManager0.getName();
        superManager0.setPassword("");
        java.lang.String str6 = superManager0.getName();
        superManager0.setEmail("hi!");
        java.lang.String str9 = superManager0.getEmail();
        int int10 = superManager0.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "supermanager" + "'", str6, "supermanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        boolean boolean6 = superManager0.isValidated();
        superManager0.setPassword("");
        java.lang.String str9 = superManager0.getPassword();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        int int7 = superManager0.getId();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getName();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.setPassword("supermanager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setPassword("supermanager");
        int int4 = superManager0.getPayRate();
        superManager0.setName("");
        java.lang.String str7 = superManager0.getName();
        java.lang.String str8 = superManager0.getName();
        superManager0.setPassword("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        superManager0.setValidated(true);
        superManager0.setEmail("");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getName();
        superManager0.setValidated(true);
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setName("supermanager");
        superManager0.setEmail("hi!");
        java.lang.String str11 = superManager0.getUserType();
        superManager0.setId((int) (short) -1);
        java.lang.String str14 = superManager0.getName();
        superManager0.setEmail("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "supermanager" + "'", str11, "supermanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "supermanager" + "'", str14, "supermanager");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setValidated(false);
        superManager0.setPassword("hi!");
        superManager0.setValidated(false);
        int int10 = superManager0.getId();
        superManager0.setValidated(false);
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        superManager0.setEmail("");
        java.lang.String str3 = superManager0.getUserType();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getUserType();
        superManager0.setId(1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "supermanager" + "'", str3, "supermanager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "supermanager" + "'", str5, "supermanager");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        singleton.SuperManager superManager0 = singleton.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValidated();
        superManager0.setValidated(true);
        java.lang.String str4 = superManager0.getName();
        superManager0.setValidated(false);
        superManager0.setValidated(true);
        superManager0.setValidated(false);
        java.lang.String str11 = superManager0.getEmail();
        superManager0.setValidated(false);
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getUserType();
        superManager0.setValidated(false);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "supermanager" + "'", str4, "supermanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "supermanager" + "'", str15, "supermanager");
    }
}
