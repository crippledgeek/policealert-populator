package se.disabledsecurity.policealert.populator.domain.external;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import se.disabledsecurity.policealert.populator.domain.external.deserializers.PoliceEventApiDateDeserializer;

import java.time.ZonedDateTime;

@EqualsAndHashCode
@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    private Long id;
    private String name;
    private String summary;
    private String url;
    private Location location;
    private EventType type;
    @JsonDeserialize(using = PoliceEventApiDateDeserializer.class)
    private ZonedDateTime datetime;
}
