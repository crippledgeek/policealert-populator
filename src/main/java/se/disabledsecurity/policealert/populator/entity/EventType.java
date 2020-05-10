package se.disabledsecurity.policealert.populator.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import se.disabledsecurity.policealert.populator.entity.converters.AbstractEnumConverter;
import se.disabledsecurity.policealert.populator.entity.converters.PersistableEnum;

public enum EventType implements PersistableEnum<String> {
    FOUND_GOODS("Anträffat gods"),
    FOUND_DEAD("Anträffad död"),
    ALCOHOL_LAW("Alkohollagen"),
    WEAPON_LAW("Vapenlagen"),
    KNIFE_LAW("Knivlagen"),
    EXTRADITION_LAW("Utlänningslagen"),
    AVIATION_LAW("Luftfartslagen"),
    PROTECTION_LAW("Skyddslagen"),
    PUBLIC_ORDER_LAW("Ordningslagen"),
    MARITIME_LAW("Sjölagen"),
    FRAUD("Bedrägeri"),
    BOMB_THREAT("Bombhot"),
    BOMB_DETONATION("Detonation"),
    FIRE("Brand"),
    FIRE_AUTOMATIC_ALARM("Brand automatlarm"),
    ECONOMIC_CRIME("Ekobrott"),
    MOUNTAIN_RESCUE("Fjällräddning"),
    LOB("Fylleri/LOB"),
    COUNTERFEITING("Förfalskningsbrott"),
    BORDER_CONTROL("Gränskontroll"),
    ROBBERY("Rån"),
    ARMED_ROBBERY("Rån väpnat"),
    ATTEMPTED_ROBBERY("Rån, försök"),
    ROBBERY_MISCELLANEOUS("Rån övrigt"),
    DRUNK_DRIVING("Rattfylleri"),
    UNLAWFUL_DRIVING("Olovlig körning"),
    RESCUE_OPERATION("Räddningsinsats"),
    UPDATE("Uppdatering"),
    RAPE("Våldtäkt"),
    ATTEMPTED_RAPE("Våldtäkt, försök"),
    THEFT("Stöld"),
    ATTEMPTED_THEFT("Stöld, försök"),
    AUTO_THEFT("Motorfordon, stöld"),
    AUTO_THEFT_FOUND_STOLEN("Motorfordon, anträffat stulet"),
    BURGLARY_THEFT("Stöld/inbrott"),
    BURGLARY("Inbrott"),
    ATTEMPTED_BURGLARY("Inbrott, försök"),
    SEXUAL_OFFENCE("Sedlighetsbrott"),
    THREAT_TO_OFFICIAL("Våld/hot mot tjänsteman"),
    SHOOTING("Skottlossning"),
    SUSPECTED_SHOOTING("Skottlossning, misstänkt"),
    PROPERTY_DAMAGE("Skadegörelse"),
    CAR_ACCIDENT("Trafikolycka"),
    CAR_ACCIDENT_RUNAWAY("Trafikolycka, smitning från"),
    CAR_ACCIDENT_SINGLE("Trafikolycka, singel"),
    CAR_ACCIDENT_WILD_ANIMAL("Trafikolycka, vilt"),
    CAR_ACCIDENT_DAMAGE_TO_PERSON("Trafikolycka, personskada"),
    MISCELLANEOUS("Övrigt"),
    TRAFFIC_CONTROL("Trafikkontroll"),
    MISSING_PERSON("Försvunnen person"),
    UNLAWFUL_THREAT("Olaga hot"),
    SUMMARY_MORNING("Sammanfattning förmiddag"),
    SUMMARY_DAY("Sammanfattning dag"),
    SUMMARY_AFTERNOON("Sammanfattning eftermiddag"),
    SUMMARY_EVENING("Sammanfattning kväll"),
    SUMMARY_NIGHT("Sammanfattning natt"),
    SUMMARY_WEEKEND("Sammanfattning helg"),
    SUMMARY_WEEK("Sammanfattning vecka"),
    SUMMARY_TWENTY_FOUR_HOUR_PERIOD("Sammanfattning dygn"),
    SUMMARY_EVENING_NIGHT("Sammanfattning kväll och natt"),
    ASSAULT("Misshandel"),
    AGGRAVATED_ASSAULT("Misshandel, grov"),
    DRUG_OFFENCE("Narkotikabrott"),
    TRAFFIC_VIOLATION("Trafikbrott"),
    WORKPLACE_ACCIDENT("Arbetsplatsolycka"),
    UNRULY_BEHAVIOUR("Ofredande/förargelse"),
    ATTEMPTED_MURDER_MANSLAUGHTER("Mord/dråp, försök"),
    MURDER_MANSLAUGHTER("Mord/dråp"),
    TRAFFIC_OBSTACLE("Trafikhinder"),
    CHECK_PERSON_VEHICLE("Kontroll person/fordon"),
    POLICE_ACTION("Polisinsats/kommendering"),
    DISTURBANCE("Bråk"),
    BREAKDOWN_WARNING("Varningslarm/haveri"),
    PANIC_ALARM("Larm Överfall"),
    CRIMES_AGAINST_ELDERLY("Åldringsbrott"),
    ILLEGAL_RESTRAINT("Olaga frihetsberövande"),
    ENVIRONMENTAL_CRIME("Miljöbrott"),
    TEMPORARILY_UNMANNED("Tillfälligt obemannat"),
    SPREADING_INFECTIOUS_CHEMICALS("Spridning smittsamma kemikalier"),
    CAUSING_BODILY_HARM("Vållande till kroppsskada"),
    DISEASE_ACCIDENT("Sjukdom/olycksfall"),
    SUSPECTED_DANGEROUS_ITEM("Farligt föremål, misstänkt"),
    TRESPASSING("Olaga intrång"),
    ANIMAL("Djur"),
    ALARM_BURGLARY("Larm Inbrott"),
    WANTED_PERSON("Efterlyst person"),
    INVASION_OF_PRIVACY("Hemfridsbrott"),
    FENCING("Häleri"),
    KIDNAPPING("Olaga frihetsberövande/människorov"),
    ABUSE_OF_RECORDS("Missbruk av urkund"),
    SABOTAGE_AGAINST_PUBLIC_SAFETY_OPERATIONS("Sabotage mot blåljusverksamhet"),
    UNRULY_CHILDREN_ADOLESCENCE("Ofog barn/ungdom")

    ;


    private String type;

    EventType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    @Override
    public String getValue() {
        return type;
    }

    public static class Converter extends AbstractEnumConverter<EventType, String> {
        public Converter() {
            super(EventType.class);
        }
    }
}


