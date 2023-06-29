package eu.yameo.recipebookapp.repository;

import eu.yameo.recipebookapp.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
