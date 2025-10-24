package com.jad;

/**
 * Baz Class - Aggregated element, potentially typed
 */
public class Baz implements IComponent {
    private BazType type;
    
    /**
     * Default constructor (SIMPLE type)
     */
    public Baz() {
        this(BazType.SIMPLE);
    }
    
    /**
     * Constructor with specific type
     * @param type the type of Baz
     */
    public Baz(BazType type) {
        this.type = type != null ? type : BazType.SIMPLE;
        initialize();
    }
    
    /**
     * Getter for the type
     * @return the type of Baz
     */
    public BazType getType() {
        return type;
    }
    
    /**
     * Setter for the type
     * @param type the new type
     */
    public void setType(BazType type) {
        this.type = type != null ? type : BazType.SIMPLE;
    }
    
    /**
     * No-op method as requested
     */
    public void doSomethingLikeABaz() {
        // Do nothing
    }
    
    @Override
    public boolean validate() {
        return type != null;
    }
    
    @Override
    public String serialize() {
        return "Baz{type=" + type + "}";
    }
}
