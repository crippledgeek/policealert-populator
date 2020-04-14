package se.disabledsecurity.policealert.populator.domain.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @JsonProperty("name")
    private String locationName;
    private String gps;

}
