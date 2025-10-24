package com.jad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generic class for managing collections of entities
 * @param <T> the type of entity managed by this repository
 */
public class Repository<T> {
    private final List<T> entities;
    
    /**
     * Default constructor
     */
    public Repository() {
        this.entities = new ArrayList<>();
    }
    
    /**
     * Adds an entity to the repository
     * @param entity the entity to add
     * @return true if the addition was successful
     */
    public boolean add(T entity) {
        if (entity != null) {
            return entities.add(entity);
        }
        return false;
    }
    
    /**
     * Removes an entity from the repository
     * @param entity the entity to remove
     * @return true if the removal was successful
     */
    public boolean remove(T entity) {
        return entities.remove(entity);
    }
    
    /**
     * Finds the first entity matching the predicate
     * @param predicate the search criterion
     * @return an Optional containing the found entity or empty
     */
    public Optional<T> findFirst(Predicate<T> predicate) {
        return entities.stream().filter(predicate).findFirst();
    }
    
    /**
     * Finds all entities matching the predicate
     * @param predicate the search criterion
     * @return the list of found entities
     */
    public List<T> findAll(Predicate<T> predicate) {
        return entities.stream().filter(predicate).toList();
    }
    
    /**
     * Returns all entities
     * @return the list of all entities
     */
    public List<T> getAll() {
        return new ArrayList<>(entities);
    }
    
    /**
     * Returns the number of entities
     * @return the number of entities in the repository
     */
    public int size() {
        return entities.size();
    }
    
    /**
     * Checks if the repository is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return entities.isEmpty();
    }
    
    /**
     * Clears the repository
     */
    public void clear() {
        entities.clear();
    }
}