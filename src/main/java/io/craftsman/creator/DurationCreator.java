package io.craftsman.creator;

import java.time.Duration;

public class DurationCreator implements Creator<Duration> {

    @Override
    public Duration create(Object source) {
        return Duration.parse(source.toString());
    }
}
