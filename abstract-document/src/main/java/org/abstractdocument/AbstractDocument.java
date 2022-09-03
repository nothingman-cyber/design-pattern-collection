package org.abstractdocument;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    protected AbstractDocument(Map<String, Object> properties){
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }


    @Override
    public Void put(String key, Object value) {
        properties.put(key, value);
        return null;
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        // 这里承接的是App里的List，任何类似的流结构应该都可以
        return Stream
            .ofNullable(get(key))
            .filter(Objects::nonNull)
            .map(el->(List<Map<String, Object>>) el)
            .findAny()
            .stream()
            .flatMap(Collection::stream)
            .map(constructor);
    }


}
