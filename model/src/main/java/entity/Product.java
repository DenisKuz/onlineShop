package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by Денис on 17.12.2016.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
   // @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "product_name")
    @JsonProperty("product_name")
    private String productName;

    @Column(name = "product_description")
    @JsonProperty("product_description")
    private String productDescription;

    @Column(name = "image_patch")
    @JsonProperty("image_patch")
    private String imagePatch;

    @Column(name = "product_quality")
    @JsonProperty("product_quality")
    private int productQuality;

    @Column(name = "product_price")
    @JsonProperty("product_price")
    private float productPrice;
}
