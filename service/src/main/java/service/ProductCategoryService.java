package service;

import entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategory> getHighestNodes();
}