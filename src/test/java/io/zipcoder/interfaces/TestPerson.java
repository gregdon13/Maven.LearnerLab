package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor () {
        //Given
        long expectedLong = 205;
        String expectedStr = "John";
        Person person = new Person(205, "John");

        //When
        long actualLong = person.getId();
        String actualStr = person.getName();

        //Then
        Assert.assertEquals(expectedLong, actualLong);
        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testSetter() {
        //Given
        String expected = "Armando";
        Person person = new Person(364, "");

        //When
        person.setName("Armando");
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
