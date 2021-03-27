package io.zipcoder.interfaces;

import Classes.Educator;
import Classes.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void instructorsContains() {
        //Given
        Instructors instructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.HELPER));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.MASTERMIND));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.WINDU));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.VILLAIN));

    }
}
