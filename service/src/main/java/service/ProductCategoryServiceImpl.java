package service;

import entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductCategoryRepo;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepo productCategoryRepo;

    @Autowired
    public ProductCategoryServiceImpl(final ProductCategoryRepo productCategoryRepo) {
        this.productCategoryRepo = productCategoryRepo;
    }

    public List<ProductCategory> getHighestNodes() {
        return productCategoryRepo.findByCategoryIdIsNull();
    }
}