package io.craftsman.creator;

import java.time.Period;

public class PeriodCreator implements Creator<Period> {

    @Override
    public Period create(Object source) {
        Period srcObject = (Period) source;
        return Period.of(srcObject.getYears(), srcObject.getMonths(), srcObject.getDays());
    }
}
