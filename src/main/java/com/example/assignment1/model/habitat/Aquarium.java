package com.example.assignment1.model.habitat;

import com.example.assignment1.model.entity.Pinguin;
import com.example.assignment1.service.SwimableService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aquarium <T extends SwimableService> {
    private int size;
    private List<T> fish = new ArrayList<>();

    private List<?> notAllowedAnimals = Collections.singletonList(Pinguin.class);

    public Aquarium(int size){
        this.size = size;
    }

    public void addAnimal(T animal) throws Exception {
        int totalSize = 0;
        for (T e : fish) totalSize += e.getComfortableSpace();

//        for (Object i : notAllowedAnimals) {
//            if (i == animal.getClass()) {
//                throw new Exception("No available animal");
//            }
//        }

        if (size > totalSize) {
            fish.add(animal);
        }
        else {
            throw new Exception("No available space");
        }
    }

    public int getSize() {
        return size;
    }

    public List<T> getAnimals() {
        return fish;
    }
}
