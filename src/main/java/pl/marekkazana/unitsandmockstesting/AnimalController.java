package pl.marekkazana.unitsandmockstesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalController  {


    @Autowired
    private AnimalService animalService;


    public List<Animal> getAnimals (){
        return animalService.getAnimals();
    }

    public Animal addAnimal(Animal animal){

        return animalService.addAnimal(animal);
    }
}
