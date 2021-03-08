/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.fileio2;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class PathCreationExample {

    public static void execute() {

        Path textFile = Path.of("subfolder/testfile.txt");
        System.out.println(textFile);

        Path textFileVarArgs = Path.of("subfolder", "testfile.txt");
        System.out.println(textFileVarArgs);

        Path absoluteTextFile = Path.of("C:\\test.txt");
        System.out.println(absoluteTextFile);

        olderInitialisation();
        funWithUri();
        fileSystemsExample();
        conversionExample();
        moreDetailsPlease();
        absolutePathsExample();
    }

    private static void olderInitialisation() {

        Path textFile = Paths.get("subfolder/anotherfile.txt");
        System.out.println(textFile);

        Path absoluteTextFile = Paths.get("C:\\anotherfile.txt");
        System.out.println(absoluteTextFile);

    }

    private static void funWithUri() {

        URI uri = null;
        try {
            uri = new URI("file://C:/temp/php.ini");
        } catch (URISyntaxException ex) {
            System.err.println(ex.getMessage());
        }

        Path uriTestFile1 = Paths.get(uri);
        System.out.println(uriTestFile1);

        Path uriTestFile2 = Path.of(uri);
        System.out.println(uriTestFile2);

    }

    private static void fileSystemsExample() {

        Path mainDrive = FileSystems.getDefault().getPath("C:\\");
        System.out.println(mainDrive);

    }

    private static void conversionExample() {

        Path path = Path.of("C://test.txt");
        File convertedFile = path.toFile();

        File file = new File("C://test.txt");
        Path convertedPath = file.toPath();

    }

    private static void moreDetailsPlease() {

        System.out.println("Starting with moreDetailsPlease...");

        Path path = Path.of("C://temp/php.ini");
        System.out.println(path.toString());

        Path fileName = Path.of("C://temp/php.ini").getFileName();
        System.out.println(fileName);
        System.out.println(Path.of("C://temp").getFileName());

        System.out.println(Path.of("C://temp/php.ini").getNameCount());
        System.out.println(Path.of("D://").getNameCount());

        System.out.println(Path.of("C://temp/php.ini").getName(0));
        // System.out.println(Path.of("D://").getName(0)); --> WONT COMPILE, java.lang.IllegalArgumentException

        System.out.println(Path.of("C://temp/php.ini").subpath(0, 2));

    }

    private static void absolutePathsExample() {
        
        System.out.println("Starting absolutePathsExample...");
        
        Path path = Path.of("/dir/testfile.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());
        
        Path absolutePath = Path.of("C://temp/dir/test.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());
        
        
    }

}
