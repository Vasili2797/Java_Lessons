package com.example.demo.dao;
import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")

public class FakePersonDataAccessService implements PersonDAO{

    private static List<Person> DB=new ArrayList<>();
    
    @Override
    public int insertPerson(UUID id, Person person){
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        
        return DB.stream().filter(person -> person.getID().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe=selectPersonById(id);
        if(Optional.empty() == null){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return selectPersonById(id).map(p -> {
            int indexOfPersonToDelete = DB.indexOf(person);
            if(indexOfPersonToDelete >=0){
                DB.set(indexOfPersonToDelete, person);
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
