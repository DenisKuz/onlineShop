package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "consumer")
public class Consumer {

    @Id
    private int id;

    @Column(name = "consumer_login")
    @JsonProperty("consumer_login")
    private String consumerLogin;

    @Column(name = "consumer_password")
    @JsonProperty("consumer_password")
    private String consumerPassword;

    @Column(name = "consumer_email")
    @JsonProperty("consumer_email")
    private String consumerEmail;

    @Column(name = "consumer_name")
    @JsonProperty("consumer_name")
    private String consumerName;

    @Column(name = "phone_number")
    @JsonProperty("phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "consumer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonProperty("orders")
    private Set<Order> orders;
}
