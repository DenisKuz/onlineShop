package repo;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProductProducerId(final int productProducerId);
    List<Product> findByProductCategoryId(final int productCategoryId);
}
