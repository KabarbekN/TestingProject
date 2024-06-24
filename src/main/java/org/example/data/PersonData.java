package org.example.data;

import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
    public static Person person = new Person("df", 45, 486);
    public static List<Person> personList = new ArrayList<>(
            List.of(
            new Person("Hoxe", 45 , 48),
            new Person("IUIO", 45 , 118),
            person
                )
    );

    public List<Person> getPersonList(){
        return personList;
    }

}
