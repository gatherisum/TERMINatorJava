package com.termin.ator.models;

import org.springframework.data.repository.CrudRepository;

import com.termin.ator.entities.Leistung;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LeistungModel extends CrudRepository<Leistung, Integer> {

}