package io.craftsman.creator;

public interface Creator<T> {

    public T create(Object source);
}
