package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product getProductById(int id) {
        return productRepo.findOne(id);
    }
}
