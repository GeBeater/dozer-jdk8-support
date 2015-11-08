package io.craftsman.creator;

public class CreatorFactory {

    private LocalDateCreator localDateCreator;

    private LocalTimeCreator localTimeCreator;

    private LocalDateTimeCreator localDateTimeCreator;

    private ZoneIdCreator zoneIdCreator;

    private DurationCreator durationCreator;

    private PeriodCreator periodCreator;


    public LocalDateCreator createLocalDateCreator() {
        if (localDateCreator == null) {
            localDateCreator = new LocalDateCreator();
        }
        return localDateCreator;
    }

    public LocalTimeCreator createLocalTimeCreator() {
        if (localTimeCreator == null) {
            localTimeCreator = new LocalTimeCreator();
        }
        return localTimeCreator;
    }

    public LocalDateTimeCreator createLocalDateTimeCreator() {
        if (localDateTimeCreator == null) {
            localDateTimeCreator = new LocalDateTimeCreator();
        }
        return localDateTimeCreator;
    }

    public ZoneIdCreator createZoneIdCreator() {
        if (zoneIdCreator == null) {
            zoneIdCreator = new ZoneIdCreator();
        }
        return zoneIdCreator;
    }

    public DurationCreator createDurationCreator() {
        if (durationCreator == null) {
            durationCreator = new DurationCreator();
        }
        return durationCreator;
    }

    public PeriodCreator createPeriodCreator() {
        if (periodCreator == null) {
            periodCreator = new PeriodCreator();
        }
        return periodCreator;
    }
}
