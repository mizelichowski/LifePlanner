package lifeplanner.domain;

import javax.persistence.*;

@Entity
public class TimetableEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private TimetableEventType timetableEventType;

    public TimetableEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimetableEventType getTimetableEventType() {
        return timetableEventType;
    }

    public void setTimetableEventType(TimetableEventType timetableEventType) {
        this.timetableEventType = timetableEventType;
    }

    private TimetableEvent(Builder builder) {
        id = builder.id;
        name = builder.name;
        description = builder.description;
        timetableEventType = builder.timetableEventType;
    }


    public static final class Builder {
        private Long id;
        private String name;
        private String description;
        private TimetableEventType timetableEventType;

        public Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder timetableEventType(TimetableEventType val) {
            timetableEventType = val;
            return this;
        }

        public TimetableEvent build() {
            return new TimetableEvent(this);
        }
    }
}
