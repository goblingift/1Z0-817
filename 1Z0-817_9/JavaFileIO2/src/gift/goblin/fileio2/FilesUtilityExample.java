/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.fileio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class FilesUtilityExample {
    
    public static void execute() {
        exists();
        pointsToSameFile();
        creatingFoldersExample();
        copyFilesExample();
        strangeCopyFilesExample();
        moveFilesAndDirsExample();
        deleteFilesAndFoldersExample();
    }
    
    private static void exists() {
        
        System.out.println("Starting exists() method...");
        
        Path pathFile = Path.of("C://temp/php.ini");
        Path pathDirectory = Path.of("C://temp/jar_test");
        System.out.println(Files.exists(pathFile));
        System.out.println(Files.exists(pathDirectory));
        
    }
    
    private static void pointsToSameFile() {
        System.out.println("Starting pointsToSameFile() method...");
        
        Path p1 = Path.of("C://temp//development//..//php2.ini");
        Path p2 = Path.of("C://temp//php2.ini");
        try {
            System.out.println(Files.isSameFile(p1, p2));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        Path p3 = Path.of("Z://windows/definitely_not_exists.java");
        try {
            System.out.println(Files.isSameFile(p3, p3));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        
    }

    private static void creatingFoldersExample() {
        
        try {
            Files.createDirectories(Path.of("Z://temp/testfiles/java/testt"));
            System.out.println("Successful created path!");
        } catch (IOException ex) {
            System.out.println("Exception while creating path:" + ex.getMessage());
        }
        
    }

    private static void copyFilesExample() {
        
        Path originalFile = Path.of("C:", "temp", "java", "php.ini");
        Path targetFile = Path.of("C:", "temp", "java", "php_copied.ini");
        try {
            Files.copy(originalFile, targetFile);
            System.out.println("Succesful copied file!");
        } catch (IOException ex) {
            System.out.println("Exception while copying file: " + ex.getMessage());
        }
        
    }

    private static void strangeCopyFilesExample() {
        
        try {
            Files.copy(Path.of("C://temp/java"), Path.of("C://temp/java2"));
            System.out.println("Succesful copied file!");
        } catch (IOException ex) {
            System.out.println("Exception while copying file: " + ex.getMessage());
        }
    }

    private static void moveFilesAndDirsExample() {
        
        Path originalFile = Path.of("C:", "temp", "java", "php.ini");
        Path targetFile = Path.of("C:", "temp", "java", "php_moved.ini");
        
        try {
            Files.move(originalFile, targetFile);
            System.out.println("Succesful moved file!");
        } catch (IOException ex) {
            System.out.println("Exception while moving file: " + ex.getMessage());
        }
    }

    private static void deleteFilesAndFoldersExample() {
        
        Path originalFile = Path.of("C:", "temp", "java", "php.ini");
        Path targetFile = Path.of("C:", "temp", "java", "php_copied.ini");
        
        try {
            Files.copy(originalFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(FilesUtilityExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Path file = Path.of("C://temp/java/php_copied.ini");
        try {
            Files.delete(file);
            boolean deleteIfExists = Files.deleteIfExists(file);
            System.out.println("Result of deletion: " + deleteIfExists);
        } catch (IOException ex) {
            System.out.println("IOException thrown!");
        }
        
        
    }
    
    
}
