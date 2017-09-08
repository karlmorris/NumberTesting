/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import numberproject.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karlmorris
 */
public class ArrayTests {
    
    public ArrayTests() {
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
    
    
    @Test
    public void single (){
        assertEquals("Largest not returned", 9, Utils.largest(new int[] {9}));
    }
    
    @Test
    public void firstIsLargest(){
        assertEquals(8, Utils.largest(new int[] {8, 5, 7}));
    }
    
    @Test
    public void multiple(){
        assertEquals(9, Utils.largest(new int[] {8, 5, 7, 5, 9, 3, 9, 4}));
    }
    
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void empty() {
        System.out.println("empty");
        int x = Utils.largest(new int[] {});
        fail("Exception should have been thrown");
    }
    
    /**
     * Test of Utils.largest
     * This test to see if a null array throws the 
     * expected exception.
     */
    @Test(expected=NullPointerException.class)
    public void testNull() {
        System.out.println("testNull");
        int x = Utils.largest(null);
        fail("Exception should have been thrown");
    }

    
    

    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
