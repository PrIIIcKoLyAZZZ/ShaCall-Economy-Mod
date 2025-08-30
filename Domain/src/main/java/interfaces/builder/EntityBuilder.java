package interfaces.builder;

import interfaces.Entity;

public interface EntityBuilder<T extends Entity, B extends EntityBuilder<T,B>> {
    public T build();
    public B self();
}
