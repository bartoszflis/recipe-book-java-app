package eu.yameo.recipebookapp.dto;

import java.util.List;

public record RecipeDTO(
        Long id,
        String name,
        String description,
        String imagePath,
        List<IngredientDTO> ingredients
) {}
