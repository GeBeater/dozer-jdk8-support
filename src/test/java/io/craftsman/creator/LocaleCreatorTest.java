package io.craftsman.creator;

import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class LocaleCreatorTest {

    private LocaleCreator objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new LocaleCreator();
    }

    @Test
    public void testCreate() {
        Locale locale = new Locale("de", "DE");
        Locale actualLocale = objectUnderTest.create(locale);
        assertEquals(locale, actualLocale);
    }
}
