package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable {
    public ArrayList<E> personList;

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        E found = null;
        for (E person : personList) {
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

    public abstract Person[] toArray();


    public Iterator<E> iterator() {
        return personList.listIterator();
    }

    public ArrayList<E> getArr() {
        return this.personList;
    }
}
