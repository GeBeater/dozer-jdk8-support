package io.craftsman.creator;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import org.junit.Before;
import org.junit.Test;

public class OffsetDateTimeCreatorTest {

    private OffsetDateTimeCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new OffsetDateTimeCreator();
    }

    @Test
    public void testCreate() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime actualDateTime = objectUnderTest.create(offsetDateTime);
        assertEquals(offsetDateTime, actualDateTime);
    }
}
