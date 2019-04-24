/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ismehene
 */
public class TestunitTest {
    Testunit helloWorldInstance;
    
    public TestunitTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUp()");
        helloWorldInstance = new Testunit();
    }
    
    @After
    public void tearDown() {
        System.out.println("* HelloWorldTest: After method tearDown()");
        helloWorldInstance = null;
    }

    /**
     * Test of main method, of class Testunit.
     */
    @Test
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        Testunit.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    public void testFormMessage() {
        //Asserts that two Strings are equal                
        String expResult = "Hello World";
        String result = helloWorldInstance.formMessage();
        System.out.println("* HelloWorldTest: test method 1 testFormMessage()");
         Assert.assertEquals(expResult, result);
    }   
    
}
