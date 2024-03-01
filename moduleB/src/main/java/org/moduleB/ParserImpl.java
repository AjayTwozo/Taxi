package org.moduleB;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.moduleA.Parser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class ParserImpl implements Parser {
    public byte[] serialize(final Map<?, ?> data) {

        try (final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            objectOutputStream.writeObject(data);

            return byteArrayOutputStream.toByteArray();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public Map<?, ?> deserialize(byte[] data) {
        try {
            final ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.readValue(data, Map.class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
