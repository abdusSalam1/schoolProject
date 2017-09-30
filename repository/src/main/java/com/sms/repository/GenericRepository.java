package com.sms.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */

public class GenericRepository<T> implements Repository<T> {

    private final MongoRepository<T, UUID> repository;

    public GenericRepository(MongoRepository<T, UUID> repository) {
        this.repository = repository;
    }

    @Override
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        return repository.save(entities);
    }

    @Override
    public T findOne(UUID id) {
        return repository.findOne(id);
    }

    @Override
    public boolean exists(UUID id) {
        return repository.exists(id);
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<T> findAll(Iterable<UUID> ids) {
        return repository.findAll(ids);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void delete(UUID id) {
        repository.delete(id);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

    @Override
    public void delete(Iterable<? extends T> entities) {
        repository.delete(entities);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}