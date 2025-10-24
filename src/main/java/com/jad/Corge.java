package com.jad;

/**
 * Corge Class - Inverse reference to Foo (0..1 relationship)
 */
public class Corge implements IFooLinked, IComponent {
    private Foo foo;

    /**
     * Constructor with reference to Foo
     * @param foo the associated Foo instance
     */
    public Corge(Foo foo) {
        this.foo = null;
        if (foo != null) {
            foo.setCorge(this); 
        }
        initialize();
    }

    /**
     * Getter for Foo
     * @return the associated Foo instance
     */
    @Override
    public Foo getFoo() {
        return foo;
    }

    /**
     * Setter for Foo with bidirectional management
     * @param newFoo the instance of Foo to associate
     */
    @Override
    public void setFoo(Foo newFoo) {
        if (this.foo == newFoo) {
            return; 
        }

        if (this.foo != null) {
            Foo oldFoo = this.foo;
            this.foo = null; 
            oldFoo.setCorge(null);
        }
       
        this.foo = newFoo;
        if (newFoo != null && newFoo.getCorge() != this) {
            newFoo.setCorge(this);
        }
    }
    
    /**
     * No-op method as requested (although not specified in the instructions)
     */
    public void doSomethingLikeACorge() {
        // Do nothing
    }
    
    @Override
    public boolean validate() {
        return true; // Corge can exist without Foo (0..1 relationship)
    }
    
    @Override
    public String serialize() {
        return "Corge{linkedToFoo=" + isLinkedToFoo() + "}";
    }
}