package randoop.randoop_tests_template;
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
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        template.Student student5 = new template.Student("faculty", (int) (byte) 1, "nonfaculty", "", false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        template.Manager manager5 = new template.Manager("student", 8, "student", "", true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        java.lang.String str9 = student5.getName();
        int int10 = student5.getPayRate();
        boolean boolean11 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        nonFacultyMember5.setId((-1));
        nonFacultyMember5.setName("");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "", "hi!", true);
        boolean boolean6 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setName("student");
        facultyMember5.setId(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        visitor5.setValidated(true);
        visitor5.setValidated(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        template.Visitor visitor5 = new template.Visitor("", (int) (short) -1, "nonfaculty", "manager", true);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        template.Student student5 = new template.Student("student", (int) (short) 1, "manager", "nonfaculty", false);
        student5.setValidated(true);
        int int8 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        template.Manager manager5 = new template.Manager("manager", (int) (short) 100, "visitor", "manager", true);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 97, "manager", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        java.lang.String str10 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        java.lang.String str8 = manager5.getUserType();
        java.lang.String str9 = manager5.getEmail();
        manager5.setName("");
        manager5.setEmail("");
        int int14 = manager5.getPayRate();
        java.lang.String str15 = manager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 15, "faculty", "nonfaculty", false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        template.Student student5 = new template.Student("student", (int) (short) 1, "manager", "nonfaculty", false);
        student5.setValidated(true);
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("hi!");
        student5.setPassword("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        manager5.setValidated(true);
        java.lang.String str9 = manager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        template.Manager manager5 = new template.Manager("student", 10, "hi!", "visitor", true);
        manager5.setName("student");
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setName("nonfaculty");
        int int11 = manager5.getPayRate();
        java.lang.String str12 = manager5.getUserType();
        manager5.setId((int) (byte) 100);
        int int15 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 0, "", "visitor", true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        boolean boolean2 = manager0.isValidated();
        java.lang.String str3 = manager0.getUserType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "manager" + "'", str3, "manager");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "", "faculty", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getName();
        facultyMember5.setValidated(true);
        int int10 = facultyMember5.getPayRate();
        java.lang.String str11 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        template.Visitor visitor5 = new template.Visitor("student", 0, "", "nonfaculty", false);
        java.lang.String str6 = visitor5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        template.Student student5 = new template.Student("faculty", (int) (short) 1, "student", "nonfaculty", false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        manager5.setEmail("faculty");
        int int8 = manager5.getPayRate();
        manager5.setEmail("visitor");
        int int11 = manager5.getPayRate();
        manager5.setPassword("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        boolean boolean8 = visitor5.isValidated();
        java.lang.String str9 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getUserType();
        int int11 = manager5.getPayRate();
        boolean boolean12 = manager5.isValidated();
        int int13 = manager5.getPayRate();
        int int14 = manager5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) (short) 10, "student", "student", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.Class<?> wildcardClass7 = facultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 8, "nonfaculty", "", false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setId(8);
        boolean boolean10 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setValidated(false);
        java.lang.String str13 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        template.Visitor visitor5 = new template.Visitor("manager", 0, "", "faculty", false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getUserType();
        java.lang.String str10 = facultyMember5.getUserType();
        java.lang.String str11 = facultyMember5.getPassword();
        int int12 = facultyMember5.getPayRate();
        facultyMember5.setId((int) (short) -1);
        facultyMember5.setId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (short) -1, "", "faculty", true);
        facultyMember5.setPassword("");
        facultyMember5.setId((int) (byte) -1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        boolean boolean11 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        int int6 = manager5.getPayRate();
        java.lang.String str7 = manager5.getUserType();
        int int8 = manager5.getPayRate();
        manager5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setId((-1));
        student5.setName("hi!");
        java.lang.String str12 = student5.getPassword();
        int int13 = student5.getPayRate();
        student5.setName("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        template.Student student5 = new template.Student("", 10, "", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        template.Student student5 = new template.Student("hi!", (int) (byte) 100, "hi!", "hi!", false);
        student5.setId((-1));
        int int8 = student5.getPayRate();
        int int9 = student5.getId();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        template.Manager manager5 = new template.Manager("faculty", 5, "nonfaculty", "hi!", false);
        java.lang.String str6 = manager5.getUserType();
        boolean boolean7 = manager5.isValidated();
        java.lang.String str8 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        template.Manager manager5 = new template.Manager("", (int) '4', "nonfaculty", "hi!", true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (short) 1, "visitor", "manager", false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        template.Manager manager5 = new template.Manager("hi!", (int) (byte) 0, "manager", "faculty", true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        nonFacultyMember5.setName("hi!");
        java.lang.String str20 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nonfaculty" + "'", str15, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        template.Student student5 = new template.Student("student", 100, "manager", "student", false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        template.Student student5 = new template.Student("student", (int) (byte) 1, "hi!", "", false);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        template.Student student5 = new template.Student("manager", (int) '#', "", "", true);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getId();
        facultyMember5.setPassword("faculty");
        java.lang.String str12 = facultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        student5.setPassword("visitor");
        java.lang.String str13 = student5.getName();
        student5.setId((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        template.Student student5 = new template.Student("manager", 15, "student", "nonfaculty", true);
        java.lang.String str6 = student5.getUserType();
        student5.setName("student");
        java.lang.String str9 = student5.getName();
        int int10 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        boolean boolean10 = nonFacultyMember5.isValidated();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setValidated(false);
        nonFacultyMember5.setName("hi!");
        int int16 = nonFacultyMember5.getPayRate();
        java.lang.String str17 = nonFacultyMember5.getUserType();
        int int18 = nonFacultyMember5.getPayRate();
        java.lang.String str19 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "nonfaculty" + "'", str17, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "nonfaculty" + "'", str19, "nonfaculty");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        template.Manager manager5 = new template.Manager("visitor", 0, "hi!", "nonfaculty", false);
        manager5.setEmail("student");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        template.Student student5 = new template.Student("faculty", 8, "visitor", "manager", true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        template.Student student5 = new template.Student("manager", (int) (byte) -1, "nonfaculty", "visitor", false);
        student5.setId((int) (byte) 10);
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        student5.setPassword("manager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        nonFacultyMember5.setPassword("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        visitor5.setPassword("hi!");
        int int9 = visitor5.getPayRate();
        visitor5.setPassword("");
        java.lang.String str12 = visitor5.getUserType();
        java.lang.String str13 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setPassword("faculty");
        facultyMember5.setId((int) (byte) 1);
        int int12 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        boolean boolean10 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        student5.setPassword("student");
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        java.lang.String str8 = manager5.getUserType();
        manager5.setName("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 0, "", "", false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) (short) -1, "", "faculty", true);
        facultyMember5.setPassword("");
        int int8 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        template.Student student5 = new template.Student("hi!", (-1), "student", "nonfaculty", true);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        boolean boolean9 = nonFacultyMember5.isValidated();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setName("student");
        java.lang.String str13 = nonFacultyMember5.getName();
        nonFacultyMember5.setId((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 97, "manager", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getEmail();
        java.lang.String str7 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getUserType();
        int int10 = manager5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        student5.setId(0);
        java.lang.String str8 = student5.getUserType();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getName();
        java.lang.String str14 = visitor5.getEmail();
        visitor5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getEmail();
        java.lang.Class<?> wildcardClass12 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        int int8 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (byte) 10, "", "hi!", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        int int7 = nonFacultyMember5.getPayRate();
        java.lang.String str8 = nonFacultyMember5.getPassword();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "student", "", true);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "", "faculty", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getName();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getUserType();
        boolean boolean10 = facultyMember5.isValidated();
        facultyMember5.setPassword("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        template.Student student5 = new template.Student("nonfaculty", 0, "", "student", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        int int8 = student5.getPayRate();
        student5.setEmail("manager");
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) ' ', "hi!", "student", true);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (byte) -1, "faculty", "nonfaculty", true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        template.Manager manager5 = new template.Manager("", 100, "student", "hi!", false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        visitor5.setEmail("hi!");
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        int int12 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (byte) 10, "hi!", "hi!", true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setPassword("student");
        java.lang.String str16 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setName("");
        facultyMember5.setValidated(true);
        boolean boolean12 = facultyMember5.isValidated();
        java.lang.String str13 = facultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        nonFacultyMember5.setValidated(false);
        boolean boolean8 = nonFacultyMember5.isValidated();
        nonFacultyMember5.setId((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", (int) '#', "", "faculty", false);
        int int6 = facultyMember5.getId();
        facultyMember5.setPassword("student");
        boolean boolean9 = facultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", 10, "nonfaculty", "hi!", true);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getEmail();
        int int10 = visitor5.getPayRate();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getUserType();
        facultyMember5.setName("manager");
        int int10 = facultyMember5.getPayRate();
        int int11 = facultyMember5.getId();
        int int12 = facultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        template.Manager manager5 = new template.Manager("", (int) (byte) 10, "hi!", "faculty", true);
        manager5.setEmail("manager");
        int int8 = manager5.getPayRate();
        java.lang.String str9 = manager5.getUserType();
        java.lang.String str10 = manager5.getPassword();
        manager5.setPassword("manager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        template.Visitor visitor5 = new template.Visitor("manager", (-1), "visitor", "", true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getUserType();
        int int8 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nonfaculty" + "'", str7, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        java.lang.Class<?> wildcardClass10 = nonFacultyMember5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setId(8);
        int int12 = visitor5.getPayRate();
        int int13 = visitor5.getPayRate();
        java.lang.String str14 = visitor5.getName();
        java.lang.String str15 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getUserType();
        java.lang.String str10 = manager5.getUserType();
        java.lang.String str11 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        template.Manager manager5 = new template.Manager("visitor", 5, "student", "hi!", true);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        template.Manager manager5 = new template.Manager("student", 10, "hi!", "visitor", true);
        int int6 = manager5.getPayRate();
        java.lang.Class<?> wildcardClass7 = manager5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (short) 100, "", "faculty", false);
        java.lang.String str6 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        boolean boolean9 = facultyMember5.isValidated();
        facultyMember5.setId((int) '#');
        java.lang.String str12 = facultyMember5.getUserType();
        facultyMember5.setEmail("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setId((int) (short) 1);
        int int10 = facultyMember5.getPayRate();
        boolean boolean11 = facultyMember5.isValidated();
        java.lang.String str12 = facultyMember5.getUserType();
        int int13 = facultyMember5.getPayRate();
        java.lang.String str14 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) '4', "", "manager", true);
        visitor5.setValidated(true);
        java.lang.String str8 = visitor5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        int int10 = visitor5.getPayRate();
        java.lang.Class<?> wildcardClass11 = visitor5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        java.lang.String str9 = visitor5.getUserType();
        int int10 = visitor5.getPayRate();
        visitor5.setId((int) (byte) 10);
        int int13 = visitor5.getPayRate();
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setName("nonfaculty");
        int int8 = nonFacultyMember5.getId();
        java.lang.String str9 = nonFacultyMember5.getUserType();
        int int10 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        java.lang.String str9 = student5.getName();
        student5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getId();
        boolean boolean8 = student5.isValidated();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        boolean boolean8 = visitor5.isValidated();
        visitor5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        int int3 = manager0.getPayRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getUserType();
        java.lang.String str7 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager" + "'", str7, "manager");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        visitor5.setValidated(true);
        java.lang.String str12 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 1, "", "nonfaculty", false);
        manager5.setId((int) ' ');
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 100, "hi!", "faculty", true);
        nonFacultyMember5.setId((int) (byte) 100);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 97, "visitor", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        facultyMember5.setValidated(true);
        java.lang.String str10 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getId();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        int int9 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        int int8 = nonFacultyMember5.getId();
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getName();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setPassword("hi!");
        nonFacultyMember5.setEmail("visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getPayRate();
        java.lang.String str11 = visitor5.getUserType();
        int int12 = visitor5.getId();
        visitor5.setEmail("student");
        visitor5.setValidated(false);
        visitor5.setName("");
        visitor5.setEmail("visitor");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) (byte) 10, "faculty", "manager", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getId();
        boolean boolean8 = facultyMember5.isValidated();
        int int9 = facultyMember5.getPayRate();
        int int10 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", 10, "student", "student", true);
        java.lang.String str6 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        template.Manager manager5 = new template.Manager("nonfaculty", 0, "nonfaculty", "hi!", true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        template.Student student5 = new template.Student("manager", 97, "", "hi!", true);
        student5.setEmail("manager");
        student5.setName("");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        java.lang.String str6 = facultyMember5.getName();
        java.lang.String str7 = facultyMember5.getName();
        java.lang.String str8 = facultyMember5.getUserType();
        int int9 = facultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 100, "", "faculty", true);
        boolean boolean6 = facultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getEmail();
        facultyMember5.setName("");
        facultyMember5.setValidated(true);
        boolean boolean12 = facultyMember5.isValidated();
        facultyMember5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getPassword();
        java.lang.String str12 = visitor5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        template.Manager manager5 = new template.Manager("manager", 97, "hi!", "visitor", true);
        manager5.setPassword("manager");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (short) 1, "hi!", "", false);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        template.Student student5 = new template.Student("", (int) (short) -1, "nonfaculty", "student", true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        java.lang.String str7 = facultyMember5.getName();
        java.lang.String str8 = facultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        template.Student student5 = new template.Student("faculty", (int) (short) 10, "hi!", "nonfaculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 10, "", "visitor", true);
        visitor5.setValidated(true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        template.Manager manager5 = new template.Manager("student", 10, "hi!", "visitor", true);
        int int6 = manager5.getPayRate();
        manager5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("visitor", (int) (short) 100, "faculty", "nonfaculty", false);
        int int6 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        visitor5.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        int int11 = visitor5.getPayRate();
        visitor5.setValidated(false);
        java.lang.String str14 = visitor5.getEmail();
        java.lang.String str15 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        visitor5.setName("visitor");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        java.lang.String str8 = visitor5.getUserType();
        java.lang.String str9 = visitor5.getUserType();
        visitor5.setName("manager");
        int int12 = visitor5.getPayRate();
        java.lang.String str13 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        template.Visitor visitor5 = new template.Visitor("nonfaculty", (int) (short) 0, "nonfaculty", "hi!", false);
        visitor5.setId((int) (short) 1);
        int int8 = visitor5.getPayRate();
        visitor5.setPassword("student");
        int int11 = visitor5.getPayRate();
        java.lang.String str12 = visitor5.getUserType();
        java.lang.String str13 = visitor5.getUserType();
        java.lang.String str14 = visitor5.getName();
        java.lang.String str15 = visitor5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nonfaculty" + "'", str14, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        student5.setName("");
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        boolean boolean10 = student5.isValidated();
        student5.setPassword("visitor");
        int int13 = student5.getPayRate();
        int int14 = student5.getPayRate();
        int int15 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (short) 0, "hi!", "nonfaculty", false);
        int int6 = nonFacultyMember5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getUserType();
        student5.setName("nonfaculty");
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        boolean boolean12 = student5.isValidated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setPassword("visitor");
        nonFacultyMember5.setPassword("faculty");
        nonFacultyMember5.setId(100);
        boolean boolean14 = nonFacultyMember5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) '#', "visitor", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        visitor5.setId(0);
        int int22 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "nonfaculty" + "'", str13, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getEmail();
        java.lang.String str9 = nonFacultyMember5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setEmail("student");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        template.Manager manager5 = new template.Manager("", 8, "faculty", "hi!", true);
        manager5.setId((int) (byte) 1);
        java.lang.String str8 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", 97, "visitor", "", true);
        java.lang.String str6 = facultyMember5.getUserType();
        java.lang.String str7 = facultyMember5.getUserType();
        facultyMember5.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        template.Manager manager5 = new template.Manager("faculty", 5, "nonfaculty", "hi!", false);
        java.lang.String str6 = manager5.getUserType();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getPayRate();
        manager5.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        template.Manager manager0 = new template.Manager();
        int int1 = manager0.getPayRate();
        int int2 = manager0.getPayRate();
        java.lang.String str3 = manager0.getUserType();
        int int4 = manager0.getPayRate();
        manager0.setName("visitor");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "manager" + "'", str3, "manager");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setEmail("");
        nonFacultyMember5.setName("visitor");
        nonFacultyMember5.setId(100);
        int int15 = nonFacultyMember5.getId();
        java.lang.String str16 = nonFacultyMember5.getUserType();
        int int17 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nonfaculty" + "'", str16, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        template.Manager manager5 = new template.Manager("hi!", 1, "faculty", "nonfaculty", false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        template.Visitor visitor5 = new template.Visitor("", (int) (short) 10, "faculty", "manager", false);
        visitor5.setEmail("");
        visitor5.setName("manager");
        java.lang.String str10 = visitor5.getPassword();
        int int11 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        boolean boolean6 = student5.isValidated();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getId();
        java.lang.String str9 = manager5.getUserType();
        java.lang.String str10 = manager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager" + "'", str9, "manager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("faculty", (int) '#', "manager", "student", false);
        java.lang.String str6 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 100, "faculty", "", true);
        java.lang.String str6 = facultyMember5.getEmail();
        facultyMember5.setValidated(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 15, "faculty", "", false);
        java.lang.String str6 = facultyMember5.getEmail();
        int int7 = facultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        java.lang.String str7 = manager5.getEmail();
        int int8 = manager5.getPayRate();
        int int9 = manager5.getPayRate();
        java.lang.String str10 = manager5.getUserType();
        int int11 = manager5.getId();
        java.lang.String str12 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager" + "'", str10, "manager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        template.Student student5 = new template.Student("visitor", 5, "", "", false);
        student5.setValidated(false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        template.Manager manager5 = new template.Manager("student", 1, "", "student", true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        int int8 = facultyMember5.getPayRate();
        java.lang.String str9 = facultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        template.Visitor visitor5 = new template.Visitor("manager", 10, "nonfaculty", "", false);
        java.lang.String str6 = visitor5.getUserType();
        java.lang.String str7 = visitor5.getPassword();
        int int8 = visitor5.getPayRate();
        int int9 = visitor5.getPayRate();
        int int10 = visitor5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        template.Student student5 = new template.Student("hi!", 100, "student", "faculty", true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setPassword("hi!");
        nonFacultyMember5.setValidated(false);
        int int11 = nonFacultyMember5.getPayRate();
        int int12 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) '#', "visitor", "faculty", true);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getPassword();
        java.lang.String str9 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        template.Manager manager0 = new template.Manager();
        manager0.setId(100);
        boolean boolean3 = manager0.isValidated();
        int int4 = manager0.getId();
        manager0.setId(5);
        manager0.setPassword("manager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        int int10 = visitor5.getPayRate();
        visitor5.setEmail("hi!");
        java.lang.String str13 = visitor5.getPassword();
        int int14 = visitor5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        template.FacultyMember facultyMember5 = new template.FacultyMember("visitor", 100, "nonfaculty", "", true);
        facultyMember5.setId(10);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) '#', "nonfaculty", "student", false);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        int int6 = manager5.getPayRate();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setName("nonfaculty");
        boolean boolean11 = manager5.isValidated();
        java.lang.String str12 = manager5.getUserType();
        manager5.setId((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "manager" + "'", str12, "manager");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        template.Student student5 = new template.Student("manager", (int) (byte) 0, "visitor", "nonfaculty", true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 1, "nonfaculty", "student", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        template.Visitor visitor5 = new template.Visitor("", (int) ' ', "hi!", "manager", false);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        template.Visitor visitor5 = new template.Visitor("faculty", (int) (short) 10, "visitor", "hi!", true);
        int int6 = visitor5.getPayRate();
        java.lang.String str7 = visitor5.getName();
        visitor5.setEmail("manager");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        java.lang.String str8 = nonFacultyMember5.getUserType();
        java.lang.String str9 = nonFacultyMember5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", 5, "visitor", "hi!", false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        template.Student student5 = new template.Student("nonfaculty", 0, "hi!", "hi!", true);
        int int6 = student5.getId();
        int int7 = student5.getId();
        int int8 = student5.getPayRate();
        boolean boolean9 = student5.isValidated();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        manager5.setId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setValidated(false);
        int int10 = visitor5.getPayRate();
        visitor5.setId((int) (byte) 100);
        java.lang.String str13 = visitor5.getUserType();
        java.lang.String str14 = visitor5.getUserType();
        java.lang.String str15 = visitor5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setValidated(false);
        java.lang.String str10 = nonFacultyMember5.getUserType();
        java.lang.String str11 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nonfaculty" + "'", str11, "nonfaculty");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        template.Manager manager5 = new template.Manager("hi!", 0, "", "", false);
        java.lang.String str6 = manager5.getPassword();
        int int7 = manager5.getPayRate();
        int int8 = manager5.getId();
        manager5.setPassword("");
        int int11 = manager5.getPayRate();
        boolean boolean12 = manager5.isValidated();
        int int13 = manager5.getPayRate();
        java.lang.String str14 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "manager" + "'", str14, "manager");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        template.FacultyMember facultyMember5 = new template.FacultyMember("faculty", (int) ' ', "", "", true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setPassword("manager");
        int int9 = nonFacultyMember5.getPayRate();
        java.lang.String str10 = nonFacultyMember5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        int int6 = manager5.getPayRate();
        boolean boolean7 = manager5.isValidated();
        java.lang.String str8 = manager5.getUserType();
        manager5.setEmail("faculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) 'a', "hi!", "", false);
        nonFacultyMember5.setEmail("faculty");
        nonFacultyMember5.setEmail("nonfaculty");
        int int10 = nonFacultyMember5.getPayRate();
        int int11 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        nonFacultyMember5.setEmail("hi!");
        java.lang.String str8 = nonFacultyMember5.getUserType();
        int int9 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setEmail("visitor");
        java.lang.String str12 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nonfaculty" + "'", str8, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "student", "student", false);
        int int6 = manager5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        template.Manager manager5 = new template.Manager("", (int) (short) 100, "hi!", "", false);
        boolean boolean6 = manager5.isValidated();
        int int7 = manager5.getPayRate();
        java.lang.String str8 = manager5.getUserType();
        manager5.setEmail("student");
        manager5.setName("visitor");
        manager5.setValidated(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager" + "'", str8, "manager");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        template.Manager manager5 = new template.Manager("manager", 100, "", "", true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        template.Manager manager5 = new template.Manager("faculty", (int) ' ', "nonfaculty", "student", false);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", (int) (byte) 100, "", "", true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", 10, "", "student", true);
        nonFacultyMember5.setValidated(true);
        int int8 = nonFacultyMember5.getPayRate();
        java.lang.String str9 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        template.Student student5 = new template.Student("", (int) (short) 100, "nonfaculty", "manager", false);
        int int6 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) '#', "visitor", "nonfaculty", true);
        java.lang.String str6 = facultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("manager", (int) 'a', "hi!", "visitor", false);
        nonFacultyMember5.setValidated(false);
        java.lang.String str8 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setEmail("");
        java.lang.Class<?> wildcardClass11 = nonFacultyMember5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        template.Visitor visitor5 = new template.Visitor("", (int) '#', "visitor", "nonfaculty", true);
        visitor5.setId((int) '#');
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        template.Student student5 = new template.Student("faculty", (int) (byte) -1, "", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        template.FacultyMember facultyMember5 = new template.FacultyMember("nonfaculty", (int) ' ', "student", "nonfaculty", false);
        java.lang.Class<?> wildcardClass6 = facultyMember5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setId(10);
        java.lang.String str9 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nonfaculty" + "'", str9, "nonfaculty");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) 100, "", "", true);
        int int6 = visitor5.getPayRate();
        int int7 = visitor5.getPayRate();
        visitor5.setName("nonfaculty");
        java.lang.String str10 = visitor5.getPassword();
        java.lang.String str11 = visitor5.getPassword();
        visitor5.setName("nonfaculty");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 15, "student", "visitor", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        facultyMember5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 15, "faculty", "", false);
        boolean boolean6 = facultyMember5.isValidated();
        facultyMember5.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        template.Manager manager5 = new template.Manager("faculty", 0, "", "faculty", false);
        java.lang.String str6 = manager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        template.Student student5 = new template.Student("", 5, "visitor", "manager", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        template.Visitor visitor5 = new template.Visitor("manager", 5, "visitor", "student", false);
        int int6 = visitor5.getPayRate();
        java.lang.String str7 = visitor5.getUserType();
        visitor5.setPassword("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        int int9 = student5.getPayRate();
        int int10 = student5.getId();
        java.lang.String str11 = student5.getUserType();
        student5.setValidated(false);
        student5.setEmail("faculty");
        student5.setPassword("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        template.Visitor visitor5 = new template.Visitor("", 100, "student", "student", false);
        java.lang.String str6 = visitor5.getUserType();
        int int7 = visitor5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        int int6 = student5.getPayRate();
        int int7 = student5.getPayRate();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getPayRate();
        student5.setEmail("manager");
        java.lang.String str12 = student5.getUserType();
        int int13 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        template.Student student5 = new template.Student("hi!", (int) (byte) 100, "hi!", "hi!", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getName();
        int int8 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        template.Manager manager5 = new template.Manager("hi!", 8, "student", "faculty", true);
        int int6 = manager5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        template.FacultyMember facultyMember5 = new template.FacultyMember("manager", (int) (byte) 10, "visitor", "", true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        template.FacultyMember facultyMember5 = new template.FacultyMember("", (int) (byte) 100, "", "", true);
        int int6 = facultyMember5.getPayRate();
        int int7 = facultyMember5.getPayRate();
        java.lang.String str8 = facultyMember5.getUserType();
        facultyMember5.setPassword("hi!");
        facultyMember5.setValidated(false);
        int int13 = facultyMember5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setEmail("");
        int int9 = student5.getPayRate();
        int int10 = student5.getId();
        java.lang.String str11 = student5.getUserType();
        student5.setValidated(false);
        int int14 = student5.getId();
        java.lang.Class<?> wildcardClass15 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        template.Manager manager5 = new template.Manager("visitor", (-1), "visitor", "visitor", false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        template.FacultyMember facultyMember5 = new template.FacultyMember("student", 5, "visitor", "manager", true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 0, "nonfaculty", "visitor", true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        template.Student student5 = new template.Student("", (int) (byte) 1, "manager", "hi!", false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        template.FacultyMember facultyMember5 = new template.FacultyMember("hi!", 8, "nonfaculty", "visitor", true);
        java.lang.String str6 = facultyMember5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        template.Visitor visitor5 = new template.Visitor("student", 100, "", "", true);
        java.lang.String str6 = visitor5.getUserType();
        visitor5.setId(35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        template.Student student5 = new template.Student("nonfaculty", 10, "visitor", "visitor", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        template.Student student5 = new template.Student("", 0, "", "manager", false);
        java.lang.String str6 = student5.getPassword();
        student5.setValidated(false);
        int int9 = student5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        int int6 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setValidated(true);
        nonFacultyMember5.setValidated(true);
        int int11 = nonFacultyMember5.getId();
        int int12 = nonFacultyMember5.getPayRate();
        nonFacultyMember5.setName("manager");
        nonFacultyMember5.setPassword("faculty");
        java.lang.String str17 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "nonfaculty" + "'", str17, "nonfaculty");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("nonfaculty", 8, "visitor", "visitor", true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) (short) 1, "hi!", "student", true);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        nonFacultyMember5.setId(10);
        int int9 = nonFacultyMember5.getPayRate();
        int int10 = nonFacultyMember5.getPayRate();
        java.lang.String str11 = nonFacultyMember5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("hi!", (int) 'a', "", "", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        java.lang.String str7 = nonFacultyMember5.getEmail();
        nonFacultyMember5.setEmail("student");
        java.lang.String str10 = nonFacultyMember5.getUserType();
        int int11 = nonFacultyMember5.getPayRate();
        java.lang.String str12 = nonFacultyMember5.getUserType();
        int int13 = nonFacultyMember5.getPayRate();
        int int14 = nonFacultyMember5.getPayRate();
        int int15 = nonFacultyMember5.getPayRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nonfaculty" + "'", str10, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nonfaculty" + "'", str12, "nonfaculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        template.Student student5 = new template.Student("faculty", 0, "faculty", "", false);
        int int6 = student5.getPayRate();
        student5.setName("faculty");
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isValidated();
        boolean boolean11 = student5.isValidated();
        int int12 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        template.Visitor visitor5 = new template.Visitor("hi!", (int) (short) -1, "manager", "faculty", false);
        boolean boolean6 = visitor5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        template.Student student5 = new template.Student("hi!", 0, "hi!", "hi!", true);
        int int6 = student5.getPayRate();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getPayRate();
        int int11 = student5.getPayRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        template.NonFacultyMember nonFacultyMember5 = new template.NonFacultyMember("", (int) (short) 0, "hi!", "nonfaculty", false);
        java.lang.String str6 = nonFacultyMember5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nonfaculty" + "'", str6, "nonfaculty");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        boolean boolean6 = student5.isValidated();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        template.Student student5 = new template.Student("student", (int) (short) 10, "student", "", false);
        int int6 = student5.getPayRate();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        template.Visitor visitor5 = new template.Visitor("", (int) '#', "visitor", "nonfaculty", true);
        visitor5.setPassword("visitor");
        visitor5.setName("");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        template.Manager manager5 = new template.Manager("student", (int) (byte) 0, "student", "manager", true);
        java.lang.String str6 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        template.Manager manager5 = new template.Manager("", (-1), "student", "manager", false);
        java.lang.String str6 = manager5.getUserType();
        manager5.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager" + "'", str6, "manager");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        template.Student student5 = new template.Student("", (int) (byte) -1, "student", "student", false);
        java.lang.String str6 = student5.getUserType();
        student5.setPassword("hi!");
        int int9 = student5.getId();
        int int10 = student5.getId();
        student5.setEmail("visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }
}

