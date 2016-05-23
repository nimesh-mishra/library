
package com.lftechnology.library.util;

import java.io.IOException;
import java.time.LocalDateTime;

import com.auth0.jwt.internal.com.fasterxml.jackson.core.JsonParser;
import com.auth0.jwt.internal.com.fasterxml.jackson.core.JsonProcessingException;
import com.auth0.jwt.internal.com.fasterxml.jackson.databind.DeserializationContext;
import com.auth0.jwt.internal.com.fasterxml.jackson.databind.JsonDeserializer;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonParser arg0, DeserializationContext arg1)
        throws IOException, JsonProcessingException {
        return LocalDateTime.parse(arg0.getText());
    }

}
