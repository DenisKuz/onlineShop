package repo;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Денис on 17.12.2016.
 */

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
