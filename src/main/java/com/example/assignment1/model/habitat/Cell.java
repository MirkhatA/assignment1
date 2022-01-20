package com.example.assignment1.model.habitat;

import com.example.assignment1.service.FlyableService;

import java.util.ArrayList;
import java.util.List;

public class Cell <T extends FlyableService> {
    private int size = 20;
    private List<T> birds = new ArrayList<>();

    public Cell(int size){
        this.size = size;
    }

    public void addAnimal(T animal) throws Exception {
        int totalSize = 0;
        for (T e : birds) totalSize += e.getComfortableSpace();

        if (size > totalSize) {
            birds.add(animal);
        } else {
            throw new Exception("No available space");
        }
    }

    public int getSize() {
        return size;
    }

    public List<T> getAnimals() {
        return birds;
    }
}
