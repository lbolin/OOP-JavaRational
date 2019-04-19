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
public class MutableRationalTest {
    
    public MutableRationalTest() {
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
     * Test of Multiply method, of class MutableRational.
     */
    @Test
    public void testMultiply_MutableRational() {
        System.out.println("Multiply");
        MutableRational rValue = new MutableRational(1,5);
        MutableRational instance = new MutableRational(2,4);
        instance.Multiply(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiply method, of class MutableRational.
     */
    @Test
    public void testMultiply_int() {
        System.out.println("Multiply");
        int rValue = 5;
        MutableRational instance = new MutableRational(1/2);
        instance.Multiply(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class MutableRational.
     */
    @Test
    public void testAdd_MutableRational() {
        System.out.println("Add");
        MutableRational rValue = new MutableRational(1/2);
        MutableRational instance = new MutableRational(5/4);
        instance.Add(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class MutableRational.
     */
    @Test
    public void testAdd_int() {
        System.out.println("Add");
        int rValue = 6;
        MutableRational instance = new MutableRational(2,5);
        instance.Add(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Sub method, of class MutableRational.
     */
    @Test
    public void testSub_MutableRational() {
        System.out.println("Sub");
        MutableRational rValue = new MutableRational(2,7);
        MutableRational instance = new MutableRational(1,3);
        instance.Sub(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Sub method, of class MutableRational.
     */
    @Test
    public void testSub_int() {
        System.out.println("Sub");
        int rValue = 6;
        MutableRational instance = new MutableRational(1/5);
        instance.Sub(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Div method, of class MutableRational.
     */
    @Test
    public void testDiv_MutableRational() {
        System.out.println("Div");
        MutableRational rValue = new MutableRational(1/3);
        MutableRational instance = new MutableRational(7/8);
        instance.Div(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Div method, of class MutableRational.
     */
    @Test
    public void testDiv_int() {
        System.out.println("Div");
        int rValue = 5;
        MutableRational instance = new MutableRational(2,5);
        instance.Div(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MutableRational.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MutableRational instance = new MutableRational(4,5);
        String expResult = "4/5";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Set method, of class MutableRational.
     */
    @Test
    public void testSet_MutableRational() {
        System.out.println("Set");
        MutableRational rValue = new MutableRational(6,7);
        MutableRational instance = new MutableRational(4,6);
        instance.Set(rValue);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Set method, of class MutableRational.
     */
    @Test
    public void testSet_int() {
        System.out.println("Set");
        int rValue = 6;
        MutableRational instance = new MutableRational(2,3);
        instance.Set(rValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
