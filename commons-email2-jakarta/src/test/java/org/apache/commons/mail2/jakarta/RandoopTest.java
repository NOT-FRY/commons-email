//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.commons.mail2.jakarta;

import jakarta.activation.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.commons.mail2.jakarta.DataSourceResolver;
import org.apache.commons.mail2.jakarta.resolver.DataSourceClassPathResolver;
import org.apache.commons.mail2.jakarta.resolver.DataSourceCompositeResolver;
import org.apache.commons.mail2.jakarta.resolver.DataSourceFileResolver;
import org.apache.commons.mail2.jakarta.resolver.DataSourcePathResolver;
import org.apache.commons.mail2.jakarta.resolver.DataSourceUrlResolver;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopTest {
    public static boolean debug = false;

    public RandoopTest() {
    }

    @Test
    public void test01() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test01");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();

        try {
            DataSource var2 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var3) {
        }

    }

    @Test
    public void test02() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test02");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("");
        String var2 = var1.getClassPathBase();
        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
    }

    @Test
    public void test03() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test03");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();

        try {
            DataSource var2 = var1.resolve("hi!", false);
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var3) {
        }

    }

    @Test
    public void test04() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test04");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceResolver[] var6 = var3.getDataSourceResolvers();
        Class var7 = var3.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var6);
        Assert.assertNotNull(var7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test05");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSourceResolver[] var4 = var3.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test06");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);

        try {
            DataSource var3 = var2.resolve("", false);
            Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (MalformedURLException var4) {
        }

    }

    @Test
    public void test07() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test07");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1);

        try {
            DataSource var3 = var2.resolve("hi!");
            Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (MalformedURLException var4) {
        }

    }

    @Test
    public void test08() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test08");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        URL var3 = var2.getBaseUrl();
        URL var4 = var2.getBaseUrl();

        try {
            DataSource var5 = var2.resolve("");
            Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (MalformedURLException var6) {
        }

        Assert.assertNull(var3);
        Assert.assertNull(var4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test09");
        }

        new DataSourceClassPathResolver();
    }

    @Test
    public void test10() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test10");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        DataSourcePathResolver var3 = new DataSourcePathResolver(var2);
        boolean var4 = var3.isLenient();
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var4 + "' != 'false'", !var4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test11");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("");

        try {
            DataSource var2 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (IOException var3) {
        }

    }

    @Test
    public void test12() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test12");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSource var2 = var1.resolve("", true);
        DataSource var3 = var1.resolve("");
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test13");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        File var4 = var1.getBaseDir();
        File var5 = var1.getBaseDir();
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNull("file5.getParent() == null", var4.getParent());
        Assert.assertEquals(var4.toString(), ".");
        Assert.assertNotNull(var5);
        Assert.assertNull("file6.getParent() == null", var5.getParent());
        Assert.assertEquals(var5.toString(), ".");
    }

    @Test
    public void test14() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test14");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("/");
        String var2 = var1.getClassPathBase();

        try {
            DataSource var3 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (IOException var4) {
        }

        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
    }

    @Test
    public void test15() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test15");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        boolean var4 = var3.isLenient();
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var4 + "' != 'false'", !var4);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test16");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        boolean var2 = var1.isLenient();

        try {
            DataSource var3 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var4) {
        }

        Assert.assertTrue("'" + var2 + "' != 'false'", !var2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test17");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceResolver[] var6 = var3.getDataSourceResolvers();
        new DataSourceCompositeResolver(var6, true);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test18");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        File var4 = var1.getBaseDir();
        new DataSourceFileResolver(var4);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNull("file5.getParent() == null", var4.getParent());
        Assert.assertEquals(var4.toString(), ".");
    }

    @Test
    public void test19() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test19");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        new DataSourceCompositeResolver(var2, false);
        DataSourceCompositeResolver var4 = new DataSourceCompositeResolver(var2, true);
        Class var5 = var4.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test20");
        }

        new DataSourceClassPathResolver("/", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test21");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        Class var3 = var1.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test22");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("hi!", true);
        String var2 = var1.getClassPathBase();
        Assert.assertEquals("'" + var2 + "' != 'hi!/'", var2, "hi!/");
    }

    @Test
    public void test23() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test23");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        DataSource var2 = var1.resolve("/");
        Assert.assertNotNull(var2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test24");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        new DataSourceFileResolver(var2);
        new DataSourceFileResolver(var2, false);
        new DataSourceFileResolver(var2);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
    }

    @Test
    public void test25() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test25");
        }

        Object var1 = null;
        new DataSourceUrlResolver((URL)var1, true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test26");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        new DataSourceCompositeResolver(var2, false);
        DataSourceCompositeResolver var4 = new DataSourceCompositeResolver(var2, true);
        DataSourceResolver[] var5 = var4.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test27");
        }

        Object var1 = null;
        OpenOption[] var2 = new OpenOption[0];
        DataSourcePathResolver var3 = new DataSourcePathResolver((Path)var1, true, var2);
        Class var4 = var3.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test28");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSource var2 = var1.resolve("", false);
        Assert.assertNotNull(var2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test29");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSourceFileResolver var3 = new DataSourceFileResolver(var2);
        DataSource var4 = var3.resolve("", true);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test30");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();

        try {
            DataSource var3 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var4) {
        }

        Assert.assertNotNull(var2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test31");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        boolean var3 = var1.isLenient();
        DataSource var4 = var1.resolve("");
        Path var5 = var1.getBaseDir();
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var3 + "' != 'false'", !var3);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test32");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        new DataSourceFileResolver(var2);
        DataSourceFileResolver var4 = new DataSourceFileResolver(var2);
        File var5 = var4.getBaseDir();
        new DataSourceFileResolver(var5);
        new DataSourceFileResolver(var5);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var5);
        Assert.assertNull("file4.getParent() == null", var5.getParent());
        Assert.assertEquals(var5.toString(), ".");
    }

    @Test
    public void test33() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test33");
        }

        Object var1 = null;
        DataSourcePathResolver var2 = new DataSourcePathResolver((Path)var1);

        try {
            DataSource var3 = var2.resolve("hi!/", false);
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/hi!");
        } catch (IOException var4) {
        }

    }

    @Test
    public void test34() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test34");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        URL var3 = var2.getBaseUrl();

        try {
            DataSource var4 = var2.resolve("hi!", false);
            Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (MalformedURLException var5) {
        }

        Assert.assertNull(var3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test35");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSource var2 = var1.resolve("");
        Class var3 = var1.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test36");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        DataSource var4 = var1.resolve("");
        File var5 = var1.getBaseDir();

        try {
            DataSource var6 = var1.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var7) {
        }

        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNull("file7.getParent() == null", var5.getParent());
        Assert.assertEquals(var5.toString(), ".");
    }

    @Test
    public void test37() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test37");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceResolver[] var6 = var3.getDataSourceResolvers();
        DataSourceResolver[] var7 = var3.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var6);
        Assert.assertNotNull(var7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test38");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("/");
        String var2 = var1.getClassPathBase();

        try {
            DataSource var3 = var1.resolve("hi!", false);
            Assert.fail("Expected exception of type java.io.IOException; message: The following class path resource was not found : hi!");
        } catch (IOException var4) {
        }

        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
    }

    @Test
    public void test39() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test39");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceCompositeResolver var6 = new DataSourceCompositeResolver(var5, true);
        DataSource var7 = var6.resolve("/");
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test40");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        URL var3 = var2.getBaseUrl();
        URL var4 = var2.getBaseUrl();
        DataSourceClassPathResolver var5 = new DataSourceClassPathResolver("", true);
        DataSourceResolver[] var6 = new DataSourceResolver[]{var2, var5};
        DataSourceCompositeResolver var7 = new DataSourceCompositeResolver(var6, false);
        Class var8 = var7.getClass();
        Assert.assertNull(var3);
        Assert.assertNull(var4);
        Assert.assertNotNull(var6);
        Assert.assertNotNull(var8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test41");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        boolean var4 = var3.isLenient();
        DataSource var5 = var3.resolve("");
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var4 + "' != 'false'", !var4);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test42");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        new DataSourceCompositeResolver(var2, false);
        new DataSourceCompositeResolver(var2, true);
        new DataSourceCompositeResolver(var2);
        Class var6 = var2.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test43");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSourceFileResolver var3 = new DataSourceFileResolver(var2);
        File var4 = var3.getBaseDir();

        try {
            DataSource var5 = var3.resolve("hi!");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var6) {
        }

        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var4);
        Assert.assertNull("file3.getParent() == null", var4.getParent());
        Assert.assertEquals(var4.toString(), ".");
    }

    @Test
    public void test44() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test44");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("");
        DataSource var4 = var1.resolve("", true);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test45");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        DataSource var4 = var1.resolve("");
        File var5 = var1.getBaseDir();
        new DataSourceFileResolver(var5);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNull("file7.getParent() == null", var5.getParent());
        Assert.assertEquals(var5.toString(), ".");
    }

    @Test
    public void test46() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test46");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceCompositeResolver var6 = new DataSourceCompositeResolver(var5, true);
        DataSource var7 = var6.resolve("hi!", true);
        DataSourceResolver[] var8 = var6.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNull(var7);
        Assert.assertNotNull(var8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test47");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        new DataSourceCompositeResolver(var2, false);
        new DataSourceCompositeResolver(var2);
        Assert.assertNotNull(var2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test48");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        boolean var2 = var1.isLenient();
        File var3 = var1.getBaseDir();
        Assert.assertTrue("'" + var2 + "' != 'false'", !var2);
        Assert.assertNotNull(var3);
        Assert.assertNull("file2.getParent() == null", var3.getParent());
        Assert.assertEquals(var3.toString(), ".");
    }

    @Test
    public void test49() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test49");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        new DataSourceCompositeResolver(var2, false);
        new DataSourceCompositeResolver(var2, true);
        DataSourceCompositeResolver var5 = new DataSourceCompositeResolver(var2);
        DataSourceResolver[] var6 = var5.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test50");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        DataSource var4 = var1.resolve("");
        File var5 = var1.getBaseDir();
        DataSourceFileResolver var6 = new DataSourceFileResolver(var5, false);

        try {
            DataSource var7 = var6.resolve("hi!/");
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var8) {
        }

        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNull("file7.getParent() == null", var5.getParent());
        Assert.assertEquals(var5.toString(), ".");
    }

    @Test
    public void test51() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test51");
        }

        Object var1 = null;
        OpenOption[] var2 = new OpenOption[0];
        DataSourcePathResolver var3 = new DataSourcePathResolver((Path)var1, true, var2);
        DataSource var4 = var3.resolve("");
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test52");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        boolean var3 = var1.isLenient();
        DataSource var4 = var1.resolve("", false);
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var3 + "' != 'false'", !var3);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test53");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("", false);
        String var2 = var1.getClassPathBase();
        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
    }

    @Test
    public void test54() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test54");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSourceFileResolver var3 = new DataSourceFileResolver(var2);
        File var4 = var3.getBaseDir();
        DataSourceFileResolver var5 = new DataSourceFileResolver(var4);
        DataSource var6 = var5.resolve("", false);
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var4);
        Assert.assertNull("file3.getParent() == null", var4.getParent());
        Assert.assertEquals(var4.toString(), ".");
        Assert.assertNotNull(var6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test55");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        boolean var3 = var2.isLenient();
        Assert.assertTrue("'" + var3 + "' != 'false'", !var3);
    }

    @Test
    public void test56() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test56");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("/");
        String var2 = var1.getClassPathBase();
        String var3 = var1.getClassPathBase();
        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
        Assert.assertEquals("'" + var3 + "' != '/'", var3, "/");
    }

    @Test
    public void test57() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test57");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        URL var3 = var2.getBaseUrl();
        URL var4 = var2.getBaseUrl();
        DataSourceClassPathResolver var5 = new DataSourceClassPathResolver("", true);
        DataSourceResolver[] var6 = new DataSourceResolver[]{var2, var5};
        new DataSourceCompositeResolver(var6, false);
        new DataSourceCompositeResolver(var6);
        Assert.assertNull(var3);
        Assert.assertNull(var4);
        Assert.assertNotNull(var6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test58");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceCompositeResolver var6 = new DataSourceCompositeResolver(var5, false);
        DataSourceResolver[] var7 = var6.getDataSourceResolvers();
        DataSource var8 = var6.resolve("/", true);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var7);
        Assert.assertNotNull(var8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test59");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceCompositeResolver var6 = new DataSourceCompositeResolver(var5, false);
        DataSourceResolver[] var7 = var6.getDataSourceResolvers();
        new DataSourceCompositeResolver(var7);
        new DataSourceCompositeResolver(var7, true);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var7);
    }

    @Test
    public void test60() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test60");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1);
        URL var3 = var2.getBaseUrl();
        Assert.assertNull(var3);
    }

    @Test
    public void test61() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test61");
        }

        DataSourceFileResolver var1 = new DataSourceFileResolver();
        File var2 = var1.getBaseDir();
        DataSource var3 = var1.resolve("/", false);
        File var4 = var1.getBaseDir();
        Class var5 = var4.getClass();
        Assert.assertNotNull(var2);
        Assert.assertNull("file1.getParent() == null", var2.getParent());
        Assert.assertEquals(var2.toString(), ".");
        Assert.assertNotNull(var3);
        Assert.assertNotNull(var4);
        Assert.assertNull("file5.getParent() == null", var4.getParent());
        Assert.assertEquals(var4.toString(), ".");
        Assert.assertNotNull(var5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test62");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        DataSourcePathResolver var3 = new DataSourcePathResolver(var2);
        DataSource var4 = var3.resolve("", false);

        try {
            DataSource var5 = var3.resolve("hi!", false);
            Assert.fail("Expected exception of type java.io.IOException; message: Cant resolve the following file resource :/mnt/c/Users/FRY/IdeaProjects/commons-email/commons-email2-jakarta/./hi!");
        } catch (IOException var6) {
        }

        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test63() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test63");
        }

        DataSourceClassPathResolver var1 = new DataSourceClassPathResolver("", true);
        String var2 = var1.getClassPathBase();
        DataSource var3 = var1.resolve("hi!/", true);
        Assert.assertEquals("'" + var2 + "' != '/'", var2, "/");
        Assert.assertNull(var3);
    }

    @Test
    public void test64() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test64");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        boolean var3 = var1.isLenient();
        Path var4 = var1.getBaseDir();
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var3 + "' != 'false'", !var3);
        Assert.assertNotNull(var4);
    }

    @Test
    public void test65() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test65");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        DataSource var4 = var3.resolve("/");
        DataSourceResolver[] var5 = var3.getDataSourceResolvers();
        DataSourceCompositeResolver var6 = new DataSourceCompositeResolver(var5, true);
        DataSource var7 = var6.resolve("");
        DataSourceResolver[] var8 = var6.getDataSourceResolvers();
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var5);
        Assert.assertNotNull(var7);
        Assert.assertNotNull(var8);
    }

    @Test
    public void test66() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test66");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSourceResolver[] var2 = new DataSourceResolver[]{var1};
        DataSourceCompositeResolver var3 = new DataSourceCompositeResolver(var2, false);
        boolean var4 = var3.isLenient();
        DataSource var5 = var3.resolve("", true);
        Assert.assertNotNull(var2);
        Assert.assertTrue("'" + var4 + "' != 'false'", !var4);
        Assert.assertNotNull(var5);
    }

    @Test
    public void test67() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test67");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        DataSource var3 = var2.resolve("hi!", true);
        URL var4 = var2.getBaseUrl();
        Assert.assertNull(var3);
        Assert.assertNull(var4);
    }

    @Test
    public void test68() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test68");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        Object var3 = null;
        OpenOption[] var4 = new OpenOption[0];
        new DataSourcePathResolver((Path)var3, true, var4);
        new DataSourcePathResolver(var2, true, var4);
        new DataSourcePathResolver(var2);
        DataSourcePathResolver var8 = new DataSourcePathResolver(var2);
        DataSource var9 = var8.resolve("/");
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var9);
    }

    @Test
    public void test69() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test69");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        DataSource var2 = var1.resolve("", true);
        DataSource var3 = var1.resolve("/", false);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var3);
    }

    @Test
    public void test70() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test70");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1, false);
        DataSource var3 = var2.resolve("hi!", true);
        DataSource var4 = var2.resolve("hi!/", true);
        URL var5 = var2.getBaseUrl();
        Assert.assertNull(var3);
        Assert.assertNull(var4);
        Assert.assertNull(var5);
    }

    @Test
    public void test71() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test71");
        }

        Object var1 = null;
        DataSourceUrlResolver var2 = new DataSourceUrlResolver((URL)var1);
        DataSource var3 = var2.resolve("hi!", true);

        try {
            DataSource var4 = var2.resolve("/", false);
            Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: /");
        } catch (MalformedURLException var5) {
        }

        Assert.assertNull(var3);
    }

    @Test
    public void test72() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test72");
        }

        DataSourcePathResolver var1 = new DataSourcePathResolver();
        Path var2 = var1.getBaseDir();
        Object var3 = null;
        OpenOption[] var4 = new OpenOption[0];
        new DataSourcePathResolver((Path)var3, true, var4);
        new DataSourcePathResolver(var2, true, var4);
        DataSourcePathResolver var7 = new DataSourcePathResolver();
        Path var8 = var7.getBaseDir();
        Object var9 = null;
        OpenOption[] var10 = new OpenOption[0];
        new DataSourcePathResolver((Path)var9, true, var10);
        new DataSourcePathResolver(var8, true, var10);
        new DataSourcePathResolver(var2, false, var10);
        Assert.assertNotNull(var2);
        Assert.assertNotNull(var4);
        Assert.assertNotNull(var8);
        Assert.assertNotNull(var10);
    }
}
