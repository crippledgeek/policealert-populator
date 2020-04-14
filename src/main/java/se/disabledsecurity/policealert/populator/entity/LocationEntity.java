package se.disabledsecurity.policealert.populator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Location")
@Entity
public class LocationEntity implements Comparable<LocationEntity> {

    @EmbeddedId
    LocationPK locationPK;



    @OneToMany(cascade = CascadeType.ALL)
    private Set<AlertEntity> alerts = new HashSet<>();


    public void addAlert(AlertEntity alert) {
        alert.setLocation(this);
    }


    @Override
    public int compareTo(LocationEntity o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }
}
