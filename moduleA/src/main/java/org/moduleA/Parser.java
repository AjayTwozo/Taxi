package org.moduleA;

import java.util.Map;

public interface Parser {

    byte[] serialize(final Map<?, ?> data);

    Map<?, ?> deserialize(byte[] data);
}
