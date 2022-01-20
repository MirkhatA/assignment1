package com.example.assignment1.model.entity;

import com.example.assignment1.model.animal.Bird;

public class Crow extends Bird {
    private int size;
    // TODO: remove method

    public Crow(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
        return 2;
    }
}
