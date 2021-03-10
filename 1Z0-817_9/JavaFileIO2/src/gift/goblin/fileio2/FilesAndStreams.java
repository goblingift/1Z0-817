/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.fileio2;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class FilesAndStreams {

    public static void execute() {

        listFiles();
        visitAllDirectories();
        visitAllDirectoriesSymLinks();
        searchForFiles();
        readFiles();
        
    }

    private static void listFiles() {

        Path p = Path.of("C://temp");
        try (Stream<Path> pathStream = Files.list(p)) {
            pathStream.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("IOException thrown! " + ex.getMessage());
        }

    }

    private static void visitAllDirectories() {

        System.out.println("starting visit all dirs");
        
        Path p = Path.of("C://temp");
        try (Stream<Path> pathStream = Files.walk(p,1)) {
            pathStream.forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private static void visitAllDirectoriesSymLinks() {
        
        System.out.println("starting visit all dirs and following symlinks");
        
        Path p = Path.of("C://temp/java");
        try (Stream<Path> pathStream = Files.walk(p, FileVisitOption.FOLLOW_LINKS)) {
            pathStream.forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void searchForFiles() {
        System.out.println("Starting with search for files!!!");
        try {
            Path startingPath = Path.of("C://development/java");
            Instant beforeHalfYear = LocalDateTime.now().toInstant(ZoneOffset.UTC).minus(180, ChronoUnit.DAYS);
            Files.find(startingPath, 1, (Path p, BasicFileAttributes b) ->
                    b.creationTime().toInstant().isBefore(beforeHalfYear))
                    .forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void readFiles() {
        System.out.println("Starting readFiles!");
        
        try {
            Path testFile = Path.of("C://temp/java/testlog.txt");
            
            List<String> readAllLines = Files.readAllLines(testFile);
            readAllLines.forEach(System.out::println);
            
            Stream<String> lines = Files.lines(testFile);
            lines.forEach(System.out::println);
            
            
        } catch (IOException ex) {
            Logger.getLogger(FilesAndStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
