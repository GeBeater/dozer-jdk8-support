package io.craftsman;

import io.craftsman.creator.CreatorFactory;
import org.dozer.CustomConverter;

import java.util.Locale;

public class JdkMissingConverter implements CustomConverter {

    private CreatorFactory creatorFactory = new CreatorFactory();

    @Override
    public Object convert(Object destination, Object source, Class<?> destinationClass, Class<?> sourceClass) {

        if (destinationClass == null || sourceClass == null) {
            return destination;
        }

        if (source == null) {
            destination = null;
        } else if (destinationClass.isAssignableFrom(Locale.class) && sourceClass.isAssignableFrom(Locale.class)) {
            destination = creatorFactory.createLocaleCreator().create(source);
        }

        return destination;
    }
}
