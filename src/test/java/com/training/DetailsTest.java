package com.training;

import org.junit.Assert;
import org.junit.Test;

public class DetailsTest {
    Details guessDetails = new Details();

    @Test
    public void none() {
        Assert.assertEquals("no boys are available.", guessDetails.getDetails("boy", 0));
    }

    @Test
    public void one() {
        Assert.assertEquals("one boy is available.", guessDetails.getDetails("boy", 1));
    }

    @Test
    public void many() {
        Assert.assertEquals("5 boys are available.", guessDetails.getDetails("boy", 5));
    }
}
