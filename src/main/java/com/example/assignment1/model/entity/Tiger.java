package com.example.assignment1.model.entity;

import com.example.assignment1.model.animal.Animal;
import com.example.assignment1.service.WalkableService;

public class Tiger extends Animal implements WalkableService {
    private int size;
    // TODO: remove method

    public Tiger(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
        return size;
    }
}
