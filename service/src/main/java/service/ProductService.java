package service;

import entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(int id);
    List<Product> getProductByProducerId(final int producerId);
    List<Product> getProductByCategoryId(final int productCategoryId);
}
