package randoop.randoop_tests_template;
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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        int int8 = nonFacultyMember5.getPayRate();
        int int9 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.Class<?> wildcardClass7 = facultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) ' ', "visitor", "", false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 8, "visitor", "nonfaculty", true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setName("visitor");
        java.lang.Class<?> wildcardClass13 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (byte) 10, "visitor", "faculty", false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getPayRate();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", (int) (byte) 1, "visitor", "faculty", false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        java.lang.String str9 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        java.lang.Class<?> wildcardClass6 = nonFacultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        template.Student student5 = new template.Student("nonfaculty", (int) (byte) 0, "visitor", "student", true);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setPassword("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        template.Visitor visitor5 = new template.Visitor("student", (int) ' ', "manager", "hi!", true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        java.lang.Class<?> wildcardClass11 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getEmail();
        java.lang.String str7 = facultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        boolean boolean9 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setEmail("visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        facultyMember5.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (short) -1, "faculty", "visitor", false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) (byte) 0, "faculty", "manager", false);
        int int6 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.Class<?> wildcardClass8 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        java.lang.String str9 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        manager5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        student5.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        template.Manager manager5 = new template.Manager("visitor", 1, "hi!", "student", true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        java.lang.String str12 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) (byte) 0, "hi!", "visitor", true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        manager5.setEmail("faculty");
        java.lang.String str8 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        visitor5.setName("");
        java.lang.Class<?> wildcardClass13 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (byte) 100, "", "manager", true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        boolean boolean8 = nonFacultyMember5.isValidated();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        int int10 = facultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass11 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 97, "", "student", false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        template.Manager manager5 = new template.Manager("", (int) (byte) 10, "hi!", "faculty", true);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setEmail("manager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        template.Manager manager5 = new template.Manager("manager", (int) ' ', "", "student", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        java.lang.Class<?> wildcardClass6 = manager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        template.Manager manager5 = new template.Manager("visitor", 10, "hi!", "hi!", false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        boolean boolean11 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass14 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setValidated(false);
        java.lang.String str10 = facultyMember5.getPassword();
        java.lang.Class<?> wildcardClass11 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        template.Manager manager5 = new template.Manager("student", (int) (short) 0, "visitor", "faculty", false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        int int6 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        java.lang.String str5 = manager0.getPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        int int9 = visitor5.getPayRate();
        boolean boolean10 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        java.lang.String str10 = nonFacultyMember5.getPassword();
        int int11 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "hi!", "visitor", false);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("hi!");
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(97);
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        student5.setPassword("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        template.Visitor visitor5 = new template.Visitor("student", 100, "student", "visitor", true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        int int10 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getEmail();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        int int6 = student5.getPayRate();
        student5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        java.lang.Class<?> wildcardClass9 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setId((int) (short) 1);
        int int10 = facultyMember5.getPayRate();
        int int11 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        template.Visitor visitor5 = new template.Visitor("student", (-1), "hi!", "hi!", true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        manager5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        template.Manager manager5 = new template.Manager("hi!", (int) (short) 10, "faculty", "", false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("");
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setValidated(false);
        java.lang.String str10 = facultyMember5.getEmail();
        java.lang.String str11 = facultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (-1), "nonfaculty", "nonfaculty", false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        int int9 = manager5.getPayRate();
        java.lang.Class<?> wildcardClass10 = manager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass9 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 0, "manager", "nonfaculty", false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("hi!");
        int int9 = student5.getId();
        student5.setName("visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        visitor5.setPassword("manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getUserType();
        student5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        nonFacultyMember5.setPassword("visitor");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        nonFacultyMember5.setId((int) (byte) -1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        java.lang.Class<?> wildcardClass4 = manager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        nonFacultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        template.Manager manager5 = new template.Manager("", (int) (byte) 100, "nonfaculty", "manager", false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        template.Manager manager5 = new template.Manager("student", (-1), "hi!", "faculty", false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        student5.setPassword("faculty");
        student5.setId(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) -1, "visitor", "hi!", true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("manager");
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setName("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 5, "faculty", "hi!", true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 0, "hi!", "student", true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        nonFacultyMember5.setPassword("faculty");
        boolean boolean12 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        java.lang.Class<?> wildcardClass8 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getId();
        java.lang.String str8 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        template.Manager manager5 = new template.Manager("student", (int) '#', "hi!", "student", true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) (byte) -1, "visitor", "hi!", true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        template.Visitor visitor5 = new template.Visitor("", 1, "nonfaculty", "faculty", false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getUserType();
        visitor5.setEmail("nonfaculty");
        int int13 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        template.Visitor visitor5 = new template.Visitor("student", (int) (byte) 100, "nonfaculty", "nonfaculty", true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        java.lang.Class<?> wildcardClass7 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 0, "hi!", "faculty", false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        template.Student student5 = new template.Student("manager", 0, "student", "nonfaculty", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) '4', "visitor", "manager", true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setId(8);
        java.lang.String str10 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getEmail();
        java.lang.String str11 = visitor5.getUserType();
        java.lang.Class<?> wildcardClass12 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        template.Student student5 = new template.Student("manager", (int) 'a', "nonfaculty", "", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        student5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) '#', "visitor", "visitor", false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "hi!", "visitor", false);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "nonfaculty", "", false);
        java.lang.Class<?> wildcardClass6 = manager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass10 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (short) -1, "manager", "visitor", false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (short) 10, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str13 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        int int8 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        template.Student student5 = new template.Student("nonfaculty", (int) (byte) 0, "visitor", "student", true);
        student5.setName("nonfaculty");
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        template.Student student5 = new template.Student("hi!", (int) (byte) -1, "hi!", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        template.Visitor visitor5 = new template.Visitor("hi!", 15, "student", "", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        int int9 = student5.getPayRate();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getEmail();
        int int10 = manager5.getPayRate();
        int int11 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        int int9 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("student");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getName();
        visitor5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        template.Manager manager5 = new template.Manager("", 5, "manager", "manager", false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        manager5.setValidated(true);
        manager5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", 1, "", "", false);
        java.lang.String str6 = nonFacultyMember5.getPassword();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        java.lang.String str8 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        java.lang.Class<?> wildcardClass9 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        manager0.setValidated(true);
        int int7 = manager0.getId();
        int int8 = manager0.getPayRate();
        java.lang.Class<?> wildcardClass9 = manager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getName();
        boolean boolean8 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        template.Manager manager5 = new template.Manager("faculty", (int) (short) -1, "manager", "faculty", true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (byte) 10, "faculty", "manager", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 0, "", "", false);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        int int10 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getId();
        student5.setId(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        boolean boolean7 = facultyMember5.isValidated();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        boolean boolean12 = nonFacultyMember5.isValidated();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        int int14 = nonFacultyMember5.getPayRate();
        boolean boolean15 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setName("manager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        boolean boolean9 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        boolean boolean9 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setEmail("manager");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setId(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        int int11 = nonFacultyMember5.getId();
        java.lang.String str12 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        int int10 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        java.lang.String str3 = manager0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        java.lang.String str12 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "", "faculty", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        template.Visitor visitor5 = new template.Visitor("visitor", (-1), "nonfaculty", "faculty", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        template.Manager manager5 = new template.Manager("visitor", (int) (short) 0, "manager", "visitor", true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getEmail();
        int int10 = manager5.getPayRate();
        manager5.setEmail("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        boolean boolean9 = nonFacultyMember5.isValidated();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("student");
        java.lang.String str13 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getName();
        java.lang.Class<?> wildcardClass10 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        facultyMember5.setId(1);
        facultyMember5.setPassword("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 0, "hi!", "", true);
        facultyMember5.setId(8);
        java.lang.String str8 = facultyMember5.getUserType();
        facultyMember5.setEmail("visitor");
        int int11 = facultyMember5.getPayRate();
        facultyMember5.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getUserType();
        facultyMember5.setPassword("visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (byte) -1, "", "hi!", false);
        facultyMember5.setPassword("manager");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        boolean boolean7 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", (int) 'a', "student", "manager", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass11 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        template.Student student5 = new template.Student("student", (int) (short) 1, "manager", "nonfaculty", false);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        template.Manager manager5 = new template.Manager("", (int) (short) 1, "hi!", "student", false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getEmail();
        manager5.setId(5);
        java.lang.String str12 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        template.Visitor visitor5 = new template.Visitor("", (int) (short) 10, "faculty", "manager", false);
        visitor5.setId((int) (short) 10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        template.Student student5 = new template.Student("student", (-1), "faculty", "student", true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        manager5.setEmail("faculty");
        int int8 = manager5.getPayRate();
        boolean boolean9 = manager5.isValidated();
        java.lang.Class<?> wildcardClass10 = manager5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        int int11 = nonFacultyMember5.getId();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) '#', "student", "faculty", true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        visitor5.setName("manager");
        java.lang.String str8 = visitor5.getName();
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 100, "manager", "faculty", false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", 8, "student", "", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        template.Visitor visitor5 = new template.Visitor("faculty", 1, "manager", "visitor", true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "visitor", "nonfaculty", true);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        manager5.setValidated(true);
        int int8 = manager5.getPayRate();
        java.lang.String str9 = manager5.getEmail();
        java.lang.String str10 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) '#', "visitor", "hi!", false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "nonfaculty", "visitor", true);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        template.Student student5 = new template.Student("manager", (int) (short) 1, "", "manager", false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getId();
        visitor5.setId(1);
        visitor5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        manager0.setValidated(true);
        int int7 = manager0.getId();
        java.lang.String str8 = manager0.getEmail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) -1, "visitor", "nonfaculty", true);
        java.lang.String str6 = visitor5.getUserType();
        visitor5.setName("manager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 35, "hi!", "visitor", false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getName();
        java.lang.Class<?> wildcardClass7 = facultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        template.Visitor visitor5 = new template.Visitor("manager", (int) ' ', "visitor", "faculty", true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        template.Visitor visitor5 = new template.Visitor("student", 0, "faculty", "", true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        template.Visitor visitor5 = new template.Visitor("", (int) (byte) 1, "faculty", "faculty", false);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        boolean boolean9 = facultyMember5.isValidated();
        facultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        template.Student student5 = new template.Student("hi!", 15, "student", "", true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        manager5.setName("manager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getEmail();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setValidated(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (byte) 1, "nonfaculty", "manager", false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        template.Student student5 = new template.Student("manager", 97, "", "hi!", true);
        int int6 = student5.getId();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) 100, "faculty", "faculty", false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        template.Manager manager5 = new template.Manager("", 10, "nonfaculty", "visitor", true);
        java.lang.String str6 = manager5.getUserType();
        java.lang.String str7 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "", "faculty", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getName();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        template.Visitor visitor5 = new template.Visitor("visitor", (-1), "nonfaculty", "faculty", true);
        visitor5.setValidated(true);
        java.lang.Class<?> wildcardClass8 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        template.Student student5 = new template.Student("", 100, "nonfaculty", "student", true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        visitor5.setEmail("student");
        java.lang.String str13 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", 0, "nonfaculty", "student", true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (-1), "", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getPassword();
        int int8 = facultyMember5.getPayRate();
        boolean boolean9 = facultyMember5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) 'a', "manager", "visitor", false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        int int4 = manager0.getPayRate();
        manager0.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setValidated(true);
        java.lang.String str10 = facultyMember5.getUserType();
        int int11 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        java.lang.Class<?> wildcardClass8 = nonFacultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 5, "visitor", "nonfaculty", false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) '4', "", "student", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        manager0.setName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        java.lang.String str6 = student5.getUserType();
        student5.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (byte) 100, "", "", true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) (short) -1, "", "student", true);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setId(15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        boolean boolean11 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        student5.setEmail("visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "manager", "faculty", false);
        manager5.setName("hi!");
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getUserType();
        int int12 = student5.getPayRate();
        student5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.String str10 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        java.lang.String str8 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        student5.setName("");
        student5.setName("visitor");
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        template.Visitor visitor5 = new template.Visitor("visitor", (-1), "nonfaculty", "faculty", true);
        visitor5.setValidated(true);
        java.lang.String str8 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        template.Student student5 = new template.Student("faculty", 0, "nonfaculty", "visitor", false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        template.Manager manager5 = new template.Manager("nonfaculty", 1, "nonfaculty", "", false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        boolean boolean12 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setName("visitor");
        int int13 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        template.Student student5 = new template.Student("faculty", 8, "", "", false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 5, "faculty", "", true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        manager5.setValidated(true);
        int int8 = manager5.getPayRate();
        manager5.setName("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) ' ', "visitor", "", false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getId();
        facultyMember5.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        template.Student student5 = new template.Student("faculty", (int) (short) 100, "", "nonfaculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        template.Student student5 = new template.Student("manager", 100, "", "visitor", false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        template.Visitor visitor5 = new template.Visitor("", 100, "student", "student", false);
        visitor5.setValidated(true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        manager0.setValidated(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        boolean boolean6 = facultyMember5.isValidated();
        int int7 = facultyMember5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) '4', "faculty", "faculty", false);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setId((int) (byte) 10);
        int int8 = student5.getPayRate();
        student5.setName("hi!");
        int int11 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", 100, "", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        boolean boolean11 = visitor5.isValidated();
        boolean boolean12 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str13 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "manager", "faculty", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        java.lang.String str9 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        template.Manager manager5 = new template.Manager("student", 35, "nonfaculty", "faculty", true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) -1, "", "hi!", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", (int) (short) 0, "", "manager", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("");
        boolean boolean11 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setPassword("visitor");
        java.lang.String str14 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (short) 100, "manager", "hi!", true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        template.Student student5 = new template.Student("hi!", (int) (byte) 10, "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "manager", "", false);
        java.lang.String str6 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        int int10 = nonFacultyMember5.getId();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "", "", false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setValidated(false);
        int int10 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        template.Manager manager5 = new template.Manager("manager", (int) (short) 10, "faculty", "", true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 8, "nonfaculty", "visitor", true);
        facultyMember5.setEmail("nonfaculty");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", 97, "", "student", false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        template.Visitor visitor5 = new template.Visitor("", (int) (short) 10, "faculty", "faculty", true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 5, "faculty", "hi!", true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setPassword("nonfaculty");
        nonFacultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        visitor5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        java.lang.String str6 = nonFacultyMember5.getPassword();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        manager5.setEmail("student");
        manager5.setValidated(true);
        java.lang.String str10 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setName("nonfaculty");
        boolean boolean11 = manager5.isValidated();
        java.lang.String str12 = manager5.getUserType();
        java.lang.String str13 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getId();
        manager5.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 35, "student", "", false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        template.Student student5 = new template.Student("student", (int) (short) 1, "manager", "nonfaculty", false);
        student5.setValidated(false);
        student5.setEmail("faculty");
        int int10 = student5.getPayRate();
        student5.setId(1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", 0, "hi!", "hi!", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", 35, "student", "faculty", true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        java.lang.String str6 = manager5.getUserType();
        int int7 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        java.lang.String str10 = facultyMember5.getUserType();
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        int int6 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (byte) 0, "visitor", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getUserType();
        int int11 = manager5.getId();
        java.lang.String str12 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setId((-1));
        student5.setName("hi!");
        java.lang.String str12 = student5.getPassword();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        template.Visitor visitor5 = new template.Visitor("", 0, "", "visitor", false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        template.Visitor visitor5 = new template.Visitor("", 100, "student", "student", false);
        java.lang.String str6 = visitor5.getEmail();
        boolean boolean7 = visitor5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        boolean boolean8 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setValidated(false);
        java.lang.String str11 = nonFacultyMember5.getUserType();
        int int12 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) '4', "", "manager", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        manager5.setPassword("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 10, "manager", "faculty", false);
        manager5.setName("hi!");
        java.lang.String str8 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        template.Student student5 = new template.Student("student", (-1), "nonfaculty", "", true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setName("");
        java.lang.Class<?> wildcardClass12 = manager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        int int12 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        facultyMember5.setId((int) (byte) 1);
        java.lang.String str12 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        visitor5.setId(15);
        java.lang.String str15 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        template.Student student5 = new template.Student("hi!", (int) (byte) 100, "hi!", "hi!", false);
        student5.setId((-1));
        int int8 = student5.getPayRate();
        int int9 = student5.getId();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        visitor5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", 5, "manager", "visitor", true);
        java.lang.Class<?> wildcardClass6 = nonFacultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        boolean boolean8 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        template.Student student5 = new template.Student("", 0, "manager", "visitor", false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setPassword("hi!");
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        student5.setEmail("manager");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        int int9 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 0, "hi!", "", true);
        facultyMember5.setId(8);
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) '#', "manager", "visitor", true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        student5.setPassword("visitor");
        student5.setPassword("hi!");
        boolean boolean15 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        int int3 = manager0.getPayRate();
        boolean boolean4 = manager0.isValidated();
        manager0.setValidated(true);
        int int7 = manager0.getId();
        int int8 = manager0.getPayRate();
        int int9 = manager0.getPayRate();
        int int10 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) -1, "visitor", "nonfaculty", true);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 100, "visitor", "student", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        nonFacultyMember5.setEmail("manager");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setPassword("hi!");
        int int12 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        visitor5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (short) -1, "", "faculty", true);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (short) 0, "nonfaculty", "student", true);
        nonFacultyMember5.setId((int) (short) 10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        visitor5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getName();
        int int11 = visitor5.getId();
        java.lang.String str12 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        template.Student student5 = new template.Student("hi!", (int) (short) 100, "visitor", "faculty", false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 100, "manager", "faculty", true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        manager5.setName("hi!");
        int int14 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 0, "hi!", "", true);
        facultyMember5.setValidated(false);
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", 8, "hi!", "visitor", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "student", "manager", true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        java.lang.Class<?> wildcardClass9 = manager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str10 = visitor5.getUserType();
        java.lang.String str11 = visitor5.getUserType();
        java.lang.String str12 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        template.Student student5 = new template.Student("manager", 15, "student", "nonfaculty", true);
        student5.setName("visitor");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (byte) 100, "nonfaculty", "manager", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        java.lang.String str10 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getUserType();
        java.lang.String str13 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        template.Student student5 = new template.Student("manager", 97, "", "hi!", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (short) -1, "manager", "hi!", true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        template.Student student5 = new template.Student("manager", 97, "nonfaculty", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setName("visitor");
        java.lang.String str13 = nonFacultyMember5.getUserType();
        int int14 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        boolean boolean3 = manager0.isValidated();
        int int4 = manager0.getId();
        manager0.setName("visitor");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        template.Manager manager5 = new template.Manager("faculty", 5, "nonfaculty", "hi!", false);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isValidated();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        template.Visitor visitor5 = new template.Visitor("hi!", 8, "nonfaculty", "manager", true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        manager5.setEmail("faculty");
        manager5.setId((int) (short) 100);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getUserType();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        template.Manager manager5 = new template.Manager("visitor", (int) (short) 10, "student", "", true);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 100, "nonfaculty", "nonfaculty", false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getId();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        template.Manager manager5 = new template.Manager("visitor", (int) ' ', "manager", "manager", false);
        manager5.setId((int) (short) 100);
        manager5.setId((int) (byte) 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("manager");
        nonFacultyMember5.setValidated(true);
        int int16 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        template.Student student5 = new template.Student("hi!", 0, "", "", true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getId();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        template.Manager manager5 = new template.Manager("visitor", 100, "faculty", "faculty", false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        boolean boolean9 = manager5.isValidated();
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (byte) 10, "faculty", "visitor", true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getUserType();
        facultyMember5.setValidated(false);
        java.lang.String str12 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getUserType();
        int int12 = student5.getPayRate();
        java.lang.String str13 = student5.getUserType();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", 1, "visitor", "hi!", false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 0, "", "", false);
        java.lang.Class<?> wildcardClass6 = facultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) -1, "", "hi!", true);
        visitor5.setName("manager");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        template.Student student5 = new template.Student("manager", 5, "visitor", "manager", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", 1, "student", "", false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getPayRate();
        student5.setId(0);
        int int9 = student5.getPayRate();
        student5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setEmail("student");
        int int11 = manager5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        java.lang.String str12 = nonFacultyMember5.getUserType();
        int int13 = nonFacultyMember5.getPayRate();
        int int14 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        template.Manager manager5 = new template.Manager("", (int) (short) 1, "", "manager", true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 100, "visitor", "hi!", false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        template.Manager manager5 = new template.Manager("hi!", (int) (short) 0, "faculty", "manager", false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "nonfaculty", "visitor", false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        boolean boolean11 = visitor5.isValidated();
        int int12 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        template.Student student5 = new template.Student("", (int) (short) 0, "visitor", "faculty", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        java.lang.String str2 = manager0.getEmail();
        int int3 = manager0.getPayRate();
        manager0.setValidated(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        int int10 = nonFacultyMember5.getPayRate();
        boolean boolean11 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        template.Student student5 = new template.Student("nonfaculty", (int) '#', "", "student", true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 0, "hi!", "faculty", false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        template.Visitor visitor5 = new template.Visitor("visitor", (int) (byte) 1, "", "visitor", true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 8, "faculty", "faculty", false);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        template.Manager manager5 = new template.Manager("", (int) (byte) 10, "hi!", "faculty", true);
        manager5.setEmail("manager");
        int int8 = manager5.getPayRate();
        java.lang.String str9 = manager5.getUserType();
        java.lang.String str10 = manager5.getPassword();
        int int11 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (short) -1, "nonfaculty", "hi!", true);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("student", (int) (short) 0, "hi!", "visitor", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setEmail("visitor");
        int int10 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getUserType();
        visitor5.setEmail("nonfaculty");
        int int13 = visitor5.getId();
        visitor5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (byte) -1, "student", "nonfaculty", true);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        template.Manager manager5 = new template.Manager("visitor", (int) (byte) 1, "visitor", "hi!", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.Class<?> wildcardClass7 = manager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        java.lang.String str13 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        manager0.setEmail("nonfaculty");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getPayRate();
        student5.setId(0);
        student5.setValidated(false);
        int int11 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 10, "", "hi!", true);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setId(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 15, "", "student", false);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 10, "visitor", "hi!", false);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (-1), "hi!", "", false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        template.Manager manager5 = new template.Manager("", (int) (byte) 10, "hi!", "faculty", true);
        manager5.setEmail("manager");
        int int8 = manager5.getPayRate();
        manager5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        template.Student student5 = new template.Student("visitor", (-1), "faculty", "nonfaculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        manager5.setEmail("faculty");
        int int8 = manager5.getPayRate();
        boolean boolean9 = manager5.isValidated();
        manager5.setName("visitor");
        java.lang.String str12 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("hi!");
        int int9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        template.Student student5 = new template.Student("", (int) 'a', "manager", "manager", false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "nonfaculty", "", true);
        int int6 = student5.getId();
        student5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        template.Visitor visitor5 = new template.Visitor("faculty", 8, "hi!", "", false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        template.Manager manager5 = new template.Manager("", (int) (byte) 100, "visitor", "", false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 1, "hi!", "nonfaculty", true);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) (byte) 1, "manager", "nonfaculty", false);
        java.lang.String str6 = facultyMember5.getPassword();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        template.Student student5 = new template.Student("nonfaculty", 0, "", "student", false);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) ' ', "nonfaculty", "visitor", true);
        facultyMember5.setValidated(false);
        java.lang.String str8 = facultyMember5.getUserType();
        java.lang.String str9 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass11 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        int int9 = nonFacultyMember5.getId();
        java.lang.String str10 = nonFacultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getPassword();
        int int13 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        manager5.setName("hi!");
        manager5.setEmail("manager");
        int int12 = manager5.getPayRate();
        java.lang.String str13 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager" + "'", str13, "manager");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        template.Student student5 = new template.Student("", 8, "student", "manager", false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        facultyMember5.setEmail("visitor");
        java.lang.String str12 = facultyMember5.getEmail();
        java.lang.Class<?> wildcardClass13 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getName();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        int int11 = nonFacultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        student5.setPassword("hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        boolean boolean10 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 5, "faculty", "manager", false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getId();
        int int10 = manager5.getPayRate();
        int int11 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) '#', "visitor", "faculty", false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        template.Manager manager5 = new template.Manager("hi!", 8, "student", "hi!", true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        student5.setName("");
        int int8 = student5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setId(8);
        boolean boolean10 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setName("student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        int int18 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "visitor", "", true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getEmail();
        manager5.setId(5);
        manager5.setPassword("faculty");
        manager5.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        student5.setPassword("hi!");
        student5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (-1), "manager", "", false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (short) 100, "visitor", "", false);
        manager5.setEmail("");
        boolean boolean8 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        facultyMember5.setPassword("nonfaculty");
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        template.Visitor visitor5 = new template.Visitor("", (int) (short) -1, "nonfaculty", "", false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (short) -1, "visitor", "nonfaculty", true);
        int int6 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getEmail();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getEmail();
        java.lang.Class<?> wildcardClass14 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        template.Visitor visitor5 = new template.Visitor("", 5, "hi!", "hi!", false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("faculty");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setValidated(false);
        boolean boolean11 = visitor5.isValidated();
        int int12 = visitor5.getId();
        int int13 = visitor5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        java.lang.String str8 = manager5.getUserType();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        int int7 = student5.getId();
        int int8 = student5.getPayRate();
        int int9 = student5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        template.Manager manager5 = new template.Manager("manager", (int) (short) 100, "", "visitor", false);
        manager5.setEmail("manager");
        manager5.setValidated(false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (byte) 1);
        int int8 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        java.lang.String str7 = manager5.getUserType();
        int int8 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        int int10 = facultyMember5.getPayRate();
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        template.Student student5 = new template.Student("nonfaculty", (int) (byte) 0, "visitor", "student", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        int int8 = student5.getPayRate();
        int int9 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        nonFacultyMember5.setId((-1));
        nonFacultyMember5.setName("");
        nonFacultyMember5.setName("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        facultyMember5.setEmail("faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        boolean boolean8 = nonFacultyMember5.isValidated();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        java.lang.String str10 = nonFacultyMember5.getPassword();
        java.lang.Class<?> wildcardClass11 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        template.Student student5 = new template.Student("", 8, "faculty", "manager", false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        template.Student student5 = new template.Student("nonfaculty", (int) 'a', "nonfaculty", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getUserType();
        boolean boolean12 = student5.isValidated();
        student5.setId((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (byte) 100, "nonfaculty", "", true);
        visitor5.setValidated(false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        template.Manager manager5 = new template.Manager("nonfaculty", (int) (byte) -1, "", "visitor", true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        template.Visitor visitor5 = new template.Visitor("manager", (int) (byte) 0, "faculty", "nonfaculty", true);
        java.lang.String str6 = visitor5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        template.Visitor visitor5 = new template.Visitor("manager", 100, "nonfaculty", "visitor", false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        int int8 = visitor5.getPayRate();
        boolean boolean9 = visitor5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        template.Visitor visitor5 = new template.Visitor("", 100, "student", "student", false);
        java.lang.String str6 = visitor5.getUserType();
        visitor5.setName("manager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (short) 10, "", "student", false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) (short) 100, "manager", "manager", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setPassword("student");
        java.lang.String str16 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (byte) 1, "nonfaculty", "nonfaculty", true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        int int9 = visitor5.getPayRate();
        visitor5.setPassword("");
        java.lang.String str12 = visitor5.getUserType();
        java.lang.Class<?> wildcardClass13 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) (byte) 100, "manager", "nonfaculty", false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        template.Student student5 = new template.Student("student", (int) (byte) 0, "hi!", "student", false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", (int) (byte) 1, "student", "", false);
        java.lang.String str6 = facultyMember5.getUserType();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        template.Manager manager5 = new template.Manager("", (int) '4', "student", "", false);
    }
}

