/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.topic4;

/**
 *
 * @author andre
 */
public class ArrayExample {
    
    public static void execute() {
        
        // Valid array initialisations:
        int[] oneDimension = {1, 2, 3};
        int[] oneDimensionLong = new int[] {0, 10, 20};
        
        int[][] twoDimensions = {{20}, {100, 200}};
        
        // var typeReferenceArray = {10, 20, 30};  --> Wont compile, type unknown!
        // var[] legalTypeReferenceArray = new int[] {200, 300};  --> Invalid syntax
        var legalTypeReferenceArray = new int[] {200, 300};
        
    }
    
}
