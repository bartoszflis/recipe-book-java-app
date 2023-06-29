package eu.yameo.recipebookapp.controller;

import eu.yameo.recipebookapp.dto.RecipeDTO;
import eu.yameo.recipebookapp.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<RecipeDTO>> getRecipes() {
        List<RecipeDTO> recipes = recipeService.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }

    @PutMapping
    public ResponseEntity<Void> storeRecipes(@RequestBody List<RecipeDTO> recipes) {
        recipeService.saveAllRecipes(recipes);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
