package com.jad;

/**
 * Bar Class - Mandatory Component of Foo
 */
public class Bar implements IComponent {
    
    /**
     * Default constructor
     */
    public Bar() {
        initialize();
    }
    
    /**
     * No-op method as requested
     */
    public void doSomethingLikeABar() {
        // Do nothing
    }
    
    @Override
    public String serialize() {
        return "Bar{}";
    }
}
