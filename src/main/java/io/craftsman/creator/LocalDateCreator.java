package io.craftsman.creator;

import java.time.LocalDate;

public class LocalDateCreator implements Creator<LocalDate> {

    @Override
    public LocalDate create(Object source) {
        LocalDate srcObject = (LocalDate) source;
        return LocalDate.of(srcObject.getYear(), srcObject.getMonth(), srcObject.getDayOfMonth());
    }
}
