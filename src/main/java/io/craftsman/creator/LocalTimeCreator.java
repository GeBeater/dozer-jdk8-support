package io.craftsman.creator;

import java.time.LocalTime;

public class LocalTimeCreator implements Creator<LocalTime> {

    @Override
    public LocalTime create(Object source) {
        LocalTime srcObject = (LocalTime) source;
        return LocalTime.of(srcObject.getHour(), srcObject.getMinute(), srcObject.getSecond(),srcObject.getNano());
    }
}
