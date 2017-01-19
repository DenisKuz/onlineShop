package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/getById/{id}")
    public Product getProductById(@PathVariable("id") final int productId) {
         return productService.getProductById(productId);
    }

    @GetMapping(path = "/getByProductProducerId/{producerId}")
    public List<Product> getProductByProducerId(@PathVariable("producerId") final int producerId) {
        return productService.getProductByProducerId(producerId);
    }

    @GetMapping(path = "/getByProductCategoryId/{сategoryId}")
    public List<Product> getProductByCategoryId(@PathVariable("сategoryId") final int сategoryId) {
        return productService.getProductByCategoryId(сategoryId);
    }

}
