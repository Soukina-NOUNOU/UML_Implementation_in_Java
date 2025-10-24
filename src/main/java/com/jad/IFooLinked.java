package com.jad;

/**
 * Interface for classes that maintain a reference to Foo
 */
public interface IFooLinked {
    /**
     * Gets the reference to Foo
     * @return the associated Foo instance
     */
    Foo getFoo();
    
    /**
     * Sets the reference to Foo
     * @param foo the associated Foo instance
     */
    void setFoo(Foo foo);
    
    /**
     * Checks if the entity is linked to a Foo
     * @return true if linked, false otherwise
     */
    default boolean isLinkedToFoo() {
        return getFoo() != null;
    }
}