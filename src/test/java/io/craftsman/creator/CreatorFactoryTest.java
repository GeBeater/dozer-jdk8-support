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

    @Test
    public void testCreateLocalDateTimeCreator() {
        assertNotNull(objectUnderTest.createLocalDateTimeCreator());
    }

    @Test
    public void testCreateZonedDateTimeCreator() {
        assertNotNull(objectUnderTest.createZonedDateTimeCreator());
    }

    @Test
    public void testCreateZoneIdCreator() {
        assertNotNull(objectUnderTest.createZoneIdCreator());
    }

    @Test
    public void testCreateDurationCreator() {
        assertNotNull(objectUnderTest.createDurationCreator());
    }

    @Test
    public void testCreatePeriodCreator() {
        assertNotNull(objectUnderTest.createPeriodCreator());
    }

    @Test
    public void testCreateLocaleCreator() {
        assertNotNull(objectUnderTest.createLocaleCreator());
    }

    @Test
    public void testCreateInstantCreator() {
        assertNotNull(objectUnderTest.createInstantCreator());
    }
}
