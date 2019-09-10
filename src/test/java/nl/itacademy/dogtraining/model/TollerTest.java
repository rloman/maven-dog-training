package nl.itacademy.dogtraining.model;

import org.junit.Assert;
import org.junit.Test;

public class TollerTest {

    @Test
    public void testSetName() {
        Toller toller = new Toller();
        toller.setName("Dexter");

        Assert.assertEquals("Dexter", toller.getName());
    }

    @Test
    public void testSetAge() {
        Toller toller = new Toller();
        toller.setAge(7);

        Assert.assertEquals(7, toller.getAge());
    }

}
