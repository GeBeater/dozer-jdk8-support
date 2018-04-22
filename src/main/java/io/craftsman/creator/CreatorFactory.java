package io.craftsman.creator;

public class CreatorFactory {

    private LocalDateCreator localDateCreator;

    private OffsetDateTimeCreator offsetDateTimeCreator;

    private LocalTimeCreator localTimeCreator;

    private LocalDateTimeCreator localDateTimeCreator;

    private ZonedDateTimeCreator zonedDateTimeCreator;

    private ZoneIdCreator zoneIdCreator;

    private DurationCreator durationCreator;

    private PeriodCreator periodCreator;

    private LocaleCreator localeCreator;

    private InstantCreator instantCreator;


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

    public OffsetDateTimeCreator createOffsetDateTimeCreator() {
        if (offsetDateTimeCreator == null) {
            offsetDateTimeCreator = new OffsetDateTimeCreator();
        }
        return offsetDateTimeCreator;
    }

    public LocalDateTimeCreator createLocalDateTimeCreator() {
        if (localDateTimeCreator == null) {
            localDateTimeCreator = new LocalDateTimeCreator();
        }
        return localDateTimeCreator;
    }

    public ZonedDateTimeCreator createZonedDateTimeCreator() {
        if (zonedDateTimeCreator == null) {
            zonedDateTimeCreator = new ZonedDateTimeCreator();
        }
        return zonedDateTimeCreator;
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

    public LocaleCreator createLocaleCreator() {
        if (localeCreator == null) {
            localeCreator = new LocaleCreator();
        }
        return localeCreator;
    }

    public InstantCreator createInstantCreator() {
        if (instantCreator == null) {
            instantCreator = new InstantCreator();
        }
        return instantCreator;
    }
}
