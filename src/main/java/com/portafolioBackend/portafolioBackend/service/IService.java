package com.portafolioBackend.portafolioBackend.service;

import com.portafolioBackend.portafolioBackend.model.Conocimiento;

import java.util.List;

public interface IService<T> {
    
    List<T> getAll();

    List<T> getAllByIdPerson(Integer idPersona);
    
    T save(T entity);
    
    void deleteById(Integer id);
    
    T getById(Integer id);

    T edit(T entity);
}
