package com.jad;

/**
 * Interface for components with common behaviors
 */
public interface IComponent {
    /**
     * Validates the state of the component
     * @return true if valid, false otherwise
     */
    default boolean validate() {
        return true;
    }
    
    /**
     * SSerializes the component to a string
     * @return textual representation of the component
     */
    default String serialize() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
    
    /**
     * Initializes the component
     */
    default void initialize() {
        // Default behavior: do nothing
    }
}