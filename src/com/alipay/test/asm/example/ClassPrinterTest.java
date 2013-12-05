/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.alipay.test.asm.example;

import java.io.IOException;
import java.io.InputStream;

import org.objectweb.asm.ClassReader;

import com.alipay.test.asm.ClassPrinter;

/**
 * 
 * @author yimingwym 
 * @version $Id: ClassPrinterTest.java, v 0.1 2013-11-12 ÏÂÎç6:02:46 yimingwym Exp $
 */
public class ClassPrinterTest {

    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("com.alipay.test.asm.example.pkg.Bean");
        ClassLoader cl = ClassPrinterTest.class.getClassLoader();
        InputStream is = cl.getResourceAsStream("com.alipay.test.asm.example.pkg.Bean".replace(".",
            "/") + ".class");
        ClassReader cr1 = new ClassReader(is);

        cr1.accept(cp, 0);
    }
}
