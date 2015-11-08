package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LocalDateCreatorTest {

    LocalDateCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new LocalDateCreator();
    }

    @Test
    public void testCreate() {
        LocalDate localDate = LocalDate.now();
        LocalDate actualDate = objectUnderTest.create(localDate);
        assertEquals(localDate, actualDate);
    }
}
