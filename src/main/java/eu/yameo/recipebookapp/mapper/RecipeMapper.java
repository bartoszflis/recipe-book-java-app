package eu.yameo.recipebookapp.mapper;

import eu.yameo.recipebookapp.dto.RecipeDTO;
import eu.yameo.recipebookapp.entity.Recipe;

import java.util.stream.Collectors;

public class RecipeMapper {

    public static RecipeDTO toDTO(Recipe recipe) {
        return new RecipeDTO(
                recipe.getId(),
                recipe.getName(),
                recipe.getDescription(),
                recipe.getImagePath(),
                recipe.getIngredients().stream()
                        .map(IngredientMapper::toDTO)
                        .collect(Collectors.toList())
        );
    }

    public static Recipe toEntity(RecipeDTO recipeDTO) {
        Recipe recipe = new Recipe();
        recipe.setId(recipeDTO.id());
        recipe.setName(recipeDTO.name());
        recipe.setDescription(recipeDTO.description());
        recipe.setImagePath(recipeDTO.imagePath());
        recipe.setIngredients(recipeDTO.ingredients().stream()
                .map(IngredientMapper::toEntity)
                .collect(Collectors.toList())
        );
        return recipe;
    }
}
