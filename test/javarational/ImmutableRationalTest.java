/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarational;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lauren
 */
public class ImmutableRationalTest {
    
    public ImmutableRationalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Multiply method, of class ImmutableRational.
     */
    @Test
    public void testMultiply_ImmutableRational() {
        System.out.println("Multiply");
        ImmutableRational rValue = new ImmutableRational(4,8);
        ImmutableRational instance = new ImmutableRational(2,5);
        ImmutableRational expResult = new ImmutableRational(1,5);
        ImmutableRational result = instance.Multiply(rValue);
        assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiply method, of class ImmutableRational.
     */
    @Test
    public void testMultiply_int() {
        System.out.println("Multiply");
        int rValue = 5;
        ImmutableRational instance = new ImmutableRational(1,2);
        ImmutableRational expResult = new ImmutableRational(5,2);
        ImmutableRational result = instance.Multiply(rValue);
         assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class ImmutableRational.
     */
    @Test
    public void testAdd_ImmutableRational() {
        System.out.println("Add");
        ImmutableRational rValue = new ImmutableRational(1,3);
        ImmutableRational instance = new ImmutableRational(1,2);
        ImmutableRational expResult = new ImmutableRational(5,6);
        ImmutableRational result = instance.Add(rValue);
         assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class ImmutableRational.
     */
    @Test
    public void testAdd_int() {
        System.out.println("Add");
        int rValue = 2 ;
        ImmutableRational instance = new ImmutableRational(1,3);
        ImmutableRational expResult = new ImmutableRational(7,3);
        ImmutableRational result = instance.Add(rValue);
        assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Sub method, of class ImmutableRational.
     */
    @Test
    public void testSub_ImmutableRational() {
        System.out.println("Sub");
        ImmutableRational rValue = new ImmutableRational(2,3);
        ImmutableRational instance = new ImmutableRational(3,4);
        ImmutableRational expResult = new ImmutableRational(1,12);
        ImmutableRational result = instance.Sub(rValue);
         assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Sub method, of class ImmutableRational.
     */
    @Test
    public void testSub_int() {
        System.out.println("Sub");
        int rValue = 2;
        ImmutableRational instance = new ImmutableRational(2,3);
        ImmutableRational expResult = new ImmutableRational(4,-3);
        ImmutableRational result = instance.Sub(rValue);
         assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Div method, of class ImmutableRational.
     */
    @Test
    public void testDiv_ImmutableRational() {
        System.out.println("Div");
        ImmutableRational rValue = new ImmutableRational(1,2);
        ImmutableRational instance = new ImmutableRational(2,6);
        ImmutableRational expResult = new ImmutableRational(2,3);
        ImmutableRational result = instance.Div(rValue);
        assertEquals(expResult.equals(result), result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Div method, of class ImmutableRational.
     */
    @Test
    public void testDiv_int() {
        System.out.println("Div");
        int rValue = 5;
        ImmutableRational instance = new ImmutableRational(1,5);
        ImmutableRational expResult = new ImmutableRational(1,25);
        ImmutableRational result = instance.Div(rValue);
        assertEquals(expResult.equals(result),result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ImmutableRational.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ImmutableRational instance = new ImmutableRational(7,2);
        String expResult = "7/2";
        String result = instance.toString(); 
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
