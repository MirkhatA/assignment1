package com.example.assignment1.model.entity;

import com.example.assignment1.model.animal.Bird;
import com.example.assignment1.service.SwimableService;
import com.example.assignment1.service.WalkableService;
import lombok.Data;

@Data
public class Pinguin extends Bird implements WalkableService, SwimableService {
    private int size;
    private String name;

    public Pinguin(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
        return size;
    }


}
