package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {

    private ReplaceAll replaceAllStrings;

    @Before
    public void setUp(){
        replaceAllStrings=new ReplaceAll();
    }

    @After
    public void tearDown(){
        replaceAllStrings=null;
    }

    @Test
    public void givenMethodWillCheckWhetherReplacedStringMatchesWithTheExpectedValues(){
        //act

        String replacedString=replaceAllStrings.givenMethodReplaceStringWithChar("My name is naveen prakash","n","a","s","i");

        //assert

        assertEquals("My sime is sivees prikish",replacedString);
    }

    @Test
    public void givenMethodShouldCheckWhetherTheReplaceWithValuesArePresentOrNot(){

        //act
        boolean replacedString=replaceAllStrings.givenMethodCheckStringWithReplaceWithChar("My name is naveen prakash","n","a","s","i");

        //assert
        assertTrue(replacedString);
    }

}