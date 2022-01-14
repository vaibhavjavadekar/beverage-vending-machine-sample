package com.ideas.interview.service;

import com.ideas.interview.model.BevarageType;
import com.ideas.interview.model.Recipe;

import java.util.List;

public interface IRecipeService {

    void addRecipe(BevarageType bevarageType, Recipe recipe);

    Recipe getRecipe(BevarageType bevarageType);
}
