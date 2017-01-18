package controller;

import entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductCategoryService;

import java.util.List;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @Autowired
    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping(path = "/getHighestNodes")
    public List<ProductCategory> getHighestNodes() {
        return productCategoryService.getHighestNodes();
    }
}
