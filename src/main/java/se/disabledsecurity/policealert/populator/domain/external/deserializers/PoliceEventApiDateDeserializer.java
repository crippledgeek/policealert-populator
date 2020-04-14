package se.disabledsecurity.policealert.populator.domain.external.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class PoliceEventApiDateDeserializer extends JsonDeserializer<ZonedDateTime> {

    @Override
    public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String node = jsonParser.getCodec().readValue(jsonParser, String.class);
        final String[] strings = node.split(" ");

        return ZonedDateTime.of(LocalDate.parse(strings[0]), mapTime(strings[1]), ZoneId.ofOffset("GMT", ZoneOffset.of(strings[2])));
    }


    private static LocalTime mapTime(final String timeString) {

        String ret;

        final var stringBuilder = new StringBuilder();
        if (timeString.length() == 7) {
            ret = stringBuilder.append("0")
                    .append(timeString)
                    .toString();

        }
        else {
            ret = timeString;
        }

        return LocalTime.parse(ret);
    }
}
