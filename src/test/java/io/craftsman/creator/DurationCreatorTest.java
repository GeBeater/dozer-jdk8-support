package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

public class DurationCreatorTest {

    private DurationCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new DurationCreator();
    }

    @Test
    public void testCreate() {
        Duration duration = Duration.of(1000, ChronoUnit.NANOS);
        Duration actualDuration = objectUnderTest.create(duration);
        assertEquals(duration, actualDuration);
    }
}
