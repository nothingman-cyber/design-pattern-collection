package org.converter;

import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class Converter<T, U> {

    private final Function<T, U> dtoToEntity;
    private final Function<U, T> entityToDto;

    public final U convertDto2Entity(final T dto) {
        return dtoToEntity.apply(dto);
    }

    public final T convertEntity2Dto(final U entity) {
        return entityToDto.apply(entity);
    }

    public final List<U> convertDto2Entity(final Collection<T> dtos) {
        return dtos.stream().map(this::convertDto2Entity).collect(Collectors.toList());
    }

    public final List<T> convertEntity2Dto(final Collection<U> entities) {
        return entities.stream().map(this::convertEntity2Dto).collect(Collectors.toList());
    }
}
