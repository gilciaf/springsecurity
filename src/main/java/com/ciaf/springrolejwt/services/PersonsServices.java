package com.ciaf.springrolejwt.services;

import com.ciaf.springrolejwt.entities.Persons;
import com.ciaf.springrolejwt.repositories.PersonsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonsServices {

    @Autowired
    private PersonsRepositories repository;

    public List<Persons> findAll(){
        return repository.findAll();
    }

//    public Persons findById(Long id) {
//        Optional<Persons> person = repository.findById(id);
//        return person.orElseThrow(() -> new ResourceNotFoundException(id));
//    }

    public Persons findByName(String name) {
        Optional<Persons> person = repository.findByNameNative(name);
        return person.orElseThrow();
    }

    public Persons findByCpfOrCnpj(String cpf_cnpj) {
        Optional<Persons> person = repository.findByCpfCnpj(cpf_cnpj);
        return person.orElseThrow();
    }

    public Persons create(Persons person) {
        return repository.save(person);
    }

    public Persons update(Long id, Persons person) {
        person.setId(id);
        return repository.save(person);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
