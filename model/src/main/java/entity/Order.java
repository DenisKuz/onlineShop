package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    // @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "order_number")
    @JsonProperty("order_number")
    private int orderNumber;

    @Column(name = "order_date")
    @JsonProperty("order_date")
    private Date consumeDate;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    @ManyToOne
    @JoinColumn(name = "status_id")
    @JsonProperty("status")
    private OrderStatus status;

    @Column(name = "order_deadline")
    @JsonProperty("order_deadline")
    private Date orderDeadline;
}
