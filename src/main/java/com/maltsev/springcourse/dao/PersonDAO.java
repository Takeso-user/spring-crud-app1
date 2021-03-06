package com.maltsev.springcourse.dao;

import com.maltsev.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;
    {
        people=new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"John"));
        people.add(new Person(++PEOPLE_COUNT,"Mike"));
        people.add(new Person(++PEOPLE_COUNT,"Anna"));
        people.add(new Person(++PEOPLE_COUNT,"Kate"));
    }

    public List<Person> index() {
        return people;
    }
    public Person show (int id){
        return people.stream().filter(person->person.getId()==id).findAny().orElse(null);
    }

}
