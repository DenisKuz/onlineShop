package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    //   @GetMapping(path = "product/get/{id}")
    @RequestMapping(value = "/getProductById", method = GET)
    public Product getProductById(@RequestParam(name = "id") final int productId) {
         return productService.getProductById(productId);
    }
}
