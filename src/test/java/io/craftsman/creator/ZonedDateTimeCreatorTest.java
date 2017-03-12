package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class ZonedDateTimeCreatorTest {

    private ZonedDateTimeCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new ZonedDateTimeCreator();
    }

    @Test
    public void testCreate() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime actualDateTime = objectUnderTest.create(zonedDateTime);
        assertEquals(zonedDateTime, actualDateTime);
    }
}
