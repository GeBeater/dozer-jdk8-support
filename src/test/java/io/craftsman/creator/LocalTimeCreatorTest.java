package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class LocalTimeCreatorTest {

    private LocalTimeCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new LocalTimeCreator();
    }

    @Test
    public void testCreate() {
        LocalTime localTime = LocalTime.now();
        LocalTime actualTime = objectUnderTest.create(localTime);
        assertEquals(localTime, actualTime);
    }
}
