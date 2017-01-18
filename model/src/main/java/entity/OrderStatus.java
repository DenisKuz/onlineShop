package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    private int id;

    @Column(name = "order_status_name")
    @JsonProperty("name")
    private String name;
}
