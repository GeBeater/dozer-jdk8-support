package io.craftsman.creator;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.Before;
import org.junit.Test;

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
