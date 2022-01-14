package com.ideas.interview.service;

import com.ideas.interview.model.BevarageType;
import com.ideas.interview.model.Beverage;
import com.ideas.interview.model.Recipe;

public class TeaMakerService implements IBeverageMaker{

    private IRecipeService recipeService;

    @Override
    public Beverage prepare() {
        Recipe recipe = recipeService.getRecipe(BevarageType.TEA);
        process(recipe);
        Beverage tea = new Beverage("Tea", BevarageType.TEA);
        return tea;
    }

    private void process(Recipe recipe){

    }
}
