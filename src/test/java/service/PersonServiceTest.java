package service;

import lombok.RequiredArgsConstructor;
import org.example.data.PersonData;
import org.example.model.Calculator;
import org.example.model.Person;
import org.example.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@RequiredArgsConstructor
public class PersonServiceTest {
    Calculator calculator;
    PersonService personService;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();

        personService = new PersonService(new PersonData());
    }


    @Test
    @Disabled
    @DisplayName("Testing get person by name method")
    public void testGetPersonByName(){
        PersonService personService = new PersonService(
                new PersonData()
        );
        assertEquals(
                personService.getPersonByName("Hox"),
                new Person("Hoxe", 45 , 48),
                "jdsbjkfbsdubfbdfjs"
                );
        assertEquals(
                personService.getPersonByName("Hox4"),
                null
        );

    }
}
