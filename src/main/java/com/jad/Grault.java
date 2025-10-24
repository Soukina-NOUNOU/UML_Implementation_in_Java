package com.jad;

/**
 * Grault Class - Back reference to Foo (relation *)
 */
public class Grault implements IFooLinked, IComponent {
    private Foo foo;

    /**
     * Constructor with reference to Foo
     * @param foo the associated Foo instance
     */
    public Grault(Foo foo) {
        this.foo = foo;
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
     * Setter for Foo
     * @param foo the instance of Foo to associate
     */
    @Override
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
    
    /**
     * No-op method as requested (although not specified in the instructions)
     */
    public void doSomethingLikeAGrault() {
        // Do nothing
    }
    
    @Override
    public boolean validate() {
        return foo != null;
    }
    
    @Override
    public String serialize() {
        return "Grault{linkedToFoo=" + isLinkedToFoo() + "}";
    }
}