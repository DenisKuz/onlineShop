package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

/**
 * Created by Денис on 17.12.2016.
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(path = "product/get/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }
}
