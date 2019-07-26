package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfTheStringTest {
    private TransposeOfTheString transposeOfTheString;

    @Before
    public void setUp(){
        transposeOfTheString=new TransposeOfTheString();
    }

    @After
    public void tearUp(){
        transposeOfTheString=null;
    }

    @Test
    public void givenMethodShouldCheckForTheTranspose(){
        //act
        String trasposedString=transposeOfTheString.methodToGetTranspose("my name is naveen prakash");

        //assert
        assertEquals("ym eman si neevan hsakarp",trasposedString);
    }

}