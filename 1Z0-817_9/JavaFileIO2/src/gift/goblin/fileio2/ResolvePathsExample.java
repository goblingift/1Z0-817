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
public class ResolvePathsExample {
    
    public static void execute() {
        
        Path baseDir = Path.of("C://development/java");
        Path dynamicSubfolder = Path.of(Long.toString(System.currentTimeMillis()));
        Path resolvedPath = baseDir.resolve(dynamicSubfolder);
        System.out.println(resolvedPath);
        
        Path baseDir2 = Path.of("C://development/java");
        Path resolvedPath2 = baseDir2.resolve(Path.of("C://test"));
        System.out.println(resolvedPath2);
        
        
        Path mainDir = Path.of("C://development/java/testfile1.txt");
        Path resolveSibling = mainDir.resolveSibling("testfile2.txt");
        System.out.println(resolveSibling);
        
    }
    
    
    
}
