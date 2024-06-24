package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.data.PersonData;
import org.example.model.Person;

@RequiredArgsConstructor
public class PersonService {
    private final PersonData personData;

    public Person getPersonByName(String name){
        for (Person person : personData.getPersonList()){
            if (person.getName().equals(name)){
                return person;
            }
        }
//        personData.getPersonList().stream().filter(person -> {
//            Person checkPerson = null;
//            if (person.getName().equals(name)){
//                checkPerson = person;
//            }

//            return (checkPerson ? true : false);
//            return person.getName().equals(name);
//        });
        return null;
    }

}
