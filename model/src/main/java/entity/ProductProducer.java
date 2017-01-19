package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_producer")
public class ProductProducer{

    @Id
    @JsonProperty("id")
    private int id;

    @Column(name = "product_producer_name")
    @JsonProperty("product_producer_name")
    private String productProducerName;
}
