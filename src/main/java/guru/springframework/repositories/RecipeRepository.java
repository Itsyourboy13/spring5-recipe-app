package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
