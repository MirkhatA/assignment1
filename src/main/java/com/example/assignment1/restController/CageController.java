package com.example.assignment1.restController;

import com.example.assignment1.model.animal.Animal;
import com.example.assignment1.model.animal.Fish;
import com.example.assignment1.model.entity.Pinguin;
import com.example.assignment1.model.entity.Shark;
import com.example.assignment1.model.entity.Tiger;
import com.example.assignment1.model.habitat.Aquarium;
import com.example.assignment1.model.habitat.Cage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CageController {

    @GetMapping(value = "/home")
    public Aquarium getAnimalsList() throws Exception {
        Cage cageList = new Cage(10);
        Tiger tiger = new Tiger(3);

        cageList.addAnimal(tiger);
        cageList.addAnimal(tiger);
        cageList.addAnimal(tiger);
        cageList.addAnimal(tiger);



        Aquarium aquariumList = new Aquarium(10);
        Pinguin pinguin = new Pinguin(3);

        aquariumList.addAnimal(pinguin);

        return aquariumList;
    }
}
