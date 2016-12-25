package repo;

import entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepo extends JpaRepository<Consumer, Integer> {
}
