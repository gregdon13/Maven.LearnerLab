package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //Given
        People people = new People();
        Person personOne = new Person(123, "Vision");
        Person personTwo = new Person(456, "Clint");
        people.add(personOne);
        people.add(personTwo);
        int expected = 2;

        //When
        int actual = people.count();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
