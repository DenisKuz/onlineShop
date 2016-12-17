package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductRepo;

/**
 * Created by Денис on 17.12.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product getProductById(int id) {
        return productRepo.findOne(id);
    }
}
