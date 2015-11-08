package io.craftsman;

import io.craftsman.creator.CreatorFactory;
import org.dozer.BeanFactory;

import java.time.LocalDate;
import java.time.LocalTime;

public class Jdk8CompatibilityBeanFactory implements BeanFactory {

    private CreatorFactory creatorFactory = new CreatorFactory();

    @Override
    public Object createBean(Object source, Class<?> sourceClass, String targetBeanId) {

        if (source == null || sourceClass == null) {
            return null;
        }

        if (sourceClass.isAssignableFrom(LocalDate.class)) {
            return creatorFactory.createLocalDateCreator().create(source);
        } else if (sourceClass.isAssignableFrom(LocalTime.class)) {
            return creatorFactory.createLocalTimeCreator().create(source);
        } else {
            return null;
        }
    }
}
