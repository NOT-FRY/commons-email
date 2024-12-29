import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource2 = dataSourceFileResolver0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("");
        java.lang.String str2 = dataSourceClassPathResolver1.getClassPathBase();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/" + "'", str2, "/");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource3 = dataSourceFileResolver0.resolve("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray7 = dataSourceCompositeResolver3.getDataSourceResolvers();
        java.lang.Class<?> wildcardClass8 = dataSourceCompositeResolver3.getClass();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSourceResolverArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray4 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSourceResolverArray4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource5 = dataSourceUrlResolver2.resolve("", false);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource3 = dataSourceUrlResolver1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        java.net.URL uRL3 = dataSourceUrlResolver2.getBaseUrl();
        java.net.URL uRL4 = dataSourceUrlResolver2.getBaseUrl();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource6 = dataSourceUrlResolver2.resolve("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1);
        boolean boolean3 = dataSourcePathResolver2.isLenient();
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("");
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource3 = dataSourceClassPathResolver1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        jakarta.activation.DataSource dataSource3 = dataSourcePathResolver0.resolve("", true);
        jakarta.activation.DataSource dataSource5 = dataSourcePathResolver0.resolve("");
        org.junit.Assert.assertNotNull(dataSource3);
        org.junit.Assert.assertNotNull(dataSource5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        java.io.File file5 = dataSourceFileResolver0.getBaseDir();
        java.io.File file6 = dataSourceFileResolver0.getBaseDir();
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), ".");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), ".");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("/");
        java.lang.String str2 = dataSourceClassPathResolver1.getClassPathBase();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource4 = dataSourceClassPathResolver1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/" + "'", str2, "/");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        boolean boolean4 = dataSourceCompositeResolver3.isLenient();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray5 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dataSourceResolverArray5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        boolean boolean1 = dataSourceFileResolver0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource3 = dataSourceFileResolver0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray7 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver9 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray7, true);
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSourceResolverArray7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        java.io.File file5 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file5);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), ".");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, true);
        java.lang.Class<?> wildcardClass6 = dataSourceCompositeResolver5.getClass();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("/", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        java.lang.Class<?> wildcardClass2 = dataSourceFileResolver0.getClass();
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("hi!", true);
        java.lang.String str3 = dataSourceClassPathResolver2.getClassPathBase();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!/" + "'", str3, "hi!/");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        jakarta.activation.DataSource dataSource2 = dataSourceFileResolver0.resolve("/");
        org.junit.Assert.assertNotNull(dataSource2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver4 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, true);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver5.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] {};
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path0, true, openOptionArray2);
        java.lang.Class<?> wildcardClass4 = dataSourcePathResolver3.getClass();
        org.junit.Assert.assertNotNull(openOptionArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        jakarta.activation.DataSource dataSource3 = dataSourcePathResolver0.resolve("", false);
        org.junit.Assert.assertNotNull(dataSource3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        jakarta.activation.DataSource dataSource5 = dataSourceFileResolver2.resolve("", true);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource3 = dataSourcePathResolver0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(path1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        boolean boolean2 = dataSourcePathResolver0.isLenient();
        jakarta.activation.DataSource dataSource4 = dataSourcePathResolver0.resolve("");
        java.nio.file.Path path5 = dataSourcePathResolver0.getBaseDir();
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        java.io.File file4 = dataSourceFileResolver3.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file4);
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file4);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), ".");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.nio.file.Path path0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path0);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource4 = dataSourcePathResolver1.resolve("hi!/", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        java.net.URL uRL3 = dataSourceUrlResolver2.getBaseUrl();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource6 = dataSourceUrlResolver2.resolve("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        jakarta.activation.DataSource dataSource2 = dataSourcePathResolver0.resolve("");
        java.lang.Class<?> wildcardClass3 = dataSourcePathResolver0.getClass();
        org.junit.Assert.assertNotNull(dataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        jakarta.activation.DataSource dataSource6 = dataSourceFileResolver0.resolve("");
        java.io.File file7 = dataSourceFileResolver0.getBaseDir();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource9 = dataSourceFileResolver0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(dataSource6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), ".");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray7 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray8 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSourceResolverArray7);
        org.junit.Assert.assertNotNull(dataSourceResolverArray8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("/");
        java.lang.String str2 = dataSourceClassPathResolver1.getClassPathBase();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource5 = dataSourceClassPathResolver1.resolve("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/" + "'", str2, "/");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray6, true);
        jakarta.activation.DataSource dataSource10 = dataSourceCompositeResolver8.resolve("/");
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSource10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        java.net.URL uRL3 = dataSourceUrlResolver2.getBaseUrl();
        java.net.URL uRL4 = dataSourceUrlResolver2.getBaseUrl();
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver7 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("", true);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray8 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourceUrlResolver2, dataSourceClassPathResolver7 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver10 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray8, false);
        java.lang.Class<?> wildcardClass11 = dataSourceCompositeResolver10.getClass();
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(dataSourceResolverArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        boolean boolean4 = dataSourceCompositeResolver3.isLenient();
        jakarta.activation.DataSource dataSource6 = dataSourceCompositeResolver3.resolve("");
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dataSource6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, true);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1);
        java.lang.Class<?> wildcardClass7 = dataSourceResolverArray1.getClass();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        java.io.File file3 = dataSourceFileResolver2.getBaseDir();
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource5 = dataSourceFileResolver2.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), ".");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource3 = dataSourcePathResolver0.resolve("");
        jakarta.activation.DataSource dataSource6 = dataSourcePathResolver0.resolve("", true);
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertNotNull(dataSource3);
        org.junit.Assert.assertNotNull(dataSource6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        jakarta.activation.DataSource dataSource6 = dataSourceFileResolver0.resolve("");
        java.io.File file7 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file7);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(dataSource6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), ".");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray6, true);
        jakarta.activation.DataSource dataSource11 = dataSourceCompositeResolver8.resolve("hi!", true);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray12 = dataSourceCompositeResolver8.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(dataSourceResolverArray12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver4 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        boolean boolean1 = dataSourceFileResolver0.isLenient();
        java.io.File file2 = dataSourceFileResolver0.getBaseDir();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), ".");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver5 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, true);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray7 = dataSourceCompositeResolver6.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSourceResolverArray7);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        jakarta.activation.DataSource dataSource6 = dataSourceFileResolver0.resolve("");
        java.io.File file7 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver9 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file7, false);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource11 = dataSourceFileResolver9.resolve("hi!/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(dataSource6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), ".");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] {};
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path0, true, openOptionArray2);
        jakarta.activation.DataSource dataSource5 = dataSourcePathResolver3.resolve("");
        org.junit.Assert.assertNotNull(openOptionArray2);
        org.junit.Assert.assertNotNull(dataSource5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        boolean boolean2 = dataSourcePathResolver0.isLenient();
        jakarta.activation.DataSource dataSource5 = dataSourcePathResolver0.resolve("", false);
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataSource5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("", false);
        java.lang.String str3 = dataSourceClassPathResolver2.getClassPathBase();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file1);
        java.io.File file3 = dataSourceFileResolver2.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver4 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver(file3);
        jakarta.activation.DataSource dataSource7 = dataSourceFileResolver4.resolve("", false);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        boolean boolean3 = dataSourceUrlResolver2.isLenient();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("/");
        java.lang.String str2 = dataSourceClassPathResolver1.getClassPathBase();
        java.lang.String str3 = dataSourceClassPathResolver1.getClassPathBase();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/" + "'", str2, "/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        java.net.URL uRL3 = dataSourceUrlResolver2.getBaseUrl();
        java.net.URL uRL4 = dataSourceUrlResolver2.getBaseUrl();
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver7 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("", true);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray8 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourceUrlResolver2, dataSourceClassPathResolver7 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver10 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray8, false);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver11 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray8);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(dataSourceResolverArray8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray6, false);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray9 = dataSourceCompositeResolver8.getDataSourceResolvers();
        jakarta.activation.DataSource dataSource12 = dataSourceCompositeResolver8.resolve("/", true);
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSourceResolverArray9);
        org.junit.Assert.assertNotNull(dataSource12);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray6, false);
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray9 = dataSourceCompositeResolver8.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver10 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray9);
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver12 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray9, true);
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSourceResolverArray9);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0);
        java.net.URL uRL2 = dataSourceUrlResolver1.getBaseUrl();
        org.junit.Assert.assertNull(uRL2);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver dataSourceFileResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver();
        java.io.File file1 = dataSourceFileResolver0.getBaseDir();
        jakarta.activation.DataSource dataSource4 = dataSourceFileResolver0.resolve("/", false);
        java.io.File file5 = dataSourceFileResolver0.getBaseDir();
        java.lang.Class<?> wildcardClass6 = file5.getClass();
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".");
        org.junit.Assert.assertNotNull(dataSource4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), ".");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1);
        jakarta.activation.DataSource dataSource5 = dataSourcePathResolver2.resolve("", false);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource8 = dataSourcePathResolver2.resolve("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertNotNull(dataSource5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver dataSourceClassPathResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver("", true);
        java.lang.String str3 = dataSourceClassPathResolver2.getClassPathBase();
        jakarta.activation.DataSource dataSource6 = dataSourceClassPathResolver2.resolve("hi!/", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        boolean boolean2 = dataSourcePathResolver0.isLenient();
        java.nio.file.Path path3 = dataSourcePathResolver0.getBaseDir();
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(path3);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        jakarta.activation.DataSource dataSource5 = dataSourceCompositeResolver3.resolve("/");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray6 = dataSourceCompositeResolver3.getDataSourceResolvers();
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray6, true);
        jakarta.activation.DataSource dataSource10 = dataSourceCompositeResolver8.resolve("");
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray11 = dataSourceCompositeResolver8.getDataSourceResolvers();
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertNotNull(dataSource5);
        org.junit.Assert.assertNotNull(dataSourceResolverArray6);
        org.junit.Assert.assertNotNull(dataSource10);
        org.junit.Assert.assertNotNull(dataSourceResolverArray11);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        org.apache.commons.mail2.jakarta.DataSourceResolver[] dataSourceResolverArray1 = new org.apache.commons.mail2.jakarta.DataSourceResolver[] { dataSourcePathResolver0 };
        org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver dataSourceCompositeResolver3 = new org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver(dataSourceResolverArray1, false);
        boolean boolean4 = dataSourceCompositeResolver3.isLenient();
        jakarta.activation.DataSource dataSource7 = dataSourceCompositeResolver3.resolve("", true);
        org.junit.Assert.assertNotNull(dataSourceResolverArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dataSource7);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        jakarta.activation.DataSource dataSource5 = dataSourceUrlResolver2.resolve("hi!", true);
        java.net.URL uRL6 = dataSourceUrlResolver2.getBaseUrl();
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] {};
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path3, true, openOptionArray5);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver7 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1, true, openOptionArray5);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver8 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver9 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1);
        jakarta.activation.DataSource dataSource11 = dataSourcePathResolver9.resolve("/");
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertNotNull(dataSource11);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        jakarta.activation.DataSource dataSource3 = dataSourcePathResolver0.resolve("", true);
        jakarta.activation.DataSource dataSource6 = dataSourcePathResolver0.resolve("/", false);
        org.junit.Assert.assertNotNull(dataSource3);
        org.junit.Assert.assertNotNull(dataSource6);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver2 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0, false);
        jakarta.activation.DataSource dataSource5 = dataSourceUrlResolver2.resolve("hi!", true);
        jakarta.activation.DataSource dataSource8 = dataSourceUrlResolver2.resolve("hi!/", true);
        java.net.URL uRL9 = dataSourceUrlResolver2.getBaseUrl();
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.net.URL uRL0 = null;
        org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver dataSourceUrlResolver1 = new org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver(uRL0);
        jakarta.activation.DataSource dataSource4 = dataSourceUrlResolver1.resolve("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            jakarta.activation.DataSource dataSource7 = dataSourceUrlResolver1.resolve("/", false);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: /");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver0 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path1 = dataSourcePathResolver0.getBaseDir();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] {};
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver6 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path3, true, openOptionArray5);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver7 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1, true, openOptionArray5);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver9 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver();
        java.nio.file.Path path10 = dataSourcePathResolver9.getBaseDir();
        java.nio.file.Path path12 = null;
        java.nio.file.OpenOption[] openOptionArray14 = new java.nio.file.OpenOption[] {};
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver15 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path12, true, openOptionArray14);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver16 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path10, true, openOptionArray14);
        org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver dataSourcePathResolver17 = new org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver(path1, false, openOptionArray14);
        org.junit.Assert.assertNotNull(path1);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(openOptionArray14);
    }
}

