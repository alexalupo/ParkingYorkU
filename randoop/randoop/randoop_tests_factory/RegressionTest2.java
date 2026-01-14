package randoop.randoop_tests_factory;

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
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass12 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        boolean boolean14 = debitCardPayment0.processPayment();
        boolean boolean15 = debitCardPayment0.processPayment();
        boolean boolean16 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        boolean boolean14 = debitCardPayment0.processPayment();
        boolean boolean15 = debitCardPayment0.processPayment();
        boolean boolean16 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass14 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        boolean boolean14 = payPalPayment0.processPayment();
        boolean boolean15 = payPalPayment0.processPayment();
        boolean boolean16 = payPalPayment0.processPayment();
        boolean boolean17 = payPalPayment0.processPayment();
        boolean boolean18 = payPalPayment0.processPayment();
        boolean boolean19 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass20 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        boolean boolean17 = creditCardPayment0.processPayment();
        boolean boolean18 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        boolean boolean14 = payPalPayment0.processPayment();
        boolean boolean15 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        boolean boolean14 = debitCardPayment0.processPayment();
        boolean boolean15 = debitCardPayment0.processPayment();
        boolean boolean16 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass11 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        boolean boolean14 = payPalPayment0.processPayment();
        boolean boolean15 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass12 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass12 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        boolean boolean14 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass15 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        boolean boolean17 = creditCardPayment0.processPayment();
        boolean boolean18 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        boolean boolean15 = creditCardPayment0.processPayment();
        boolean boolean16 = creditCardPayment0.processPayment();
        boolean boolean17 = creditCardPayment0.processPayment();
        boolean boolean18 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        boolean boolean14 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        boolean boolean13 = payPalPayment0.processPayment();
        boolean boolean14 = payPalPayment0.processPayment();
        boolean boolean15 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass16 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        boolean boolean11 = creditCardPayment0.processPayment();
        boolean boolean12 = creditCardPayment0.processPayment();
        boolean boolean13 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        boolean boolean14 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        boolean boolean9 = creditCardPayment0.processPayment();
        boolean boolean10 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        boolean boolean12 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        boolean boolean13 = debitCardPayment0.processPayment();
        boolean boolean14 = debitCardPayment0.processPayment();
        boolean boolean15 = debitCardPayment0.processPayment();
        boolean boolean16 = debitCardPayment0.processPayment();
        boolean boolean17 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        boolean boolean9 = payPalPayment0.processPayment();
        boolean boolean10 = payPalPayment0.processPayment();
        boolean boolean11 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        boolean boolean10 = debitCardPayment0.processPayment();
        boolean boolean11 = debitCardPayment0.processPayment();
        boolean boolean12 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        boolean boolean9 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

