/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.trywithresources;

/**
 *
 * @author andre
 */
public class OwnTryWithResourceImpl {
    
    private class SelfClosingAction implements AutoCloseable {
        
        int actionCount;

        public SelfClosingAction(int actionCount) {
            this.actionCount = actionCount;
        }
        
        @Override
        public void close() throws Exception {
            System.out.println("CLOSED RESOURCE, SIR!");
        }
        
    }
    
    private class FastClosingAction implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("OFF!");
        }
    }
    
    public void execute() {
        
        System.out.println("Starting code and calling dangerous methods now...");
        try (SelfClosingAction s = new SelfClosingAction(100);
                FastClosingAction f = new FastClosingAction()) {
            System.out.println(s.actionCount);
        } catch (Exception e) {
            System.out.println("Exception thrown!");
        }
        
    }
    
    public void executeTwo() {
        
        SelfClosingAction selfClosingAction = new SelfClosingAction(99);
        
        try (selfClosingAction) {
            System.out.println("doing risky stuff...");
        } catch (Exception e) {
            System.out.println("BAM!");
        }
        
    }
    
    
}
