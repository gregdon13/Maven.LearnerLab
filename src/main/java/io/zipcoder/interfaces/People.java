package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList;

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person found = new Person(00, "");
        for (Person person : personList) {
            if (person.getId() == id) {
                found = person;
            }
        }
        return found;
    }

    public Boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(Person person) {
        if (personList.contains(person)) {
            personList.remove(person);
        }
    }

    public void remove(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] personArr = new Person[count()];
        for (int i = 0; i < personList.size(); i++) {
            personArr[i] = personList.get(i);
        }
        return personArr;
    }


    public Iterator<Person> iterator() {
        return personList.listIterator();
    }
}
