package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CreatorFactoryTest {

    private CreatorFactory objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new CreatorFactory();
    }

    @Test
    public void testCreateLocalDateCreator() {
        assertNotNull(objectUnderTest.createLocalDateCreator());
    }

    @Test
    public void testCreateLocalTimeCreator() {
        assertNotNull(objectUnderTest.createLocalTimeCreator());
    }
}
