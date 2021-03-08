/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.fileio2;

import java.nio.file.Path;

/**
 *
 * @author andre
 */
public class RelativizePathsExample {

    public static void execute() {

        System.out.println("RelativizePathsExample started...");

        Path p1 = Path.of("C://development/java/TestClass.java");
        Path p2 = Path.of("C://development/php/php.ini");
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));

        relativeExample();
        mixedExample();
        normalizeExample();
    }

    private static void relativeExample() {

        Path p1 = Path.of("TestClass.java");
        Path p2 = Path.of("php/php.ini");
        System.out.println(p1.relativize(p2));

    }

    private static void mixedExample() {

        Path p1 = Path.of("C://development/java/TestClass.java");
        Path p2 = Path.of("php/php.ini");
        // System.out.println(p1.relativize(p2)); WONT COMPILE
    }

    private static void normalizeExample() {
        
        Path path = Path.of("/development/java/test/../java.init");
        System.out.println(path);
        System.out.println(path.normalize());
        
    }

}
