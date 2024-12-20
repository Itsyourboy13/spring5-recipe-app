package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
