package com.example.assignment1.model.entity;

import com.example.assignment1.model.animal.Fish;

public class Shark extends Fish {
    private int size;
    // TODO: remove method

    public Shark(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
        return 15;
    }
}
