package com.portafolioBackend.portafolioBackend.service;

import java.util.List;

public interface IService<T> {
    
    List<T> getAll();
    
    T save(T entity);
    
    void deleteById(Integer id);
    
    T getById(Integer id);

    T edit(T entity);
}
