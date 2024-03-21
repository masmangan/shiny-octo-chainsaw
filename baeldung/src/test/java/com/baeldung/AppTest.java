package com.baeldung;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void isHeapIsTrue()
    {
        int[] a = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        boolean actual = App.isHeap(a);
        assertTrue( actual );
    }

    @Test
    public void isHeapIsFalse()
    {
        int[] a = {10, 14, 5};
        boolean actual = App.isHeap(a);
        assertTrue( !actual );
    }    
}
