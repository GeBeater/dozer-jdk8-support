package io.craftsman;

import io.craftsman.creator.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Jdk8CompatibilityConverterTest {

    @Mock
    private LocalDateCreator localDateCreatorMock;

    @Mock
    private LocalTimeCreator localTimeCreatorMock;

    @Mock
    private LocalDateTimeCreator localDateTimeCreatorMock;

    @Mock
    private ZoneIdCreator zoneIdCreatorMock;

    @Mock
    private DurationCreator durationCreatorMock;

    @Mock
    private PeriodCreator periodCreatorMock;

    @Mock
    private CreatorFactory creatorFactoryMock;

    @InjectMocks
    private Jdk8CompatibilityConverter objectUnderTest;


    @Before
    public void setUp() {
        when(creatorFactoryMock.createLocalDateCreator()).thenReturn(localDateCreatorMock);
        when(creatorFactoryMock.createLocalTimeCreator()).thenReturn(localTimeCreatorMock);
        when(creatorFactoryMock.createLocalDateTimeCreator()).thenReturn(localDateTimeCreatorMock);
        when(creatorFactoryMock.createZoneIdCreator()).thenReturn(zoneIdCreatorMock);
        when(creatorFactoryMock.createDurationCreator()).thenReturn(durationCreatorMock);
        when(creatorFactoryMock.createPeriodCreator()).thenReturn(periodCreatorMock);
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
    public void testConvertLocalDate() {
        LocalDate sourceLocalDate = LocalDate.now();
        LocalDate destinationLocalDate = null;

        when(localDateCreatorMock.create(sourceLocalDate)).thenReturn(sourceLocalDate);

        Object actualLocalDate = objectUnderTest.convert(destinationLocalDate, sourceLocalDate, LocalDate.class, LocalDate.class);

        assertThat(actualLocalDate, instanceOf(LocalDate.class));
        assertEquals(sourceLocalDate, actualLocalDate);

        verify(localDateCreatorMock, times(1)).create(sourceLocalDate);
    }

    @Test
    public void testConvertLocalTime() {
        LocalTime sourceLocalTime = LocalTime.now();
        LocalTime destinationLocalTime = null;

        when(localTimeCreatorMock.create(sourceLocalTime)).thenReturn(sourceLocalTime);

        Object actualLocalTime = objectUnderTest.convert(destinationLocalTime, sourceLocalTime, LocalTime.class, LocalTime.class);

        assertThat(actualLocalTime, instanceOf(LocalTime.class));
        assertEquals(sourceLocalTime, actualLocalTime);

        verify(localTimeCreatorMock, times(1)).create(sourceLocalTime);
    }

    @Test
    public void testConvertLocalDateTime() {
        LocalDateTime sourceLocalDateTime = LocalDateTime.now();
        LocalDateTime destinationLocalDateTime = null;

        when(localDateTimeCreatorMock.create(sourceLocalDateTime)).thenReturn(sourceLocalDateTime);

        Object actualLocalDateTime = objectUnderTest.convert(destinationLocalDateTime, sourceLocalDateTime, LocalDateTime.class, LocalDateTime.class);

        assertThat(actualLocalDateTime, instanceOf(LocalDateTime.class));
        assertEquals(sourceLocalDateTime, actualLocalDateTime);

        verify(localDateTimeCreatorMock, times(1)).create(sourceLocalDateTime);
    }

    @Test
    public void testConvertZoneId() {
        ZoneId sourceZoneId = ZoneId.of("Europe/Berlin");
        ZoneId destinationZoneId = null;

        when(zoneIdCreatorMock.create(sourceZoneId)).thenReturn(sourceZoneId);

        Object actualZoneId = objectUnderTest.convert(destinationZoneId, sourceZoneId, ZoneId.class, ZoneId.class);

        assertThat(actualZoneId, instanceOf(ZoneId.class));
        assertEquals(sourceZoneId, actualZoneId);

        verify(zoneIdCreatorMock, times(1)).create(sourceZoneId);
    }

    @Test
    public void testConvertDuration() {
        Duration sourceDuration = Duration.of(1000, ChronoUnit.NANOS);
        Duration destinationDuration = null;

        when(durationCreatorMock.create(sourceDuration)).thenReturn(sourceDuration);

        Object actualDuration = objectUnderTest.convert(destinationDuration, sourceDuration, Duration.class, Duration.class);

        assertThat(actualDuration, instanceOf(Duration.class));
        assertEquals(sourceDuration, actualDuration);

        verify(durationCreatorMock, times(1)).create(sourceDuration);
    }

    @Test
    public void testCreateBeanForPeriod() {
        Period sourcePeriod = Period.of(2015, 11, 8);
        Period destinationPeriod = null;

        when(periodCreatorMock.create(sourcePeriod)).thenReturn(sourcePeriod);

        Object actualPeriod = objectUnderTest.convert(destinationPeriod, sourcePeriod, Period.class, Period.class);

        assertThat(actualPeriod, instanceOf(Period.class));
        assertEquals(sourcePeriod, actualPeriod);

        verify(periodCreatorMock, times(1)).create(sourcePeriod);
    }
}
