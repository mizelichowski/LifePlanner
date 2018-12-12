package lifeplanner.domain;

import javax.persistence.*;

@Entity
public class MoneyEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // only getter
    private String name;
    @Enumerated(value = EnumType.STRING)
    private MoneyEventType moneyEventType;
    private String description;
    private Integer amount;

    public MoneyEvent() {
    }

    private MoneyEvent(Builder builder) {
        id = builder.id;
        setName(builder.name);
        setMoneyEventType(builder.moneyEventType);
        setDescription(builder.description);
        setAmount(builder.amount);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoneyEventType getMoneyEventType() {
        return moneyEventType;
    }

    public void setMoneyEventType(MoneyEventType moneyEventType) {
        this.moneyEventType = moneyEventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public static final class Builder {
        private Long id;
        private String name;
        private MoneyEventType moneyEventType;
        private String description;
        private Integer amount;

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

        public Builder moneyEventType(MoneyEventType val) {
            moneyEventType = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder amount(Integer val) {
            amount = val;
            return this;
        }

        public MoneyEvent build() {
            return new MoneyEvent(this);
        }
    }
}
