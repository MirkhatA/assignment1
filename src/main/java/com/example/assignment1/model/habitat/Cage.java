package com.example.assignment1.model.habitat;

import com.example.assignment1.service.WalkableService;

import java.util.ArrayList;
import java.util.List;

public class Cage <T extends WalkableService> {
    private int size;
    private List<T> animals = new ArrayList<>();

    public Cage(int size){
        this.size = size;
    }

    public void addAnimal(T animal) throws Exception {
        int totalSize = 0;
        for (T e : animals) totalSize += e.getComfortableSpace();

        if (size > totalSize) {
            animals.add(animal);
        } else {
            throw new Exception("No available space");
        }
    }

    public int getSize() {
        return size;
    }

    public List<T> getAnimals() {
        return animals;
    }
}
