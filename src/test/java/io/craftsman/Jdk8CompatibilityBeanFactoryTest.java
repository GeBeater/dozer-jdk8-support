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
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Jdk8CompatibilityBeanFactoryTest {

    private static final String ANY_TARGET_BEAN_ID = "ANY.TARGET.BEAN.ID";

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
    private Jdk8CompatibilityBeanFactory objectUnderTest;


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
    public void testCreateBeanForLocalDate() {
        LocalDate localDate = LocalDate.now();

        when(localDateCreatorMock.create(localDate)).thenReturn(localDate);

        Object actualLocalDate = objectUnderTest.createBean(localDate, LocalDate.class, ANY_TARGET_BEAN_ID);

        assertThat(actualLocalDate, instanceOf(LocalDate.class));
        assertEquals(localDate, actualLocalDate);

        verify(localDateCreatorMock, times(1)).create(localDate);
    }

    @Test
    public void testCreateBeanForLocalTime() {
        LocalTime localTime = LocalTime.now();

        when(localTimeCreatorMock.create(localTime)).thenReturn(localTime);

        Object actualLocalTime = objectUnderTest.createBean(localTime, LocalTime.class, ANY_TARGET_BEAN_ID);

        assertThat(actualLocalTime, instanceOf(LocalTime.class));
        assertEquals(localTime, actualLocalTime);

        verify(localTimeCreatorMock, times(1)).create(localTime);
    }

    @Test
    public void testCreateBeanForLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        when(localDateTimeCreatorMock.create(localDateTime)).thenReturn(localDateTime);

        Object actualLocalDateTime = objectUnderTest.createBean(localDateTime, LocalDateTime.class, ANY_TARGET_BEAN_ID);

        assertThat(actualLocalDateTime, instanceOf(LocalDateTime.class));
        assertEquals(localDateTime, actualLocalDateTime);

        verify(localDateTimeCreatorMock, times(1)).create(localDateTime);
    }

    @Test
    public void testCreateBeanForZoneId() {
        ZoneId zoneId = ZoneId.of("Europe/Berlin");

        when(zoneIdCreatorMock.create(zoneId)).thenReturn(zoneId);

        Object actualZoneId = objectUnderTest.createBean(zoneId, ZoneId.class, ANY_TARGET_BEAN_ID);

        assertThat(actualZoneId, instanceOf(ZoneId.class));
        assertEquals(zoneId, actualZoneId);

        verify(zoneIdCreatorMock, times(1)).create(zoneId);
    }

    @Test
    public void testCreateBeanForDuration() {
        Duration duration = Duration.of(1000, ChronoUnit.NANOS);

        when(durationCreatorMock.create(duration)).thenReturn(duration);

        Object actualDuration = objectUnderTest.createBean(duration, Duration.class, ANY_TARGET_BEAN_ID);

        assertThat(actualDuration, instanceOf(Duration.class));
        assertEquals(duration, actualDuration);

        verify(durationCreatorMock, times(1)).create(duration);
    }

    @Test
    public void testCreateBeanForPeriod() {
        Period period = Period.of(2015, 11, 8);

        when(periodCreatorMock.create(period)).thenReturn(period);

        Object actualPeriod = objectUnderTest.createBean(period, Period.class, ANY_TARGET_BEAN_ID);

        assertThat(actualPeriod, instanceOf(Period.class));
        assertEquals(period, actualPeriod);

        verify(periodCreatorMock, times(1)).create(period);
    }
}
