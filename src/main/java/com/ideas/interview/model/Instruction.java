package com.ideas.interview.model;

import java.util.ArrayList;
import java.util.List;

public class Instruction {
    List<Step> steps;

    public Instruction(List<Step> listOfSteps) {
        this.steps = listOfSteps;
    }

    public void addStep(Step step) {
        if (steps == null) {
            steps = new ArrayList<>();
        }
        steps.add(step);
    }
}
