package eu.yameo.recipebookapp.service;

import eu.yameo.recipebookapp.dto.RecipeDTO;
import eu.yameo.recipebookapp.entity.Recipe;
import eu.yameo.recipebookapp.mapper.RecipeMapper;
import eu.yameo.recipebookapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<RecipeDTO> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipes.stream()
                .map(RecipeMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void saveAllRecipes(List<RecipeDTO> recipes) {
        List<Recipe> recipeEntities = recipes.stream()
                .map(RecipeMapper::toEntity)
                .collect(Collectors.toList());
        recipeRepository.saveAll(recipeEntities);
    }
}
