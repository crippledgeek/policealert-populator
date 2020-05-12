package se.disabledsecurity.policealert.populator.entity.converters;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Optional;

public abstract class AbstractEnumConverter <T extends Enum<T> & PersistableEnum<E>, E> implements AttributeConverter<T, E> {
    private final Class<T> clazz;

    public AbstractEnumConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public E convertToDatabaseColumn(T attribute) {
        return Optional.ofNullable(attribute)
                .map(PersistableEnum::getValue)
                .orElse(null);
    }

    @Override
    public T convertToEntityAttribute(E dbData) {
        return Arrays.stream(clazz.getEnumConstants())
                .filter(e -> e.getValue().equals(dbData))
                .findFirst()
                .orElseThrow(UnsupportedOperationException::new);
    }
}
