package randoop.randoop_tests_factory;

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
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        java.lang.Class<?> wildcardClass1 = creditCardPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            factory.PaymentOption paymentOption1 = factory.PaymentFactory.createPayment("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Choose either paypal, credit, or debit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        java.lang.Class<?> wildcardClass1 = debitCardPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        java.lang.Class<?> wildcardClass1 = payPalPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            factory.PaymentOption paymentOption1 = factory.PaymentFactory.createPayment("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Choose either paypal, credit, or debit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        factory.PaymentFactory paymentFactory0 = new factory.PaymentFactory();
        java.lang.Class<?> wildcardClass1 = paymentFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass2 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass3 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.Class<?> wildcardClass14 = payPalPayment0.getClass();
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.Class<?> wildcardClass14 = payPalPayment0.getClass();
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass7 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.Class<?> wildcardClass12 = debitCardPayment0.getClass();
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.lang.Class<?> wildcardClass14 = creditCardPayment0.getClass();
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.Class<?> wildcardClass14 = payPalPayment0.getClass();
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        factory.PayPalPayment payPalPayment0 = new factory.PayPalPayment();
        boolean boolean1 = payPalPayment0.processPayment();
        boolean boolean2 = payPalPayment0.processPayment();
        boolean boolean3 = payPalPayment0.processPayment();
        boolean boolean4 = payPalPayment0.processPayment();
        boolean boolean5 = payPalPayment0.processPayment();
        boolean boolean6 = payPalPayment0.processPayment();
        boolean boolean7 = payPalPayment0.processPayment();
        boolean boolean8 = payPalPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = payPalPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.Class<?> wildcardClass18 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.lang.Class<?> wildcardClass13 = payPalPayment0.getClass();
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        boolean boolean8 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass10 = payPalPayment0.getClass();
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Class<?> wildcardClass14 = payPalPayment0.getClass();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        factory.DebitCardPayment debitCardPayment0 = new factory.DebitCardPayment();
        boolean boolean1 = debitCardPayment0.processPayment();
        boolean boolean2 = debitCardPayment0.processPayment();
        boolean boolean3 = debitCardPayment0.processPayment();
        boolean boolean4 = debitCardPayment0.processPayment();
        boolean boolean5 = debitCardPayment0.processPayment();
        boolean boolean6 = debitCardPayment0.processPayment();
        boolean boolean7 = debitCardPayment0.processPayment();
        boolean boolean8 = debitCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass6 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        factory.CreditCardPayment creditCardPayment0 = new factory.CreditCardPayment();
        boolean boolean1 = creditCardPayment0.processPayment();
        boolean boolean2 = creditCardPayment0.processPayment();
        boolean boolean3 = creditCardPayment0.processPayment();
        boolean boolean4 = creditCardPayment0.processPayment();
        boolean boolean5 = creditCardPayment0.processPayment();
        boolean boolean6 = creditCardPayment0.processPayment();
        boolean boolean7 = creditCardPayment0.processPayment();
        java.lang.Class<?> wildcardClass8 = creditCardPayment0.getClass();
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
}

