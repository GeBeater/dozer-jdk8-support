package io.craftsman;

import io.craftsman.creator.CreatorFactory;
import io.craftsman.creator.LocalDateCreator;
import io.craftsman.creator.LocalTimeCreator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalTime;

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
    private CreatorFactory creatorFactoryMock;

    @InjectMocks
    private Jdk8CompatibilityBeanFactory objectUnderTest;


    @Before
    public void setUp() {
        when(creatorFactoryMock.createLocalDateCreator()).thenReturn(localDateCreatorMock);
        when(creatorFactoryMock.createLocalTimeCreator()).thenReturn(localTimeCreatorMock);
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
}
