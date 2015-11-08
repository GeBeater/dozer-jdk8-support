package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.Period;

import static org.junit.Assert.assertEquals;

public class PeriodCreatorTest {

    private PeriodCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new PeriodCreator();
    }

    @Test
    public void testCreate() {
        Period period = Period.of(2015, 11, 8);
        Period actualPeriod = objectUnderTest.create(period);
        assertEquals(period, actualPeriod);
    }
}
