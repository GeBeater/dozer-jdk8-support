package io.craftsman.creator;

public class CreatorFactory {

    private LocalDateCreator localDateCreator;

    private LocalTimeCreator localTimeCreator;


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

}
