package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertEquals;

public class InstantCreatorTest {

    private InstantCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new InstantCreator();
    }

    @Test
    public void testCreate() {
        Instant instant = Instant.now();
        Instant actualInstant = objectUnderTest.create(instant);
        assertEquals(instant, actualInstant);
    }
}
