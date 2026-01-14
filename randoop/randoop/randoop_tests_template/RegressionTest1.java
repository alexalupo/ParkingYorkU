package randoop.randoop_tests_template;
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
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getEmail();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getEmail();
        java.lang.String str10 = facultyMember5.getPassword();
        java.lang.String str11 = facultyMember5.getUserType();
        java.lang.String str12 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getUserType();
        int int11 = manager5.getPayRate();
        java.lang.String str12 = manager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        int int11 = nonFacultyMember5.getId();
        java.lang.String str12 = nonFacultyMember5.getUserType();
        int int13 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        template.Visitor visitor5 = new template.Visitor("student", (int) (byte) 0, "manager", "", true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        template.Visitor visitor5 = new template.Visitor("visitor", (-1), "nonfaculty", "faculty", true);
        visitor5.setValidated(true);
        java.lang.String str8 = visitor5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        template.Student student5 = new template.Student("hi!", (int) (short) 1, "nonfaculty", "faculty", true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) '#', "manager", "student", true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setValidated(false);
        facultyMember5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        visitor5.setValidated(true);
        java.lang.String str12 = visitor5.getUserType();
        int int13 = visitor5.getPayRate();
        java.lang.String str14 = visitor5.getUserType();
        int int15 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", 5, "visitor", "faculty", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        template.Student student5 = new template.Student("visitor", (int) (short) 100, "", "hi!", false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        manager0.setValidated(true);
        java.lang.String str7 = manager0.getPassword();
        manager0.setEmail("faculty");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        template.Manager manager5 = new template.Manager("nonfaculty", 0, "student", "hi!", false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setName("");
        int int10 = facultyMember5.getPayRate();
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getId();
        boolean boolean8 = facultyMember5.isValidated();
        int int9 = facultyMember5.getPayRate();
        java.lang.String str10 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        template.Student student5 = new template.Student("student", (int) (short) 1, "manager", "nonfaculty", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        visitor5.setId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        nonFacultyMember5.setValidated(false);
        boolean boolean8 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        java.lang.String str8 = facultyMember5.getUserType();
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) (short) -1, "manager", "", true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setId(8);
        boolean boolean10 = nonFacultyMember5.isValidated();
        int int11 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        boolean boolean8 = visitor5.isValidated();
        java.lang.String str9 = visitor5.getUserType();
        java.lang.String str10 = visitor5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (byte) 100, "student", "", true);
        visitor5.setValidated(true);
        int int8 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        template.Manager manager5 = new template.Manager("visitor", (int) (short) 1, "faculty", "", false);
        java.lang.String str6 = manager5.getUserType();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) -1, "manager", "faculty", false);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setEmail("visitor");
        java.lang.String str10 = facultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        boolean boolean7 = facultyMember5.isValidated();
        int int8 = facultyMember5.getPayRate();
        facultyMember5.setPassword("");
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        manager5.setPassword("visitor");
        manager5.setId((int) (short) 1);
        java.lang.String str13 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        template.Visitor visitor5 = new template.Visitor("hi!", 100, "visitor", "student", false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        template.Manager manager0 = new template.Manager();
        java.lang.String str1 = manager0.getUserType();
        java.lang.String str2 = manager0.getUserType();
        java.lang.String str3 = manager0.getUserType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "manager" + "'", str1, "manager");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "manager" + "'", str2, "manager");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "manager" + "'", str3, "manager");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        java.lang.String str12 = nonFacultyMember5.getPassword();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass14 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        java.lang.String str10 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) '4', "faculty", "faculty", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("faculty");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getId();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        java.lang.String str14 = nonFacultyMember5.getUserType();
        java.lang.String str15 = nonFacultyMember5.getUserType();
        java.lang.String str16 = nonFacultyMember5.getUserType();
        int int17 = nonFacultyMember5.getPayRate();
        java.lang.String str18 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "nonfaculty" + "'", str18, "nonfaculty");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getEmail();
        int int10 = manager5.getPayRate();
        int int11 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        nonFacultyMember5.setEmail("student");
        java.lang.String str12 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        int int9 = student5.getId();
        student5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", 15, "manager", "nonfaculty", false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        template.Student student5 = new template.Student("hi!", (-1), "hi!", "manager", false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        template.Student student5 = new template.Student("visitor", (int) (short) 100, "nonfaculty", "visitor", true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setEmail("visitor");
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        manager5.setValidated(true);
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (short) 100, "visitor", "", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", 8, "", "", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        template.Visitor visitor5 = new template.Visitor("hi!", 15, "", "", false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        student5.setName("");
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        java.lang.String str2 = manager0.getEmail();
        int int3 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        template.Manager manager5 = new template.Manager("student", 100, "nonfaculty", "manager", false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        student5.setName("student");
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getName();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 8, "nonfaculty", "visitor", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        manager5.setName("hi!");
        int int10 = manager5.getPayRate();
        java.lang.String str11 = manager5.getUserType();
        java.lang.String str12 = manager5.getName();
        java.lang.String str13 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "manager" + "'", str11, "manager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        template.Manager manager5 = new template.Manager("", (int) '#', "nonfaculty", "manager", false);
        java.lang.Class<?> wildcardClass6 = manager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        int int10 = visitor5.getPayRate();
        boolean boolean11 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setEmail("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        visitor5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 15, "manager", "manager", false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        manager5.setEmail("student");
        manager5.setValidated(true);
        manager5.setName("");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        template.Student student5 = new template.Student("manager", 0, "student", "nonfaculty", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        template.Visitor visitor5 = new template.Visitor("student", 100, "", "", true);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        manager5.setEmail("faculty");
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        int int11 = nonFacultyMember5.getId();
        int int12 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        template.Manager manager5 = new template.Manager("", (int) ' ', "faculty", "", true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        template.Student student5 = new template.Student("student", 97, "", "manager", false);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        int int10 = facultyMember5.getPayRate();
        int int11 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 35, "", "faculty", true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "hi!", "manager", false);
        student5.setPassword("");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getName();
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("");
        int int11 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        boolean boolean2 = manager0.isValidated();
        java.lang.String str3 = manager0.getPassword();
        java.lang.String str4 = manager0.getUserType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "manager" + "'", str4, "manager");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (short) 10, "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (byte) -1, "nonfaculty", "", false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 100, "nonfaculty", "faculty", true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("hi!");
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        java.lang.String str8 = facultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        template.Student student5 = new template.Student("nonfaculty", 0, "", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getPassword();
        boolean boolean9 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (byte) 10, "", "student", false);
        visitor5.setPassword("faculty");
        java.lang.String str8 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 1, "nonfaculty", "student", true);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setName("manager");
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setId(8);
        nonFacultyMember5.setPassword("hi!");
        nonFacultyMember5.setPassword("faculty");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) -1, "manager", "faculty", false);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (short) -1, "nonfaculty", "hi!", true);
        java.lang.String str6 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getUserType();
        boolean boolean14 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setName("");
        manager5.setEmail("");
        int int14 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        java.lang.String str4 = manager0.getUserType();
        java.lang.String str5 = manager0.getPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "manager" + "'", str4, "manager");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        template.Student student5 = new template.Student("visitor", (int) (byte) 1, "hi!", "faculty", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        template.Visitor visitor5 = new template.Visitor("student", 100, "", "", true);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        boolean boolean6 = student5.isValidated();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        java.lang.String str13 = visitor5.getUserType();
        java.lang.String str14 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getPayRate();
        student5.setId(0);
        int int9 = student5.getPayRate();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "manager", "faculty", false);
        manager5.setName("hi!");
        manager5.setEmail("");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        boolean boolean9 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setEmail("manager");
        int int12 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        template.Visitor visitor5 = new template.Visitor("", (int) (byte) 0, "faculty", "nonfaculty", false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        boolean boolean3 = manager0.isValidated();
        java.lang.String str4 = manager0.getPassword();
        java.lang.String str5 = manager0.getUserType();
        java.lang.Class<?> wildcardClass6 = manager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "manager" + "'", str5, "manager");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        template.Manager manager5 = new template.Manager("visitor", (int) (short) 1, "faculty", "", false);
        java.lang.String str6 = manager5.getUserType();
        java.lang.Class<?> wildcardClass7 = manager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        student5.setPassword("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "hi!", "visitor", false);
        nonFacultyMember5.setEmail("student");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (byte) -1, "", "hi!", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setName("visitor");
        nonFacultyMember5.setId(100);
        int int15 = nonFacultyMember5.getId();
        int int16 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        template.Visitor visitor5 = new template.Visitor("", (int) '#', "visitor", "nonfaculty", true);
        java.lang.String str6 = visitor5.getEmail();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        java.lang.Class<?> wildcardClass9 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        template.Manager manager5 = new template.Manager("visitor", (int) 'a', "manager", "visitor", true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getId();
        java.lang.String str3 = manager0.getEmail();
        int int4 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        template.Visitor visitor5 = new template.Visitor("student", 100, "", "", true);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        template.Manager manager5 = new template.Manager("nonfaculty", 1, "visitor", "student", false);
        manager5.setEmail("visitor");
        boolean boolean8 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        int int5 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        student5.setName("nonfaculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setId((int) (byte) 10);
        int int8 = student5.getPayRate();
        student5.setName("hi!");
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getPassword();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        student5.setName("");
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        student5.setId((int) 'a');
        int int12 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        template.Student student5 = new template.Student("student", 100, "hi!", "hi!", false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        template.Visitor visitor5 = new template.Visitor("", (-1), "", "faculty", true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        template.Student student5 = new template.Student("", (int) (short) -1, "student", "visitor", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        nonFacultyMember5.setId(5);
        int int14 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        template.Student student5 = new template.Student("manager", (int) (short) 0, "faculty", "faculty", true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 8, "manager", "student", true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getUserType();
        java.lang.String str11 = visitor5.getUserType();
        java.lang.Class<?> wildcardClass12 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (-1), "", "faculty", true);
        java.lang.String str6 = nonFacultyMember5.getName();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        template.Visitor visitor5 = new template.Visitor("visitor", 0, "", "", true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        visitor5.setEmail("student");
        visitor5.setValidated(false);
        int int17 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setId((int) (byte) 10);
        int int8 = student5.getPayRate();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) 100, "student", "visitor", true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        int int9 = visitor5.getPayRate();
        java.lang.String str10 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (byte) 10, "faculty", "manager", true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        java.lang.String str12 = manager5.getName();
        int int13 = manager5.getPayRate();
        java.lang.String str14 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "manager" + "'", str14, "manager");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        template.Student student5 = new template.Student("student", 0, "", "manager", false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (byte) 0, "visitor", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setId(15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        template.Manager manager5 = new template.Manager("student", (int) (short) 10, "visitor", "visitor", false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 8, "faculty", "faculty", false);
        visitor5.setEmail("visitor");
        java.lang.String str8 = visitor5.getEmail();
        java.lang.String str9 = visitor5.getUserType();
        java.lang.String str10 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setValidated(false);
        boolean boolean11 = visitor5.isValidated();
        int int12 = visitor5.getId();
        int int13 = visitor5.getPayRate();
        int int14 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        template.Manager manager5 = new template.Manager("", 15, "", "hi!", true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "hi!", "manager", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        visitor5.setEmail("manager");
        java.lang.String str15 = visitor5.getPassword();
        java.lang.String str16 = visitor5.getUserType();
        int int17 = visitor5.getPayRate();
        int int18 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getUserType();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        nonFacultyMember5.setPassword("visitor");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        template.Manager manager5 = new template.Manager("", (int) '4', "manager", "nonfaculty", true);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (byte) -1, "student", "manager", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        manager0.setValidated(true);
        java.lang.String str7 = manager0.getPassword();
        int int8 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        template.Student student5 = new template.Student("", 0, "hi!", "", false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        int int7 = student5.getId();
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        int int9 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) (short) 100, "nonfaculty", "", false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        template.Manager manager5 = new template.Manager("faculty", 5, "nonfaculty", "hi!", false);
        java.lang.String str6 = manager5.getUserType();
        boolean boolean7 = manager5.isValidated();
        manager5.setEmail("student");
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (byte) 100, "student", "faculty", false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 10, "", "manager", true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setId((int) (byte) 10);
        int int8 = student5.getPayRate();
        student5.setName("hi!");
        boolean boolean11 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        student5.setName("student");
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        template.Visitor visitor5 = new template.Visitor("", (int) '#', "visitor", "nonfaculty", true);
        java.lang.String str6 = visitor5.getEmail();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", (int) (short) 0, "", "manager", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        int int7 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("hi!");
        int int9 = student5.getId();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        facultyMember5.setPassword("hi!");
        facultyMember5.setName("");
        java.lang.String str13 = facultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setName("hi!");
        nonFacultyMember5.setName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        manager5.setName("hi!");
        int int9 = manager5.getPayRate();
        manager5.setId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        template.Visitor visitor5 = new template.Visitor("faculty", 100, "nonfaculty", "faculty", false);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        template.Manager manager5 = new template.Manager("hi!", 0, "hi!", "student", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setValidated(false);
        boolean boolean11 = visitor5.isValidated();
        int int12 = visitor5.getId();
        java.lang.String str13 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        template.Student student5 = new template.Student("visitor", 0, "hi!", "manager", true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        boolean boolean12 = nonFacultyMember5.isValidated();
        boolean boolean13 = nonFacultyMember5.isValidated();
        java.lang.String str14 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getName();
        java.lang.String str14 = visitor5.getEmail();
        int int15 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass7 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        template.Manager manager5 = new template.Manager("hi!", (int) 'a', "", "faculty", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        template.Manager manager5 = new template.Manager("faculty", (int) (byte) 0, "hi!", "visitor", false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) (byte) 0, "faculty", "hi!", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        boolean boolean11 = visitor5.isValidated();
        int int12 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        int int10 = facultyMember5.getPayRate();
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (short) 100, "visitor", "student", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        template.Manager manager5 = new template.Manager("visitor", (int) (byte) -1, "visitor", "faculty", false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setName("");
        facultyMember5.setValidated(true);
        int int12 = facultyMember5.getPayRate();
        java.lang.String str13 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 0, "hi!", "", true);
        facultyMember5.setId(8);
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getUserType();
        facultyMember5.setEmail("visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        template.Student student5 = new template.Student("hi!", (int) (short) -1, "manager", "", true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        int int11 = visitor5.getPayRate();
        visitor5.setValidated(false);
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        template.Student student5 = new template.Student("hi!", (int) (short) 1, "manager", "visitor", true);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        template.Visitor visitor5 = new template.Visitor("manager", (int) 'a', "student", "nonfaculty", false);
        int int6 = visitor5.getPayRate();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        template.Manager manager5 = new template.Manager("nonfaculty", 0, "visitor", "student", false);
        manager5.setName("");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        template.Manager manager5 = new template.Manager("manager", 10, "nonfaculty", "faculty", true);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        boolean boolean8 = visitor5.isValidated();
        visitor5.setEmail("visitor");
        int int11 = visitor5.getPayRate();
        java.lang.Class<?> wildcardClass12 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) ' ', "hi!", "manager", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) 10, "", "nonfaculty", false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        boolean boolean8 = visitor5.isValidated();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getPayRate();
        manager5.setName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        template.Manager manager5 = new template.Manager("student", 0, "hi!", "manager", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 100, "nonfaculty", "nonfaculty", false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        java.lang.String str12 = nonFacultyMember5.getPassword();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        java.lang.String str14 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        int int6 = manager5.getPayRate();
        java.lang.String str7 = manager5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        int int7 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setPassword("hi!");
        int int10 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setName("nonfaculty");
        int int11 = manager5.getPayRate();
        java.lang.String str12 = manager5.getUserType();
        manager5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        template.Manager manager5 = new template.Manager("hi!", 5, "", "manager", true);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        nonFacultyMember5.setValidated(false);
        boolean boolean8 = nonFacultyMember5.isValidated();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        template.Visitor visitor5 = new template.Visitor("", (int) (byte) -1, "", "hi!", false);
        java.lang.String str6 = visitor5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        template.Visitor visitor5 = new template.Visitor("", (int) ' ', "hi!", "manager", false);
        visitor5.setValidated(true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        template.Student student5 = new template.Student("hi!", (int) (byte) 100, "faculty", "hi!", true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 0, "nonfaculty", "manager", true);
        java.lang.Class<?> wildcardClass6 = nonFacultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        template.Student student5 = new template.Student("", 35, "faculty", "faculty", true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getId();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (byte) -1, "manager", "hi!", true);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) (short) 10, "manager", "hi!", true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        template.Manager manager5 = new template.Manager("hi!", (int) 'a', "", "faculty", false);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        int int6 = manager5.getPayRate();
        java.lang.String str7 = manager5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        boolean boolean9 = nonFacultyMember5.isValidated();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setEmail("manager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        template.Visitor visitor5 = new template.Visitor("manager", 35, "visitor", "manager", false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str11 = visitor5.getUserType();
        java.lang.String str12 = visitor5.getUserType();
        int int13 = visitor5.getPayRate();
        java.lang.String str14 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        template.Visitor visitor5 = new template.Visitor("manager", 1, "manager", "nonfaculty", true);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        template.Manager manager5 = new template.Manager("faculty", (int) (short) 0, "", "", true);
        manager5.setEmail("");
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (byte) 100, "student", "", true);
        visitor5.setValidated(true);
        java.lang.String str8 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) '#', "visitor", "nonfaculty", false);
        nonFacultyMember5.setId((int) (short) 10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        template.Student student5 = new template.Student("faculty", (int) (short) -1, "faculty", "visitor", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        visitor5.setEmail("manager");
        java.lang.String str15 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        template.Manager manager5 = new template.Manager("faculty", 1, "manager", "faculty", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (byte) 100, "hi!", "", false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setEmail("visitor");
        boolean boolean10 = facultyMember5.isValidated();
        java.lang.String str11 = facultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 8, "faculty", "hi!", false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        student5.setId(0);
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        template.Visitor visitor5 = new template.Visitor("", (int) (byte) 100, "nonfaculty", "student", true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        java.lang.Class<?> wildcardClass8 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", 10, "student", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getName();
        visitor5.setEmail("nonfaculty");
        java.lang.String str13 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.String str12 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        manager5.setName("hi!");
        int int9 = manager5.getPayRate();
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 10, "", "student", true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "visitor", "hi!", false);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        template.Manager manager5 = new template.Manager("manager", 5, "hi!", "student", false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) '4', "visitor", "visitor", true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        template.Manager manager5 = new template.Manager("visitor", (-1), "nonfaculty", "nonfaculty", true);
        manager5.setValidated(false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) ' ', "nonfaculty", "visitor", true);
        facultyMember5.setValidated(false);
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getName();
        java.lang.Class<?> wildcardClass10 = facultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        boolean boolean9 = facultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        boolean boolean8 = visitor5.isValidated();
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        int int10 = visitor5.getPayRate();
        visitor5.setId((int) (byte) 100);
        java.lang.String str13 = visitor5.getUserType();
        java.lang.String str14 = visitor5.getUserType();
        visitor5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.String str10 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (short) 10, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setEmail("visitor");
        java.lang.String str9 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        template.Manager manager5 = new template.Manager("nonfaculty", 1, "visitor", "student", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        visitor5.setEmail("student");
        int int13 = visitor5.getPayRate();
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        manager5.setEmail("faculty");
        int int8 = manager5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 0, "", "", false);
        java.lang.String str6 = facultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 1, "faculty", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        java.lang.String str6 = nonFacultyMember5.getName();
        nonFacultyMember5.setId(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        boolean boolean6 = visitor5.isValidated();
        visitor5.setId((int) '#');
        visitor5.setId((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (byte) 1, "faculty", "", false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass8 = facultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setName("visitor");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        template.Student student5 = new template.Student("visitor", (int) (byte) 1, "hi!", "faculty", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        student5.setPassword("visitor");
        java.lang.String str13 = student5.getName();
        java.lang.String str14 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        template.Visitor visitor5 = new template.Visitor("faculty", 5, "hi!", "manager", false);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        int int10 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (byte) 0, "student", "", true);
        visitor5.setName("visitor");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        int int9 = manager5.getPayRate();
        int int10 = manager5.getPayRate();
        manager5.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "nonfaculty", "", false);
        java.lang.String str6 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        visitor5.setEmail("manager");
        java.lang.String str15 = visitor5.getPassword();
        visitor5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        student5.setId(0);
        java.lang.String str8 = student5.getUserType();
        student5.setName("manager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 100, "nonfaculty", "hi!", false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getUserType();
        int int11 = manager5.getPayRate();
        boolean boolean12 = manager5.isValidated();
        int int13 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        template.Visitor visitor5 = new template.Visitor("manager", 1, "manager", "nonfaculty", true);
        int int6 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 0, "student", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        template.Student student5 = new template.Student("", (int) (short) 0, "visitor", "faculty", true);
        java.lang.String str6 = student5.getName();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        template.Manager manager5 = new template.Manager("visitor", (int) '#', "student", "manager", false);
        java.lang.String str6 = manager5.getUserType();
        java.lang.String str7 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        visitor5.setId(0);
        java.lang.String str15 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        int int6 = manager5.getPayRate();
        java.lang.String str7 = manager5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 97, "visitor", "visitor", false);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        template.Manager manager5 = new template.Manager("faculty", (int) (byte) 0, "nonfaculty", "", false);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        int int6 = student5.getPayRate();
        student5.setPassword("student");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (short) 10, "student", "student", false);
        java.lang.Class<?> wildcardClass6 = facultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", 15, "visitor", "nonfaculty", true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isValidated();
        int int9 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", 8, "student", "", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setValidated(true);
        java.lang.String str10 = facultyMember5.getUserType();
        int int11 = facultyMember5.getPayRate();
        facultyMember5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) 'a', "", "student", true);
        facultyMember5.setEmail("faculty");
        java.lang.String str8 = facultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        java.lang.String str2 = manager0.getEmail();
        int int3 = manager0.getPayRate();
        java.lang.String str4 = manager0.getName();
        manager0.setPassword("manager");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", 35, "hi!", "faculty", false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "student", true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (-1), "nonfaculty", "student", true);
        java.lang.Class<?> wildcardClass6 = nonFacultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        template.Manager manager5 = new template.Manager("visitor", (int) (byte) 100, "manager", "student", false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isValidated();
        student5.setName("manager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        template.Manager manager5 = new template.Manager("hi!", 1, "hi!", "", false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        template.Visitor visitor5 = new template.Visitor("", 100, "student", "student", false);
        java.lang.String str6 = visitor5.getEmail();
        visitor5.setPassword("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 15, "faculty", "faculty", true);
        nonFacultyMember5.setName("faculty");
        int int8 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", 5, "manager", "visitor", true);
        nonFacultyMember5.setPassword("student");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        template.Student student5 = new template.Student("nonfaculty", 10, "visitor", "visitor", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        template.Visitor visitor5 = new template.Visitor("hi!", 97, "hi!", "nonfaculty", false);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        template.Manager manager5 = new template.Manager("student", 10, "hi!", "visitor", true);
        manager5.setName("student");
        manager5.setId((int) (byte) 1);
        manager5.setValidated(true);
        java.lang.Class<?> wildcardClass12 = manager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        java.lang.String str10 = facultyMember5.getUserType();
        int int11 = facultyMember5.getPayRate();
        java.lang.String str12 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setName("");
        manager5.setId(5);
        java.lang.String str14 = manager5.getUserType();
        java.lang.String str15 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "manager" + "'", str14, "manager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "manager" + "'", str15, "manager");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getUserType();
        manager5.setPassword("student");
        manager5.setEmail("nonfaculty");
        java.lang.String str11 = manager5.getUserType();
        boolean boolean12 = manager5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "manager" + "'", str11, "manager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        java.lang.String str10 = manager5.getUserType();
        boolean boolean11 = manager5.isValidated();
        java.lang.String str12 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        template.Student student5 = new template.Student("faculty", (int) '#', "", "faculty", true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isValidated();
        boolean boolean11 = student5.isValidated();
        int int12 = student5.getPayRate();
        student5.setId((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 97, "", "manager", false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        int int10 = nonFacultyMember5.getPayRate();
        int int11 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", (-1), "manager", "manager", true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (byte) 100, "student", "", true);
        visitor5.setValidated(true);
        visitor5.setId((-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        visitor5.setPassword("");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        student5.setName("");
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        template.Manager manager5 = new template.Manager("manager", (int) (short) 100, "hi!", "faculty", true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) -1, "", "hi!", false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (byte) 1, "", "hi!", true);
        java.lang.String str6 = nonFacultyMember5.getPassword();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        template.Student student5 = new template.Student("faculty", (int) (short) 10, "student", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        java.lang.String str12 = manager5.getName();
        java.lang.String str13 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getId();
        java.lang.String str10 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        int int3 = manager0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        template.Manager manager5 = new template.Manager("visitor", (int) '#', "nonfaculty", "", true);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        int int6 = student5.getPayRate();
        student5.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        template.Student student5 = new template.Student("", (int) (byte) 1, "faculty", "faculty", false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        template.Visitor visitor5 = new template.Visitor("faculty", 10, "faculty", "nonfaculty", false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        template.Manager manager5 = new template.Manager("student", 1, "student", "nonfaculty", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        nonFacultyMember5.setId(5);
        java.lang.String str14 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        int int11 = student5.getPayRate();
        java.lang.String str12 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setId((-1));
        student5.setName("hi!");
        boolean boolean12 = student5.isValidated();
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        int int14 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str17 = visitor5.getUserType();
        java.lang.String str18 = visitor5.getUserType();
        int int19 = visitor5.getPayRate();
        java.lang.String str20 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        template.Manager manager5 = new template.Manager("nonfaculty", 0, "manager", "", false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        facultyMember5.setId((int) '4');
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getName();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", 0, "faculty", "faculty", false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 0, "manager", "nonfaculty", false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getEmail();
        java.lang.String str10 = facultyMember5.getPassword();
        int int11 = facultyMember5.getId();
        java.lang.String str12 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getUserType();
        int int13 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        template.Student student5 = new template.Student("", (int) (byte) -1, "visitor", "nonfaculty", true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (-1), "", "faculty", true);
        java.lang.String str6 = nonFacultyMember5.getName();
        int int7 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        template.Visitor visitor5 = new template.Visitor("faculty", 10, "hi!", "", false);
        int int6 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        int int11 = nonFacultyMember5.getId();
        int int12 = nonFacultyMember5.getPayRate();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        java.lang.String str14 = nonFacultyMember5.getName();
        java.lang.String str15 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        template.Manager manager5 = new template.Manager("visitor", (int) '#', "student", "manager", false);
        manager5.setId(15);
        manager5.setId(8);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setName("visitor");
        boolean boolean13 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setPassword("visitor");
        int int16 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (short) 0, "manager", "nonfaculty", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        template.Manager manager5 = new template.Manager("hi!", (int) 'a', "", "faculty", false);
        int int6 = manager5.getPayRate();
        java.lang.Class<?> wildcardClass7 = manager5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setPassword("hi!");
        java.lang.String str13 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        boolean boolean9 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setPassword("");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getUserType();
        java.lang.String str7 = manager5.getUserType();
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (short) 10, "visitor", "hi!", true);
        int int6 = visitor5.getPayRate();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        template.Student student5 = new template.Student("visitor", 8, "student", "nonfaculty", true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        int int11 = nonFacultyMember5.getId();
        nonFacultyMember5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setName("visitor");
        java.lang.String str13 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "manager", "nonfaculty", false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        template.Visitor visitor5 = new template.Visitor("", (int) ' ', "hi!", "", false);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        template.Manager manager5 = new template.Manager("visitor", (int) ' ', "manager", "manager", false);
        int int6 = manager5.getPayRate();
        manager5.setEmail("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        template.Manager manager5 = new template.Manager("student", 0, "hi!", "manager", false);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        template.Student student5 = new template.Student("hi!", (int) (byte) 100, "hi!", "hi!", false);
        student5.setId((-1));
        int int8 = student5.getPayRate();
        student5.setId(0);
        int int11 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        template.Student student5 = new template.Student("nonfaculty", (int) (byte) 0, "visitor", "student", true);
        student5.setName("nonfaculty");
        student5.setPassword("nonfaculty");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getPayRate();
        manager5.setEmail("");
        int int11 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        facultyMember5.setEmail("visitor");
        java.lang.String str12 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) '#', "student", "", true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        template.Manager manager5 = new template.Manager("faculty", 1, "manager", "faculty", false);
        manager5.setName("");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 97, "manager", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        java.lang.String str10 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 0, "manager", "hi!", true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        template.Manager manager5 = new template.Manager("student", 15, "manager", "manager", false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setEmail("visitor");
        manager5.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        visitor5.setEmail("student");
        java.lang.String str15 = visitor5.getUserType();
        int int16 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        template.Visitor visitor5 = new template.Visitor("visitor", 1, "", "", false);
        boolean boolean6 = visitor5.isValidated();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        java.lang.String str9 = visitor5.getUserType();
        boolean boolean10 = visitor5.isValidated();
        int int11 = visitor5.getPayRate();
        int int12 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (short) 100, "visitor", "", false);
        manager5.setEmail("");
        java.lang.String str8 = manager5.getPassword();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getUserType();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getEmail();
        java.lang.String str11 = visitor5.getUserType();
        visitor5.setName("nonfaculty");
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 97, "faculty", "nonfaculty", false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        template.Student student5 = new template.Student("manager", 8, "nonfaculty", "manager", false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isValidated();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (byte) 10, "faculty", "manager", true);
        java.lang.String str6 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (byte) 0, "student", "", true);
        boolean boolean6 = visitor5.isValidated();
        java.lang.String str7 = visitor5.getUserType();
        int int8 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        template.Manager manager5 = new template.Manager("visitor", (int) ' ', "manager", "manager", false);
        java.lang.String str6 = manager5.getName();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getName();
        facultyMember5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        template.Student student5 = new template.Student("manager", (int) (short) -1, "student", "", true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "hi!", "visitor", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        int int8 = nonFacultyMember5.getPayRate();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        template.Manager manager5 = new template.Manager("student", (int) 'a', "visitor", "", false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        template.Student student5 = new template.Student("visitor", 15, "manager", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getName();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        template.Manager manager5 = new template.Manager("visitor", 15, "nonfaculty", "hi!", true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getName();
        int int11 = visitor5.getId();
        java.lang.String str12 = visitor5.getName();
        visitor5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        template.Visitor visitor5 = new template.Visitor("manager", 35, "manager", "nonfaculty", true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        java.lang.String str10 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getPayRate();
        student5.setId(0);
        int int9 = student5.getPayRate();
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 5, "visitor", "hi!", true);
        nonFacultyMember5.setValidated(false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("");
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 8, "faculty", "faculty", false);
        visitor5.setEmail("visitor");
        java.lang.String str8 = visitor5.getEmail();
        int int9 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        template.Manager manager5 = new template.Manager("", (int) (short) 10, "", "visitor", true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setName("student");
        nonFacultyMember5.setPassword("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getPayRate();
        student5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getId();
        java.lang.String str3 = manager0.getEmail();
        java.lang.String str4 = manager0.getUserType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "manager" + "'", str4, "manager");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (-1), "", "faculty", true);
        nonFacultyMember5.setName("faculty");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (byte) 100, "hi!", "hi!", false);
        nonFacultyMember5.setName("student");
        nonFacultyMember5.setPassword("student");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        int int8 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        template.Manager manager5 = new template.Manager("nonfaculty", 1, "visitor", "student", false);
        manager5.setEmail("visitor");
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 10, "", "hi!", true);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setValidated(true);
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        template.Student student5 = new template.Student("hi!", (int) (byte) 0, "hi!", "student", true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) ' ', "", "visitor", false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setName("hi!");
        java.lang.String str16 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 1, "nonfaculty", "nonfaculty", true);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        facultyMember5.setId(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        template.Manager manager5 = new template.Manager("faculty", 1, "manager", "faculty", false);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        facultyMember5.setId(1);
        int int11 = facultyMember5.getPayRate();
        boolean boolean12 = facultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isValidated();
        boolean boolean8 = student5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        int int9 = student5.getPayRate();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 5, "", "manager", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) -1, "faculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        facultyMember5.setId(5);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        int int9 = student5.getId();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        template.Manager manager5 = new template.Manager("faculty", 10, "student", "manager", true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (byte) 0, "nonfaculty", "visitor", false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        template.Student student5 = new template.Student("faculty", (int) (short) 10, "student", "manager", true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        template.Manager manager5 = new template.Manager("", 1, "manager", "manager", true);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        int int10 = student5.getId();
        java.lang.String str11 = student5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        java.lang.String str14 = visitor5.getUserType();
        java.lang.String str15 = visitor5.getUserType();
        java.lang.String str16 = visitor5.getEmail();
        visitor5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        boolean boolean9 = nonFacultyMember5.isValidated();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("student");
        java.lang.String str13 = nonFacultyMember5.getName();
        int int14 = nonFacultyMember5.getPayRate();
        int int15 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        int int9 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("student");
        int int12 = nonFacultyMember5.getPayRate();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (byte) 100, "faculty", "visitor", false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getName();
        int int11 = visitor5.getPayRate();
        visitor5.setPassword("manager");
        visitor5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        template.Student student5 = new template.Student("hi!", 15, "nonfaculty", "nonfaculty", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        int int12 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        boolean boolean12 = manager5.isValidated();
        java.lang.String str13 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        boolean boolean3 = manager0.isValidated();
        java.lang.String str4 = manager0.getUserType();
        java.lang.String str5 = manager0.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "manager" + "'", str4, "manager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "manager" + "'", str5, "manager");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        java.lang.String str14 = nonFacultyMember5.getUserType();
        java.lang.String str15 = nonFacultyMember5.getUserType();
        java.lang.String str16 = nonFacultyMember5.getUserType();
        int int17 = nonFacultyMember5.getPayRate();
        boolean boolean18 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        boolean boolean12 = nonFacultyMember5.isValidated();
        int int13 = nonFacultyMember5.getPayRate();
        int int14 = nonFacultyMember5.getId();
        java.lang.String str15 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (short) -1, "", "visitor", true);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (-1), "nonfaculty", "student", false);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass8 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        template.Manager manager5 = new template.Manager("hi!", (int) (short) 0, "manager", "visitor", false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        int int7 = student5.getId();
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        int int10 = student5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getPayRate();
        student5.setEmail("manager");
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        student5.setId(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        int int14 = visitor5.getPayRate();
        visitor5.setEmail("faculty");
        int int17 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        template.Manager manager5 = new template.Manager("student", 10, "hi!", "visitor", true);
        int int6 = manager5.getPayRate();
        java.lang.String str7 = manager5.getPassword();
        java.lang.String str8 = manager5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        template.Manager manager5 = new template.Manager("faculty", 5, "nonfaculty", "hi!", false);
        java.lang.String str6 = manager5.getUserType();
        java.lang.String str7 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getName();
        java.lang.String str14 = visitor5.getEmail();
        int int15 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        template.Manager manager5 = new template.Manager("faculty", (int) (short) 10, "", "student", true);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        boolean boolean8 = visitor5.isValidated();
        int int9 = visitor5.getPayRate();
        java.lang.String str10 = visitor5.getEmail();
        visitor5.setId((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        int int9 = visitor5.getPayRate();
        visitor5.setPassword("");
        java.lang.String str12 = visitor5.getUserType();
        java.lang.String str13 = visitor5.getUserType();
        java.lang.String str14 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        student5.setName("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        template.Student student5 = new template.Student("student", 97, "student", "hi!", false);
        boolean boolean6 = student5.isValidated();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        int int9 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("student");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        boolean boolean13 = nonFacultyMember5.isValidated();
        int int14 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (-1), "nonfaculty", "student", false);
        visitor5.setId(0);
        java.lang.String str8 = visitor5.getUserType();
        visitor5.setName("student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        visitor5.setEmail("manager");
        java.lang.String str15 = visitor5.getPassword();
        int int16 = visitor5.getPayRate();
        java.lang.String str17 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        nonFacultyMember5.setValidated(false);
        boolean boolean8 = nonFacultyMember5.isValidated();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getUserType();
        java.lang.String str10 = facultyMember5.getUserType();
        facultyMember5.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (short) 10, "faculty", "hi!", false);
        java.lang.String str6 = nonFacultyMember5.getName();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (-1), "nonfaculty", "student", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setPassword("visitor");
        java.lang.Class<?> wildcardClass10 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (short) 10, "visitor", "nonfaculty", false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 35, "", "manager", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        template.Visitor visitor5 = new template.Visitor("manager", 1, "manager", "nonfaculty", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        visitor5.setValidated(true);
        java.lang.String str12 = visitor5.getUserType();
        int int13 = visitor5.getPayRate();
        visitor5.setValidated(true);
        java.lang.String str16 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 0, "hi!", "", true);
        facultyMember5.setId(8);
        java.lang.String str8 = facultyMember5.getUserType();
        facultyMember5.setEmail("visitor");
        facultyMember5.setId(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        template.Manager manager5 = new template.Manager("manager", 97, "hi!", "visitor", true);
        manager5.setId((int) (byte) 100);
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        boolean boolean6 = visitor5.isValidated();
        visitor5.setId((int) '#');
        java.lang.String str9 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        boolean boolean2 = manager0.isValidated();
        java.lang.String str3 = manager0.getPassword();
        java.lang.String str4 = manager0.getUserType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "manager" + "'", str4, "manager");
    }
}

