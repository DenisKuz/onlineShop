package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @JsonProperty("id")
    private int id;

    @Column(name = "category_name")
    @JsonProperty("category_name")
    private String categoryName;

    @OneToMany(mappedBy = "categoryId", fetch = FetchType.EAGER)
    @JsonProperty("sub_category_list")
    private List<ProductCategory> subCategoryList;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory categoryId;
}