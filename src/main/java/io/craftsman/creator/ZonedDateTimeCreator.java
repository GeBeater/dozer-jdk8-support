package io.craftsman.creator;

import java.time.ZonedDateTime;

public class ZonedDateTimeCreator implements Creator<ZonedDateTime> {

    @Override
    public ZonedDateTime create(Object source) {
    	ZonedDateTime srcObject = (ZonedDateTime) source;
        return ZonedDateTime.of(
                srcObject.getYear(),
                srcObject.getMonthValue(),
                srcObject.getDayOfMonth(),
                srcObject.getHour(),
                srcObject.getMinute(),
                srcObject.getSecond(),
                srcObject.getNano(),
                srcObject.getZone()
        );
    }
}