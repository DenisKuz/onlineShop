package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "consumer")
public class Consumer {

    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consumer_id_seq")
    // @SequenceGenerator(name = "consumer_id_seq", sequenceName = "consumer_id_seq", allocationSize = 1)
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

    @OneToMany(mappedBy = "consumer", fetch = FetchType.EAGER)
    @JsonProperty("orders")
    private List<Order> orders;
}