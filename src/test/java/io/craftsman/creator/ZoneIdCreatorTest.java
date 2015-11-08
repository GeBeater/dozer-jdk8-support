package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

public class ZoneIdCreatorTest {

    private ZoneIdCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new ZoneIdCreator();
    }

    @Test
    public void testCreate() {
        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        ZoneId actualZoneId = objectUnderTest.create(zoneId);
        assertEquals(zoneId, actualZoneId);
    }
}
