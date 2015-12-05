package io.craftsman;

import io.craftsman.creator.CreatorFactory;
import io.craftsman.creator.LocaleCreator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JdkMissingConverterTest {

    @Mock
    private LocaleCreator localeCreatorMock;

    @Mock
    private CreatorFactory creatorFactoryMock;

    @InjectMocks
    private JdkMissingConverter objectUnderTest;


    @Before
    public void setUp() {
        when(creatorFactoryMock.createLocaleCreator()).thenReturn(localeCreatorMock);
    }

    @Test
    public void testConvertWithMissingDestinationClass() {
        Object sourceObject = new Object();
        Object destinationObject = new Object();

        Object actualObject = objectUnderTest.convert(destinationObject, sourceObject, null, Object.class);

        assertEquals(destinationObject, actualObject);
    }

    @Test
    public void testConvertWithMissingSourceClass() {
        Object sourceObject = new Object();
        Object destinationObject = new Object();

        Object actualObject = objectUnderTest.convert(destinationObject, sourceObject, Object.class, null);

        assertEquals(destinationObject, actualObject);
    }

    @Test
    public void testConvertWithMissingSource() {
        Object destinationObject = new Object();

        Object actualObject = objectUnderTest.convert(destinationObject, null, Object.class, Object.class);

        assertNull(actualObject);
    }

    @Test
    public void testConvertLocale() {
        Locale sourceLocale = new Locale("de", "DE");
        Locale destinationLocale = null;

        when(localeCreatorMock.create(sourceLocale)).thenReturn(sourceLocale);

        Object actualLocale = objectUnderTest.convert(destinationLocale, sourceLocale, Locale.class, Locale.class);

        assertThat(actualLocale, instanceOf(Locale.class));
        assertEquals(sourceLocale, actualLocale);

        verify(localeCreatorMock, times(1)).create(sourceLocale);
    }
}
