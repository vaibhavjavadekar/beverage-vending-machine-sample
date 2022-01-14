package com.ideas.interview.service;

import com.ideas.interview.model.BevarageType;
import com.ideas.interview.model.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeServiceImpl implements IRecipeService {

    Map<BevarageType, Recipe> beverageTypeRecipeMap = new HashMap<>();

    @Override
    public void addRecipe(BevarageType bevarageType, Recipe recipe) {
        beverageTypeRecipeMap.put(bevarageType, recipe);
    }

    @Override
    public Recipe getRecipe(BevarageType bevarageType) {
        return beverageTypeRecipeMap.get(bevarageType);
    }


}
