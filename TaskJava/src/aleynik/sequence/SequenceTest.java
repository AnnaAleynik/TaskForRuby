package aleynik.sequence;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class SequenceTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testOneSequence() {
        Sequence s = new Sequence(1);
        Assert.assertEquals("1\n", s.toString());
    }

    @Test
    public void testFourSequence() {
        Sequence s = new Sequence(4);
        String expected = "1\n11\n21\n1211\n";
        Assert.assertEquals(expected, s.toString());
    }

    @Test
    public  void testEmptySequence() {
        Sequence s = new Sequence(0);
        Assert.assertEquals("Empty sequence.", s.toString());
    }

    @Test
    public void textExceptionSequence() {
        Sequence s = new Sequence(-1);
    }

    @Test
    public void testPrint() {
        Sequence s = new Sequence(4);
        Assert.assertEquals("21", s.print(2));
    }

    @Test
    public void testErrorPrint() {
        Sequence s = new Sequence(4);
        Assert.assertEquals("No such item in the sequence.", s.print(-1));
    }

}