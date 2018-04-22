package io.craftsman.creator;

import java.time.OffsetDateTime;

public class OffsetDateTimeCreator implements Creator<OffsetDateTime> {

    @Override
    public OffsetDateTime create(Object source) {
      OffsetDateTime srcObject = (OffsetDateTime) source;
        return OffsetDateTime.of(
                srcObject.getYear(),
                srcObject.getMonthValue(),
                srcObject.getDayOfMonth(),
                srcObject.getHour(),
                srcObject.getMinute(),
                srcObject.getSecond(),
                srcObject.getNano(),
                srcObject.getOffset()
        );
    }
}