package se.disabledsecurity.policealert.populator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.CompareToBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@EqualsAndHashCode(of = "externalId")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Alerts")
@Entity
public class AlertEntity implements Comparable<AlertEntity> {

    @Id
    private Long externalId;
    private String name;
    private String summary;
    private String url;

    @Enumerated(EnumType.STRING)
    private EventType type;
    private ZonedDateTime datetime;

    @ManyToOne
    private LocationEntity location;

    public void setLocation(LocationEntity location) {
        // update association on Location entity
        if (location != null) {
            location.getAlerts().add(this);
        } else if (this.location != null) {
            this.location.getAlerts().remove(this);
        }

        this.location = location;
    }
    @Override
    public int compareTo(AlertEntity o) {
       return CompareToBuilder.reflectionCompare(this, o);
    }
}

