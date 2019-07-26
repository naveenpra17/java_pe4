package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlphabeticalOrderGeneratorTest {
    private AlphabeticalOrderGenerator alphabeticalOrderGenerator;

    @Before
    public void setUp(){
        alphabeticalOrderGenerator=new AlphabeticalOrderGenerator();
    }

    @After
    public void After(){
        alphabeticalOrderGenerator=null;
    }

    @Test//test method for checking alphabetical order for the fgiven inupt
    public void givenMethodShouldCheckForCorrectAlphabeticalOrderForTheGivenInputString(){
        //act
        String sortedString=alphabeticalOrderGenerator.alphabeticalSorter("my name is naveen prakash and am from tamil nadu");

        //assert

        assertEquals("amandfromismynadunamenaveenprakashtamil",sortedString);
        }

        @Test //test method for input strings as null
        public void givenMethodShouldTestForTheInputStringWhenItIsNull(){
        //act
            String string=alphabeticalOrderGenerator.alphabeticalSorter("");

            //aasert

            assertEquals(string,null);

        }

}