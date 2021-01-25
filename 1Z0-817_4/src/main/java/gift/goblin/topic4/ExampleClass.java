/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.topic4;

/**
 *
 * @author andre
 */
public class ExampleClass {

    // var localVariable = "teststring"; --> Wont compile, not allowed as instance-variable
    
    public void simpleLocalVariables() {

        var localInt = 7;
        var anotherLocalInt = 3;
        var localString = "...";
        
        int sum = localInt + anotherLocalInt;
        System.out.println("Sum: " + sum + localString);
    }
    
    public void invalidAssignment() {
        var verySmall = (short)7;
        verySmall = 8;
        // verySmall = 8_999_888; DOESNT COMPILE
        // var nullVariable = null; DOESNT COMPILE
    }
    
    public void multipleAssignments() {
        int a, b = 10;
        // var c, d = 20; DOESNT COMPILE
    }
    
    public void nullValues() {
        // var x = null; DOESNT COMPILE
        var y = "Yeah!";
        y = null;
        var number = 17;
        // number = null; DOESNT COMPILE
    }
    
    public void invalidDifferentLines() {
        // var myText;
        // myText = "Test";
        var anotherVariable
                = "works fine";
    }
    
    /* DOESNT COMPILE
    public void varAsMethodParams(var x, var y) {
    var sum = x + y;
    }
    */
    
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.simpleLocalVariables();
    }
}
