package com.ideas.interview.service;

import com.ideas.interview.model.BevarageType;
import com.ideas.interview.model.Beverage;
import com.ideas.interview.model.Recipe;

public class LatteService implements IBeverageMaker {

    private IRecipeService recipeService;

    @Override
    public Beverage prepare() {
        Recipe recipe = recipeService.getRecipe(BevarageType.LATTE_COFFEE);
        process(recipe);
        Beverage latteCoffee = new Beverage("Latte Coffee", BevarageType.LATTE_COFFEE);
        return latteCoffee;
    }

    private void process(Recipe recipe) {

    }
}
