package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class LocalDateTimeCreatorTest {

    private LocalDateTimeCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new LocalDateTimeCreator();
    }

    @Test
    public void testCreate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime actualDateTime = objectUnderTest.create(localDateTime);
        assertEquals(localDateTime, actualDateTime);
    }
}
