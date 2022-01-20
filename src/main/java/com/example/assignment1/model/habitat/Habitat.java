package com.example.assignment1.model.habitat;

import com.example.assignment1.service.MovableService;

import java.util.List;

public class Habitat <T extends MovableService> {
    private int size;
    private List<T> animals;


    public int getSize() {
        return size;
    }

    public List<T> getAnimals() {
        return animals;
    }
}
