package com.ideas.interview.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    List<Instruction> instructionList;

    public Recipe(List<Instruction> instructionList) {
        this.instructionList = instructionList;
    }

    public void addInstruction(Instruction instruction) {
        if (instructionList == null) {
            this.instructionList = new ArrayList<>();
        }
        instructionList.add(instruction);
    }
}
