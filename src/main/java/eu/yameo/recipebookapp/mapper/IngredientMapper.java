package eu.yameo.recipebookapp.mapper;

import eu.yameo.recipebookapp.dto.IngredientDTO;
import eu.yameo.recipebookapp.entity.Ingredient;

public class IngredientMapper {

    public static IngredientDTO toDTO(Ingredient ingredient) {
        return new IngredientDTO(
                ingredient.getName(),
                ingredient.getAmount()
        );
    }

    public static Ingredient toEntity(IngredientDTO ingredientDTO) {
        Ingredient ingredient = new Ingredient();
        ingredient.setName(ingredientDTO.name());
        ingredient.setAmount(ingredientDTO.amount());
        return ingredient;
    }
}
