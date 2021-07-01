package isp.lab3;

import org.junit.Test;

import isp.lab3.exercise1.Tree;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Rares
 */
public class Exercise1Test {
    
    @Test
    public void testGrow() {
        Tree stejar;
        stejar=new Tree();
        stejar.grow(5);
        assertEquals("Should grow", 20, stejar.height);
    }

    @Test
    public void testtoString() {
        Tree fag;
        fag=new Tree();
        String s=fag.toString();
        assertEquals("Should show string", "15", s);
    }
    
}

