package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    private int id;

    @Column(name = "payment_method_name")
    @JsonProperty("name")
    private String name;
}
