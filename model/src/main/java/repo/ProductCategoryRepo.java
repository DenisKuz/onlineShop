package repo;

import entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {
    public List<ProductCategory> findByCategoryIdIsNull();
}