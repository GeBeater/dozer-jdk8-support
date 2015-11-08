package io.craftsman.creator;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationCreator implements Creator<Duration> {

    @Override
    public Duration create(Object source) {
        return Duration.of(((Duration)source).getNano(), ChronoUnit.NANOS);
    }
}
