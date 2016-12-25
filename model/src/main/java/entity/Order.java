package entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "order")
class Order {

    @Id
    private int id;

    @Column(name = "order_number")
    @JsonProperty("order_number")
    private String orderNumber;

    @Column(name = "order_date")
    @JsonProperty("order_date")
    private String consumeDate;

    @Column(name = "payment_method_id")
    @JsonProperty("payment_method_id")
    private String paymentMethodId;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    @Column(name = "status_id")
    @JsonProperty("status_id")
    private String statusId;

    @Column(name = "order_deadline")
    @JsonProperty("order_deadline")
    private String orderDeadline;

}
